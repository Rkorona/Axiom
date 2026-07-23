package io.axiom.ui.settings

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import io.axiom.data.model.SettingValue
import io.axiom.data.model.SettingsCategory
import io.axiom.data.model.SettingsEntry
import io.axiom.ui.components.AnimatedBackground
import io.axiom.ui.theme.AxiomCoral
import io.axiom.ui.theme.AxiomDusk
import io.axiom.ui.theme.AxiomInfo
import io.axiom.ui.theme.AxiomMint
import io.axiom.ui.theme.AxiomTextDisabled
import io.axiom.ui.theme.AxiomTextSecondary
import io.axiom.ui.theme.AxiomViolet

// ── Category → accent colour mapping ──────────────────────────────────────────

private val SettingsCategory.accentColor: Color
    get() = when (this) {
        SettingsCategory.APPEARANCE -> AxiomViolet
        SettingsCategory.EDITOR     -> AxiomMint
        SettingsCategory.GIT        -> AxiomCoral
        SettingsCategory.ABOUT      -> AxiomInfo
    }

// ── Screen ─────────────────────────────────────────────────────────────────────

@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    viewModel: SettingsViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val activeCategory = uiState.activeCategory

    val accentColor by animateColorAsState(
        targetValue   = activeCategory.accentColor,
        animationSpec = tween(600, easing = FastOutSlowInEasing),
        label         = "settings-accent"
    )

    Box(modifier = Modifier.fillMaxSize()) {
        AnimatedBackground(commandMode = activeCategory.commandMode)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
        ) {

            // ── Top bar ───────────────────────────────────────────────────────
            Row(
                modifier          = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBack) {
                    Icon(
                        imageVector        = Icons.Rounded.ArrowBackIosNew,
                        contentDescription = "Back",
                        tint               = AxiomTextSecondary
                    )
                }
                Text(
                    text     = "SETTINGS",
                    modifier = Modifier.weight(1f),
                    style    = TextStyle(
                        fontFamily    = FontFamily.Monospace,
                        fontWeight    = FontWeight.Bold,
                        fontSize      = 13.sp,
                        letterSpacing = 4.sp,
                        color         = accentColor
                    ),
                    textAlign = TextAlign.Center
                )
                // Phantom box balances the back button so the title stays centred
                Box(modifier = Modifier.size(48.dp))
            }

            // ── Category tab strip ────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                SettingsCategory.entries.forEach { category ->
                    CategoryTab(
                        category    = category,
                        isActive    = category == activeCategory,
                        accentColor = category.accentColor,
                        onClick     = { viewModel.onCategorySelect(category) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // ── Accent gradient divider ───────────────────────────────────────
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                Color.Transparent,
                                accentColor.copy(alpha = 0.45f),
                                accentColor.copy(alpha = 0.45f),
                                Color.Transparent
                            )
                        )
                    )
            )

            // ── Dotfile content ───────────────────────────────────────────────
            LazyColumn(
                modifier        = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp),
                contentPadding  = PaddingValues(vertical = 20.dp)
            ) {
                item(key = "open_brace") {
                    Text(
                        text  = "{",
                        style = monoStyle(14.sp, AxiomTextDisabled)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                }

                items(uiState.visibleEntries, key = { it.id }) { entry ->
                    SettingRow(
                        entry         = entry,
                        accentColor   = accentColor,
                        onToggle      = { viewModel.onToggle(entry.id) },
                        onSelect      = { viewModel.onSelectChange(entry.id, it) },
                        onStepper     = { viewModel.onStepperChange(entry.id, it) },
                        onAccent      = { viewModel.onAccentChange(entry.id, it) }
                    )
                }

                item(key = "close_brace") {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text  = "}",
                        style = monoStyle(14.sp, AxiomTextDisabled)
                    )
                }
            }
        }
    }
}

// ── Category tab ───────────────────────────────────────────────────────────────

@Composable
private fun CategoryTab(
    category: SettingsCategory,
    isActive: Boolean,
    accentColor: Color,
    onClick: () -> Unit
) {
    val bgAlpha     by animateFloatAsState(if (isActive) 0.18f else 0f,   label = "tab-bg")
    val borderAlpha by animateFloatAsState(if (isActive) 1f    else 0.25f, label = "tab-border")
    val textAlpha   by animateFloatAsState(if (isActive) 1f    else 0.4f,  label = "tab-text")

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(accentColor.copy(alpha = bgAlpha))
            .border(1.dp, accentColor.copy(alpha = borderAlpha), RoundedCornerShape(20.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 7.dp)
    ) {
        Text(
            text  = category.label,
            style = TextStyle(
                fontFamily    = FontFamily.Monospace,
                fontWeight    = if (isActive) FontWeight.SemiBold else FontWeight.Normal,
                fontSize      = 11.sp,
                letterSpacing = 1.5.sp,
                color         = accentColor.copy(alpha = textAlpha)
            )
        )
    }
}

