package io.axiom.editor.data

import android.content.Context
import android.content.SharedPreferences

class GitHubStore(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("github_credentials", Context.MODE_PRIVATE)

    data class Credentials(
        val isLoggedIn: Boolean,
        val username: String,
        val avatarUrl: String,
        val accessToken: String
    )

    fun load(): Credentials = Credentials(
        isLoggedIn  = prefs.getBoolean("isLoggedIn", false),
        username    = prefs.getString("username", "") ?: "",
        avatarUrl   = prefs.getString("avatarUrl", "") ?: "",
        accessToken = prefs.getString("accessToken", "") ?: ""
    )

    fun save(username: String, avatarUrl: String, accessToken: String) {
        prefs.edit()
            .putBoolean("isLoggedIn", true)
            .putString("username", username)
            .putString("avatarUrl", avatarUrl)
            .putString("accessToken", accessToken)
            .apply()
    }

    fun clear() {
        prefs.edit().clear().apply()
    }
}
