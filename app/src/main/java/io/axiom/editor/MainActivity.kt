package io.axiom.editor

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.SideEffect
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import io.axiom.editor.data.GitHubOAuthBus
import io.axiom.editor.data.SettingsViewModel
import io.axiom.editor.data.ThemeMode
import io.axiom.editor.ui.navigation.AppNavigation
import io.axiom.editor.ui.theme.AxiomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        handleOAuthIntent(intent)
        val insetsController = WindowCompat.getInsetsController(window, window.decorView)
        setContent {
            val settingsVm: SettingsViewModel = viewModel()
            val settings = settingsVm.settings
            val systemDark = isSystemInDarkTheme()
            val isDark = when (settings.themeOption) {
                ThemeMode.SYSTEM -> systemDark
                ThemeMode.LIGHT  -> false
                ThemeMode.DARK   -> true
            }
            SideEffect {
                insetsController.isAppearanceLightStatusBars = !isDark
                insetsController.isAppearanceLightNavigationBars = !isDark
            }
            AxiomTheme(darkTheme = isDark) {
                AppNavigation(settingsViewModel = settingsVm)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleOAuthIntent(intent)
    }

    private fun handleOAuthIntent(intent: Intent?) {
        val data = intent?.data ?: return
        if (data.scheme == "axiomide" && data.host == "callback") {
            val code = data.getQueryParameter("code")
            if (!code.isNullOrBlank()) {
                GitHubOAuthBus.emit(code)
            }
        }
    }
}
