package com.example.myapplication.ui.screen

import android.annotation.SuppressLint
import android.webkit.JavascriptInterface
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// ─────────────────────────────────────────────
// 数据模型
// ─────────────────────────────────────────────

data class EditorFile(
    val name: String,
    val code: String,
    val lang: String = name.substringAfterLast('.', "js")
)

// ─────────────────────────────────────────────
// JS ↔ Kotlin Bridge
// ─────────────────────────────────────────────

class EditorJsBridge(
    private val onReady: () -> Unit,
    private val onContentChange: (String) -> Unit
) {
    @JavascriptInterface
    fun onEditorReady() {
        onReady()
    }

    @JavascriptInterface
    fun onContentChange(content: String) {
        onContentChange(content)
    }
}

// ─────────────────────────────────────────────
// WebView 操作封装
// ─────────────────────────────────────────────

object EditorCommands {

    /** 转义代码字符串，安全注入到 JS backtick 模板中 */
    private fun String.escapeForJs(): String =
        this.replace("\\", "\\\\")
            .replace("`", "\\`")
            .replace("$", "\\$")

    fun init(webView: WebView, code: String, lang: String) {
        val escaped = code.escapeForJs()
        webView.evaluateJavascript(
            "window.EditorBridge.init({ code: `$escaped`, lang: `$lang`, theme: 'dark' })",
            null
        )
    }

    fun setContent(webView: WebView, code: String) {
        val escaped = code.escapeForJs()
        webView.evaluateJavascript(
            "window.EditorBridge.setContent(`$escaped`)",
            null
        )
    }

    fun getContent(webView: WebView, callback: (String) -> Unit) {
        webView.evaluateJavascript("window.EditorBridge.getContent()") { raw ->
            // evaluateJavascript 返回的是 JSON 字符串，需要去掉首尾引号并反转义
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

    fun setLanguage(webView: WebView, lang: String) {
        webView.evaluateJavascript(
            "window.EditorBridge.setLanguage(`$lang`)",
            null
        )
    }

    fun setCursor(webView: WebView, line: Int, col: Int) {
        webView.evaluateJavascript(
            "window.EditorBridge.setCursor($line, $col)",
            null
        )
    }
}

// ─────────────────────────────────────────────
// EditorScreen
// ─────────────────────────────────────────────

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun EditorScreen(
    file: EditorFile,
    onBack: () -> Unit,
    onSave: (String) -> Unit
) {
    val context = LocalContext.current
    val view = LocalView.current
    val scope = rememberCoroutineScope()
    val isDark = true // 或接入 isSystemInDarkTheme()

    // 保存 WebView 引用，跨 recomposition 稳定
    val webViewRef = remember { mutableStateOf<WebView?>(null) }
    var isEditorReady by remember { mutableStateOf(false) }
    var isSaving by remember { mutableStateOf(false) }
    var currentLang by remember { mutableStateOf(file.lang) }
    var hasUnsavedChanges by remember { mutableStateOf(false) }
    var showDiscardDialog by remember { mutableStateOf(false) }
    var snackbarMessage by remember { mutableStateOf<String?>(null) }
    val snackbarHostState = remember { SnackbarHostState() }

    // 拦截返回键，未保存时弹确认
    BackHandler(enabled = hasUnsavedChanges) {
        showDiscardDialog = true
    }

    // 软键盘适配：让 WebView 随键盘自动 resize
    DisposableEffect(view) {
        val window = (view.context as? androidx.activity.ComponentActivity)?.window
        window?.let {
            WindowCompat.setDecorFitsSystemWindows(it, false)
        }
        onDispose {
            window?.let {
                WindowCompat.setDecorFitsSystemWindows(it, true)
            }
        }
    }

    // Snackbar 触发
    LaunchedEffect(snackbarMessage) {
        snackbarMessage?.let {
            snackbarHostState.showSnackbar(it)
            snackbarMessage = null
        }
    }

    // 保存操作
    fun saveFile() {
        val wv = webViewRef.value ?: return
        isSaving = true
        EditorCommands.getContent(wv) { content ->
            scope.launch(Dispatchers.Main) {
                onSave(content)
                hasUnsavedChanges = false
                isSaving = false
                snackbarMessage = "已保存"
            }
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = file.name + if (hasUnsavedChanges) " ●" else "",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = currentLang.uppercase(),
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        if (hasUnsavedChanges) showDiscardDialog = true
                        else onBack()
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                },
                actions = {
                    // 语言切换下拉
                    LangDropdown(
                        current = currentLang,
                        onSelect = { lang ->
                            currentLang = lang
                            webViewRef.value?.let { EditorCommands.setLanguage(it, lang) }
                        }
                    )
                    // 保存按钮
                    IconButton(
                        onClick = { saveFile() },
                        enabled = !isSaving && isEditorReady
                    ) {
                        if (isSaving) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(20.dp),
                                strokeWidth = 2.dp
                            )
                        } else {
                            Icon(Icons.Default.Save, contentDescription = "保存")
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer
                )
            )
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.surface)
        ) {
            // WebView
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { ctx ->
                    WebView(ctx).apply {
                        settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            allowFileAccessFromFileURLs = true
                            allowUniversalAccessFromFileURLs = true
                            // 关键：让 WebView 随软键盘 resize
                            setSupportZoom(false)
                            builtInZoomControls = false
                            displayZoomControls = false
                        }

                        // 在 AndroidView factory 里
                        val bridge = EditorBridge(
                            scope = scope,
                            callback = object : EditorCallback {
                                override fun onReady() {
                                    isEditorReady = true
                                    EditorCommands.init(webView, file.code, file.lang)
                                }
                                override fun onContentChange(content: String) {
                                    hasUnsavedChanges = true
                                }
                                override fun onSelectionChange(line: Int, col: Int) {
                                    // 可以在状态栏显示 "行:列"
                                }
                                override fun onError(message: String) {
                                    snackbarMessage = "编辑器错误：$message"
                                }
                            }
                        )
                        webView.addJavascriptInterface(bridge, "Android")
                            
                        webViewRef.value = this

                        webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView,
                                request: WebResourceRequest
                            ): Boolean = true // 阻止跳转外部链接
                        }

