package com.example.myapplication.ui.screen

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.net.Uri
import android.provider.DocumentsContract
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
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
// 内部数据模型（sheet 版独立定义，避免跨文件私有符号冲突）
// ─────────────────────────────────────────────

private data class SheetFileNode(
    val name: String,
    val path: String,
    val isDirectory: Boolean,
    val extension: String,
    val children: List<SheetFileNode> = emptyList()
)

private data class SheetDisplayRow(
    val node: SheetFileNode,
    val depth: Int
)

private sealed class SheetLoadState {
    object Loading : SheetLoadState()
    data class Loaded(val root: SheetFileNode) : SheetLoadState()
    data class Error(val message: String) : SheetLoadState()
}

// ─────────────────────────────────────────────
// 上下文菜单 Action 定义
// ─────────────────────────────────────────────

private data class SheetContextAction(
    val label: String,
    val icon: ImageVector,
    val isDestructive: Boolean = false,
    val forFolder: Boolean? = null   // null=通用  true=仅文件夹  false=仅文件
)

private val SHEET_CONTEXT_ACTIONS = listOf(
    SheetContextAction("重命名",       Icons.Outlined.Edit),
    SheetContextAction("新建文件",     Icons.Outlined.NoteAdd,         forFolder = true),
    SheetContextAction("新建文件夹",   Icons.Outlined.CreateNewFolder,  forFolder = true),
    SheetContextAction("在此打开终端", Icons.Outlined.Terminal,         forFolder = true),
    SheetContextAction("复制路径",     Icons.Outlined.ContentCopy),
    SheetContextAction("删除",         Icons.Outlined.Delete,           isDestructive = true),
)

