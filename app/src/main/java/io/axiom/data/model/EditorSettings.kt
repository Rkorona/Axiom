package io.axiom.data.model

/**
 * Snapshot of editor-specific user preferences consumed by [SoraCodeEditor].
 * Sourced from [AppSettingsRepository] and surfaced through [EditorUiState].
 */
data class EditorSettings(
    val fontSize:    Int     = 14,
    val wordWrap:    Boolean = false,
    val lineNumbers: Boolean = true
)
