package io.axiom.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.MotionScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// ── Hand-crafted Dark Colour Scheme ──────────────────────────────────────────
private val AxiomDarkColorScheme = darkColorScheme(
    primary              = AxiomViolet,
    onPrimary            = Color.White,
    primaryContainer     = AxiomVioletDim,
    onPrimaryContainer   = AxiomVioletGlow,
    inversePrimary       = AxiomVioletLight,

    secondary            = AxiomCoral,
    onSecondary          = Color.White,
    secondaryContainer   = AxiomCoralDim,
    onSecondaryContainer = AxiomCoralGlow,

    tertiary             = AxiomMint,
    onTertiary           = AxiomInk,
    tertiaryContainer    = AxiomMintDim,
    onTertiaryContainer  = AxiomMintGlow,

    background           = AxiomInk,
    onBackground         = AxiomTextPrimary,
    surface              = AxiomVoid,
    onSurface            = AxiomTextPrimary,
    surfaceVariant       = AxiomSlate,
    onSurfaceVariant     = AxiomTextSecondary,
    surfaceTint          = AxiomViolet,

    outline              = AxiomDusk,
    outlineVariant       = AxiomMist,

    error                = AxiomError,
    onError              = Color.White,
    errorContainer       = Color(0xFF5C1A26),
    onErrorContainer     = Color(0xFFFFB3BE),

    scrim                = Color(0xCC000000),
    inverseSurface       = AxiomTextPrimary,
    inverseOnSurface     = AxiomInk,
)

// ── Light Colour Scheme (fallback) ────────────────────────────────────────────
private val AxiomLightColorScheme = lightColorScheme(
    primary              = Color(0xFF5040CC),
    onPrimary            = Color.White,
    primaryContainer     = AxiomVioletLight,
    onPrimaryContainer   = Color(0xFF2A1D80),

    secondary            = Color(0xFFCC3355),
    onSecondary          = Color.White,
    secondaryContainer   = Color(0xFFFFD9E0),
    onSecondaryContainer = Color(0xFF60001F),

    tertiary             = Color(0xFF006B55),
    onTertiary           = Color.White,
    tertiaryContainer    = Color(0xFF80FFD9),
    onTertiaryContainer  = Color(0xFF002019),

    background           = Color(0xFFF5F4FF),
    onBackground         = Color(0xFF1A1B2E),
    surface              = Color(0xFFFCFBFF),
    onSurface            = Color(0xFF1A1B2E),
    surfaceVariant       = Color(0xFFE6E2F7),
    onSurfaceVariant     = Color(0xFF48455E),

    outline              = Color(0xFF79768F),
    error                = AxiomError,
)

/**
 * Axiom application theme.
 *
 * Wraps [MaterialExpressiveTheme] with [MotionScheme.expressive] to
 * enable spring-physics-based motion across all M3 components out of the box.
 *
 * Dynamic colour is always enabled on API 36+ (Android 16) which is our minSdk.
 */
@Composable
fun AxiomTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    // API 36 is always >= S (31), so dynamic colour is always available.
    val colorScheme = if (darkTheme) {
        dynamicDarkColorScheme(context)
    } else {
        dynamicLightColorScheme(context)
    }

    // Make the status bar and nav bar transparent so the background canvas
    // bleeds edge-to-edge.
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor   = Color.Transparent.toArgb()
            window.navigationBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars     = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    MaterialExpressiveTheme(
        colorScheme  = colorScheme,
        typography   = Typography,
        motionScheme = MotionScheme.expressive(),
        content      = content
    )
}
