package io.axiom.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.axiom.ui.theme.AxiomMist
import io.axiom.ui.theme.AxiomTextSecondary
import kotlinx.coroutines.delay

/**
 * Section header displayed above result groups (Files, Commands, Symbols).
 *
 * Slides in from the left with a spring when first composed, so that
 * each section appears with a staggered entrance feel.
 *
 * @param title       The label shown in the header (e.g. "FILES", "COMMANDS").
 * @param count       Optional result count badge.
 * @param accentColor The thin left-side marker colour matching the command mode.
 * @param delayMs     Entrance animation delay in milliseconds.
 */
@Composable
fun SectionHeader(
    title: String,
    count: Int? = null,
    accentColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.primary,
    delayMs: Long = 0L,
    modifier: Modifier = Modifier
) {
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(title) {
        delay(delayMs)
        visible = true
    }

    AnimatedVisibility(
        visible = visible,
        enter   = fadeIn(spring(stiffness = Spring.StiffnessMedium)) +
                  slideInHorizontally(
                      animationSpec = spring(
                          dampingRatio = Spring.DampingRatioMediumBouncy,
                          stiffness    = Spring.StiffnessMedium
                      ),
                      initialOffsetX = { -it / 3 }
                  ),
        modifier = modifier
    ) {
        Row(
            verticalAlignment     = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier              = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 6.dp)
        ) {
            // Accent marker
            Box(
                modifier = Modifier
                    .width(3.dp)
                    .height(14.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(accentColor)
            )

            Text(
                text  = title.uppercase(),
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight    = FontWeight.Bold,
                    letterSpacing = 1.2.sp,
                    color         = AxiomTextSecondary
                )
            )

            if (count != null && count > 0) {
                Spacer(Modifier.weight(1f))
                CountBadge(count = count, accentColor = accentColor)
            }

            // Divider line — only need the stretching spacer when there is no
            // count badge; when count != null the earlier Spacer(weight(1f))
            // already consumed all free space, and weight(0f) would crash.
            if (count == null) {
                Spacer(Modifier.weight(1f))
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(
                        color = AxiomMist.copy(alpha = 0.4f)
                    )
            )
        }
    }
}

@Composable
private fun CountBadge(
    count: Int,
    accentColor: androidx.compose.ui.graphics.Color
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier
            .clip(RoundedCornerShape(100.dp))
            .background(accentColor.copy(alpha = 0.18f))
            .padding(horizontal = 8.dp, vertical = 2.dp)
    ) {
        Text(
            text  = count.toString(),
            style = MaterialTheme.typography.labelSmall.copy(
                fontWeight = FontWeight.Bold,
                color      = accentColor,
                fontSize   = 10.sp
            )
        )
    }
}