// ─────────────────────────────────────────────
// 主入口：底部弹出文件树
// ─────────────────────────────────────────────

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FileExplorerSheet(
    project: Project,
    onDismiss: () -> Unit,
    onOpenFile: (EditorFile) -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    var loadState by remember(project.localPath) {
        mutableStateOf<SheetLoadState>(SheetLoadState.Loading)
    }
    var expandedPaths by remember(project.localPath) {
        mutableStateOf(setOf(project.localPath ?: ""))
    }
    var openingFile by remember { mutableStateOf(false) }

    // ── 上下文菜单状态 ──
    var contextNode         by remember { mutableStateOf<SheetFileNode?>(null) }
    var showContextSheet    by remember { mutableStateOf(false) }
    val contextSheetState   = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    // ── 对话框状态 ──
    var showRenameDialog    by remember { mutableStateOf(false) }
    var showNewFileDialog   by remember { mutableStateOf(false) }
    var showNewFolderDialog by remember { mutableStateOf(false) }
    var showDeleteDialog    by remember { mutableStateOf(false) }
    // 重命名/删除 → 操作目标节点；新建 → 目标目录路径
    var dialogTargetNode    by remember { mutableStateOf<SheetFileNode?>(null) }
    var newItemTargetPath   by remember { mutableStateOf("") }

    val snackbarHostState   = remember { SnackbarHostState() }

    // 加载文件树
    LaunchedEffect(project.localPath) {
        loadState = SheetLoadState.Loading
        val path = project.localPath
        if (path.isNullOrBlank()) {
            loadState = SheetLoadState.Error("该项目没有关联本地路径")
            return@LaunchedEffect
        }
        val result = withContext(Dispatchers.IO) {
            runCatching {
                val root: SheetFileNode = if (path.startsWith("content://")) {
                    val treeUri = Uri.parse(path)
                    val rootDoc = DocumentFile.fromTreeUri(context, treeUri)
                        ?: return@runCatching SheetLoadState.Error("无法访问该目录，权限可能已失效")
                    buildSheetNodeFromSaf(context, rootDoc)
                } else {
                    val file = File(path)
                    if (!file.exists()) return@runCatching SheetLoadState.Error("目录不存在：$path")
                    buildSheetNodeFromFile(file)
                }
                SheetLoadState.Loaded(root)
            }.getOrElse { e ->
                SheetLoadState.Error("加载失败：${e.message}")
            }
        }
        // SAF 的 doc.uri 与原始 tree URI 可能不同，加载完成后
        // 用实际根节点路径初始化 expandedPaths，确保根始终展开
        if (result is SheetLoadState.Loaded) {
            expandedPaths = setOf(result.root.path)
        }
        loadState = result
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        dragHandle = { BottomSheetDefaults.DragHandle() },
        containerColor = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.85f)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
            // ── 标题栏 ──────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = project.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    if (project.description.isNotBlank()) {
                        Text(
                            text = project.description,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                // "文件树" 标签按钮（装饰性）
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.surfaceContainerHigh
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.FolderOpen,
                            contentDescription = null,
                            modifier = Modifier.size(14.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "文件树",
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }

            HorizontalDivider(
                modifier = Modifier.padding(top = 8.dp),
                color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)
            )

            // ── 文件树内容区 ─────────────────────────────────────
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                when (val state = loadState) {
                    is SheetLoadState.Loading -> {
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

                    is SheetLoadState.Error -> {
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
                                modifier = Modifier.size(48.dp),
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

                    is SheetLoadState.Loaded -> {
                        val displayRows = remember(state.root, expandedPaths) {
                            flattenSheetVisible(state.root, depth = 0, expanded = expandedPaths)
                        }

                        if (displayRows.isEmpty()) {
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
                                    modifier = Modifier.size(48.dp),
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
                                contentPadding = PaddingValues(vertical = 4.dp)
                            ) {
                                items(displayRows, key = { it.node.path }) { row ->
                                    val isExpanded = row.node.path in expandedPaths
                                    SheetFileTreeRow(
                                        row = row,
                                        isExpanded = isExpanded,
                                        onClick = {
                                            if (row.node.isDirectory) {
                                                expandedPaths = if (isExpanded) {
                                                    expandedPaths - row.node.path
                                                } else {
                                                    expandedPaths + row.node.path
                                                }
                                            } else {
                                                if (!openingFile) {
                                                    openingFile = true
                                                    scope.launch(Dispatchers.IO) {
                                                        val content =
                                                            readSheetFileContent(context, row.node.path)
                                                        withContext(Dispatchers.Main) {
                                                            openingFile = false
                                                            onOpenFile(
                                                                EditorFile(
                                                                    name = row.node.name,
                                                                    code = content,
                                                                    lang = row.node.extension.ifBlank { "txt" }
                                                                )
                                                            )
                                                        }
                                                    }
                                                }
                                            }
                                        },
                                        onContextMenu = {
                                            contextNode = row.node
                                            showContextSheet = true
                                        }
                                    )
                                }
                            }
                        }

                        // 打开文件时的遮罩
                        if (openingFile) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(MaterialTheme.colorScheme.scrim.copy(alpha = 0.2f)),
                                contentAlignment = Alignment.Center
                            ) {
                                CircularProgressIndicator()
                            }
                        }
                    }
                }
            }

            // ── 底部操作栏 ───────────────────────────────────────
            HorizontalDivider(
                color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                SheetBottomAction(label = "新建文件") {
                    newItemTargetPath = project.localPath ?: ""
                    showNewFileDialog = true
                }
                SheetBottomAction(label = "新建文件夹") {
                    newItemTargetPath = project.localPath ?: ""
                    showNewFolderDialog = true
                }
                SheetBottomAction(label = "上传文件", onClick = { /* TODO */ })
                SheetBottomAction(label = "下载", onClick = { /* TODO */ })
            }
        } // end Column

            // Snackbar 悬浮在内容上方
            SnackbarHost(
                hostState = snackbarHostState,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .navigationBarsPadding()
                    .padding(bottom = 64.dp)
            )
        } // end Box
    } // end ModalBottomSheet

    // ── 上下文菜单 BottomSheet ────────────────────────────────────────────────
    if (showContextSheet) {
        val node = contextNode ?: return
        val isFolder = node.isDirectory
        ModalBottomSheet(
            onDismissRequest = { showContextSheet = false },
            sheetState = contextSheetState,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
            ) {
                // 节点信息头
                ListItem(
                    headlineContent = {
                        Text(
                            node.name,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold
                        )
                    },
                    leadingContent = {
                        if (isFolder) {
                            Icon(
                                Icons.Outlined.Folder, null,
                                tint = Color(0xFFFFB74D),
                                modifier = Modifier.size(24.dp)
                            )
                        } else {
                            SheetFileExtBadge(node.extension)
                        }
                    },
                    supportingContent = {
                        Text(
                            node.path,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                )
                HorizontalDivider(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                )
                Spacer(Modifier.height(4.dp))

                SHEET_CONTEXT_ACTIONS
                    .filter { action ->
                        when (action.forFolder) {
                            true  -> isFolder
                            false -> !isFolder
                            null  -> true
                        }
                    }
                    .forEach { action ->
                        ListItem(
                            headlineContent = {
                                Text(
                                    action.label,
                                    color = if (action.isDestructive)
                                        MaterialTheme.colorScheme.error
                                    else
                                        MaterialTheme.colorScheme.onSurface
                                )
                            },
                            leadingContent = {
                                Icon(
                                    action.icon, null,
                                    modifier = Modifier.size(20.dp),
                                    tint = if (action.isDestructive)
                                        MaterialTheme.colorScheme.error
                                    else
                                        MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            },
                            modifier = Modifier.clickable {
                                scope.launch { contextSheetState.hide() }
                                showContextSheet = false
                                when (action.label) {
                                    "重命名"       -> { dialogTargetNode = node; showRenameDialog = true }
                                    "新建文件"     -> { newItemTargetPath = node.path; showNewFileDialog = true }
                                    "新建文件夹"   -> { newItemTargetPath = node.path; showNewFolderDialog = true }
                                    "在此打开终端" -> { /* TODO: open terminal at node.path */ }
                                    "复制路径"     -> {
                                        val cm = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                        cm.setPrimaryClip(ClipData.newPlainText("path", node.path))
                                        scope.launch { snackbarHostState.showSnackbar("路径已复制") }
                                    }
                                    "删除"         -> { dialogTargetNode = node; showDeleteDialog = true }
                                }
                            }
                        )
                    }
                Spacer(Modifier.height(8.dp))
            }
        }
    }

    // ── 重命名对话框 ──────────────────────────────────────────────────────────
    if (showRenameDialog) {
        val target = dialogTargetNode ?: return
        SheetInputDialog(
            title = "重命名",
            label = "新名称",
            initialText = target.name,
            confirmLabel = "重命名",
            onConfirm = { newName ->
                // TODO: 调用 FS rename（兼容 SAF / File 两种路径）
                showRenameDialog = false
            },
            onDismiss = { showRenameDialog = false }
        )
    }

    // ── 新建文件对话框 ────────────────────────────────────────────────────────
    if (showNewFileDialog) {
        SheetInputDialog(
            title = "新建文件",
            label = "文件名",
            placeholder = "例如：main.js",
            confirmLabel = "创建",
            onConfirm = { name ->
                // TODO: 调用 FS create file 于 newItemTargetPath
                showNewFileDialog = false
            },
            onDismiss = { showNewFileDialog = false }
        )
    }

    // ── 新建文件夹对话框 ──────────────────────────────────────────────────────
    if (showNewFolderDialog) {
        SheetInputDialog(
            title = "新建文件夹",
            label = "文件夹名",
            confirmLabel = "创建",
            onConfirm = { name ->
                // TODO: 调用 FS mkdir 于 newItemTargetPath
                showNewFolderDialog = false
            },
            onDismiss = { showNewFolderDialog = false }
        )
    }

    // ── 删除确认对话框 ────────────────────────────────────────────────────────
    if (showDeleteDialog) {
        val target = dialogTargetNode ?: return
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            icon = { Icon(Icons.Outlined.Delete, null, tint = MaterialTheme.colorScheme.error) },
            title = { Text("确认删除") },
            text = { Text("将永久删除「${target.name}」，此操作不可撤销。") },
            confirmButton = {
                Button(
                    onClick = {
                        // TODO: 调用 FS delete（兼容 SAF / File 两种路径）
                        showDeleteDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.error
                    )
                ) { Text("删除") }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteDialog = false }) { Text("取消") }
            }
        )
    }
}

