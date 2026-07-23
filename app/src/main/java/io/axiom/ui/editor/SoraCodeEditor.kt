package io.axiom.ui.editor

import android.graphics.Typeface
import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import io.axiom.data.model.CodeLanguage
import io.axiom.data.model.EditorSettings
import io.axiom.ui.editor.textmate.TextMateManager
import io.github.rosemoe.sora.event.ContentChangeEvent
import io.github.rosemoe.sora.widget.CodeEditor

/**
 * Compose wrapper around sora-editor's [CodeEditor] with TextMate syntax highlighting.
 *
 * Settings are applied **only when their value changes** — this prevents sora-editor
 * from calling `invalidate()` on every keystroke (which caused the editor to flash).
 *
 * - [EditorSettings.tabSize]    → `editor.tabWidth`  (visual tab width + auto-indent unit)
 * - [EditorSettings.autoIndent] → `editor.props.autoIndent`  (auto-indent on Enter)
 * - [EditorSettings.wordWrap]   → `editor.isWordwrap`
 * - [EditorSettings.lineNumbers]→ `editor.isLineNumberEnabled`
 * - [EditorSettings.fontSize]   → `editor.setTextSize`
 *
 * Language is only recreated when the active file or its detected language changes —
 * NOT on every settings change — so there is no recomposition side-effect from typing.
 *
 * File switching:
 * Content and language are only reloaded when [fileKey] changes, never on
 * every recomposition or keystroke — this prevents cursor-jump and flash on typing.
 */
@Composable
fun SoraCodeEditor(
    content:         String,
    fileKey:         String,
    language:        CodeLanguage,
    onContentChange: (String) -> Unit,
    settings:        EditorSettings = EditorSettings(),
    modifier:        Modifier       = Modifier
) {
    val context       = LocalContext.current
    val onChangeState = rememberUpdatedState(onContentChange)

    // Track the last loaded file so we only reload content on file changes.
    var lastFileKey by remember { mutableStateOf<String?>(null) }
    // Track the last language key so we only recreate the language when needed.
    var lastLangKey by remember { mutableStateOf<String?>(null) }
    // Track the last applied settings to skip redundant sora-editor property writes.
    // Sora-editor setters call invalidate() even when the value hasn't changed,
    // causing a visible flash on every keystroke if we apply them unconditionally.
    var lastSettings by remember { mutableStateOf<EditorSettings?>(null) }

    remember(context) { TextMateManager.init(context) }

    AndroidView(
        factory = { ctx ->
            TextMateManager.init(ctx)

            CodeEditor(ctx).apply {

                // ── Theme ──────────────────────────────────────────────────────
                TextMateManager.applyTheme(this)

                // ── Typography ─────────────────────────────────────────────────
                typefaceText = Typeface.MONOSPACE
                setTextSize(settings.fontSize.toFloat())
                tabWidth = settings.tabSize

                // ── Layout behaviour ───────────────────────────────────────────
                isWordwrap          = settings.wordWrap
                isLineNumberEnabled = settings.lineNumbers
                nonPrintablePaintingFlags = 0

                // ── Auto-indent ────────────────────────────────────────────────
                // props.autoIndent controls whether the editor applies grammar-driven
                // indentation on Enter. This is the correct toggle — mapping to
                // TextMateLanguage.autoCompleteEnabled only controls the popup.
                props.autoIndent = settings.autoIndent

                // ── Scrollbars ─────────────────────────────────────────────────
                isVerticalScrollBarEnabled   = false
                isHorizontalScrollBarEnabled = false
                overScrollMode               = View.OVER_SCROLL_NEVER

                // ── Language ───────────────────────────────────────────────────
                setEditorLanguage(TextMateManager.createLanguage(language))

                // ── Content change → ViewModel ─────────────────────────────────
                subscribeEvent(ContentChangeEvent::class.java) { _, _ ->
                    onChangeState.value(text.toString())
                }
            }
        },
        update = { editor ->

            // ── Settings — only write properties whose value actually changed ──
            // Skipping unchanged writes prevents sora-editor from invalidating
            // (and re-drawing) the editor view on every keystroke.
            val prev = lastSettings
            if (prev == null || prev.fontSize != settings.fontSize)
                editor.setTextSize(settings.fontSize.toFloat())
            if (prev == null || prev.tabSize != settings.tabSize)
                editor.tabWidth = settings.tabSize
            if (prev == null || prev.wordWrap != settings.wordWrap)
                editor.isWordwrap = settings.wordWrap
            if (prev == null || prev.lineNumbers != settings.lineNumbers)
                editor.isLineNumberEnabled = settings.lineNumbers
            if (prev == null || prev.autoIndent != settings.autoIndent)
                editor.props.autoIndent = settings.autoIndent
            lastSettings = settings

            // ── File change: reload content and theme ──────────────────────────
            val fileChanged = fileKey != lastFileKey
            if (fileChanged) {
                lastFileKey = fileKey
                editor.setText(content)
                if (editor.lineCount > 0) editor.setSelection(0, 0)
                TextMateManager.applyTheme(editor)
            }

            // ── Language change: recreate only when file or language type changes.
            // tabSize and autoIndent no longer require language recreation — they
            // are applied directly via editor.tabWidth and editor.props.autoIndent.
            val langKey = "$fileKey|${language.name}"
            if (langKey != lastLangKey) {
                lastLangKey = langKey
                editor.setEditorLanguage(TextMateManager.createLanguage(language))
            }
        },
        onRelease = { editor -> editor.release() },
        modifier  = modifier
    )
}
