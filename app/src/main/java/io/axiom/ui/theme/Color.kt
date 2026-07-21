package io.axiom.ui.theme

import androidx.compose.ui.graphics.Color

// ── Axiom Brand Palette ────────────────────────────────────────────────────────
// Hand-crafted for a deep-space code editor aesthetic.
// Primary: electric violet   Secondary: coral glow   Tertiary: neon mint

// Neutral deep-space backgrounds
val AxiomInk         = Color(0xFF0C0E14)   // deepest background
val AxiomVoid        = Color(0xFF10121A)   // card/surface background
val AxiomSlate       = Color(0xFF1A1C28)   // surface variant
val AxiomDusk        = Color(0xFF22253A)   // outline / divider
val AxiomMist        = Color(0xFF3A3D58)   // disabled / subtle

// Primary — Electric Violet
val AxiomViolet      = Color(0xFF7B68EE)   // primary
val AxiomVioletDim   = Color(0xFF5548D4)   // primary container
val AxiomVioletGlow  = Color(0xFFB0A4FF)   // on-primary-container / highlight
val AxiomVioletLight = Color(0xFFE4E0FF)   // light variant

// Secondary — Coral Glow
val AxiomCoral       = Color(0xFFFF6B8A)   // secondary
val AxiomCoralDim    = Color(0xFF8B2B47)   // secondary container
val AxiomCoralGlow   = Color(0xFFFFB3C4)   // on-secondary-container

// Tertiary — Neon Mint
val AxiomMint        = Color(0xFF00DDB3)   // tertiary
val AxiomMintDim     = Color(0xFF004F41)   // tertiary container
val AxiomMintGlow    = Color(0xFF80FFDF)   // on-tertiary-container

// Semantic / status
val AxiomError       = Color(0xFFFF5370)
val AxiomWarning     = Color(0xFFFFC66D)
val AxiomSuccess     = Color(0xFF00DDB3)
val AxiomInfo        = Color(0xFF82AAFF)

// Text
val AxiomTextPrimary   = Color(0xFFEAEBF5)
val AxiomTextSecondary = Color(0xFF8B8FA8)
val AxiomTextDisabled  = Color(0xFF4A4D68)

// Command-mode accent colours (used by AnimatedBackground + CommandBar)
val AxiomFileModeColor    = AxiomViolet     // default FILE mode
val AxiomCommandModeColor = AxiomCoral      // COMMAND mode (>)
val AxiomSymbolModeColor  = AxiomMint       // SYMBOL mode (#)

// Language dot colours — mirrors CodeLanguage.colorHex but as Color instances
val LangKotlin     = Color(0xFF7F52FF)
val LangJava       = Color(0xFFED8B00)
val LangPython     = Color(0xFF3776AB)
val LangJavaScript = Color(0xFFF7DF1E)
val LangTypeScript = Color(0xFF3178C6)
val LangRust       = Color(0xFFCE422B)
val LangCpp        = Color(0xFF00599C)
val LangGo         = Color(0xFF00ADD8)
val LangSwift      = Color(0xFFFA7343)
val LangDart       = Color(0xFF00B4AB)
val LangHtml       = Color(0xFFE34F26)
val LangCss        = Color(0xFF1572B6)
val LangJson       = Color(0xFF92C544)
val LangMarkdown   = Color(0xFF083FA1)
val LangYaml       = Color(0xFFCB171E)
val LangShell      = Color(0xFF4EAA25)
val LangUnknown    = Color(0xFF8B8FA8)
