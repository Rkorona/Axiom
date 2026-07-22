package io.axiom.data.util

import io.axiom.data.model.CodeLanguage
import io.axiom.data.model.FileItem
import io.axiom.data.model.toCodeLanguage
import java.io.File

/**
 * Utilities for working with the local file system.
 */
object FileSystemUtils {

    /**
     * Scan the root directory of a project and auto-detect its primary language.
     *
     * Strategy:
     * 1. Check for well-known indicator files in the root (e.g. build.gradle.kts → Kotlin).
     * 2. Fall back to the most frequent file extension in the top 3 directory levels.
     */
    fun detectLanguage(rootPath: String): CodeLanguage {
        val root = File(rootPath)
        if (!root.exists() || !root.isDirectory) return CodeLanguage.UNKNOWN

        // Indicator files → language mapping (ordered by specificity)
        val indicators = linkedMapOf(
            "build.gradle.kts" to CodeLanguage.KOTLIN,
            "build.gradle"     to CodeLanguage.KOTLIN,
            "tsconfig.json"    to CodeLanguage.TYPESCRIPT,
            "package.json"     to CodeLanguage.JAVASCRIPT,
            "requirements.txt" to CodeLanguage.PYTHON,
            "pyproject.toml"   to CodeLanguage.PYTHON,
            "setup.py"         to CodeLanguage.PYTHON,
            "Cargo.toml"       to CodeLanguage.RUST,
            "go.mod"           to CodeLanguage.GO,
            "pubspec.yaml"     to CodeLanguage.DART,
            "Package.swift"    to CodeLanguage.SWIFT,
            "pom.xml"          to CodeLanguage.JAVA,
            "gradlew"          to CodeLanguage.KOTLIN
        )

        root.listFiles()?.forEach { file ->
            indicators[file.name]?.let { return it }
        }

        // Extension frequency fallback — walk up to 3 levels deep
        val extFreq = mutableMapOf<String, Int>()
        root.walkTopDown()
            .maxDepth(3)
            .filter { it.isFile }
            .forEach { file ->
                val ext = file.extension.lowercase()
                if (ext.isNotBlank()) extFreq[ext] = (extFreq[ext] ?: 0) + 1
            }

        val topExt = extFreq.maxByOrNull { it.value }?.key ?: return CodeLanguage.UNKNOWN
        return CodeLanguage.entries.firstOrNull { topExt in it.extensions }
            ?: CodeLanguage.UNKNOWN
    }

    /**
     * Create a project directory under [baseDir].
     * Sanitises [projectName] to a safe directory name.
     * Returns the created [File] or null if creation failed.
     */
    fun createProjectDir(baseDir: File, projectName: String): File? {
        val sanitized = projectName.trim()
            .replace(Regex("[^a-zA-Z0-9_.\\- ]"), "_")
            .replace(' ', '_')
            .ifBlank { "project_${System.currentTimeMillis()}" }
        val projectDir = File(baseDir, sanitized)
        return if (projectDir.mkdirs() || projectDir.exists()) projectDir else null
    }

    /**
     * Recursively scan a project directory and return a flat list of [FileItem]s.
     *
     * Skips hidden files, `node_modules`, `build`, `.gradle`, `.git`, `__pycache__`,
     * and `target` directories to avoid polluting the tree with generated artefacts.
     *
     * @param rootPath Absolute path to the project root.
     * @param maxFiles Safety cap to avoid walking enormous monorepos.
     */
    fun scanFiles(rootPath: String, maxFiles: Int = 300): List<FileItem> {
        val root = File(rootPath)
        if (!root.exists() || !root.isDirectory) return emptyList()

        val skipDirs = setOf(
            "node_modules", "build", ".gradle", ".git",
            "__pycache__", "target", ".idea", ".dart_tool", ".pub-cache"
        )

        return root.walkTopDown()
            .onEnter { dir ->
                !dir.name.startsWith(".") && dir.name !in skipDirs
            }
            .filter { it.isFile && !it.name.startsWith(".") }
            .take(maxFiles)
            .mapIndexed { index, file ->
                val relativePath = file.relativeTo(root).parentFile?.path ?: ""
                val ext = file.extension.lowercase()
                FileItem(
                    id           = index.toString(),
                    name         = file.name,
                    path         = if (relativePath.isEmpty()) "" else "$relativePath/",
                    extension    = ext,
                    lastModified = file.lastModified(),
                    size         = file.length(),
                    language     = ext.toCodeLanguage()
                )
            }
            .sortedWith(compareBy({ it.path }, { it.name }))
            .toList()
    }

    /**
     * Format a Unix timestamp as a human-readable "time ago" string.
     * Used in project cards to show recency.
     */
    fun timeAgo(timestamp: Long): String {
        val diff = System.currentTimeMillis() - timestamp
        return when {
            diff < 60_000L       -> "just now"
            diff < 3_600_000L    -> "${diff / 60_000L}m ago"
            diff < 86_400_000L   -> "${diff / 3_600_000L}h ago"
            diff < 604_800_000L  -> "${diff / 86_400_000L}d ago"
            else                 -> "${diff / 604_800_000L}w ago"
        }
    }
}
