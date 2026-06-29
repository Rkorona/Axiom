package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.data.SettingsViewModel
import com.example.myapplication.data.ThemeMode
import com.example.myapplication.ui.navigation.AppNavigation
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val settingsVm: SettingsViewModel = viewModel()
            val settings = settingsVm.settings
            val systemDark = isSystemInDarkTheme()
            val isDark = when (settings.themeOption) {
                ThemeMode.SYSTEM -> systemDark
                ThemeMode.LIGHT  -> false
                ThemeMode.DARK   -> true
            }
            MyApplicationTheme(darkTheme = isDark) {
                AppNavigation(settingsViewModel = settingsVm)
            }
        }
    }
}
