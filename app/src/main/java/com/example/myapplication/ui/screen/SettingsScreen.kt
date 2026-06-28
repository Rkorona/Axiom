package com.example.myapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ─────────────────────────────────────────────────────────────────
// 主入口
// ─────────────────────────────────────────────────────────────────
@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {

    // ── 状态 ──────────────────────────────────────────────────────
    var themeOption by remember { mutableStateOf(ThemeOption.SYSTEM) }
    var editorFontSize by remember { mutableStateOf(14f) }
    var terminalFontSize by remember { mutableStateOf(13f) }
    var autoComplete by remember { mutableStateOf(true) }
    var showLineNumbers by remember { mutableStateOf(true) }
    var wordWrap by remember { mutableStateOf(false) }
    var tabWidth by remember { mutableStateOf(TabWidthOption.FOUR) }
    var keepScreenOn by remember { mutableStateOf(false) }

    var showThemeDialog by remember { mutableStateOf(false) }
    var showTabWidthDialog by remember { mutableStateOf(false) }
    var showEditorFontDialog by remember { mutableStateOf(false) }
    var showTerminalFontDialog by remember { mutableStateOf(false) }
    var showLicenseDialog by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(vertical = 12.dp)
    ) {

        // ── 外观 ──────────────────────────────────────────────────
        item { SectionHeader("外观") }

        item {
            SettingsSingleLineItem(
                icon = Icons.Filled.Palette,
                iconTint = MaterialTheme.colorScheme.primary,
                title = "主题",
                value = themeOption.label,
                onClick = { showThemeDialog = true }
            )
        }

        // ── 编辑器 ────────────────────────────────────────────────
        item { SectionHeader("编辑器") }

        item {
            SettingsSingleLineItem(
                icon = Icons.Filled.FormatSize,
                iconTint = MaterialTheme.colorScheme.secondary,
                title = "字体大小",
                value = "${editorFontSize.toInt()} sp",
                onClick = { showEditorFontDialog = true }
            )
        }

        item {
            SettingsSwitchItem(
                icon = Icons.Filled.AutoAwesome,
                iconTint = MaterialTheme.colorScheme.secondary,
                title = "自动补全",
                checked = autoComplete,
                onCheckedChange = { autoComplete = it }
            )
        }

        item {
            SettingsSwitchItem(
                icon = Icons.Filled.FormatListNumbered,
                iconTint = MaterialTheme.colorScheme.secondary,
                title = "显示行号",
                checked = showLineNumbers,
                onCheckedChange = { showLineNumbers = it }
            )
        }

        item {
            SettingsSwitchItem(
                icon = Icons.Filled.WrapText,
                iconTint = MaterialTheme.colorScheme.secondary,
                title = "自动换行",
                checked = wordWrap,
                onCheckedChange = { wordWrap = it }
            )
        }

        item {
            SettingsSingleLineItem(
                icon = Icons.Filled.SpaceBar,
                iconTint = MaterialTheme.colorScheme.secondary,
                title = "Tab 宽度",
                value = tabWidth.label,
                onClick = { showTabWidthDialog = true }
            )
        }

        // ── 终端 ──────────────────────────────────────────────────
        item { SectionHeader("终端") }

        item {
            SettingsSingleLineItem(
                icon = Icons.Filled.Terminal,
                iconTint = MaterialTheme.colorScheme.tertiary,
                title = "字体大小",
                value = "${terminalFontSize.toInt()} sp",
                onClick = { showTerminalFontDialog = true }
            )
        }

        item {
            SettingsSwitchItem(
                icon = Icons.Filled.PhoneAndroid,
                iconTint = MaterialTheme.colorScheme.tertiary,
                title = "屏幕常亮",
                subtitle = "终端运行时保持屏幕不息屏",
                checked = keepScreenOn,
                onCheckedChange = { keepScreenOn = it }
            )
        }

        // ── 关于 ──────────────────────────────────────────────────
        item { SectionHeader("关于") }

        item {
            SettingsSingleLineItem(
                icon = Icons.Filled.Info,
                iconTint = MaterialTheme.colorScheme.outline,
                title = "版本",
                value = "1.0.0",
                onClick = {}
            )
        }

        item {
            SettingsSingleLineItem(
                icon = Icons.Filled.Article,
                iconTint = MaterialTheme.colorScheme.outline,
                title = "开源许可",
                value = "",
                onClick = { showLicenseDialog = true }
            )
        }

        item { Spacer(Modifier.height(24.dp)) }
    }

    // ── 弹窗 ──────────────────────────────────────────────────────
    if (showThemeDialog) {
        SingleChoiceDialog(
            title = "选择主题",
            options = ThemeOption.entries.map { it.label },
            selectedIndex = ThemeOption.entries.indexOf(themeOption),
            onSelect = { themeOption = ThemeOption.entries[it] },
            onDismiss = { showThemeDialog = false }
        )
    }

    if (showTabWidthDialog) {
        SingleChoiceDialog(
            title = "Tab 宽度",
            options = TabWidthOption.entries.map { it.label },
            selectedIndex = TabWidthOption.entries.indexOf(tabWidth),
            onSelect = { tabWidth = TabWidthOption.entries[it] },
            onDismiss = { showTabWidthDialog = false }
        )
    }

    if (showEditorFontDialog) {
        FontSizeDialog(
            title = "编辑器字体大小",
            value = editorFontSize,
            range = 10f..24f,
            onConfirm = { editorFontSize = it },
            onDismiss = { showEditorFontDialog = false }
        )
    }

    if (showTerminalFontDialog) {
        FontSizeDialog(
            title = "终端字体大小",
            value = terminalFontSize,
            range = 10f..24f,
            onConfirm = { terminalFontSize = it },
            onDismiss = { showTerminalFontDialog = false }
        )
    }

    if (showLicenseDialog) {
        AlertDialog(
            onDismissRequest = { showLicenseDialog = false },
            icon = { Icon(Icons.Filled.Article, contentDescription = null) },
            title = { Text("开源许可") },
            text = {
                Text(
                    "本项目使用以下开源库：\n\n" +
                    "• Jetpack Compose — Apache 2.0\n" +
                    "• Room — Apache 2.0\n" +
                    "• PRoot — GPL v2\n" +
                    "• Material Icons — Apache 2.0",
                    lineHeight = 22.sp
                )
            },
            confirmButton = {
                TextButton(onClick = { showLicenseDialog = false }) { Text("关闭") }
            }
        )
    }
}

