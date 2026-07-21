package io.axiom.ui.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.axiom.data.model.FileItem
import kotlinx.coroutines.delay

/**
 * Which side of the Command Bar a wing sits on.
 * Controls the direction of the slide-out animation.
 */
enum class WingSide { LEFT, RIGHT }

/**
 * A vertical stack of [FileWingChip]s anchored to one side of the Command Bar.
 *
 * When [isCommandBarExpanded] is false, chips materialise with a staggered
 * spring entrance. When the bar expands, they spring off-screen in the
 * corresponding direction and fade simultaneously.
 *
 * @param files                List of recent files to show as chips.
 * @param side                 LEFT or RIGHT determines animation direction.
 * @param isCommandBarExpanded When true, chips animate out and become invisible.
 * @param onFileClick          Callback invoked when a chip is tapped.
 * @param maxChips             Maximum number of chips to render per wing (default 3).
 */
@Composable
fun RecentFilesWing(
    files: List<FileItem>,
    side: WingSide,
    isCommandBarExpanded: Boolean,
    onFileClick: (FileItem) -> Unit,
    maxChips: Int = 3,
    modifier: Modifier = Modifier
) {
    val displayFiles = files.take(maxChips)

    Column(
        horizontalAlignment = if (side == WingSide.LEFT) Alignment.End else Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(6.dp),
        modifier            = modifier
    ) {
        displayFiles.forEachIndexed { index, file ->
            WingChipSlot(
                file                 = file,
                side                 = side,
                isCommandBarExpanded = isCommandBarExpanded,
                entranceDelayMs      = index * 60L,
                onFileClick          = onFileClick
            )
        }
    }
}

// ── Private internals ─────────────────────────────────────────────────────────

/**
 * A single chip within a wing.
 *
 * Manages its own entrance / exit state so staggered delays work per-chip.
 */
@Composable
private fun WingChipSlot(
    file: FileItem,
    side: WingSide,
    isCommandBarExpanded: Boolean,
    entranceDelayMs: Long,
    onFileClick: (FileItem) -> Unit
) {
    // Controls whether this chip is in its "shown" state.
    var appearedYet by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(entranceDelayMs)
        appearedYet = true
    }

    // The chip is visible when it has appeared AND the bar is not expanded.
    val shouldShow = appearedYet && !isCommandBarExpanded

    // Alpha: fades in when shown, fades out when bar expands.
    val alpha by animateFloatAsState(
        targetValue   = if (shouldShow) 1f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioNoBouncy,
            stiffness    = Spring.StiffnessMedium
        ),
        label = "wing-chip-alpha-${file.id}"
    )

    // Horizontal slide: chips drift toward their edge when hiding.
    val slideX by animateDpAsState(
        targetValue   = when {
            !appearedYet          -> if (side == WingSide.LEFT) (-24).dp else 24.dp
            isCommandBarExpanded  -> if (side == WingSide.LEFT) (-16).dp else 16.dp
            else                  -> 0.dp
        },
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness    = Spring.StiffnessMedium
        ),
        label = "wing-chip-x-${file.id}"
    )

    // Subtle vertical entrance spring (chips drop slightly into place).
    val slideY by animateDpAsState(
        targetValue   = if (shouldShow) 0.dp else (-4).dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness    = Spring.StiffnessMediumLow
        ),
        label = "wing-chip-y-${file.id}"
    )

    FileWingChip(
        file      = file,
        onClick   = { onFileClick(file) },
        modifier  = Modifier
            .widthIn(max = 116.dp)
            .graphicsLayer {
                this.alpha        = alpha
                translationX      = slideX.toPx()
                translationY      = slideY.toPx()
            }
    )
}
