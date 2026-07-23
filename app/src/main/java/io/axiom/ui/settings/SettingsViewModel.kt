package io.axiom.ui.settings

import androidx.lifecycle.ViewModel
import io.axiom.data.model.SettingsCategory
import io.axiom.data.model.SettingValue
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SettingsViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()

    fun onCategorySelect(category: SettingsCategory) {
        _uiState.update { it.copy(activeCategory = category) }
    }

    fun onToggle(entryId: String) {
        _uiState.update { state ->
            state.copy(entries = state.entries.map { entry ->
                if (entry.id == entryId && entry.value is SettingValue.Toggle)
                    entry.copy(value = entry.value.copy(enabled = !entry.value.enabled))
                else entry
            })
        }
    }

    fun onSelectChange(entryId: String, selected: String) {
        _uiState.update { state ->
            state.copy(entries = state.entries.map { entry ->
                if (entry.id == entryId && entry.value is SettingValue.Select)
                    entry.copy(value = entry.value.copy(selected = selected))
                else entry
            })
        }
    }

    fun onStepperChange(entryId: String, delta: Int) {
        _uiState.update { state ->
            state.copy(entries = state.entries.map { entry ->
                if (entry.id == entryId && entry.value is SettingValue.Stepper) {
                    val v = entry.value
                    entry.copy(value = v.copy(value = (v.value + delta).coerceIn(v.min, v.max)))
                } else entry
            })
        }
    }

    fun onAccentChange(entryId: String, accent: String) {
        _uiState.update { state ->
            state.copy(entries = state.entries.map { entry ->
                if (entry.id == entryId && entry.value is SettingValue.AccentPicker)
                    entry.copy(value = SettingValue.AccentPicker(accent))
                else entry
            })
        }
    }
}
