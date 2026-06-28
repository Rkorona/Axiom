package com.example.myapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ─────────────────────────────────────────────────────────────────
// 颜色常量（与深色背景匹配）
// ─────────────────────────────────────────────────────────────────
private val CardBg = Color(0xFF1E2130)
private val DividerColor = Color(0xFF2A2D3E)
private val LabelBlue = Color(0xFF4D9FFF)
private val IconColor = Color(0xFFCCCCCC)
private val ValueColor = Color(0xFF8A8FA8)
private val ChevronColor = Color(0xFF555A70)
private val AppearanceIconBg = Color(0xFF3A3F55)
private val EditorIconBg = Color(0xFF3A3F55)
private val TerminalGreen = Color(0xFF1A6B4A)
private val TerminalIconBg = Color(0xFF153D2E)

// ─────────────────────────────────────────────────────────────────
// 主页面
// ─────────────────────────────────────────────────────────────────
@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {

    var themeOption       by remember { mutableStateOf(ThemeOption.SYSTEM) }
    var editorFontSize    by remember { mutableStateOf(14f) }
    var terminalFontSize  by remember { mutableStateOf(13f) }
    var autoComplete      by remember { mutableStateOf(true) }
    var showLineNumbers   by remember { mutableStateOf(true) }
    var wordWrap          by remember { mutableStateOf(false) }
    var tabWidth          by remember { mutableStateOf(TabWidthOption.FOUR) }
    var keepScreenOn      by remember { mutableStateOf(false) }

    var showThemeDialog       by remember { mutableStateOf(false) }
    var showTabWidthDialog    by remember { mutableStateOf(false) }
    var showEditorFontDialog  by remember { mutableStateOf(false) }
    var showTerminalFontDialog by remember { mutableStateOf(false) }
    var showLicenseDialog     by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {

        // ── 外观 ──────────────────────────────────────────────────
        item {
            SectionLabel("外观")
            SettingsCard {
                CardRowClickable(
                    icon = Icons.Filled.Palette,
                    iconBg = AppearanceIconBg,
                    title = "主题",
                    value = themeOption.label,
                    isLast = true,
                    onClick = { showThemeDialog = true }
                )
            }
            Spacer(Modifier.height(20.dp))
        }

        // ── 编辑器 ────────────────────────────────────────────────
        item {
            SectionLabel("编辑器")
            SettingsCard {
                CardRowClickable(
                    icon = Icons.Filled.FormatSize,
                    iconBg = EditorIconBg,
                    title = "字体大小",
                    value = "${editorFontSize.toInt()} sp",
                    onClick = { showEditorFontDialog = true }
                )
                CardDivider()
                CardRowSwitch(
                    icon = Icons.Filled.AutoAwesome,
                    iconBg = EditorIconBg,
                    title = "自动补全",
                    checked = autoComplete,
                    onCheckedChange = { autoComplete = it }
                )
                CardDivider()
                CardRowSwitch(
                    icon = Icons.Filled.FormatListNumbered,
                    iconBg = EditorIconBg,
                    title = "显示行号",
                    checked = showLineNumbers,
                    onCheckedChange = { showLineNumbers = it }
                )
                CardDivider()
                CardRowSwitch(
                    icon = Icons.Filled.WrapText,
                    iconBg = EditorIconBg,
                    title = "自动换行",
                    checked = wordWrap,
                    onCheckedChange = { wordWrap = it }
                )
                CardDivider()
                CardRowClickable(
                    icon = Icons.Filled.SpaceBar,
                    iconBg = EditorIconBg,
                    title = "Tab 宽度",
                    value = tabWidth.label,
                    isLast = true,
                    onClick = { showTabWidthDialog = true }
                )
            }
            Spacer(Modifier.height(20.dp))
        }

        // ── 终端 ──────────────────────────────────────────────────
        item {
            SectionLabel("终端")
            SettingsCard {
                CardRowClickable(
                    icon = Icons.Filled.Terminal,
                    iconBg = TerminalIconBg,
                    iconTint = Color(0xFF2ECC8E),
                    title = "字体大小",
                    value = "${terminalFontSize.toInt()} sp",
                    onClick = { showTerminalFontDialog = true }
                )
                CardDivider()
                CardRowSwitch(
                    icon = Icons.Filled.PhoneAndroid,
                    iconBg = TerminalIconBg,
                    iconTint = Color(0xFF2ECC8E),
                    title = "屏幕常亮",
                    subtitle = "终端运行时保持屏幕不息屏",
                    checked = keepScreenOn,
                    isLast = true,
                    onCheckedChange = { keepScreenOn = it }
                )
            }
            Spacer(Modifier.height(20.dp))
        }

        // ── 关于 ──────────────────────────────────────────────────
        item {
            SectionLabel("关于")
            SettingsCard {
                CardRowClickable(
                    icon = Icons.Filled.Info,
                    iconBg = AppearanceIconBg,
                    title = "版本",
                    value = "1.0.0",
                    onClick = {}
                )
                CardDivider()
                CardRowClickable(
                    icon = Icons.Filled.Article,
                    iconBg = AppearanceIconBg,
                    title = "开源许可",
                    value = "",
                    isLast = true,
                    onClick = { showLicenseDialog = true }
                )
            }
            Spacer(Modifier.height(24.dp))
        }
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
// Section 蓝色标签
// ─────────────────────────────────────────────────────────────────
@Composable
private fun SectionLabel(text: String) {
    Text(
        text = text,
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium,
        color = LabelBlue,
        modifier = Modifier.padding(start = 4.dp, bottom = 8.dp)
    )
}

// ─────────────────────────────────────────────────────────────────
// 圆角卡片容器
// ─────────────────────────────────────────────────────────────────
@Composable
private fun SettingsCard(content: @Composable ColumnScope.() -> Unit) {
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = CardBg,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(content = content)
    }
}

// ─────────────────────────────────────────────────────────────────
// 卡片内分割线
// ─────────────────────────────────────────────────────────────────
@Composable
private fun CardDivider() {
    HorizontalDivider(
        modifier = Modifier.padding(start = 56.dp),
        color = DividerColor
    )
}

// ─────────────────────────────────────────────────────────────────
// 可点击行（右侧显示值 + 箭头）
// ─────────────────────────────────────────────────────────────────
@Composable
private fun CardRowClickable(
    icon: ImageVector,
    iconBg: Color,
    iconTint: Color = IconColor,
    title: String,
    value: String,
    isLast: Boolean = false,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(
                if (isLast) RoundedCornerShape(bottomStart = 14.dp, bottomEnd = 14.dp)
                else RoundedCornerShape(0.dp)
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(34.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(iconBg),
            contentAlignment = Alignment.Center
        ) {
            Icon(icon, contentDescription = null, tint = iconTint, modifier = Modifier.size(18.dp))
        }
        Spacer(Modifier.width(14.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            modifier = Modifier.weight(1f)
        )
        if (value.isNotEmpty()) {
            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium,
                color = ValueColor
            )
            Spacer(Modifier.width(6.dp))
        }
        Icon(
            Icons.Filled.ChevronRight,
            contentDescription = null,
            tint = ChevronColor,
            modifier = Modifier.size(20.dp)
        )
    }
}

// ─────────────────────────────────────────────────────────────────
// Switch 行
// ─────────────────────────────────────────────────────────────────
@Composable
private fun CardRowSwitch(
    icon: ImageVector,
    iconBg: Color,
    iconTint: Color = IconColor,
    title: String,
    subtitle: String = "",
    checked: Boolean,
    isLast: Boolean = false,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(
                if (isLast) RoundedCornerShape(bottomStart = 14.dp, bottomEnd = 14.dp)
                else RoundedCornerShape(0.dp)
            )
            .clickable { onCheckedChange(!checked) }
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(34.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(iconBg),
            contentAlignment = Alignment.Center
        ) {
            Icon(icon, contentDescription = null, tint = iconTint, modifier = Modifier.size(18.dp))
        }
        Spacer(Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, style = MaterialTheme.typography.bodyLarge, color = Color.White)
            if (subtitle.isNotEmpty()) {
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = ValueColor
                )
            }
        }
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = Modifier.height(28.dp)
        )
    }
}

// ─────────────────────────────────────────────────────────────────
// 单选弹窗
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
                            .clickable { onSelect(index); onDismiss() }
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = index == selectedIndex,
                            onClick = { onSelect(index); onDismiss() }
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
