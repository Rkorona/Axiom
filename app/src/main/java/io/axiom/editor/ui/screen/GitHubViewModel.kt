package io.axiom.editor.ui.screen

import android.app.Application
import android.content.Context
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.net.toUri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import io.axiom.editor.data.GitHubOAuthBus
import io.axiom.editor.data.GitHubOAuthService
import io.axiom.editor.data.GitHubStore
import io.axiom.editor.ui.model.ChangedFile
import io.axiom.editor.ui.model.CommitRecord
import io.axiom.editor.ui.model.FileChangeStatus
import io.axiom.editor.ui.model.LocalRepo
import io.axiom.editor.ui.model.RemoteRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

enum class GitHubLoginState { Idle, Loading, Error }

class GitHubViewModel(application: Application) : AndroidViewModel(application) {

    private val store = GitHubStore(application)

    // ── 登录状态 ──────────────────────────────────────────────────────
    var loginState by mutableStateOf(GitHubLoginState.Idle)
        private set

    var loginError by mutableStateOf("")
        private set

    var isLoggedIn by mutableStateOf(false)
        private set

    var userName by mutableStateOf("")
        private set

    var userAvatarUrl by mutableStateOf<String?>(null)
        private set

    init {
        val saved = store.load()
        isLoggedIn    = saved.isLoggedIn
        userName      = saved.username
        userAvatarUrl = saved.avatarUrl.ifEmpty { null }

        viewModelScope.launch {
            GitHubOAuthBus.codeFlow.collect { code ->
                exchangeCodeAndLogin(code)
            }
        }
    }

    // ── 展开卡片 ──────────────────────────────────────────────────────
    var expandedRepoName by mutableStateOf<String?>(null)
        private set

    var expandedTabIndex by mutableStateOf(0)
        private set

    // ── 本地仓库数据 ──────────────────────────────────────────────────
    var localRepos by mutableStateOf(
        listOf(
            LocalRepo("codemirror6", "main", uncommittedChanges = 2),
            LocalRepo("axiom-editor", "feature/git-integration", unpushedCommits = 1),
            LocalRepo("kotlin-compiler", "develop")
        )
    )
        private set

    var changedFiles by mutableStateOf(
        mapOf(
            "codemirror6" to listOf(
                ChangedFile("src/extensions/search.ts", FileChangeStatus.MODIFIED),
                ChangedFile("src/view/editorView.ts", FileChangeStatus.MODIFIED)
            ),
            "axiom-editor" to listOf(
                ChangedFile(
                    "app/src/main/java/io/axiom/editor/ui/screen/GitHubScreen.kt",
                    FileChangeStatus.ADDED, isStaged = true
                ),
                ChangedFile(
                    "app/src/main/java/io/axiom/editor/ui/screen/GitHubViewModel.kt",
                    FileChangeStatus.ADDED, isStaged = true
                ),
                ChangedFile("README.md", FileChangeStatus.MODIFIED, isStaged = false)
            ),
            "kotlin-compiler" to emptyList()
        )
    )
        private set

    var commitHistory by mutableStateOf(
        mapOf(
            "codemirror6" to listOf(
                CommitRecord("a3f12bc", "Fix selection rendering bug", "YangHuaYong", "2 小时前"),
                CommitRecord("9d2e4f1", "Add search extension API", "YangHuaYong", "昨天"),
                CommitRecord("5c81a30", "Refactor viewport management", "contributor", "3 天前")
            ),
            "axiom-editor" to listOf(
                CommitRecord("f7b3c92", "feat: GitHub integration screen", "YangHuaYong", "刚刚", isPushed = false),
                CommitRecord("2a9d1e4", "refactor: theme system overhaul", "YangHuaYong", "1 天前"),
                CommitRecord("8f4b730", "fix: editor crash on large files", "YangHuaYong", "3 天前")
            ),
            "kotlin-compiler" to listOf(
                CommitRecord("1b4d8e2", "Update to Kotlin 2.1.0", "JetBrains", "1 周前"),
                CommitRecord("c9f2a57", "Performance improvements", "JetBrains", "2 周前")
            )
        )
    )
        private set

    // ── 云端仓库数据 ──────────────────────────────────────────────────
    var remoteRepos by mutableStateOf(
        listOf(
            RemoteRepo("Free-SS-NODES", 142, "Python"),
            RemoteRepo("awesome-kotlin", 12400, "Kotlin"),
            RemoteRepo("JetBrains/kotlin", 48000, "Kotlin"),
            RemoteRepo("flutter/flutter", 168000, "Dart")
        )
    )
        private set

    var searchQuery by mutableStateOf("")
        private set

    // ── OAuth 登录 ────────────────────────────────────────────────────

    fun startOAuthFlow(context: Context) {
        val authUrl = GitHubOAuthService.buildAuthUrl()
        val customTabsIntent = CustomTabsIntent.Builder().build()
        customTabsIntent.launchUrl(context, authUrl.toUri())
    }

    private fun exchangeCodeAndLogin(code: String) {
        viewModelScope.launch {
            loginState = GitHubLoginState.Loading
            loginError = ""
            try {
                val (token, userInfo) = withContext(Dispatchers.IO) {
                    val token = GitHubOAuthService.exchangeCodeForToken(code)
                    val userInfo = GitHubOAuthService.getUserInfo(token)
                    token to userInfo
                }
                isLoggedIn    = true
                userName      = userInfo.login
                userAvatarUrl = userInfo.avatarUrl
                store.save(userInfo.login, userInfo.avatarUrl, token)
                loginState    = GitHubLoginState.Idle
            } catch (e: Exception) {
                loginState = GitHubLoginState.Error
                loginError = e.message ?: "登录失败，请重试"
            }
        }
    }

    fun clearLoginError() {
        if (loginState == GitHubLoginState.Error) {
            loginState = GitHubLoginState.Idle
            loginError = ""
        }
    }

    fun logout() {
        isLoggedIn    = false
        userName      = ""
        userAvatarUrl = null
        loginState    = GitHubLoginState.Idle
        loginError    = ""
        store.clear()
    }

    // ── 仓库操作 ──────────────────────────────────────────────────────

    fun toggleRepoExpansion(repoName: String) {
        expandedRepoName = if (expandedRepoName == repoName) null else repoName
        expandedTabIndex = 0
    }

    fun switchExpandedTab(index: Int) {
        expandedTabIndex = index
    }

    fun toggleFileStaged(repoName: String, filePath: String) {
        val files = changedFiles[repoName] ?: return
        changedFiles = changedFiles + (repoName to files.map { f ->
            if (f.path == filePath) f.copy(isStaged = !f.isStaged) else f
        })
    }

    fun stageAll(repoName: String) {
        val files = changedFiles[repoName] ?: return
        changedFiles = changedFiles + (repoName to files.map { it.copy(isStaged = true) })
    }

    fun unstageAll(repoName: String) {
        val files = changedFiles[repoName] ?: return
        changedFiles = changedFiles + (repoName to files.map { it.copy(isStaged = false) })
    }

    fun updateSearchQuery(query: String) {
        searchQuery = query
    }
}