// ─────────────────────────────────────────────
// 底部操作按钮
// ─────────────────────────────────────────────

@Composable
private fun SheetBottomAction(label: String, onClick: () -> Unit) {
    TextButton(
        onClick = onClick,
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

// ─────────────────────────────────────────────
// 文件树行 UI
// ─────────────────────────────────────────────

@Composable
private fun SheetFileTreeRow(
    row: SheetDisplayRow,
    isExpanded: Boolean,
    onClick: () -> Unit,
    onContextMenu: () -> Unit
) {
    val node = row.node
    val indentDp = (row.depth * 18 + 8).dp

    // 文件夹 chevron 旋转动画
    val chevronDeg by animateFloatAsState(
        targetValue = if (isExpanded) 90f else 0f,
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "chevron_${node.path}"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(start = indentDp, end = 4.dp, top = 5.dp, bottom = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // ── 左侧：chevron（文件夹） 或 对齐空位（文件） ──
        if (node.isDirectory) {
            Icon(
                imageVector = Icons.Outlined.ChevronRight,
                contentDescription = null,
                modifier = Modifier
                    .size(18.dp)
                    .rotate(chevronDeg),
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.55f)
            )
            Spacer(Modifier.width(4.dp))
            Icon(
                imageVector = if (isExpanded) Icons.Outlined.FolderOpen else Icons.Outlined.Folder,
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color(0xFFFFB74D)
            )
        } else {
            Spacer(Modifier.width(22.dp))   // 与文件夹 chevron(18) + gap(4) 对齐
            SheetFileExtBadge(node.extension)
        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = node.name,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f),
            fontFamily = if (!node.isDirectory) FontFamily.Monospace else FontFamily.Default,
            fontWeight = if (node.isDirectory) FontWeight.Medium else FontWeight.Normal
        )

        // ── 右侧：⋮ 上下文菜单按钮 ──
        IconButton(
            onClick = onContextMenu,
            modifier = Modifier.size(36.dp)
        ) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "更多操作",
                modifier = Modifier.size(18.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
            )
        }
    }
}

