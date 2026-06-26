package com.example.myapplication.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import java.io.File

// ─────────────────────────────────────────────
// 新建本地项目对话框
// ─────────────────────────────────────────────

@Composable
fun NewLocalProjectDialog(
    onConfirm: (projectName: String, localPath: String) -> Unit,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }

    var projectName by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    // 自动弹出键盘
    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        shape = RoundedCornerShape(20.dp),
        containerColor = MaterialTheme.colorScheme.surface,
        title = {
            Text(
                text = "新建本地项目",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = "项目将创建在应用私有目录中",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(4.dp))
                OutlinedTextField(
                    value = projectName,
                    onValueChange = { input ->
                        // 过滤掉文件系统非法字符
                        val sanitized = input.filter { ch ->
                            ch != '/' && ch != '\\' && ch != ':' &&
                            ch != '*' && ch != '?' && ch != '"' &&
                            ch != '<'  && ch != '>' && ch != '|'
                        }
                        projectName = sanitized
                        errorMessage = null
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .focusRequester(focusRequester),
                    label = { Text("项目名称") },
                    placeholder = { Text("例如：my-project") },
                    singleLine = true,
                    isError = errorMessage != null,
                    supportingText = errorMessage?.let { msg ->
                        { Text(text = msg, color = MaterialTheme.colorScheme.error) }
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.None,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                            handleConfirm(
                                context = context,
                                projectName = projectName,
                                onError = { errorMessage = it },
                                onConfirm = onConfirm
                            )
                        }
                    ),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = MaterialTheme.colorScheme.primary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant
                    )
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    keyboardController?.hide()
                    handleConfirm(
                        context = context,
                        projectName = projectName,
                        onError = { errorMessage = it },
                        onConfirm = onConfirm
                    )
                },
                enabled = projectName.isNotBlank(),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("创建")
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("取消")
            }
        }
    )
}

// ─────────────────────────────────────────────
// 文件夹创建逻辑（抽离便于测试）
// ─────────────────────────────────────────────

private fun handleConfirm(
    context: android.content.Context,
    projectName: String,
    onError: (String) -> Unit,
    onConfirm: (name: String, localPath: String) -> Unit
) {
    val name = projectName.trim()

    if (name.isBlank()) {
        onError("项目名称不能为空")
        return
    }
    if (name.length > 64) {
        onError("名称不能超过 64 个字符")
        return
    }

    // 在 app 私有目录下的 projects/ 中创建文件夹
    val projectsRoot = File(context.filesDir, "projects")
    if (!projectsRoot.exists()) {
        projectsRoot.mkdirs()
    }

    val projectDir = File(projectsRoot, name)
    if (projectDir.exists()) {
        onError("同名项目已存在，请换一个名称")
        return
    }

    val created = projectDir.mkdir()
    if (!created) {
        onError("创建失败，请重试")
        return
    }

    onConfirm(name, projectDir.absolutePath)
}
