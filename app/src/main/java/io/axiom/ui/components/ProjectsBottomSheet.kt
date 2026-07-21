package io.axiom.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FolderOpen
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.axiom.data.model.Project
import io.axiom.ui.theme.AxiomDusk
import io.axiom.ui.theme.AxiomFileModeColor
import io.axiom.ui.theme.AxiomMist
import io.axiom.ui.theme.AxiomSlate
import io.axiom.ui.theme.AxiomTextDisabled
import io.axiom.ui.theme.AxiomTextSecondary
import io.axiom.ui.theme.AxiomVoid
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

// Height of the always-visible peek strip (handle pill + label row)
private val PEEK_BASE_HEIGHT = 72.dp
private val SHEET_CORNER = 28.dp

/**
 * A draggable bottom sheet that replaces the fixed [ProjectsPanel] slot.
 *
 * Behaviour:
 * - **Collapsed** — only the drag handle + PROJECTS label row peek above the
 *   navigation bar.  The rest of the screen is unobstructed.
 * - **Expanded** — the sheet rises to just below the status bar, showing the
 *   full project list (or empty state).
 * - **Search active** — the sheet slides completely off-screen with a snappy
 *   spring, then eases back to collapsed when search is dismissed.
 *
 * All position transitions use spring physics (M3 Expressive style — no tweens).
 */
@Composable
fun ProjectsBottomSheet(
    projects: List<Project>,
    isSearchActive: Boolean,
    onProjectClick: (Project) -> Unit,
    onNewProject: () -> Unit,
    modifier: Modifier = Modifier
) {
    val density      = LocalDensity.current
    val scope        = rememberCoroutineScope()
    val navBarHeight = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
    val statusBarHeight = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()

    // Peek = handle pill + label row + nav bar clearance
    val peekDp: Dp  = PEEK_BASE_HEIGHT + navBarHeight
    val peekPx: Float
    val minOffsetPx: Float  // top of expanded sheet (just below status bar + gap)
    with(density) {
        peekPx      = peekDp.toPx()
        minOffsetPx = (statusBarHeight + 20.dp).toPx()
    }

    // Y offset: minOffsetPx = fully expanded, collapsedOffset = only peek visible
    val offsetAnim       = remember { Animatable(20000f) }   // starts off-screen
    var collapsedOffset  by remember { mutableFloatStateOf(0f) }
    var isExpanded       by remember { mutableStateOf(false) }

    BoxWithConstraints(
        modifier         = modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        val fullHeightPx = with(density) { maxHeight.toPx() }

        // Recalculate anchors whenever dimensions change
        LaunchedEffect(fullHeightPx, peekPx) {
            collapsedOffset = fullHeightPx - peekPx
            if (!isSearchActive) {
                offsetAnim.snapTo(collapsedOffset)
            }
        }

        // React to search focus toggling
        LaunchedEffect(isSearchActive) {
            if (collapsedOffset == 0f) return@LaunchedEffect  // dimensions not ready yet
            if (isSearchActive) {
                isExpanded = false
                // Fast snap off-screen (no bounce — it should feel like it's clearing the way)
                offsetAnim.animateTo(
                    targetValue    = collapsedOffset + peekPx,
                    animationSpec  = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness    = Spring.StiffnessMedium
                    )
                )
            } else {
                // Return to collapsed with a gentle bounce
                offsetAnim.animateTo(
                    targetValue   = collapsedOffset,
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness    = Spring.StiffnessMediumLow
                    )
                )
            }
        }

        // ── The draggable sheet ──────────────────────────────────────────────
        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset { IntOffset(x = 0, y = offsetAnim.value.roundToInt()) }
                .draggable(
                    orientation = Orientation.Vertical,
                    state       = rememberDraggableState { delta ->
                        scope.launch {
                            offsetAnim.snapTo(
                                (offsetAnim.value + delta)
                                    .coerceIn(minOffsetPx, collapsedOffset + peekPx)
                            )
                        }
                    },
                    onDragStopped = { velocity ->
                        scope.launch {
                            val current  = offsetAnim.value
                            // Snap threshold: 40 % of the way up OR fast upward fling
                            val snapUp   = velocity < -600f ||
                                    current < collapsedOffset * 0.55f
                            val target   = if (snapUp) {
                                isExpanded = true
                                minOffsetPx
                            } else {
                                isExpanded = false
                                collapsedOffset
                            }
                            offsetAnim.animateTo(
                                targetValue    = target,
                                animationSpec  = spring(
                                    dampingRatio = Spring.DampingRatioMediumBouncy,
                                    stiffness    = Spring.StiffnessMediumLow
                                ),
                                initialVelocity = velocity
                            )
                        }
                    }
                )
        ) {
            // Subtle ambient shadow behind the sheet top edge
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(SHEET_CORNER)
                    .shadow(
                        elevation    = 24.dp,
                        shape        = RoundedCornerShape(topStart = SHEET_CORNER, topEnd = SHEET_CORNER),
                        ambientColor = Color.Black.copy(alpha = 0.4f),
                        spotColor    = Color.Black.copy(alpha = 0.3f)
                    )
            )

            // ── Sheet surface ────────────────────────────────────────────────
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = SHEET_CORNER, topEnd = SHEET_CORNER))
                    .background(AxiomVoid)
            ) {
                // Drag handle
                SheetHandle()

                // Peek bar — always rendered, visible at any expansion level
                SheetPeekBar(
                    projects          = projects,
                    navBarBottomPad   = navBarHeight
                )

                // Thin divider line
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(AxiomDusk.copy(alpha = 0.6f))
                )

                // Scrollable content — meaningful only when expanded
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    if (projects.isEmpty()) {
                        ProjectsEmptyState(onNewProject = onNewProject)
                    } else {
                        ProjectsList(
                            projects       = projects,
                            onProjectClick = onProjectClick
                        )
                    }

                    // Top gradient — masks the scroll overshoot
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(28.dp)
                            .align(Alignment.TopCenter)
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(AxiomVoid, Color.Transparent)
                                )
                            )
                    )
                }
            }
        }
    }
}