// ─────────────────────────────────────────────
// 文件扩展名 Badge（上下文菜单头部 & 文件行）
// ─────────────────────────────────────────────

@Composable
private fun SheetFileExtBadge(extension: String) {
    val bg = sheetFileIconColor(extension)
    Box(
        modifier = Modifier
            .size(width = 28.dp, height = 20.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(bg.copy(alpha = 0.18f)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = extension.take(3).uppercase().ifBlank { "?" },
            fontSize = 7.sp,
            fontWeight = FontWeight.Bold,
            color = bg,
            maxLines = 1
        )
    }
}

// ─────────────────────────────────────────────
// 通用输入对话框（重命名 / 新建）
// ─────────────────────────────────────────────

@Composable
private fun SheetInputDialog(
    title: String,
    label: String,
    initialText: String = "",
    placeholder: String = "",
    confirmLabel: String = "确定",
    onConfirm: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    var text by remember(initialText) { mutableStateOf(initialText) }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(title) },
        text = {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(label) },
                placeholder = if (placeholder.isNotEmpty()) ({ Text(placeholder) }) else null,
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
        },
        confirmButton = {
            Button(
                onClick = { if (text.isNotBlank()) onConfirm(text.trim()) },
                enabled = text.isNotBlank()
            ) { Text(confirmLabel) }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("取消") }
        }
    )
}

// ─────────────────────────────────────────────
// 树构建：java.io.File（本地绝对路径）
// ─────────────────────────────────────────────

