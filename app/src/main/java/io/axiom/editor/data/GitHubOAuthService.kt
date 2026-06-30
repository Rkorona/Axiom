package io.axiom.editor.data

import io.axiom.editor.BuildConfig
import org.json.JSONObject
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL

object GitHubOAuthService {

    data class UserInfo(
        val login: String,
        val avatarUrl: String,
        val name: String?,
        val email: String?
    )

    fun buildAuthUrl(): String {
        val clientId = BuildConfig.GITHUB_CLIENT_ID
        val callbackUrl = BuildConfig.GITHUB_CALLBACK_URL
        val scope = "repo,user,read:org"
        return "https://github.com/login/oauth/authorize" +
            "?client_id=$clientId" +
            "&redirect_uri=${encode(callbackUrl)}" +
            "&scope=${encode(scope)}"
    }

    fun exchangeCodeForToken(code: String): String {
        val url = URL("https://github.com/login/oauth/access_token")
        val conn = url.openConnection() as HttpURLConnection
        conn.apply {
            requestMethod = "POST"
            setRequestProperty("Accept", "application/json")
            setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            doOutput = true
            connectTimeout = 15000
            readTimeout = 15000
        }
        val body = "client_id=${BuildConfig.GITHUB_CLIENT_ID}" +
            "&client_secret=${BuildConfig.GITHUB_CLIENT_SECRET}" +
            "&code=$code"
        OutputStreamWriter(conn.outputStream).use { it.write(body) }

        val responseCode = conn.responseCode
        val stream = if (responseCode in 200..299) conn.inputStream else conn.errorStream
        val response = stream.bufferedReader().readText()
        val json = JSONObject(response)

        if (json.has("error")) {
            throw Exception("OAuth error: ${json.optString("error_description", json.getString("error"))}")
        }
        return json.getString("access_token")
    }

    fun getUserInfo(token: String): UserInfo {
        val url = URL("https://api.github.com/user")
        val conn = url.openConnection() as HttpURLConnection
        conn.apply {
            requestMethod = "GET"
            setRequestProperty("Authorization", "Bearer $token")
            setRequestProperty("Accept", "application/vnd.github+json")
            setRequestProperty("X-GitHub-Api-Version", "2022-11-28")
            connectTimeout = 15000
            readTimeout = 15000
        }
        val responseCode = conn.responseCode
        if (responseCode != 200) {
            throw Exception("GitHub API returned $responseCode")
        }
        val response = conn.inputStream.bufferedReader().readText()
        val json = JSONObject(response)
        return UserInfo(
            login = json.getString("login"),
            avatarUrl = json.getString("avatar_url"),
            name = if (json.isNull("name")) null else json.optString("name"),
            email = if (json.isNull("email")) null else json.optString("email")
        )
    }

    private fun encode(value: String): String =
        java.net.URLEncoder.encode(value, "UTF-8")
}
