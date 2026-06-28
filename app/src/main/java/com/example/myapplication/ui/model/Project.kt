package com.example.myapplication.ui.model

import androidx.compose.ui.graphics.Color

enum class ProjectType {
    LOCAL, GITHUB
}

data class Project(
    val id: String,
    val name: String,
    val description: String,
    val type: ProjectType,
    val lastModified: String,
    val isActive: Boolean,
    val localPath: String? = null   // 本地导入项目的 URI 字符串
    val language: ProjectLanguage = ProjectLanguage.UNKNOWN,   // ← 新增
    val lastModified: Long = System.currentTimeMillis()
)