                        loadUrl("file:///android_asset/editor/index.html")
                    }
                }
            )

            // 加载中遮罩
            if (!isEditorReady) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.surface),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CircularProgressIndicator()
                        Spacer(Modifier.height(12.dp))
                        Text("加载编辑器…", style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }

    // 放弃更改确认弹窗
    if (showDiscardDialog) {
        AlertDialog(
            onDismissRequest = { showDiscardDialog = false },
            title = { Text("放弃更改？") },
            text = { Text("${file.name} 有未保存的修改，离开后将丢失。") },
            confirmButton = {
                TextButton(onClick = {
                    showDiscardDialog = false
                    onBack()
                }) { Text("放弃") }
            },
            dismissButton = {
                TextButton(onClick = { showDiscardDialog = false }) { Text("取消") }
            }
        )
    }
}

// ─────────────────────────────────────────────
// 语言切换下拉菜单
// ─────────────────────────────────────────────

@Composable
private fun LangDropdown(
    current: String,
    onSelect: (String) -> Unit
) {
    val langs = listOf("js", "ts", "jsx", "py", "cpp", "c", "java", "html", "css", "json")
    var expanded by remember { mutableStateOf(false) }

    Box {
        TextButton(onClick = { expanded = true }) {
            Text(current.uppercase())
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            langs.forEach { lang ->
                DropdownMenuItem(
                    text = { Text(lang.uppercase()) },
                    onClick = {
                        onSelect(lang)
                        expanded = false
                    },
                    leadingIcon = if (lang == current) {
                        { Icon(Icons.Default.Save, contentDescription = null, modifier = Modifier.size(16.dp)) }
                    } else null
                )
            }
        }
    }
}