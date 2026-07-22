package io.axiom.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.axiom.ui.editor.EditorScreen
import io.axiom.ui.home.HomeScreen

/**
 * Root navigation graph for Axiom.
 *
 * Routes:
 * - `home`               → [HomeScreen]
 * - `editor/{projectId}` → [EditorScreen]  (projectId = Room Long primary key)
 */
@Composable
fun AxiomNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController    = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onNavigateToProject = { project ->
                    navController.navigate("editor/${project.id}")
                }
            )
        }

        composable(
            route     = "editor/{projectId}",
            arguments = listOf(navArgument("projectId") { type = NavType.LongType })
        ) { backStackEntry ->
            val projectId = backStackEntry.arguments?.getLong("projectId")
                ?: return@composable
            EditorScreen(
                projectId = projectId,
                onBack    = { navController.popBackStack() }
            )
        }
    }
}
