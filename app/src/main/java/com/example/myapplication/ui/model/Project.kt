package com.example.myapplication.model

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
    val iconColor: Color,
    val isActive: Boolean
)