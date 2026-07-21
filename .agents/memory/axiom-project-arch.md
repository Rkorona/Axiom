---
name: Axiom project architecture
description: Key decisions made when adding the Room data layer, project management UI, and the projects bottom sheet to Axiom.
---

# Axiom — Data Layer + Project UI Architecture

## Core decisions

**Room setup**
- KSP (not KAPT) — matches the existing Kotlin Compose plugin pattern
- Single table: `projects` via `ProjectEntity` → `ProjectDao` → `AxiomDatabase` singleton
- All DAO queries return `Flow<List<...>>` so Room changes propagate reactively to the ViewModel

**Storage strategy (hybrid)**
- New projects: `getExternalFilesDir("projects")/<name>/` — no permission needed on minSdk 36
- Imported folders: SAF `ACTION_OPEN_DOCUMENT_TREE` + `takePersistableUriPermission()` for restart-persistent access
- `Project.isExternal` distinguishes the two: `false` = absolute path, `true` = SAF URI string

**Why:** minSdk 36 (Android 16) means dynamic colour always on; SAF is stable and requires no manifest permissions for the tree picker.

**ViewModel**
- `HomeViewModel` extends `AndroidViewModel(application)` to access context for `ProjectRepository`
- `HomeSideEffect` sealed class with `SharedFlow` for one-shot UI actions (SAF picker launch)
- `recentProjects` collected from `ProjectRepository.recentProjects(limit = 6)` Flow

**Home screen state machine**
- ① Idle: wings = project chips (`RecentProjectsWing`), bottom sheet collapsed (PROJECTS peek bar)
- ② Search active: wings collapse, sheet hides off-screen, `ResultsPanel` fills the space
- ③ In-project (future): wings = current project's files, bottom = file tree

**How to apply:** Any change to home screen layout must preserve the three-state machine. The sheet auto-hides when `focused = true`; ResultsPanel uses `Box(weight = 1f)` in the Column.

**Home screen layout weights (unfocused / focused)**
- `topWeight`: 0.65f / 0.04f — centres the command stage rather than pushing it to the lower half
- `midWeight`: 0.35f / 0.02f
- Bottom slot: removed — replaced by `ProjectsBottomSheet` overlay (Layer 4 in root Box)

**Why weights changed:** The original 1.2f/0.6f pushed content into the lower half with empty upper space. 0.65f/0.35f centres the stage vertically.

**ProjectsBottomSheet (`ui/components/ProjectsBottomSheet.kt`)**
- Custom draggable overlay using `Animatable<Float>` + `draggable` modifier (no M3 BottomSheetScaffold)
- Two anchors: `collapsedOffset` (peek only) and `minOffsetPx` (just below status bar)
- Spring physics everywhere — `DampingRatioMediumBouncy / StiffnessMediumLow` for snap, `DampingRatioNoBouncy / StiffnessMedium` for search-hide
- Velocity threshold for fling-to-expand: < −600f px/s OR position < 55% of travel distance
- When `isSearchActive`: sheet hides below screen (collapsedOffset + peekPx), resets `isExpanded = false`
- `BoxWithConstraints` provides `fullHeightPx`; anchors recalculated via `LaunchedEffect(fullHeightPx, peekPx)`

**ProjectsPanel.kt**
- `ProjectsList` and `ProjectsEmptyState` changed from `private` to `internal` so `ProjectsBottomSheet` can reuse them
- `ProjectsPanel` composable itself is now unused by HomeScreen (the sheet replaced it) but kept for potential future use

**Mock data**
- `HomeViewModel.mockFiles` and `mockCommands` still in place — real file scanning is a follow-up
- `> New Project` and `> Open Folder` commands are wired end-to-end (dialog + SAF picker)
