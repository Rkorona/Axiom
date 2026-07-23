package io.axiom.ui.settings

import io.axiom.data.model.SettingsCategory
import io.axiom.data.model.SettingsEntry
import io.axiom.data.model.defaultSettings

data class SettingsUiState(
    val activeCategory: SettingsCategory = SettingsCategory.APPEARANCE,
    val entries: List<SettingsEntry> = defaultSettings()
) {
    val visibleEntries: List<SettingsEntry>
        get() = entries.filter { it.category == activeCategory }
}