private fun buildSheetNodeFromFile(file: File): SheetFileNode {
    return if (file.isDirectory) {
        val children = (file.listFiles() ?: emptyArray())
            .sortedWith(compareBy({ !it.isDirectory }, { it.name.lowercase() }))
            .map { buildSheetNodeFromFile(it) }
        SheetFileNode(
            name = file.name,
            path = file.absolutePath,
            isDirectory = true,
            extension = "",
            children = children
        )
    } else {
        SheetFileNode(
            name = file.name,
            path = file.absolutePath,
            isDirectory = false,
            extension = file.extension.lowercase()
        )
    }
}

// ─────────────────────────────────────────────
// 树构建：SAF DocumentFile（content URI）
// 修复：通过 MIME type 和 isDirectory 双重判断，
// 避免部分 Android 版本 DocumentFile.isDirectory
// 因 MIME 未缓存而错误返回 false 的问题
// ─────────────────────────────────────────────

private fun buildSheetNodeFromSaf(context: Context, doc: DocumentFile): SheetFileNode {
    val name = doc.name ?: "未知"
    // 双重检查：优先用 isDirectory，备用检查 MIME type
    val isDir = doc.isDirectory || doc.type == DocumentsContract.Document.MIME_TYPE_DIR
    return if (isDir) {
        val children = doc.listFiles()
            .filter { it.name != null } // 过滤掉名称为 null 的条目
            .sortedWith(compareBy(
                // 目录排前面：isDirectory 或 MIME 为目录型
                { !(it.isDirectory || it.type == DocumentsContract.Document.MIME_TYPE_DIR) },
                { it.name?.lowercase() ?: "" }
            ))
            .map { buildSheetNodeFromSaf(context, it) }
        SheetFileNode(
            name = name,
            path = doc.uri.toString(),
            isDirectory = true,
            extension = "",
            children = children
        )
    } else {
        val ext = name.substringAfterLast('.', "").lowercase()
        SheetFileNode(
            name = name,
            path = doc.uri.toString(),
            isDirectory = false,
            extension = ext
        )
    }
}

// ─────────────────────────────────────────────
// 将树展平为可见行列表（根节点本身不显示）
// ─────────────────────────────────────────────

private fun flattenSheetVisible(
    node: SheetFileNode,
    depth: Int,
    expanded: Set<String>
): List<SheetDisplayRow> {
    if (depth == 0) {
        if (node.path !in expanded) return emptyList()
        return node.children.flatMap { flattenSheetVisible(it, 1, expanded) }
    }
    val selfRow = SheetDisplayRow(node, depth)
    return if (node.isDirectory && node.path in expanded) {
        listOf(selfRow) + node.children.flatMap { flattenSheetVisible(it, depth + 1, expanded) }
    } else {
        listOf(selfRow)
    }
}

// ─────────────────────────────────────────────
// 读取文件内容
// ─────────────────────────────────────────────

private fun readSheetFileContent(context: Context, path: String): String {
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

private fun sheetFileIconColor(extension: String): Color = when (extension) {
    "js", "jsx", "mjs"            -> Color(0xFFF5C518)
    "ts", "tsx"                    -> Color(0xFF3178C6)
    "py"                           -> Color(0xFF3572A5)
    "kt", "kts"                    -> Color(0xFF7F52FF)
    "java"                         -> Color(0xFFB07219)
    "dart"                         -> Color(0xFF00B4AB)
    "html", "htm"                  -> Color(0xFFE34C26)
    "css", "scss", "sass", "less"  -> Color(0xFF563D7C)
    "json", "jsonc"                -> Color(0xFF40BF40)
    "md", "markdown"               -> Color(0xFF888888)
    "xml", "svg"                   -> Color(0xFFE07020)
    "sh", "bash", "zsh"            -> Color(0xFF89E051)
    "go"                           -> Color(0xFF00ADD8)
    "rs"                           -> Color(0xFFDEA584)
    "cpp", "cc", "cxx", "c", "h"  -> Color(0xFF555599)
    "rb"                           -> Color(0xFFCC342D)
    "php"                          -> Color(0xFF4F5D95)
    "swift"                        -> Color(0xFFFF6940)
    else                           -> Color(0xFF9E9E9E)
}
