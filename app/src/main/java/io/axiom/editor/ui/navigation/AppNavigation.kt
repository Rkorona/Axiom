package io.axiom.editor.ui.navigation

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import androidx.documentfile.provider.DocumentFile
import androidx.lifecycle.viewmodel.compose.viewModel
import io.axiom.editor.data.ProjectRepository
import io.axiom.editor.data.SettingsViewModel
import io.axiom.editor.ui.component.NewLocalProjectDialog
import io.axiom.editor.ui.model.Project
import io.axiom.editor.ui.model.ProjectLanguage
import io.axiom.editor.ui.model.ProjectType
import io.axiom.editor.ui.screen.EditorScreen
import io.axiom.editor.ui.screen.HomeScreen
import io.axiom.editor.ui.screen.TerminalScreen
import kotlinx.coroutines.launch
import java.io.File

// ─────────────────────────────────────────────
// 导航路由定义
// ─────────────────────────────────────────────
sealed class Screen {
    object Home : Screen()
    object Terminal : Screen()
    data class Editor(
        val filePath: String,
        val projectId: String,
        val projectName: String = "",
        val projectLocalPath: String? = null
    ) : Screen()
}

// 编辑器选项卡数据
data class EditorTab(
    val filePath: String,
    val projectId: String,
    val projectName: String,
    val projectLocalPath: String?
)

