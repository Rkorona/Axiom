---
name: Axiom editor screen architecture
description: Phase A decisions — navigation, EditorScreen layout, file scanning, FileTreeSheet, B2 command bar placement.
---

# Axiom — Editor Screen (Phase A)

## Navigation
- Added `navigation-compose = "2.9.0"` to `libs.versions.toml` + `build.gradle.kts`
- `AxiomNavGraph.kt` (`ui/navigation/`) — NavHost with two routes: `home` and `editor/{projectId}` (Long)
- `MainActivity` now renders `AxiomNavGraph()` instead of `HomeScreen()` directly
- `HomeSideEffect.NavigateToProject(project)` emitted from `HomeViewModel.onProjectClick`; HomeScreen observes and calls `onNavigateToProject(project)` callback

## EditorScreen layout (state ③)
```
Box (fillMaxSize) {
  AnimatedBackground        // same deep-space canvas as home
  Scrim                     // spring-animated, appears when bar focused
  Column {
    EditorTopBar             // back | project name / file name + dirty dot | save
    Box(weight=1f) {
      EditorSurface          // BasicTextField, monospace, verticalScroll
      ResultsPanel overlay   // slides over editor when command bar focused + has results
    }
    CommandBar               // B2: always-visible at bottom, same component as home
    navigationBarsPadding
  }
  FileTreeSheet overlay      // draggable bottom sheet above command bar
}
```

**Why:** ResultsPanel must overlay the editor (not push it down) to avoid layout jumps when the command bar receives focus.

## CommandBar reuse in editor
- Added `hints: List<String> = commandBarHints` parameter to `CommandBar` (default keeps home screen unchanged)
- `EditorScreen` passes `hints = editorCommandBarHints` (defined in `EditorUiState.kt`)
- `editorCommandBarHints` = ["Search in project…", "Type > for commands", …]

## FileTreeSheet (`ui/components/FileTreeSheet.kt`)
- Same spring/draggable pattern as `ProjectsBottomSheet`
- `bottomPaddingDp` parameter: collapsed peek sits above command bar (= `EDITOR_CMD_BAR_HEIGHT.value + 16f` = 80dp)
- Files grouped by `FileItem.path` (directory); flat root files get no header
- Active file highlighted in violet; auto-collapses after file selection
- `FILE_ITEM_H = 52dp`, `DIR_HEADER_H = 36dp`, `MAX_VISIBLE_H = 420dp` (same content-fit formula as ProjectsBottomSheet)

## File scanning
- `FileSystemUtils.scanFiles(rootPath, maxFiles=300)` — walks internal project dir, skips `.git`, `node_modules`, `build`, `.gradle`, `__pycache__`, `target`, `.idea`
- SAF projects: `EditorViewModel.scanSafFiles()` — uses `DocumentsContract` to list top-level children only; stores document URI in `FileItem.path` for later reads
- `ProjectDao.getById(id)` + `ProjectRepository.getProjectById(id)` added for EditorViewModel to load a project by Room Long ID

## EditorViewModel
- `loadProject(projectId)` → fetches project, scans files on IO dispatcher
- `onFileClick(file)` → reads file content (internal: `File.readText()`; SAF: `ContentResolver.openInputStream`)
- `onContentChange(text)` → sets `isDirty = true`
- `saveCurrentFile()` → writes to disk on IO dispatcher; SAF write not yet supported
- Command bar mirrors HomeViewModel pattern; `performSearch` searches loaded `files` list for FILE mode; COMMAND mode searches `EDITOR_COMMANDS` list; SYMBOL = empty (Phase B)

## Phase C — SharedElement transition (Plan C)

### What was added
- `AxiomNavGraph` wrapped in `SharedTransitionLayout`
- Editor route gets slide-up enter (`slideInVertically { fullHeight }` + spring MediumBouncy/MediumLow + `fadeIn 380ms`) and slide-down popExit
- Home route gets `fadeOut 220ms` exit / `fadeIn 280ms` popEnter
- `HomeScreen` + `CommandStage` (private) accept `SharedTransitionScope?` + `AnimatedVisibilityScope?` (nullable, default null → graceful fallback)
- `EditorScreen` accepts same nullable scope params
- Both screens apply `.sharedElement(rememberSharedContentState("command-bar"), scope)` to their CommandBar's `modifier`; key is the string `"command-bar"`

### Critical design rules
- The `sharedElement` modifier must be inside `with(sharedTransitionScope) { ... }` to access extension functions
- `rememberSharedContentState` is composable — must be called in composable context (inside Row/Column lambda is fine)
- Keep the shared element key consistent: always `"command-bar"` (no project-id suffix)
- CommandBar's own `modifier` param carries the sharedElement; no changes needed inside CommandBar.kt itself
- `@OptIn(ExperimentalSharedTransitionApi::class)` required on AxiomNavGraph, HomeScreen, CommandStage (private), EditorScreen

## How to apply
- Any new editor feature lives in `ui/editor/`
- The command bar in the editor (B2) handles all non-typing operations; keep editing surface clean of toolbar/button UI
- SAF write support is the next unimplemented gap in EditorViewModel
- If adding a second shared element (e.g. project name text), use a unique key like `"project-name-${projectId}"`
