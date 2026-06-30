package io.axiom.editor.data

import android.content.Context
import android.content.SharedPreferences

class GitHubStore(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("github_credentials", Context.MODE_PRIVATE)

    data class Credentials(
        val isLoggedIn: Boolean,
        val username: String,
        val avatarUrl: String
    )

    fun load(): Credentials = Credentials(
        isLoggedIn = prefs.getBoolean("isLoggedIn", false),
        username   = prefs.getString("username", "") ?: "",
        avatarUrl  = prefs.getString("avatarUrl", "") ?: ""
    )

    fun save(username: String, avatarUrl: String) {
        prefs.edit()
            .putBoolean("isLoggedIn", true)
            .putString("username", username)
            .putString("avatarUrl", avatarUrl)
            .apply()
    }

    fun clear() {
        prefs.edit().clear().apply()
    }
}
