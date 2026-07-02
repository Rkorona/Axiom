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
import io.axiom.editor.ui.screen.GitHubViewModel
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
fun AppNavigation(
    settingsViewModel: SettingsViewModel = viewModel(),
    gitHubViewModel: GitHubViewModel = viewModel(),
    editorSessionViewModel: EditorSessionViewModel = viewModel()
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

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

    val settings = settingsViewModel.settings

    // ── 打开文件：创建或复用选项卡 ──────────────────────────
    fun openFileInTab(
        filePath: String,
        projectId: String,
        projectName: String,
        projectLocalPath: String?
    ) {
        val enableTabs = settingsViewModel.settings.enableFileTabs
        val tabs = editorSessionViewModel.getTabs(projectId)
        if (!enableTabs || tabs.isEmpty()) {
            val tab = EditorTab(filePath, projectId, projectName, projectLocalPath)
            editorSessionViewModel.setTabs(projectId, listOf(tab))
            editorSessionViewModel.setActiveIndex(projectId, 0)
        } else {
            val existingIndex = tabs.indexOfFirst { it.filePath == filePath }
            if (existingIndex >= 0) {
                editorSessionViewModel.setActiveIndex(projectId, existingIndex)
            } else {
                val newTabs = tabs + EditorTab(filePath, projectId, projectName, projectLocalPath)
                editorSessionViewModel.setTabs(projectId, newTabs)
                editorSessionViewModel.setActiveIndex(projectId, newTabs.size - 1)
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
                settingsViewModel = settingsViewModel,
                onProjectClick = { project ->
                    // 点击项目直接进编辑器：有历史选项卡则恢复，否则空编辑器
                    if (!project.localPath.isNullOrBlank()) {
                        val tabs = editorSessionViewModel.getTabs(project.id)
                        if (tabs.isNotEmpty()) {
                            val savedIndex = editorSessionViewModel.getActiveIndex(project.id)
                            val clampedIndex = savedIndex.coerceIn(0, tabs.size - 1)
                            val activeTab = tabs[clampedIndex]
                            currentScreen = Screen.Editor(
                                filePath = activeTab.filePath,
                                projectId = project.id,
                                projectName = project.name,
                                projectLocalPath = project.localPath
                            )
                        } else {
                            currentScreen = Screen.Editor(
                                filePath = "",
                                projectId = project.id,
                                projectName = project.name,
                                projectLocalPath = project.localPath
                            )
                        }
                    }
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
                    scope.launch {
                        repository.deleteProject(project)
                        gitHubViewModel.refreshLocalRepos()
                    }
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
            val tabs = editorSessionViewModel.getTabs(screen.projectId)
            val activeIdx = editorSessionViewModel.getActiveIndex(screen.projectId)
                .coerceIn(0, maxOf(0, tabs.size - 1))
            val activeTab = tabs.getOrNull(activeIdx)
            val displayFilePath = activeTab?.filePath ?: screen.filePath

            EditorScreen(
                filePath = displayFilePath,
                onNavigateBack = {
                    // 返回首页但不清除选项卡，保留会话状态
                    currentScreen = Screen.Home
                },
                onFileSaved = {
                    val pid = activeTab?.projectId ?: screen.projectId
                    if (pid.isNotEmpty()) {
                        scope.launch { repository.updateLastModified(pid) }
                    }
                },
                settings = settings,
                projectName = activeTab?.projectName ?: screen.projectName,
                projectLocalPath = activeTab?.projectLocalPath ?: screen.projectLocalPath,
                tabFilePaths = tabs.map { it.filePath },
                activeTabIndex = activeIdx,
                onTabSelected = { index ->
                    editorSessionViewModel.setActiveIndex(screen.projectId, index)
                },
                onTabClose = { index ->
                    val currentTabs = editorSessionViewModel.getTabs(screen.projectId)
                    if (currentTabs.size == 1) {
                        editorSessionViewModel.clearTabs(screen.projectId)
                        currentScreen = Screen.Home
                    } else {
                        val newTabs = currentTabs.toMutableList().also { it.removeAt(index) }
                        editorSessionViewModel.setTabs(screen.projectId, newTabs)
                        val newActiveIdx = activeIdx.coerceAtMost(newTabs.size - 1)
                        editorSessionViewModel.setActiveIndex(screen.projectId, newActiveIdx)
                    }
                },
                onOpenNewTab = { newFilePath ->
                    openFileInTab(
                        filePath = newFilePath,
                        projectId = activeTab?.projectId ?: screen.projectId,
                        projectName = activeTab?.projectName ?: screen.projectName,
                        projectLocalPath = activeTab?.projectLocalPath ?: screen.projectLocalPath
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
