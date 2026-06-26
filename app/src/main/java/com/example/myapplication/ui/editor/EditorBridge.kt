package com.example.myapplication.ui.editor

import android.webkit.JavascriptInterface
import android.webkit.WebView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// ─────────────────────────────────────────────
// JS → Kotlin 回调接口
// ─────────────────────────────────────────────

interface EditorCallback {
    fun onReady()
    fun onContentChange(content: String)
    fun onSelectionChange(line: Int, col: Int)
    fun onError(message: String)
}

// ─────────────────────────────────────────────
// JS → Kotlin Bridge（注入到 WebView）
// ─────────────────────────────────────────────

class EditorBridge(
    private val scope: CoroutineScope,
    private val callback: EditorCallback
) {
    // JS 调用：window.Android.onEditorReady()
    @JavascriptInterface
    fun onEditorReady() {
        scope.launch(Dispatchers.Main) {
            callback.onReady()
        }
    }

    // JS 调用：window.Android.onContentChange(content)
    @JavascriptInterface
    fun onContentChange(content: String) {
        scope.launch(Dispatchers.Main) {
            callback.onContentChange(content)
        }
    }

    // JS 调用：window.Android.onSelectionChange(line, col)
    @JavascriptInterface
    fun onSelectionChange(line: Int, col: Int) {
        scope.launch(Dispatchers.Main) {
            callback.onSelectionChange(line, col)
        }
    }

    // JS 调用：window.Android.onError(message)
    @JavascriptInterface
    fun onError(message: String) {
        scope.launch(Dispatchers.Main) {
            callback.onError(message)
        }
    }
}

// ─────────────────────────────────────────────
// Kotlin → JS 命令封装
// ─────────────────────────────────────────────

object EditorCommands {

    private fun String.escapeForJs(): String =
        this.replace("\\", "\\\\")
            .replace("`", "\\`")
            .replace("$", "\\$")

    /** 初始化编辑器，传入代码、语言、主题 */
    fun init(webView: WebView, code: String, lang: String, theme: String = "dark") {
        val escaped = code.escapeForJs()
        webView.evaluateJavascript(
            "window.EditorBridge.init({ code: `$escaped`, lang: `$lang`, theme: `$theme` })",
            null
        )
    }

    /** 替换全部内容 */
    fun setContent(webView: WebView, code: String) {
        val escaped = code.escapeForJs()
        webView.evaluateJavascript(
            "window.EditorBridge.setContent(`$escaped`)",
            null
        )
    }

    /** 获取当前内容，结果通过 callback 返回 */
    fun getContent(webView: WebView, callback: (String) -> Unit) {
        webView.evaluateJavascript("window.EditorBridge.getContent()") { raw ->
            val content = raw
                ?.removeSurrounding("\"")
                ?.replace("\\n", "\n")
                ?.replace("\\t", "\t")
                ?.replace("\\\"", "\"")
                ?.replace("\\\\", "\\")
                ?: ""
            callback(content)
        }
    }

    /** 切换语言高亮 */
    fun setLanguage(webView: WebView, lang: String) {
        webView.evaluateJavascript(
            "window.EditorBridge.setLanguage(`$lang`)",
            null
        )
    }

    /** 切换主题 dark / light */
    fun setTheme(webView: WebView, theme: String) {
        webView.evaluateJavascript(
            "window.EditorBridge.setTheme(`$theme`)",
            null
        )
    }

    /** 跳转到指定行列（1-based） */
    fun setCursor(webView: WebView, line: Int, col: Int) {
        webView.evaluateJavascript(
            "window.EditorBridge.setCursor($line, $col)",
            null
        )
    }

    /** 在当前光标位置插入文本 */
    fun insertText(webView: WebView, text: String) {
        val escaped = text.escapeForJs()
        webView.evaluateJavascript(
            "window.EditorBridge.insertText(`$escaped`)",
            null
        )
    }

    /** 撤销 */
    fun undo(webView: WebView) {
        webView.evaluateJavascript("window.EditorBridge.undo()", null)
    }

    /** 重做 */
    fun redo(webView: WebView) {
        webView.evaluateJavascript("window.EditorBridge.redo()", null)
    }

    /** 格式化代码（需要 JS 侧实现） */
    fun format(webView: WebView) {
        webView.evaluateJavascript("window.EditorBridge.format()", null)
    }
}