// ─────────────────────────────────────────────
// 导航状态机
// ─────────────────────────────────────────────
@Composable
fun AppNavigation(settingsViewModel: SettingsViewModel = viewModel()) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

    // 文件选项卡状态
    var editorTabs by remember { mutableStateOf<List<EditorTab>>(emptyList()) }
    var activeTabIndex by remember { mutableIntStateOf(0) }

    // 通过 Repository 从数据库加载项目列表
    val repository = remember { ProjectRepository(context) }
    val projects by repository.projects.collectAsState(initial = emptyList())

    // 对语言仍为 UNKNOWN 且路径为普通文件系统路径的项目，后台重新扫描并更新
    LaunchedEffect(projects) {
        projects.filter { it.language == ProjectLanguage.UNKNOWN && it.localPath != null }
            .forEach { project ->
                val path = project.localPath!!
                if (!path.startsWith("content://")) {
                    val files = File(path).list()?.toList() ?: emptyList()
                    val detected = ProjectLanguage.detect(files)
                    if (detected != ProjectLanguage.UNKNOWN) {
                        scope.launch { repository.updateProjectLanguage(project.id, detected) }
                    }
                }
            }
    }

    // 弹窗状态
    var showNewLocalDialog by remember { mutableStateOf(false) }

    // ── 文件夹选择器（导入已有本地项目）──────────────────
    val importFolderLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree()
    ) { uri: Uri? ->
        if (uri == null) return@rememberLauncherForActivityResult

        val persistFlags = Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
        runCatching {
            context.contentResolver.takePersistableUriPermission(uri, persistFlags)
        }

        val rawSegment = uri.lastPathSegment ?: uri.toString()
        val folderName = rawSegment
            .substringAfterLast(':')
            .substringAfterLast('/')
            .ifBlank { rawSegment }

        val readablePath = rawSegment
            .substringAfterLast(':')
            .let { relativePath ->
                if (relativePath.isNotBlank()) "/storage/emulated/0/$relativePath"
                else uri.toString()
            }

        val fileNames = DocumentFile.fromTreeUri(context, uri)
            ?.listFiles()
            ?.mapNotNull { it.name?.lowercase() }
            ?: emptyList()
        val detectedLanguage = ProjectLanguage.detect(fileNames)

        val newProject = Project(
            id = System.currentTimeMillis().toString(),
            name = folderName,
            description = readablePath,
            type = ProjectType.LOCAL,
            lastModified = System.currentTimeMillis(),
            isActive = false,
            localPath = uri.toString(),
            language = detectedLanguage,
        )
        scope.launch { repository.addProject(newProject) }
    }

    var selectedProject by remember { mutableStateOf<Project?>(null) }
    val settings = settingsViewModel.settings

    // ── 打开文件：创建或复用选项卡 ──────────────────────────
    fun openFileInTab(
        filePath: String,
        projectId: String,
        projectName: String,
        projectLocalPath: String?
    ) {
        val enableTabs = settingsViewModel.settings.enableFileTabs
        if (!enableTabs || editorTabs.isEmpty()) {
            // 无选项卡模式或首次打开：直接替换
            val tab = EditorTab(filePath, projectId, projectName, projectLocalPath)
            editorTabs = listOf(tab)
            activeTabIndex = 0
        } else {
            // 查找是否已有此文件的选项卡
            val existingIndex = editorTabs.indexOfFirst { it.filePath == filePath }
            if (existingIndex >= 0) {
                activeTabIndex = existingIndex
            } else {
                editorTabs = editorTabs + EditorTab(filePath, projectId, projectName, projectLocalPath)
                activeTabIndex = editorTabs.size - 1
            }
        }
        currentScreen = Screen.Editor(
            filePath = filePath,
            projectId = projectId,
            projectName = projectName,
            projectLocalPath = projectLocalPath
        )
    }

    when (val screen = currentScreen) {
        is Screen.Home -> {
            HomeScreen(
                projects = projects,
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it },
                selectedProject = selectedProject,
                settingsViewModel = settingsViewModel,
                onProjectClick = { project ->
                    if (!project.localPath.isNullOrBlank()) {
                        selectedProject = project
                    }
                },
                onProjectSheetDismiss = { selectedProject = null },
                onOpenFile = { filePath ->
                    val proj = selectedProject
                    selectedProject = null
                    // 从首页进入时，清空选项卡状态并重新开始
                    editorTabs = emptyList()
                    openFileInTab(
                        filePath = filePath,
                        projectId = proj?.id ?: "",
                        projectName = proj?.name ?: "",
                        projectLocalPath = proj?.localPath
                    )
                },
                onNewLocalProject = { showNewLocalDialog = true },
                onCloneGithub = {},
                onImportFile = { importFolderLauncher.launch(null) },
                onFromTemplate = {},
                onSettingsClick = {},
                onTerminalClick = { currentScreen = Screen.Terminal },
                onEditProject = { project, newName ->
                    scope.launch { repository.updateProjectName(project.id, newName) }
                },
                onDeleteProject = { project ->
                    scope.launch { repository.deleteProject(project.id) }
                },
                onCopyProject = { project ->
                    scope.launch { repository.copyProject(project) }
                }
            )
        }

        is Screen.Terminal -> {
            TerminalScreen(
                onNavigateBack = { currentScreen = Screen.Home },
                settings = settings
            )
        }

        is Screen.Editor -> {
            val activeTab = editorTabs.getOrNull(activeTabIndex)
            EditorScreen(
                filePath = activeTab?.filePath ?: screen.filePath,
                onNavigateBack = { currentScreen = Screen.Home; editorTabs = emptyList() },
                onFileSaved = {
                    val pid = activeTab?.projectId ?: screen.projectId
                    if (pid.isNotEmpty()) {
                        scope.launch { repository.updateLastModified(pid) }
                    }
                },
                settings = settings,
                projectName = activeTab?.projectName ?: screen.projectName,
                projectLocalPath = activeTab?.projectLocalPath ?: screen.projectLocalPath,
                // 选项卡相关
                tabFilePaths = editorTabs.map { it.filePath },
                activeTabIndex = activeTabIndex,
                onTabSelected = { index ->
                    activeTabIndex = index
                },
                onTabClose = { index ->
                    if (editorTabs.size == 1) {
                        currentScreen = Screen.Home
                        editorTabs = emptyList()
                    } else {
                        val newTabs = editorTabs.toMutableList().also { it.removeAt(index) }
                        editorTabs = newTabs
                        activeTabIndex = (activeTabIndex).coerceAtMost(newTabs.size - 1)
                    }
                },
                onOpenNewTab = { newFilePath ->
                    val currentTab = editorTabs.getOrNull(activeTabIndex)
                    openFileInTab(
                        filePath = newFilePath,
                        projectId = currentTab?.projectId ?: screen.projectId,
                        projectName = currentTab?.projectName ?: screen.projectName,
                        projectLocalPath = currentTab?.projectLocalPath ?: screen.projectLocalPath
                    )
                }
            )
        }
    }

    if (showNewLocalDialog) {
        NewLocalProjectDialog(
            onConfirm = { name, localPath ->
                val newProject = Project(
                    id = System.currentTimeMillis().toString(),
                    name = name,
                    description = "本地项目",
                    type = ProjectType.LOCAL,
                    lastModified = System.currentTimeMillis(),
                    isActive = false,
                    localPath = localPath,
                    language = localPath?.let { path ->
                        val files = java.io.File(path).list()?.toList() ?: emptyList()
                        ProjectLanguage.detect(files)
                    } ?: ProjectLanguage.UNKNOWN,
                )
                scope.launch { repository.addProject(newProject) }
                showNewLocalDialog = false
            },
            onDismiss = { showNewLocalDialog = false }
        )
    }
}
