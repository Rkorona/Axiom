package com.example.myapplication.data

import android.content.Context
import com.example.myapplication.ui.model.Project
import com.example.myapplication.ui.model.ProjectLanguage
import com.example.myapplication.ui.model.ProjectType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ProjectRepository(context: Context) {

    private val dao = ProjectDatabase.getInstance(context).projectDao()

    val projects: Flow<List<Project>> = dao.getAllProjects().map { entities ->
        entities.map { it.toProject() }
    }

    suspend fun addProject(project: Project) {
        dao.insertProject(project.toEntity())
    }

    suspend fun deleteProject(id: String) {
        dao.deleteProjectById(id)
    }

    private fun ProjectEntity.toProject(): Project = Project(
        id = id,
        name = name,
        description = description,
        type = if (type == "GITHUB") ProjectType.GITHUB else ProjectType.LOCAL,
        // 旧数据库存的是字符串（如"刚刚"），无法解析时退回当前时间
        lastModified = lastModified.toLongOrNull() ?: System.currentTimeMillis(),
        isActive = isActive,
        localPath = localPath,
        // TODO: 将 language 持久化到 ProjectEntity（需要 Room 迁移）
        language = ProjectLanguage.UNKNOWN,
    )

    private fun Project.toEntity(): ProjectEntity = ProjectEntity(
        id = id,
        name = name,
        description = description,
        type = type.name,
        lastModified = lastModified.toString(),
        iconColorLong = 0L,   // 字段已废弃，保留仅为兼容现有数据库结构
        isActive = isActive,
        localPath = localPath
    )
}
