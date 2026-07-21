package io.axiom.ui.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Code
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.FileOpen
import androidx.compose.material.icons.rounded.FolderOpen
import androidx.compose.material.icons.rounded.FormatPaint
import androidx.compose.material.icons.rounded.ManageSearch
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Terminal
import androidx.compose.material.icons.rounded.VerticalSplit
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.axiom.data.model.AppCommand
import io.axiom.data.model.CommandCategory
import io.axiom.ui.theme.AxiomCommandModeColor
import io.axiom.ui.theme.AxiomSlate
import io.axiom.ui.theme.AxiomTextPrimary
import io.axiom.ui.theme.AxiomTextSecondary
import io.axiom.ui.theme.ShortcutTextStyle

/**
 * A single command result card displayed inside [ResultsPanel] when in COMMAND mode.
 *
 * Features:
 * - Category icon with coral accent background.
 * - Command title + description.
 * - Keyboard shortcut badge (keyboard-key visual style).
 * - Spring press animation.
 */
@Composable
fun CommandResultCard(
    command: AppCommand,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isPressed by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue   = if (isPressed) 0.97f else 1.0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness    = Spring.StiffnessHigh
        ),
        label = "cmd-card-scale"
    )
    val elevation by animateFloatAsState(
        targetValue   = if (isPressed) 0f else 2f,
        animationSpec = spring(stiffness = Spring.StiffnessHigh),
        label = "cmd-card-elevation"
    )

    val accentColor = AxiomCommandModeColor
    val icon        = remember(command.category) { command.category.toIcon() }

    Row(
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        modifier              = modifier
            .fillMaxWidth()
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .shadow(
                elevation    = elevation.dp,
                shape        = RoundedCornerShape(12.dp),
                spotColor    = accentColor.copy(alpha = 0.20f),
                ambientColor = accentColor.copy(alpha = 0.10f)
            )
            .clip(RoundedCornerShape(12.dp))
            .background(AxiomSlate)
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = {
                        isPressed = true
                        tryAwaitRelease()
                        isPressed = false
                    },
                    onTap   = { onClick() }
                )
            }
            .padding(horizontal = 14.dp, vertical = 12.dp)
    ) {
        // ── Category icon ─────────────────────────────────────────────────────
        Box(
            contentAlignment = Alignment.Center,
            modifier         = Modifier
                .size(38.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(accentColor.copy(alpha = 0.15f))
        ) {
            Icon(
                imageVector        = icon,
                contentDescription = command.category.label,
                tint               = accentColor,
                modifier           = Modifier.size(18.dp)
            )
        }

        // ── Text content ──────────────────────────────────────────────────────
        Column(
            verticalArrangement = Arrangement.Center,
            modifier            = Modifier.weight(1f)
        ) {
            Text(
                text     = command.title,
                style    = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color      = AxiomTextPrimary
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text     = command.description,
                style    = MaterialTheme.typography.bodySmall.copy(
                    color = AxiomTextSecondary
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        // ── Shortcut badge ────────────────────────────────────────────────────
        if (command.shortcut != null) {
            ShortcutBadge(shortcut = command.shortcut)
        }
    }
}

@Composable
private fun ShortcutBadge(shortcut: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(AxiomTextSecondary.copy(alpha = 0.12f))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text  = shortcut,
            style = ShortcutTextStyle.copy(
                color    = AxiomTextSecondary,
                fontSize = 10.sp
            )
        )
    }
}

// ── Command category → icon mapping ──────────────────────────────────────────

private fun CommandCategory.toIcon(): ImageVector = when (this) {
    CommandCategory.FILE     -> Icons.Rounded.FileOpen
    CommandCategory.EDIT     -> Icons.Rounded.Edit
    CommandCategory.VIEW     -> Icons.Rounded.VerticalSplit
    CommandCategory.GIT      -> Icons.Rounded.ManageSearch
    CommandCategory.TERMINAL -> Icons.Rounded.Terminal
    CommandCategory.GENERAL  -> Icons.Rounded.Settings
}
