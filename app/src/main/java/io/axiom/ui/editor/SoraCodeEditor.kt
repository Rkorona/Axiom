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
import androidx.compose.ui.viewinterop.AndroidView
import io.axiom.data.model.CodeLanguage
import io.github.rosemoe.sora.event.ContentChangeEvent
import io.github.rosemoe.sora.lang.smartEnter.HandleResult
import io.github.rosemoe.sora.lang.smartEnter.NewlineHandler
import io.github.rosemoe.sora.text.ContentReference
import io.github.rosemoe.sora.text.Cursor
import io.github.rosemoe.sora.widget.CodeEditor

/**
 * A Compose wrapper around sora-editor's [CodeEditor].
 *
 * Content model:
 *  - When [fileKey] changes (new file opened), the editor is seeded with [content]
 *    and the cursor is reset to (0, 0).
 *  - While the user is typing, [onContentChange] is called on every edit so the
 *    ViewModel can track dirty state and keep a current snapshot for saving.
 *  - [fileKey] must be a **unique per-file** string — callers should use
 *    `"${file.path}${file.name}"` (full relative path), NOT `file.path` alone,
 *    because `path` is the parent directory and is `""` for all root-level files,
 *    which would prevent the editor from reloading when switching between them.
 *
 * Language / syntax highlighting:
 *  - Currently uses [io.github.rosemoe.sora.langs.EmptyLanguage] (no highlighting).
 *  - The [language] parameter is accepted so callers don't need to change their
 *    call-site when TextMate grammar support is wired up later.
 *  - [AxiomEditorColorScheme] (extends SchemeDarcula) is applied so all colours —
 *    including scrollbars and popups — are dark by default.
 *
 * Auto-indent:
 *  - A [NewlineHandler] copies the current line's leading whitespace on every Enter.
 *  - An extra indent level is added automatically after lines ending with
 *    `{`, `(`, `[`, or `:`.
 */
@Composable
fun SoraCodeEditor(
    content: String,
    fileKey: String,        // unique per-file: "${file.path}${file.name}"
    language: CodeLanguage,
    onContentChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    // Always reference the latest lambda without recreating the event subscription.
    val onChangeState = rememberUpdatedState(onContentChange)

    // Track which file is currently loaded so we only call setText() on file switches,
    // never in response to user-driven content changes.
    var lastLoadedKey by remember { mutableStateOf<String?>(null) }

    AndroidView(
        factory = { context ->
            CodeEditor(context).apply {

                // ── Theme ──────────────────────────────────────────────────────
                // SchemeDarcula base ensures scrollbars, popups and all
                // unoverridden colours are dark — no more white bars.
                colorScheme = AxiomEditorColorScheme()

                // ── Typography ─────────────────────────────────────────────────
                typefaceText = Typeface.MONOSPACE
                setTextSize(13f)
                tabWidth = 4

                // ── Layout behaviour ───────────────────────────────────────────
                isWordwrap = false
                isLineNumberEnabled = true
                nonPrintablePaintingFlags = 0

                // ── Scrollbars ─────────────────────────────────────────────────
                // Disable Android View's own scroll indicators; sora-editor draws
                // its own which are already dark via SchemeDarcula.
                isVerticalScrollBarEnabled = false
                isHorizontalScrollBarEnabled = false
                overScrollMode = View.OVER_SCROLL_NEVER

                // ── Auto-indent ────────────────────────────────────────────────
                // Copies the previous line's leading whitespace on Enter, and
                // adds one extra tab level after block-opening characters.
                addNewlineHandler(object : NewlineHandler {
                    override fun matchesRequirement(
                        text: ContentReference,
                        cursor: Cursor
                    ): Boolean = true

                    override fun handleNewline(
                        text: ContentReference,
                        cursor: Cursor,
                        tabSize: Int
                    ): HandleResult {
                        val line    = text.getLine(cursor.leftLine).toString()
                        val indent  = line.takeWhile { it == ' ' || it == '\t' }
                        val trimmed = line.trimEnd()
                        val extra   = if (trimmed.endsWith("{") ||
                                          trimmed.endsWith("(") ||
                                          trimmed.endsWith("[") ||
                                          (trimmed.endsWith(":") && !trimmed.contains("//"))) {
                            " ".repeat(tabSize)
                        } else ""
                        return HandleResult("\n$indent$extra", 0)
                    }
                })

                // ── Content change → ViewModel ─────────────────────────────────
                subscribeEvent(ContentChangeEvent::class.java) { _, _ ->
                    onChangeState.value(text.toString())
                }
            }
        },
        update = { editor ->
            // Only reload when the file changes, not on every recomposition.
            if (fileKey != lastLoadedKey) {
                lastLoadedKey = fileKey
                editor.setText(content)
                if (editor.lineCount > 0) {
                    editor.setSelection(0, 0)
                }
            }
        },
        onRelease = { editor ->
            editor.release()
        },
        modifier = modifier
    )
}
