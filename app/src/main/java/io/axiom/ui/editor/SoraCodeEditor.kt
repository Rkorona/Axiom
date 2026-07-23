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
import io.axiom.ui.editor.textmate.TextMateManager
import io.github.rosemoe.sora.event.ContentChangeEvent
import io.github.rosemoe.sora.widget.CodeEditor

/**
 * Compose wrapper around sora-editor's [CodeEditor] with TextMate syntax highlighting.
 *
 * Architecture:
 *  - [TextMateManager.init] is idempotent; it loads grammars and the Axiom dark theme
 *    from `assets/textmate/` on first call, then no-ops on subsequent calls.
 *  - [TextMateManager.applyTheme] binds [TextMateColorScheme] so token colours from
 *    the theme JSON are used.  Falls back to [AxiomEditorColorScheme] if init failed.
 *  - [TextMateManager.createLanguage] returns a per-editor [TextMateLanguage] instance
 *    (single-editor use, per sora docs) keyed on the language's TextMate scope name.
 *  - Auto-indent is provided natively by [TextMateLanguage] via the bundled
 *    `*.language-configuration.json` files; no manual NewlineHandler needed.
 *
 * File switching:
 *  - [fileKey] must be unique per file: callers use `"${file.path}${file.name}"`.
 *  - Editor content and language are only reloaded when [fileKey] changes, never on
 *    every recomposition or keystroke.
 */
@Composable
fun SoraCodeEditor(
    content: String,
    fileKey: String,
    language: CodeLanguage,
    onContentChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val onChangeState = rememberUpdatedState(onContentChange)
    var lastLoadedKey by remember { mutableStateOf<String?>(null) }

    // Ensure the TextMate pipeline is ready before the first frame.
    // remember(context) runs once per composition lifetime.
    remember(context) { TextMateManager.init(context) }

    AndroidView(
        factory = { ctx ->
            // init() is idempotent — safe to call redundantly here in case
            // the factory runs on a different Context than the one above.
            TextMateManager.init(ctx)

            CodeEditor(ctx).apply {

                // ── Theme ──────────────────────────────────────────────────
                // Must be set before the first layout pass or colours are lost.
                TextMateManager.applyTheme(this)

                // ── Typography ─────────────────────────────────────────────
                typefaceText = Typeface.MONOSPACE
                setTextSize(13f)
                tabWidth = 4

                // ── Layout behaviour ───────────────────────────────────────
                isWordwrap = false
                isLineNumberEnabled = true
                nonPrintablePaintingFlags = 0

                // ── Scrollbars ─────────────────────────────────────────────
                // Disable the native Android scroll indicators; sora draws
                // its own from the theme.
                isVerticalScrollBarEnabled = false
                isHorizontalScrollBarEnabled = false
                overScrollMode = View.OVER_SCROLL_NEVER

                // ── Language & auto-indent ─────────────────────────────────
                // TextMateLanguage provides syntax highlighting and reads
                // indentationRules from the bundled language-configuration.json
                // for automatic indent on Enter — no manual NewlineHandler needed.
                setEditorLanguage(TextMateManager.createLanguage(language))

                // ── Content change → ViewModel ─────────────────────────────
                subscribeEvent(ContentChangeEvent::class.java) { _, _ ->
                    onChangeState.value(text.toString())
                }
            }
        },
        update = { editor ->
            // Only reload content and language when the open file changes.
            if (fileKey != lastLoadedKey) {
                lastLoadedKey = fileKey
                editor.setText(content)
                if (editor.lineCount > 0) editor.setSelection(0, 0)
                TextMateManager.applyTheme(editor)
                editor.setEditorLanguage(TextMateManager.createLanguage(language))
            }
        },
        onRelease = { editor -> editor.release() },
        modifier = modifier
    )
}
