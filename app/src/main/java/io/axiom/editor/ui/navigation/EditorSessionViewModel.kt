package io.axiom.editor.ui.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EditorSessionViewModel : ViewModel() {

    private var _tabsByProject by mutableStateOf<Map<String, List<EditorTab>>>(emptyMap())
    private var _activeIndexByProject by mutableStateOf<Map<String, Int>>(emptyMap())

    fun getTabs(projectId: String): List<EditorTab> =
        _tabsByProject[projectId] ?: emptyList()

    fun getActiveIndex(projectId: String): Int =
        _activeIndexByProject[projectId] ?: 0

    fun hasTabs(projectId: String): Boolean =
        (_tabsByProject[projectId]?.isNotEmpty()) == true

    fun setTabs(projectId: String, tabs: List<EditorTab>) {
        _tabsByProject = _tabsByProject + (projectId to tabs)
    }

    fun setActiveIndex(projectId: String, index: Int) {
        _activeIndexByProject = _activeIndexByProject + (projectId to index)
    }

    fun clearTabs(projectId: String) {
        _tabsByProject = _tabsByProject - projectId
        _activeIndexByProject = _activeIndexByProject - projectId
    }
}
