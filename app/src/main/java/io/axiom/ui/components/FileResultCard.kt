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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.axiom.data.model.CodeLanguage
import io.axiom.data.model.FileItem
import io.axiom.ui.theme.AxiomMist
import io.axiom.ui.theme.AxiomSlate
import io.axiom.ui.theme.AxiomTextPrimary
import io.axiom.ui.theme.AxiomTextSecondary
import io.axiom.ui.theme.FilePathTextStyle

/**
 * A single file result card displayed inside [ResultsPanel].
 *
 * Features:
 * - Left colour strip keyed to the file's [CodeLanguage].
 * - Spring-physics press animation (scale + elevation).
 * - File name (bold) + directory path (monospaced, dimmed).
 * - Language badge pill on the right.
 */
@Composable
fun FileResultCard(
    file: FileItem,
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
        label = "file-card-scale"
    )
    val elevation by animateFloatAsState(
        targetValue   = if (isPressed) 0f else 2f,
        animationSpec = spring(stiffness = Spring.StiffnessHigh),
        label = "file-card-elevation"
    )

    val langColor = Color(file.language.colorHex)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .shadow(
                elevation      = elevation.dp,
                shape          = RoundedCornerShape(12.dp),
                ambientColor   = langColor.copy(alpha = 0.15f),
                spotColor      = langColor.copy(alpha = 0.25f)
            )
            .clip(RoundedCornerShape(12.dp))
            .background(AxiomSlate)
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress   = {
                        isPressed = true
                        tryAwaitRelease()
                        isPressed = false
                    },
                    onTap     = { onClick() }
                )
            }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier          = Modifier.fillMaxWidth()
        ) {
            // ── Language colour strip ─────────────────────────────────────────
            Box(
                modifier = Modifier
                    .width(4.dp)
                    .height(56.dp)
                    .background(langColor)
            )

            Spacer(Modifier.width(14.dp))

            // ── File info ─────────────────────────────────────────────────────
            Column(
                verticalArrangement = Arrangement.Center,
                modifier            = Modifier
                    .weight(1f)
                    .padding(vertical = 10.dp)
            ) {
                Text(
                    text     = file.name,
                    style    = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        color      = AxiomTextPrimary
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                // Don't display raw SAF content:// URIs — they're internal identifiers, not paths
                if (file.path.isNotBlank() && !file.path.startsWith("content://")) {
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text     = file.path,
                        style    = FilePathTextStyle.copy(color = AxiomTextSecondary),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(Modifier.width(10.dp))

            // ── Language badge ────────────────────────────────────────────────
            LanguageBadge(language = file.language, color = langColor)

            Spacer(Modifier.width(14.dp))
        }
    }
}

@Composable
private fun LanguageBadge(
    language: CodeLanguage,
    color: Color
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(color.copy(alpha = 0.15f))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text  = language.displayName,
            style = MaterialTheme.typography.labelSmall.copy(
                color      = color,
                fontWeight = FontWeight.Bold,
                fontSize   = 10.sp
            )
        )
    }
}

/**
 * Compact inline file chip used in the [RecentFilesWings] wings display.
 */
@Composable
fun FileWingChip(
    file: FileItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isPressed by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue   = if (isPressed) 0.93f else 1.0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness    = Spring.StiffnessHigh
        ),
        label = "wing-chip-scale"
    )

    val langColor = Color(file.language.colorHex)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        modifier          = modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .clip(RoundedCornerShape(10.dp))
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
            .padding(horizontal = 10.dp, vertical = 8.dp)
    ) {
        // Colour dot
        Box(
            modifier = Modifier
                .width(6.dp)
                .height(6.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(langColor)
        )

        Text(
            text     = file.name,
            style    = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.Medium,
                color      = AxiomTextPrimary,
                fontSize   = 11.sp
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp)
        )
    }
}