// ─────────────────────────────────────────────────────────────────
// 枚举
// ─────────────────────────────────────────────────────────────────
private enum class ThemeOption(val label: String) {
    SYSTEM("跟随系统"), LIGHT("浅色"), DARK("深色")
}

private enum class TabWidthOption(val label: String) {
    TWO("2 个空格"), FOUR("4 个空格"), EIGHT("8 个空格")
}

// ─────────────────────────────────────────────────────────────────
// Section 标题
// ─────────────────────────────────────────────────────────────────
@Composable
private fun SectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelMedium,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 72.dp, top = 20.dp, bottom = 4.dp, end = 16.dp)
    )
}

// ─────────────────────────────────────────────────────────────────
// 普通单行条目（带右侧文字值）
// ─────────────────────────────────────────────────────────────────
@Composable
private fun SettingsSingleLineItem(
    icon: ImageVector,
    iconTint: androidx.compose.ui.graphics.Color,
    title: String,
    value: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(iconTint.copy(alpha = 0.12f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(icon, contentDescription = null, tint = iconTint, modifier = Modifier.size(20.dp))
        }
        Spacer(Modifier.width(16.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f)
        )
        if (value.isNotEmpty()) {
            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(Modifier.width(4.dp))
            Icon(
                Icons.Filled.ChevronRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.outlineVariant,
                modifier = Modifier.size(20.dp)
            )
        } else {
            Icon(
                Icons.Filled.ChevronRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.outlineVariant,
                modifier = Modifier.size(20.dp)
            )
        }
    }
    HorizontalDivider(
        modifier = Modifier.padding(start = 72.dp),
        color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)
    )
}

// ─────────────────────────────────────────────────────────────────
// 带 Switch 的条目
// ─────────────────────────────────────────────────────────────────
@Composable
private fun SettingsSwitchItem(
    icon: ImageVector,
    iconTint: androidx.compose.ui.graphics.Color,
    title: String,
    subtitle: String = "",
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onCheckedChange(!checked) }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(iconTint.copy(alpha = 0.12f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(icon, contentDescription = null, tint = iconTint, modifier = Modifier.size(20.dp))
        }
        Spacer(Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, style = MaterialTheme.typography.bodyLarge)
            if (subtitle.isNotEmpty()) {
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
    HorizontalDivider(
        modifier = Modifier.padding(start = 72.dp),
        color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)
    )
}

// ─────────────────────────────────────────────────────────────────
// 单选弹窗（主题 / Tab 宽度）
// ─────────────────────────────────────────────────────────────────
@Composable
private fun SingleChoiceDialog(
    title: String,
    options: List<String>,
    selectedIndex: Int,
    onSelect: (Int) -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(title) },
        text = {
            Column {
                options.forEachIndexed { index, label ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .clickable {
                                onSelect(index)
                                onDismiss()
                            }
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = index == selectedIndex,
                            onClick = {
                                onSelect(index)
                                onDismiss()
                            }
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(label, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) { Text("取消") }
        }
    )
}

// ─────────────────────────────────────────────────────────────────
// 字体大小滑块弹窗
// ─────────────────────────────────────────────────────────────────
@Composable
private fun FontSizeDialog(
    title: String,
    value: Float,
    range: ClosedFloatingPointRange<Float>,
    onConfirm: (Float) -> Unit,
    onDismiss: () -> Unit
) {
    var current by remember { mutableStateOf(value) }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(title) },
        text = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "${current.toInt()} sp",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(Modifier.height(12.dp))
                Slider(
                    value = current,
                    onValueChange = { current = it },
                    valueRange = range,
                    steps = ((range.endInclusive - range.start).toInt() - 1)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("${range.start.toInt()} sp", style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Text("${range.endInclusive.toInt()} sp", style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
        },
        confirmButton = {
            TextButton(onClick = { onConfirm(current); onDismiss() }) { Text("确定") }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("取消") }
        }
    )
}
