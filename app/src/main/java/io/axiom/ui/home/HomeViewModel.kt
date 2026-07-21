package io.axiom.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.axiom.data.model.AppCommand
import io.axiom.data.model.CodeLanguage
import io.axiom.data.model.CommandCategory
import io.axiom.data.model.CommandMode
import io.axiom.data.model.FileItem
import io.axiom.data.model.SearchResult
import io.axiom.data.model.SymbolKind
import io.axiom.data.model.toGrouped
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    private var searchJob: Job? = null
    private var hintCycleJob: Job? = null

    // ── Mock Data ──────────────────────────────────────────────────────────────

    private val mockFiles = listOf(
        FileItem("1",  "MainActivity.kt",   "app/src/main/java/io/axiom/",              "kt",   language = CodeLanguage.KOTLIN),
        FileItem("2",  "HomeScreen.kt",     "app/src/main/java/io/axiom/ui/home/",      "kt",   language = CodeLanguage.KOTLIN),
        FileItem("3",  "HomeViewModel.kt",  "app/src/main/java/io/axiom/ui/home/",      "kt",   language = CodeLanguage.KOTLIN),
        FileItem("4",  "CommandBar.kt",     "app/src/main/java/io/axiom/ui/components/","kt",   language = CodeLanguage.KOTLIN),
        FileItem("5",  "Theme.kt",          "app/src/main/java/io/axiom/ui/theme/",     "kt",   language = CodeLanguage.KOTLIN),
        FileItem("6",  "Color.kt",          "app/src/main/java/io/axiom/ui/theme/",     "kt",   language = CodeLanguage.KOTLIN),
        FileItem("7",  "build.gradle.kts",  "",                                          "kts",  language = CodeLanguage.KOTLIN),
        FileItem("8",  "README.md",         "",                                          "md",   language = CodeLanguage.MARKDOWN),
        FileItem("9",  "index.ts",          "src/frontend/",                             "ts",   language = CodeLanguage.TYPESCRIPT),
        FileItem("10", "styles.scss",       "src/assets/",                               "scss", language = CodeLanguage.CSS),
        FileItem("11", "config.json",       "",                                          "json", language = CodeLanguage.JSON),
        FileItem("12", "main.py",           "scripts/",                                  "py",   language = CodeLanguage.PYTHON),
        FileItem("13", "server.go",         "backend/",                                  "go",   language = CodeLanguage.GO),
        FileItem("14", "App.swift",         "ios/Sources/",                              "swift",language = CodeLanguage.SWIFT),
        FileItem("15", "main.rs",           "src/",                                      "rs",   language = CodeLanguage.RUST),
        FileItem("16", "Component.tsx",     "src/components/",                           "tsx",  language = CodeLanguage.TYPESCRIPT),
        FileItem("17", "deploy.sh",         "scripts/",                                  "sh",   language = CodeLanguage.SHELL),
        FileItem("18", "docker-compose.yml","",                                          "yml",  language = CodeLanguage.YAML),
    )

    private val mockCommands = listOf(
        AppCommand("new_file",       "New File",            "Create a new file in the current directory",   "⌘N",   CommandCategory.FILE),
        AppCommand("new_folder",     "New Folder",          "Create a new folder",                          "⌘⇧N",  CommandCategory.FILE),
        AppCommand("save_all",       "Save All",            "Save all unsaved changes",                     "⌘⇧S",  CommandCategory.FILE),
        AppCommand("close_file",     "Close File",          "Close the active editor tab",                  "⌘W",   CommandCategory.FILE),
        AppCommand("find_replace",   "Find & Replace",      "Search and replace across all project files",  "⌘⇧F",  CommandCategory.EDIT),
        AppCommand("format_doc",     "Format Document",     "Run the code formatter on the current file",   "⌘⇧I",  CommandCategory.EDIT),
        AppCommand("rename_symbol",  "Rename Symbol",       "Refactor: rename symbol under cursor",         "F2",    CommandCategory.EDIT),
        AppCommand("open_terminal",  "Open Terminal",       "Open integrated terminal panel",               "⌘`",   CommandCategory.TERMINAL),
        AppCommand("split_editor",   "Split Editor",        "Split editor horizontally or vertically",      "⌘\\",  CommandCategory.VIEW),
        AppCommand("toggle_minimap", "Toggle Minimap",      "Show or hide the code minimap",                null,   CommandCategory.VIEW),
        AppCommand("toggle_theme",   "Toggle Theme",        "Switch between dark and light colour scheme",  null,   CommandCategory.VIEW),
        AppCommand("git_status",     "Git Status",          "Show working tree status",                     null,   CommandCategory.GIT),
        AppCommand("git_commit",     "Git Commit",          "Stage all changes and open commit dialog",     null,   CommandCategory.GIT),
        AppCommand("git_push",       "Git Push",            "Push commits to remote",                       null,   CommandCategory.GIT),
        AppCommand("settings",       "Settings",            "Open application settings",                    "⌘,",   CommandCategory.GENERAL),
        AppCommand("command_palette","Command Palette",     "Open this command palette",                    "⌘⇧P",  CommandCategory.GENERAL),
    )

    init {
        _uiState.update { state ->
            state.copy(
                recentFiles = mockFiles.take(6),
                pinnedFiles = mockFiles.filter { it.id in listOf("1", "7") }
                                      .map { it.copy(isPinned = true) }
            )
        }
        startHintCycle()
    }

    // ── Public Events ──────────────────────────────────────────────────────────

    fun onQueryChange(query: String) {
        val mode = when {
            query.startsWith(">") -> CommandMode.COMMAND
            query.startsWith("#") -> CommandMode.SYMBOL
            else                  -> CommandMode.FILE
        }

        _uiState.update { it.copy(query = query, commandMode = mode, isSearching = true) }

        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            delay(SEARCH_DEBOUNCE_MS)
            val results = performSearch(query, mode)
            val grouped = results.toGrouped()
            _uiState.update {
                it.copy(
                    groupedResults = grouped,
                    isSearching    = false,
                    showEmptyState = query.isNotBlank() && grouped.isEmpty
                )
            }
        }
    }

    fun onCommandBarFocusChange(focused: Boolean) {
        _uiState.update { it.copy(isCommandBarFocused = focused) }
        if (focused) {
            hintCycleJob?.cancel()
        } else {
            startHintCycle()
        }
    }

    fun onClearQuery() {
        searchJob?.cancel()
        _uiState.update {
            it.copy(
                query          = "",
                commandMode    = CommandMode.FILE,
                groupedResults = io.axiom.data.model.GroupedResults(),
                isSearching    = false,
                showEmptyState = false
            )
        }
    }

    fun onFilePinToggle(file: FileItem) {
        val newPinned = if (_uiState.value.pinnedFiles.any { it.id == file.id }) {
            _uiState.value.pinnedFiles.filterNot { it.id == file.id }
        } else {
            _uiState.value.pinnedFiles + file.copy(isPinned = true)
        }
        _uiState.update { it.copy(pinnedFiles = newPinned) }
    }

    // ── Private Helpers ────────────────────────────────────────────────────────

    private fun startHintCycle() {
        hintCycleJob?.cancel()
        hintCycleJob = viewModelScope.launch {
            var index = 0
            while (true) {
                delay(HINT_CYCLE_INTERVAL_MS)
                index = (index + 1) % commandBarHints.size
                _uiState.update { it.copy(placeholderIndex = index) }
            }
        }
    }

    private fun performSearch(query: String, mode: CommandMode): List<SearchResult> {
        val effectiveQuery = when (mode) {
            CommandMode.COMMAND -> query.removePrefix(">").trim()
            CommandMode.SYMBOL  -> query.removePrefix("#").trim()
            CommandMode.FILE    -> query.trim()
        }
        if (effectiveQuery.isBlank()) return emptyList()

        return when (mode) {
            CommandMode.FILE -> searchFiles(effectiveQuery)
            CommandMode.COMMAND -> searchCommands(effectiveQuery)
            CommandMode.SYMBOL -> searchSymbols(effectiveQuery)
        }
    }

    private fun searchFiles(query: String): List<SearchResult> =
        mockFiles
            .filter {
                it.name.contains(query, ignoreCase = true) ||
                it.path.contains(query, ignoreCase = true) ||
                it.extension.contains(query, ignoreCase = true)
            }
            .sortedByDescending { it.name.startsWith(query, ignoreCase = true) }
            .take(MAX_FILE_RESULTS)
            .map { SearchResult.FileResult(it) }

    private fun searchCommands(query: String): List<SearchResult> =
        mockCommands
            .filter {
                it.title.contains(query, ignoreCase = true) ||
                it.description.contains(query, ignoreCase = true) ||
                it.category.label.contains(query, ignoreCase = true)
            }
            .sortedByDescending { it.title.startsWith(query, ignoreCase = true) }
            .take(MAX_COMMAND_RESULTS)
            .map { SearchResult.CommandResult(it) }

    private fun searchSymbols(query: String): List<SearchResult> {
        val codeFiles = mockFiles.filter {
            it.language in listOf(
                CodeLanguage.KOTLIN, CodeLanguage.JAVA, CodeLanguage.TYPESCRIPT,
                CodeLanguage.JAVASCRIPT, CodeLanguage.PYTHON, CodeLanguage.SWIFT,
                CodeLanguage.RUST, CodeLanguage.GO
            )
        }
        return codeFiles.flatMap { file ->
            listOf(
                SearchResult.SymbolResult("fun ${query}Screen()",       SymbolKind.FUNCTION,  file, 12),
                SearchResult.SymbolResult("class ${query}ViewModel",    SymbolKind.CLASS,     file, 34),
                SearchResult.SymbolResult("val ${query}State",          SymbolKind.VARIABLE,  file, 56),
                SearchResult.SymbolResult("interface I${query}Service", SymbolKind.INTERFACE, file, 78),
            ).filter { it.symbol.contains(query, ignoreCase = true) }
        }.take(MAX_SYMBOL_RESULTS)
    }

    override fun onCleared() {
        super.onCleared()
        searchJob?.cancel()
        hintCycleJob?.cancel()
    }

    companion object {
        private const val SEARCH_DEBOUNCE_MS      = 120L
        private const val HINT_CYCLE_INTERVAL_MS  = 3_000L
        private const val MAX_FILE_RESULTS        = 12
        private const val MAX_COMMAND_RESULTS     = 8
        private const val MAX_SYMBOL_RESULTS      = 8
    }
}