// ── Setting row ────────────────────────────────────────────────────────────────

@Composable
private fun SettingRow(
    entry: SettingsEntry,
    accentColor: Color,
    onToggle: () -> Unit,
    onSelect: (String) -> Unit,
    onStepper: (Int) -> Unit,
    onAccent: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 12.dp, bottom = 22.dp)
    ) {
        // // comment
        Text(
            text  = "  ${entry.comment}",
            style = monoStyle(11.sp, accentColor.copy(alpha = 0.4f))
        )
        Spacer(modifier = Modifier.height(6.dp))
        // "key": <widget>
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "  \"${entry.key}\"", style = monoStyle(13.sp, AxiomTextSecondary))
            Text(text = ": ",                style = monoStyle(13.sp, AxiomTextDisabled))
            when (val v = entry.value) {
                is SettingValue.Toggle      -> TogglePills(v.enabled, accentColor, onToggle)
                is SettingValue.Select      -> SelectPills(v.options, v.selected, accentColor, onSelect)
                is SettingValue.Stepper     -> StepperControl(v.value, v.min, v.max, v.step, accentColor, onStepper)
                is SettingValue.AccentPicker -> AccentPickerRow(v.selected, onAccent)
                is SettingValue.Info        -> InfoValue(v.text, accentColor)
            }
        }
    }
}

// ── Widgets ────────────────────────────────────────────────────────────────────

@Composable
private fun TogglePills(enabled: Boolean, accent: Color, onToggle: () -> Unit) {
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        OptionPill("true",  selected = enabled,  accent) { if (!enabled) onToggle() }
        OptionPill("false", selected = !enabled, accent) { if (enabled)  onToggle() }
    }
}

@Composable
private fun SelectPills(options: List<String>, selected: String, accent: Color, onSelect: (String) -> Unit) {
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        options.forEach { opt ->
            OptionPill(opt, opt == selected, accent) { onSelect(opt) }
        }
    }
}

@Composable
private fun OptionPill(label: String, selected: Boolean, accent: Color, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(if (selected) accent.copy(alpha = 0.15f) else Color.Transparent)
            .border(1.dp, if (selected) accent else AxiomDusk, RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(
            text  = label,
            style = monoStyle(12.sp, if (selected) accent else AxiomTextDisabled)
        )
    }
}

@Composable
private fun StepperControl(value: Int, min: Int, max: Int, step: Int, accent: Color, onChange: (Int) -> Unit) {
    Row(
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        StepButton("−", enabled = value > min, accent) { onChange(-step) }
        Text(
            text      = value.toString(),
            modifier  = Modifier.widthIn(min = 28.dp),
            style     = monoStyle(14.sp, accent, FontWeight.Medium),
            textAlign = TextAlign.Center
        )
        StepButton("+", enabled = value < max, accent) { onChange(+step) }
    }
}

@Composable
private fun StepButton(label: String, enabled: Boolean, accent: Color, onClick: () -> Unit) {
    Box(
        modifier        = Modifier
            .size(24.dp)
            .clip(CircleShape)
            .background(if (enabled) accent.copy(alpha = 0.12f) else Color.Transparent)
            .border(1.dp, if (enabled) accent.copy(alpha = 0.5f) else AxiomDusk, CircleShape)
            .then(if (enabled) Modifier.clickable(onClick = onClick) else Modifier),
        contentAlignment = Alignment.Center
    ) {
        Text(text = label, style = monoStyle(14.sp, if (enabled) accent else AxiomTextDisabled))
    }
}

@Composable
private fun AccentPickerRow(selected: String, onSelect: (String) -> Unit) {
    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        listOf(
            Triple("violet", AxiomViolet, "Violet"),
            Triple("coral",  AxiomCoral,  "Coral"),
            Triple("mint",   AxiomMint,   "Mint"),
        ).forEach { (id, color, label) ->
            AccentChip(label, color, id == selected) { onSelect(id) }
        }
    }
}

@Composable
private fun AccentChip(label: String, color: Color, selected: Boolean, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(if (selected) color.copy(alpha = 0.15f) else Color.Transparent)
            .border(1.dp, if (selected) color else AxiomDusk, RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 5.dp),
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Box(modifier = Modifier.size(8.dp).clip(CircleShape).background(color))
        Text(text = label, style = monoStyle(12.sp, if (selected) color else AxiomTextDisabled))
    }
}

@Composable
private fun InfoValue(text: String, accent: Color) {
    Text(
        text  = "\"$text\"",
        style = monoStyle(13.sp, accent.copy(alpha = 0.7f))
    )
}

// ── Helpers ────────────────────────────────────────────────────────────────────

private fun monoStyle(
    size: androidx.compose.ui.unit.TextUnit,
    color: Color,
    weight: FontWeight = FontWeight.Normal
) = TextStyle(
    fontFamily = FontFamily.Monospace,
    fontWeight = weight,
    fontSize   = size,
    color      = color
)
