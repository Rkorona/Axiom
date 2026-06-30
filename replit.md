# Axiom — Android IDE

A Kotlin/Compose Android IDE with a code editor, GitHub integration, terminal (PTY), and local SQLite database.

## Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose + Material 3
- **Architecture**: AndroidViewModel + Compose State
- **Database**: Room (SQLite)
- **Native**: CMake/NDK — PTY helper (`app/src/main/cpp/pty_helper.c`)
- **Networking**: HttpURLConnection (no third-party HTTP client)
- **Image loading**: Coil 3

## Project Structure

```
app/src/main/java/io/axiom/editor/
├── data/               # Data layer
│   ├── GitHubOAuthService.kt     # GitHub REST + Trees API client
│   ├── GitHubFileChangeScanner.kt# File-diff engine (AXIOM_INDEX / AXIOM_REMOTE_INDEX)
│   ├── GitHubRepoScanner.kt      # Local .git repo scanner
│   ├── GitHubStore.kt            # SharedPreferences token store
│   └── ProjectRepository.kt     # Room project store
├── ui/
│   ├── screen/
│   │   ├── GitHubScreen.kt       # GitHub tab UI
│   │   ├── GitHubViewModel.kt    # GitHub operations (fetch/pull/commit/push)
│   │   ├── HomeScreen.kt         # Main screen with tabs
│   │   └── ...
│   ├── model/                    # Data classes
│   └── theme/
└── MainActivity.kt
```

## GitHub Integration

The app uses a custom lightweight git implementation (no JGit):

| File | Purpose |
|------|---------|
| `.git/AXIOM_INDEX` | MD5 snapshot at last local commit (baseline for uncommitted changes) |
| `.git/AXIOM_REMOTE_INDEX` | MD5 snapshot at last push/clone (baseline for push diff) |
| `.git/AXIOM_COMMITS` | Local commit log (tab-separated: sha, timestamp, status, author, message) |

### Operation Flow

- **Clone**: download ZIP → extract → write both index files → write .git structure
- **Fetch**: call `GET /repos/{fullName}/git/refs/heads/{branch}` → update `refs/remotes/origin/{branch}`
- **Pull**: re-download ZIP, overwrite files, reset both index files
- **Commit** (local): update `AXIOM_INDEX` for staged files only → append to `AXIOM_COMMITS` → update `refs/heads/{branch}` to new local SHA
- **Push**: diff current files vs `AXIOM_REMOTE_INDEX` → GitHub Trees API (blobs → tree → commit → PATCH ref) → update `AXIOM_REMOTE_INDEX` + mark commits pushed

## Building

This project requires Android SDK (compileSdk 37, minSdk 30). It cannot be run directly in Replit's preview pane — it must be built into an APK and installed on an Android device.

To build a debug APK (requires Android SDK + Java 21 in environment):
```
./gradlew assembleDebug
```

## GitHub OAuth Credentials

Client ID and secret are hardcoded in `app/build.gradle.kts` under `buildConfigField`. The callback URL scheme is `axiomide://callback`.

## User Preferences

- Keep the existing project structure and stack
