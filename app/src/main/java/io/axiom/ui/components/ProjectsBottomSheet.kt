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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentHeight
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

// ── Layout constants ──────────────────────────────────────────────────────────
private val PEEK_BASE_HEIGHT  = 72.dp
private val SHEET_CORNER      = 28.dp

// Used to compute the expanded-sheet height from the project list size, so the
// sheet only rises as far as needed rather than always flying to the status bar.
private val SHEET_HANDLE_H    = 20.dp   // handle pill area (padding + pill)
private val SHEET_PEEK_BAR_H  = 48.dp   // peek row fixed height
private val SHEET_DIVIDER_H   = 1.dp
private val LIST_V_PAD        = 8.dp    // LazyColumn contentPadding vertical each side
private val LIST_HEADER_H     = 40.dp   // SectionHeader approximate height
private val LIST_SPACING      = 8.dp    // spacedBy between items
private val CARD_H            = 68.dp   // ProjectCard approximate height
private val LIST_BOTTOM_SPACER = 16.dp  // trailing Spacer inside LazyColumn
private val EMPTY_STATE_H     = 200.dp  // ProjectsEmptyState approximate height

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

        // ── Content-aware expanded anchor ─────────────────────────────────────
        // Peek section: handle (20dp) + peek bar (48dp + navBar) + divider (1dp)
        val peekSectionDp = SHEET_HANDLE_H + SHEET_PEEK_BAR_H +
                navBarHeight.coerceAtLeast(8.dp) + SHEET_DIVIDER_H
        // List / empty-state content height derived from item count
        val rawContentDp: Dp = when {
            projects.isEmpty() -> EMPTY_STATE_H
            else -> {
                val n = projects.size
                LIST_V_PAD + LIST_HEADER_H + LIST_SPACING +
                        n * CARD_H + (n - 1) * LIST_SPACING +
                        LIST_BOTTOM_SPACER + LIST_V_PAD
            }
        }
        // Maximum sheet height before it would overlap the status-bar gap
        val maxSheetDp = with(density) { (fullHeightPx - minOffsetPx).toDp() }
        val clampedContentDp = rawContentDp.coerceAtMost(maxSheetDp - peekSectionDp)
        val maxSheetVisualDp = peekSectionDp + clampedContentDp

        // Expanded anchor: sheet bottom stays at screen bottom, top sits just
        // above the content — no wasted empty space.
        val expandedOffset = with(density) {
            (fullHeightPx - maxSheetVisualDp.toPx()).coerceAtLeast(minOffsetPx)
        }

        // Recalculate collapsed anchor whenever dimensions change
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
                // Fast snap off-screen — clearing the way for the results panel
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
                                    .coerceIn(expandedOffset, collapsedOffset + peekPx)
                            )
                        }
                    },
                    onDragStopped = { velocity ->
                        scope.launch {
                            val current = offsetAnim.value
                            val travel  = collapsedOffset - expandedOffset
                            // Snap up: fast fling OR crossed 55 % of travel distance
                            val snapUp  = velocity < -600f ||
                                    (travel > 0f && current < collapsedOffset - travel * 0.55f)
                            val target  = if (snapUp) {
                                isExpanded = true
                                expandedOffset
                            } else {
                                isExpanded = false
                                collapsedOffset
                            }
                            offsetAnim.animateTo(
                                targetValue     = target,
                                animationSpec   = spring(
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

            // ── Sheet surface — wraps content height ─────────────────────────
            // wrapContentHeight() + heightIn() means the background fills only
            // what the content needs, not the entire screen.
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.Top, unbounded = false)
                    .heightIn(max = maxSheetVisualDp)
                    .clip(RoundedCornerShape(topStart = SHEET_CORNER, topEnd = SHEET_CORNER))
                    .background(AxiomVoid)
            ) {
                // Drag handle
                SheetHandle()

                // Peek bar — always rendered, visible at any expansion level
                SheetPeekBar(
                    projects        = projects,
                    navBarBottomPad = navBarHeight
                )

                // Thin divider line
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(SHEET_DIVIDER_H)
                        .background(AxiomDusk.copy(alpha = 0.6f))
                )

                // Content area — sized to fit the project list exactly
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(clampedContentDp)
                ) {
                    if (projects.isEmpty()) {
                        ProjectsEmptyState(onNewProject = onNewProject)
                    } else {
                        ProjectsList(
                            projects       = projects,
                            onProjectClick = onProjectClick,
                            listModifier   = Modifier
                                .fillMaxWidth()
                                .height(clampedContentDp)
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
