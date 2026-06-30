package io.axiom.editor.data

import io.axiom.editor.ui.model.ChangedFile
import io.axiom.editor.ui.model.FileChangeStatus
import java.io.File
import java.security.MessageDigest

object GitHubFileChangeScanner {

    private const val INDEX_FILE = "AXIOM_INDEX"

    // ── 写快照（克隆完成后调用）──────────────────────────────────────────
    fun writeIndex(projectDir: File) {
        val gitDir = File(projectDir, ".git")
        if (!gitDir.exists()) return
        val indexFile = File(gitDir, INDEX_FILE)
        val sb = StringBuilder()
        walkFiles(projectDir).forEach { file ->
            val rel = file.relativeTo(projectDir).path
            val hash = md5(file)
            sb.append("$hash $rel\n")
        }
        indexFile.writeText(sb.toString())
    }

    // ── 扫描变更（打开卡片时调用）────────────────────────────────────────
    fun scanChanges(projectDir: File): List<ChangedFile> {
        val gitDir = File(projectDir, ".git")
        val indexFile = File(gitDir, INDEX_FILE)

        if (!indexFile.exists()) {
            // 没有快照：全部文件显示为 UNTRACKED
            return walkFiles(projectDir)
                .take(200)
                .map { ChangedFile(it.relativeTo(projectDir).path, FileChangeStatus.UNTRACKED) }
        }

        // 读已保存快照
        val indexed: Map<String, String> = indexFile.readLines()
            .filter { it.isNotBlank() }
            .mapNotNull { line ->
                val idx = line.indexOf(' ')
                if (idx < 0) null else line.substring(idx + 1) to line.substring(0, idx)
            }
            .toMap()

        // 读当前磁盘状态
        val current: Map<String, String> = walkFiles(projectDir)
            .associate { it.relativeTo(projectDir).path to md5(it) }

        val changes = mutableListOf<ChangedFile>()

        // 已删除
        for ((path, _) in indexed) {
            if (!current.containsKey(path)) {
                changes.add(ChangedFile(path, FileChangeStatus.DELETED))
            }
        }

        // 修改 / 新增
        for ((path, hash) in current) {
            val old = indexed[path]
            when {
                old == null -> changes.add(ChangedFile(path, FileChangeStatus.ADDED))
                old != hash -> changes.add(ChangedFile(path, FileChangeStatus.MODIFIED))
            }
        }

        return changes.sortedWith(compareBy({ it.status.ordinal }, { it.path }))
    }

    // ── 更新快照（提交或还原后调用）──────────────────────────────────────
    fun resetIndex(projectDir: File) = writeIndex(projectDir)

    // ── 工具函数 ──────────────────────────────────────────────────────────
    private fun walkFiles(projectDir: File): Sequence<File> {
        val gitDir = File(projectDir, ".git")
        return projectDir.walkTopDown()
            .onEnter { it != gitDir }
            .filter { it.isFile }
    }

    private fun md5(file: File): String {
        return try {
            val md = MessageDigest.getInstance("MD5")
            file.inputStream().buffered().use { input ->
                val buf = ByteArray(8192)
                var n: Int
                while (input.read(buf).also { n = it } != -1) md.update(buf, 0, n)
            }
            md.digest().joinToString("") { "%02x".format(it) }
        } catch (_: Exception) { "error" }
    }
}
