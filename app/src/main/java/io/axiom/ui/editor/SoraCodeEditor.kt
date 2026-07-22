package io.axiom.ui.editor

import android.graphics.Typeface
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
 *  - [AxiomEditorColorScheme] is applied so all syntax token colours are ready
 *    the moment a real language is attached.
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
                colorScheme = AxiomEditorColorScheme()

                // ── Typography ─────────────────────────────────────────────────
                typefaceText = Typeface.MONOSPACE
                setTextSize(13f)  // sp — matches the old BasicTextField size

                // ── Layout behaviour ───────────────────────────────────────────
                isWordwrap = false              // horizontal scroll for long lines
                isLineNumberEnabled = true

                // Hide whitespace dots/arrows — cleaner for reading code
                nonPrintablePaintingFlags = 0

                // ── Content change → ViewModel ─────────────────────────────────
                // Fires on every character insert/delete so the ViewModel always
                // holds a current snapshot and can mark the file dirty.
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
                // Reset cursor to the top of the new file.
                if (editor.lineCount > 0) {
                    editor.setSelection(0, 0)
                }
            }
        },
        onRelease = { editor ->
            // Free native resources when the composable leaves the composition.
            editor.release()
        },
        modifier = modifier
    )
}
