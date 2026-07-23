package io.axiom.ui.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.axiom.ui.editor.EditorScreen
import io.axiom.ui.home.HomeScreen
import io.axiom.ui.settings.SettingsScreen

/**
 * Root navigation graph for Axiom.
 *
 * Routes:
 * - `home`               → [HomeScreen]
 * - `editor/{projectId}` → [EditorScreen]  (projectId = Room Long primary key)
 * - `settings`           → [SettingsScreen]
 *
 * Plan C: wrapped in [SharedTransitionLayout] so the CommandBar can use
 * `sharedElement` — animating seamlessly between its home-screen position
 * (centred in the command stage) and its editor-screen position (pinned to
 * the bottom). The editor route also gets a slide-up enter / slide-down exit
 * so the screen feels like it rises from the tapped card rather than
 * replacing it.
 */
@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun AxiomNavGraph() {
    val navController = rememberNavController()

    SharedTransitionLayout {
        NavHost(
            navController    = navController,
            startDestination = "home"
        ) {
            // ── Home ──────────────────────────────────────────────────────────
            composable(
                route           = "home",
                exitTransition  = { fadeOut(tween(220)) },
                popEnterTransition = { fadeIn(tween(280)) }
            ) {
                HomeScreen(
                    onNavigateToProject     = { project ->
                        navController.navigate("editor/${project.id}")
                    },
                    onNavigateToSettings    = {
                        navController.navigate("settings")
                    },
                    sharedTransitionScope   = this@SharedTransitionLayout,
                    animatedVisibilityScope = this
                )
            }

            // ── Editor ────────────────────────────────────────────────────────
            composable(
                route      = "editor/{projectId}",
                arguments  = listOf(navArgument("projectId") { type = NavType.LongType }),
                // Card-to-screen: editor rises from the bottom of the display
                enterTransition = {
                    slideInVertically(
                        initialOffsetY = { fullHeight -> fullHeight },
                        animationSpec  = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness    = Spring.StiffnessMediumLow
                        )
                    ) + fadeIn(tween(380))
                },
                // Back: editor drops back down
                popExitTransition = {
                    slideOutVertically(
                        targetOffsetY = { fullHeight -> fullHeight },
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioNoBouncy,
                            stiffness    = Spring.StiffnessMediumLow
                        )
                    ) + fadeOut(tween(260))
                }
            ) { backStackEntry ->
                val projectId = backStackEntry.arguments?.getLong("projectId")
                    ?: return@composable
                EditorScreen(
                    projectId               = projectId,
                    onBack                  = { navController.popBackStack() },
                    sharedTransitionScope   = this@SharedTransitionLayout,
                    animatedVisibilityScope = this
                )
            }

            // ── Settings ──────────────────────────────────────────────────────
            composable(
                route             = "settings",
                // Slides in from the right
                enterTransition   = {
                    slideInHorizontally(
                        initialOffsetX = { it },
                        animationSpec  = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness    = Spring.StiffnessMediumLow
                        )
                    ) + fadeIn(tween(300))
                },
                // Slides back out to the right on pop
                popExitTransition = {
                    slideOutHorizontally(
                        targetOffsetX = { it },
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioNoBouncy,
                            stiffness    = Spring.StiffnessMediumLow
                        )
                    ) + fadeOut(tween(220))
                }
            ) {
                SettingsScreen(onBack = { navController.popBackStack() })
            }
        }
    }
}