// ── Handle pill ───────────────────────────────────────────────────────────────

@Composable
private fun SheetHandle() {
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .size(width = 36.dp, height = 4.dp)
                .clip(CircleShape)
                .background(AxiomMist.copy(alpha = 0.55f))
        )
    }
}

// ── Peek bar ──────────────────────────────────────────────────────────────────

@Composable
private fun SheetPeekBar(
    projects: List<Project>,
    navBarBottomPad: Dp
) {
    Row(
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier              = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(bottom = navBarBottomPad.coerceAtLeast(8.dp))
            .height(48.dp)
    ) {
        // Folder icon
        Icon(
            imageVector        = Icons.Rounded.FolderOpen,
            contentDescription = null,
            tint               = AxiomTextSecondary.copy(alpha = 0.55f),
            modifier           = Modifier.size(17.dp)
        )

        Spacer(Modifier.width(2.dp))

        // Label
        Text(
            text     = "PROJECTS",
            style    = MaterialTheme.typography.labelSmall.copy(
                color         = AxiomTextSecondary.copy(alpha = 0.6f),
                fontWeight    = FontWeight.Bold,
                letterSpacing = 1.5.sp,
                fontFamily    = FontFamily.Monospace,
                fontSize      = 10.sp
            ),
            modifier = Modifier.weight(1f)
        )

        // Count badge or empty hint
        if (projects.isNotEmpty()) {
            Box(
                contentAlignment = Alignment.Center,
                modifier         = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(AxiomSlate)
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text  = "${projects.size}",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color      = AxiomTextSecondary,
                        fontWeight = FontWeight.SemiBold,
                        fontSize   = 11.sp
                    )
                )
            }
        } else {
            Text(
                text  = "> New Project",
                style = MaterialTheme.typography.labelSmall.copy(
                    color      = AxiomFileModeColor.copy(alpha = 0.5f),
                    fontFamily = FontFamily.Monospace,
                    fontSize   = 10.sp
                )
            )
        }

        // Upward nudge affordance
        Text(
            text  = "↑",
            style = MaterialTheme.typography.labelSmall.copy(
                color    = AxiomTextDisabled.copy(alpha = 0.45f),
                fontSize = 11.sp
            )
        )
    }
}
