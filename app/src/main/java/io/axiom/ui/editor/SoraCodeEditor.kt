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
 * Settings are applied **only when their value changes** to prevent sora-editor from
 * calling `invalidate()` on every keystroke (which caused the editor to flash).
 *
 * tabSize behaviour:
 * - `editor.tabWidth` is updated immediately so new grammar-driven indentation uses
 *   the correct number of spaces.
 * - When tabSize changes while a file is open, the current file content is
 *   re-indented in place: every N leading spaces (where N = previous tabSize) becomes
 *   M leading spaces (where M = new tabSize). This converts existing code to the new
 *   indent width so the setting feels immediate and consistent.
 *
 * Auto-indent is always enabled (editor.props.autoIndent = true); the UI toggle for
 * it has been removed.
 *
 * File switching:
 * Content and language are only reloaded when [fileKey] changes, never on every
 * recomposition or keystroke — this prevents cursor-jump and flash on typing.
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

    var lastFileKey  by remember { mutableStateOf<String?>(null) }
    var lastLangKey  by remember { mutableStateOf<String?>(null) }
    // Track the last applied settings so we skip sora-editor property writes (which
    // call invalidate() internally) when the value hasn't actually changed.
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

                // ── Auto-indent always on ──────────────────────────────────────
                props.autoIndent = true

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

            val prev = lastSettings

            // ── tabSize: apply width, then re-indent existing content ──────────
            // Only runs when the user actually changed the setting.
            if (prev == null || prev.tabSize != settings.tabSize) {
                editor.tabWidth = settings.tabSize
                // Re-indent the open file so existing code converts immediately.
                // Skip on initial attach (prev == null) — content is already set
                // with the correct tabSize from the factory block.
                if (prev != null && prev.tabSize != settings.tabSize) {
                    val current = editor.text.toString()
                    val converted = reIndentContent(current, prev.tabSize, settings.tabSize)
                    if (converted != current) {
                        editor.setText(converted)
                        if (editor.lineCount > 0) editor.setSelection(0, 0)
                    }
                }
            }

            // ── Other settings — only write when changed ───────────────────────
            if (prev == null || prev.fontSize != settings.fontSize)
                editor.setTextSize(settings.fontSize.toFloat())
            if (prev == null || prev.wordWrap != settings.wordWrap)
                editor.isWordwrap = settings.wordWrap
            if (prev == null || prev.lineNumbers != settings.lineNumbers)
                editor.isLineNumberEnabled = settings.lineNumbers

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

/**
 * Converts the leading indentation of every line in [content] from [oldTabSize]-space
 * units to [newTabSize]-space units.
 *
 * For each line, the number of leading spaces is decomposed as:
 *   levels   = leadingSpaces / oldTabSize   (integer division)
 *   remainder = leadingSpaces % oldTabSize  (preserved as-is to avoid corruption)
 *
 * The new leading spaces = levels * newTabSize + remainder.
 *
 * Only space characters are treated as indentation. Lines that start with a tab
 * or have no leading spaces are left unchanged.
 */
private fun reIndentContent(content: String, oldTabSize: Int, newTabSize: Int): String {
    if (oldTabSize <= 0 || newTabSize <= 0 || oldTabSize == newTabSize) return content
    val sb = StringBuilder(content.length)
    val lines = content.split('\n')
    lines.forEachIndexed { i, line ->
        val leadingSpaces = line.length - line.trimStart(' ').length
        if (leadingSpaces > 0) {
            val levels    = leadingSpaces / oldTabSize
            val remainder = leadingSpaces % oldTabSize
            val newIndent = levels * newTabSize + remainder
            repeat(newIndent) { sb.append(' ') }
            sb.append(line, leadingSpaces, line.length)
        } else {
            sb.append(line)
        }
        if (i < lines.size - 1) sb.append('\n')
    }
    return sb.toString()
}
