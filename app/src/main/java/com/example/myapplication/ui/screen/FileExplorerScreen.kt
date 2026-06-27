package com.example.myapplication.ui.screen

import android.content.Context
import android.net.Uri
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.FolderOpen
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material.icons.outlined.SentimentDissatisfied
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.documentfile.provider.DocumentFile
import com.example.myapplication.ui.model.Project
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

// ─────────────────────────────────────────────
// 内部数据模型
// ─────────────────────────────────────────────

private data class FileNode(
    val name: String,
    val path: String,           // 绝对路径 或 SAF content URI 字符串
    val isDirectory: Boolean,
    val extension: String,      // 文件扩展名（不含点），目录为空字符串
    val children: List<FileNode> = emptyList()
)

private data class DisplayRow(
    val node: FileNode,
    val depth: Int
)

private sealed class LoadState {
    object Loading : LoadState()
    data class Loaded(val root: FileNode) : LoadState()
    data class Error(val message: String) : LoadState()
}

// ─────────────────────────────────────────────
// 主屏幕
// ─────────────────────────────────────────────

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FileExplorerScreen(
    project: Project,
    onBack: () -> Unit,
    onOpenFile: (String) -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var loadState by remember { mutableStateOf<LoadState>(LoadState.Loading) }
    var expandedPaths by remember { mutableStateOf(setOf(project.localPath ?: "")) }
    var openingFile by remember { mutableStateOf(false) }

    // 在 IO 线程加载文件树
    LaunchedEffect(project.localPath) {
        loadState = LoadState.Loading
        val path = project.localPath
        if (path.isNullOrBlank()) {
            loadState = LoadState.Error("该项目没有关联本地路径")
            return@LaunchedEffect
        }
        loadState = withContext(Dispatchers.IO) {
            runCatching {
                val root: FileNode = if (path.startsWith("content://")) {
                    val treeUri = Uri.parse(path)
                    val rootDoc = DocumentFile.fromTreeUri(context, treeUri)
                        ?: return@runCatching LoadState.Error("无法访问该目录，权限可能已失效")
                    buildNodeFromSaf(rootDoc)
                } else {
                    val file = File(path)
                    if (!file.exists()) return@runCatching LoadState.Error("目录不存在：$path")
                    buildNodeFromFile(file)
                }
                LoadState.Loaded(root)
            }.getOrElse { e ->
                LoadState.Error("加载失败：${e.message}")
            }
        }
    }

    BackHandler { onBack() }

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
                    }
                },
                title = {
                    Column {
                        Text(
                            text = project.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = project.description,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (val state = loadState) {
                // ── 加载中 ────────────────────────────────────────
                is LoadState.Loading -> {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        CircularProgressIndicator()
                        Text(
                            text = "读取文件列表…",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // ── 加载失败 ──────────────────────────────────────
                is LoadState.Error -> {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.SentimentDissatisfied,
                            contentDescription = null,
                            modifier = Modifier.size(52.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.35f)
                        )
                        Text(
                            text = state.message,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                // ── 加载成功：显示文件树 ───────────────────────────
                is LoadState.Loaded -> {
                    val displayRows = remember(state.root, expandedPaths) {
                        flattenVisible(state.root, depth = 0, expanded = expandedPaths)
                    }

                    if (displayRows.isEmpty()) {
                        // 目录为空
                        Column(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(32.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.FolderOpen,
                                contentDescription = null,
                                modifier = Modifier.size(52.dp),
                                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.35f)
                            )
                            Text(
                                text = "项目目录为空",
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
                            )
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(vertical = 8.dp)
                        ) {
                            items(displayRows, key = { it.node.path }) { row ->
                                val isExpanded = row.node.path in expandedPaths
                                FileTreeRow(
                                    row = row,
                                    isExpanded = isExpanded,
                                    onClick = {
                                        if (row.node.isDirectory) {
                                            // 展开或折叠目录
                                            expandedPaths = if (isExpanded) {
                                                expandedPaths - row.node.path
                                            } else {
                                                expandedPaths + row.node.path
                                            }
                                        } else {
                                            // 打开文件到编辑器（IO 线程读取内容）
                                            if (!openingFile) {
                                                openingFile = true
                                                scope.launch(Dispatchers.IO) {
                                                    withContext(Dispatchers.Main) {
                                                        openingFile = false
                                                        onOpenFile(row.node.path)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                )
                            }
                        }
                    }

                    // 打开文件时的半透明遮罩
                    if (openingFile) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.scrim.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator()
                        }
                    }
                }
            }
        }
    }
}

// ─────────────────────────────────────────────
// 文件树行 UI
// ─────────────────────────────────────────────

@Composable
private fun FileTreeRow(
    row: DisplayRow,
    isExpanded: Boolean,
    onClick: () -> Unit
) {
    val node = row.node
    val indentDp = (row.depth * 18 + 16).dp

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(start = indentDp, end = 12.dp, top = 7.dp, bottom = 7.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // ── 图标区域 ────────────────────────────────────
        if (node.isDirectory) {
            Icon(
                imageVector = if (isExpanded) Icons.Outlined.FolderOpen
                              else Icons.Outlined.Folder,
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color(0xFFFFB74D)    // 文件夹统一琥珀色
            )
        } else {
            // 小色块：扩展名缩写徽标
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(fileIconColor(node.extension).copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = node.extension.take(2).uppercase().ifBlank { "  " },
                    fontSize = 7.sp,
                    fontWeight = FontWeight.Bold,
                    color = fileIconColor(node.extension),
                    maxLines = 1
                )
            }
        }

        Spacer(modifier = Modifier.width(10.dp))

        // ── 名称 ────────────────────────────────────────
        Text(
            text = node.name,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )

        // ── 目录展开箭头 ─────────────────────────────────
        if (node.isDirectory && node.children.isNotEmpty()) {
            Icon(
                imageVector = if (isExpanded) Icons.Default.KeyboardArrowDown
                              else Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier.size(18.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.45f)
            )
        }
    }
}

// ─────────────────────────────────────────────
// 树构建：java.io.File（本地绝对路径）
// ─────────────────────────────────────────────

private fun buildNodeFromFile(file: File): FileNode {
    return if (file.isDirectory) {
        val sorted = (file.listFiles() ?: emptyArray())
            .sortedWith(compareBy({ !it.isDirectory }, { it.name.lowercase() }))
        FileNode(
            name = file.name,
            path = file.absolutePath,
            isDirectory = true,
            extension = "",
            children = sorted.map { buildNodeFromFile(it) }
        )
    } else {
        FileNode(
            name = file.name,
            path = file.absolutePath,
            isDirectory = false,
            extension = file.extension.lowercase()
        )
    }
}

// ─────────────────────────────────────────────
// 树构建：SAF DocumentFile（content URI）
// ─────────────────────────────────────────────

private fun buildNodeFromSaf(doc: DocumentFile): FileNode {
    val name = doc.name ?: "未知"
    return if (doc.isDirectory) {
        val sorted = doc.listFiles()
            .sortedWith(compareBy({ !it.isDirectory }, { it.name?.lowercase() ?: "" }))
        FileNode(
            name = name,
            path = doc.uri.toString(),
            isDirectory = true,
            extension = "",
            children = sorted.map { buildNodeFromSaf(it) }
        )
    } else {
        val ext = name.substringAfterLast('.', "").lowercase()
        FileNode(
            name = name,
            path = doc.uri.toString(),
            isDirectory = false,
            extension = ext
        )
    }
}

// ─────────────────────────────────────────────
// 将树展平为可见行列表（根据 expandedPaths 状态）
// 根节点（depth=0）本身不显示，只展示其子节点
// ─────────────────────────────────────────────

private fun flattenVisible(
    node: FileNode,
    depth: Int,
    expanded: Set<String>
): List<DisplayRow> {
    if (depth == 0) {
        // 根节点不显示自身，只要展开就递归展示子节点
        if (node.path !in expanded) return emptyList()
        return node.children.flatMap { flattenVisible(it, 1, expanded) }
    }
    val selfRow = DisplayRow(node, depth)
    return if (node.isDirectory && node.path in expanded) {
        listOf(selfRow) + node.children.flatMap { flattenVisible(it, depth + 1, expanded) }
    } else {
        listOf(selfRow)
    }
}

// ─────────────────────────────────────────────
// 读取文件内容（支持绝对路径 和 SAF content URI）
// ─────────────────────────────────────────────

private fun readFileContent(context: Context, path: String): String {
    return try {
        if (path.startsWith("content://")) {
            val uri = Uri.parse(path)
            context.contentResolver.openInputStream(uri)
                ?.use { it.bufferedReader(Charsets.UTF_8).readText() }
                ?: "（无法读取文件内容）"
        } else {
            File(path).readText(Charsets.UTF_8)
        }
    } catch (e: Exception) {
        "// 读取文件失败：${e.message}\n"
    }
}

// ─────────────────────────────────────────────
// 扩展名 → 图标颜色映射
// ─────────────────────────────────────────────

private fun fileIconColor(extension: String): Color = when (extension) {
    "js", "jsx", "mjs"           -> Color(0xFFF5C518) // 黄
    "ts", "tsx"                   -> Color(0xFF3178C6) // TypeScript 蓝
    "py"                          -> Color(0xFF3572A5) // Python 蓝
    "kt", "kts"                   -> Color(0xFF7F52FF) // Kotlin 紫
    "java"                        -> Color(0xFFB07219) // Java 棕橙
    "dart"                        -> Color(0xFF00B4AB) // Dart 青
    "html", "htm"                 -> Color(0xFFE34C26) // HTML 红橙
    "css", "scss", "sass", "less" -> Color(0xFF563D7C) // CSS 紫
    "json", "jsonc"               -> Color(0xFF40BF40) // JSON 绿
    "md", "markdown"              -> Color(0xFF888888) // Markdown 灰
    "xml", "svg"                  -> Color(0xFFE07020) // XML 橙
    "sh", "bash", "zsh"           -> Color(0xFF89E051) // Shell 浅绿
    "go"                          -> Color(0xFF00ADD8) // Go 青蓝
    "rs"                          -> Color(0xFFDEA584) // Rust 肉桂
    "cpp", "cc", "cxx", "c", "h" -> Color(0xFF555599) // C/C++ 深蓝
    "rb"                          -> Color(0xFFCC342D) // Ruby 红
    "php"                         -> Color(0xFF4F5D95) // PHP 蓝紫
    "swift"                       -> Color(0xFFFF6940) // Swift 橙红
    else                          -> Color(0xFF9E9E9E) // 默认灰
}
