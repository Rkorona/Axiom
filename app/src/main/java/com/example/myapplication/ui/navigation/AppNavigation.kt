package com.example.myapplication.ui.navigation

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import com.example.myapplication.ui.model.Project
import com.example.myapplication.ui.model.ProjectType
import com.example.myapplication.ui.screen.EditorFile
import com.example.myapplication.ui.screen.EditorScreen
import com.example.myapplication.ui.screen.HomeScreen

// ─────────────────────────────────────────────
// 导航路由定义
// ─────────────────────────────────────────────

sealed class Screen {
    object Home : Screen()
    data class Editor(val file: EditorFile) : Screen()
}

// ─────────────────────────────────────────────
// 本地项目图标颜色循环色盘
// ─────────────────────────────────────────────

private val localProjectIconColors = listOf(
    Color(0xFFE53935), // 红
    Color(0xFF1565C0), // 深蓝
    Color(0xFF2E7D32), // 绿
    Color(0xFF6A1B9A), // 紫
    Color(0xFFE65100), // 橙
    Color(0xFF00838F), // 青
    Color(0xFF558B2F), // 草绿
    Color(0xFF4527A0), // 靛蓝
)

// ─────────────────────────────────────────────
// 导航状态机
// ─────────────────────────────────────────────

@Composable
fun AppNavigation() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

    // 项目列表：动态管理，无硬编码
    val projects = remember { mutableStateListOf<Project>() }

    // ── 文件夹选择器（导入本地项目）──────────────────
    val importFolderLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree()
    ) { uri: Uri? ->
        if (uri == null) return@rememberLauncherForActivityResult

        // 解析文件夹名称：取 URI 末段，去掉 "primary:" 前缀
        val rawSegment = uri.lastPathSegment ?: uri.toString()
        val folderName = rawSegment
            .substringAfterLast(':')   // 去掉 "primary:" 等存储卷前缀
            .substringAfterLast('/')   // 取最后一段路径
            .ifBlank { rawSegment }    // 若解析为空则回退原始值

        // 友好显示路径（用于 description 副标题）
        val displayPath = rawSegment
            .substringAfterLast(':')
            .ifBlank { "本地存储" }

        val colorIndex = projects.count { it.type == ProjectType.LOCAL } % localProjectIconColors.size
        val newProject = Project(
            id = System.currentTimeMillis().toString(),
            name = folderName,
            description = displayPath,
            type = ProjectType.LOCAL,
            lastModified = "刚刚",
            iconColor = localProjectIconColors[colorIndex],
            isActive = false,
            localPath = uri.toString()
        )
        projects.add(0, newProject) // 插入到列表头部，最新的在最上面
    }

    when (val screen = currentScreen) {
        is Screen.Home -> {
            HomeScreen(
                projects = projects,
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it },
                onProjectClick = { project ->
                    currentScreen = Screen.Editor(
                        file = projectToEditorFile(project)
                    )
                },
                onNewLocalProject = {
                    // 新建本地项目：打开空白编辑器
                    currentScreen = Screen.Editor(
                        file = EditorFile(
                            name = "untitled.js",
                            code = "// untitled.js\n// Start coding here...\n\n",
                            lang = "js"
                        )
                    )
                },
                onCloneGithub = {
                    // TODO: 打开 GitHub 克隆对话框
                },
                onImportFile = {
                    // 打开系统文件夹选择器
                    importFolderLauncher.launch(null)
                },
                onSettingsClick = {
                    // TODO: 后续接入设置页
                }
            )
        }

        is Screen.Editor -> {
            EditorScreen(
                file = screen.file,
                onBack = {
                    currentScreen = Screen.Home
                },
                onSave = { _ ->
                    // TODO: 写入本地文件或推送到 GitHub
                    currentScreen = Screen.Home
                }
            )
        }
    }
}

// ─────────────────────────────────────────────
// Project → EditorFile 转换
// ─────────────────────────────────────────────

private fun projectToEditorFile(project: Project): EditorFile {
    val lang = when {
        "flutter" in project.description  -> "dart"
        "compose" in project.description  -> "kotlin"
        "react" in project.description    -> "jsx"
        else                              -> "js"
    }
    return EditorFile(
        name = project.name,
        code = "// ${project.name}\n// ${project.description}\n",
        lang = lang
    )
}
