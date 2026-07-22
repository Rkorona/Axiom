---
name: sora-editor integration
description: How sora-editor (CodeEditor) is wired into the Axiom editor screen, and key API/design decisions.
---

# sora-editor integration

## Version
`io.github.Rosemoe.sora-editor:editor:0.23.4` — core only (no language-textmate yet).

## Files
- `app/src/main/java/io/axiom/ui/editor/SoraCodeEditor.kt` — Compose wrapper via `AndroidView`
- `app/src/main/java/io/axiom/ui/editor/AxiomEditorColorScheme.kt` — custom `EditorColorScheme` subclass matching Axiom palette

## Key design decisions

### File-switch key pattern
The `AndroidView` `update` lambda only calls `editor.setText(content)` when `fileKey` changes, not on every recomposition. This prevents cursor-reset on every keystroke.
**Why:** `FileItem.path` is the *parent directory* and is `""` for all root-level files — using it as the key means switching between two root files never triggers `setText`. The correct key is `"${file.path}${file.name}"` (full relative path including filename).
**How to apply:** Every caller must pass `"${openFile.path}${openFile.name}"` as `fileKey`, not `openFile.path` alone.

### Content sync via event subscription
`ContentChangeEvent` is subscribed once in the `factory` lambda. The callback captures `onContentChange` via `rememberUpdatedState` so it always calls the latest lambda without recreating the subscription.
**Why:** Subscriptions created in the `factory` lambda persist for the View's lifetime; using `rememberUpdatedState` avoids stale closure issues without re-subscribing on every recomposition.

### No language / syntax highlighting yet
`EmptyLanguage` is the default. `AxiomEditorColorScheme` already has all syntax token colours defined (KEYWORD=AxiomViolet, STRING=AxiomMint, COMMENT=AxiomTextDisabled, LITERAL/ANNOTATION=AxiomCoral, FUNCTION_NAME=AxiomVioletGlow).
**How to apply:** When adding `language-textmate`, call `editor.setEditorLanguage(textmateLanguage)` in `SoraCodeEditor`'s `factory` or `update` block, keyed on `language: CodeLanguage`.

### Cleanup
`onRelease = { editor -> editor.release() }` frees sora-editor's native resources when the composable leaves the composition.
