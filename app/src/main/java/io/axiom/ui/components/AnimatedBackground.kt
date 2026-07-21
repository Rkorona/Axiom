package io.axiom.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import io.axiom.data.model.CommandMode
import io.axiom.ui.theme.AxiomCommandModeColor
import io.axiom.ui.theme.AxiomFileModeColor
import io.axiom.ui.theme.AxiomInk
import io.axiom.ui.theme.AxiomSymbolModeColor
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

// ── Orb Configuration ─────────────────────────────────────────────────────────

private data class OrbSpec(
    /** Normalised base X position [0..1]. */
    val baseX: Float,
    /** Normalised base Y position [0..1]. */
    val baseY: Float,
    /** Radius as a fraction of the shorter screen dimension. */
    val radiusFraction: Float,
    /** Drift amplitude in normalised units. */
    val driftAmplitude: Float,
    /** Full-cycle duration in milliseconds. */
    val periodMs: Int,
    /** Phase offset so orbs don't all move in sync. */
    val phaseOffsetRadians: Float,
    /** Colour index into the three accent colours (0=primary, 1=secondary, 2=tertiary). */
    val colorIndex: Int,
    /** Alpha of the orb (soft glow). */
    val alpha: Float
)

private val ORB_SPECS = listOf(
    OrbSpec(0.15f, 0.15f, 0.55f, 0.07f, 14_000, 0.00f,          0, 0.10f),
    OrbSpec(0.85f, 0.10f, 0.45f, 0.06f, 11_000, (PI / 3).toFloat(), 1, 0.08f),
    OrbSpec(0.70f, 0.80f, 0.60f, 0.08f, 16_000, (PI / 1.5).toFloat(), 2, 0.09f),
    OrbSpec(0.10f, 0.75f, 0.40f, 0.05f, 12_500, (PI / 2).toFloat(), 0, 0.07f),
    OrbSpec(0.50f, 0.50f, 0.35f, 0.04f,  9_000, (PI / 4).toFloat(), 1, 0.06f),
    OrbSpec(0.30f, 0.35f, 0.28f, 0.06f, 13_000, (PI / 5).toFloat(), 2, 0.05f),
    OrbSpec(0.90f, 0.55f, 0.32f, 0.05f, 10_500, (PI / 6).toFloat(), 0, 0.06f),
    OrbSpec(0.45f, 0.90f, 0.25f, 0.04f, 15_000, (PI / 7).toFloat(), 1, 0.05f),
)

/**
 * Full-screen animated background composed of soft floating colour orbs.
 *
 * Each orb drifts on a sinusoidal path at its own pace and phase, creating
 * a living, breathing depth effect. The three accent colours (primary /
 * secondary / tertiary) shift smoothly when [commandMode] changes, so the
 * entire atmosphere reacts to the user's intent.
 */
@Composable
fun AnimatedBackground(
    commandMode: CommandMode,
    modifier: Modifier = Modifier
) {
    // ── Accent colours driven by command mode ─────────────────────────────────
    val targetPrimary = when (commandMode) {
        CommandMode.FILE    -> AxiomFileModeColor
        CommandMode.COMMAND -> AxiomCommandModeColor
        CommandMode.SYMBOL  -> AxiomSymbolModeColor
    }
    val targetSecondary = when (commandMode) {
        CommandMode.FILE    -> AxiomCommandModeColor
        CommandMode.COMMAND -> AxiomSymbolModeColor
        CommandMode.SYMBOL  -> AxiomFileModeColor
    }
    val targetTertiary = when (commandMode) {
        CommandMode.FILE    -> AxiomSymbolModeColor
        CommandMode.COMMAND -> AxiomFileModeColor
        CommandMode.SYMBOL  -> AxiomCommandModeColor
    }

    val colorSpec = tween<Color>(durationMillis = 700, easing = FastOutSlowInEasing)

    val primaryColor   by animateColorAsState(targetPrimary,   colorSpec, label = "bg-primary")
    val secondaryColor by animateColorAsState(targetSecondary, colorSpec, label = "bg-secondary")
    val tertiaryColor  by animateColorAsState(targetTertiary,  colorSpec, label = "bg-tertiary")

    val accentColors = remember(primaryColor, secondaryColor, tertiaryColor) {
        listOf(primaryColor, secondaryColor, tertiaryColor)
    }

    // ── Infinite drift animations ─────────────────────────────────────────────
    val transition = rememberInfiniteTransition(label = "orb-drift")

    val orbPhases = ORB_SPECS.mapIndexed { i, spec ->
        transition.animateFloat(
            initialValue   = spec.phaseOffsetRadians,
            targetValue    = spec.phaseOffsetRadians + (2 * PI).toFloat(),
            animationSpec  = infiniteRepeatable(
                animation  = tween(spec.periodMs, easing = LinearEasing),
                repeatMode = RepeatMode.Restart
            ),
            label = "orb-phase-$i"
        )
    }

    // ── Draw ──────────────────────────────────────────────────────────────────
    Canvas(modifier = modifier.fillMaxSize()) {
        // Solid base — the deep space background
        drawRect(color = AxiomInk)

        val shortSide = minOf(size.width, size.height)

        ORB_SPECS.forEachIndexed { i, spec ->
            val phase  = orbPhases[i].value
            val driftX = cos(phase) * spec.driftAmplitude * size.width
            val driftY = sin(phase) * spec.driftAmplitude * size.height

            val cx = spec.baseX * size.width  + driftX
            val cy = spec.baseY * size.height + driftY
            val r  = spec.radiusFraction * shortSide

            val color = accentColors[spec.colorIndex % accentColors.size]

            drawCircle(
                brush = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.0f to color.copy(alpha = spec.alpha),
                        0.5f to color.copy(alpha = spec.alpha * 0.4f),
                        1.0f to Color.Transparent
                    ),
                    center = Offset(cx, cy),
                    radius = r
                ),
                radius = r,
                center = Offset(cx, cy)
            )
        }

        // Subtle vignette to darken the corners and keep the composition centred
        drawRect(
            brush = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0f to Color.Transparent,
                    0.6f to Color.Transparent,
                    1.0f to AxiomInk.copy(alpha = 0.6f)
                ),
                center = Offset(size.width / 2f, size.height / 2f),
                radius = maxOf(size.width, size.height) * 0.7f
            )
        )
    }
}
