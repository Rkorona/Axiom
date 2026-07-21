package io.axiom.ui.home

import io.axiom.data.model.CommandMode
import io.axiom.data.model.FileItem
import io.axiom.data.model.GroupedResults
import io.axiom.data.model.SearchResult

/**
 * Immutable snapshot of everything the Home screen needs to render.
 * Produced by [HomeViewModel] and consumed by [HomeScreen].
 */
data class HomeUiState(
    /** The current raw text inside the Command Bar. */
    val query: String = "",

    /** Whether the Command Bar text field currently has focus. */
    val isCommandBarFocused: Boolean = false,

    /** Derived from query prefix: FILE by default, COMMAND on '>', SYMBOL on '#'. */
    val commandMode: CommandMode = CommandMode.FILE,

    /** The six most recently opened files — shown as wings when idle. */
    val recentFiles: List<FileItem> = emptyList(),

    /** Files the user has explicitly pinned to the top. */
    val pinnedFiles: List<FileItem> = emptyList(),

    /** Live search results, grouped by result type for section rendering. */
    val groupedResults: GroupedResults = GroupedResults(),

    /** True while the search debounce timer is running / async work in flight. */
    val isSearching: Boolean = false,

    /**
     * Dynamic greeting shown in the hero area when the bar is idle.
     * Cycles through several messages over time.
     */
    val greetingText: String = "What are we building today?",

    /** Index into the placeholder hint cycle — drives animated placeholder text. */
    val placeholderIndex: Int = 0,

    /** Whether the "no results" empty state should be displayed. */
    val showEmptyState: Boolean = false
)

/** Placeholder hints that cycle in the Command Bar when it's idle. */
val commandBarHints: List<String> = listOf(
    "Search files…",
    "Type > for commands",
    "Type # to jump to a symbol",
    "Open anything, instantly",
    "Your code, your command"
)
