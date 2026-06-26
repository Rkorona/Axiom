package com.example.myapplication.ui.screen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.util.Base64
import android.webkit.ConsoleMessage
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.WindowCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// ─────────────────────────────────────────────
// 数据模型
// ─────────────────────────────────────────────

data class EditorFile(
    val name: String,
    val code: String,
    val lang: String = name.substringAfterLast('.', "js")
)

// ─────────────────────────────────────────────
// JS → Kotlin Bridge
// ─────────────────────────────────────────────

private class MonacoBridge(
    private val webView: WebView,
    private val onReady: () -> Unit,
    private val onContentChanged: () -> Unit,
    private val onError: (String) -> Unit
) {
    private val main = Handler(Looper.getMainLooper())

    @JavascriptInterface
    fun onReady() = main.post { onReady.invoke() }

    @JavascriptInterface
    fun onStatsChanged(lines: Int, chars: Int) = main.post { onContentChanged.invoke() }

    @JavascriptInterface
    fun onCursorChanged(line: Int, col: Int) {}

    @JavascriptInterface
    fun onCursorLayout(x: Int, y: Int, caretHeight: Int, visible: Boolean) {}

    @JavascriptInterface
    fun onSelectionChanged(hasSelection: Boolean, base64Text: String) {}

    @JavascriptInterface
    fun onEditorTapped() {
        main.post {
            webView.requestFocus()
            val imm = webView.context.getSystemService(android.view.inputmethod.InputMethodManager::class.java)
            imm?.showSoftInput(webView, android.view.inputmethod.InputMethodManager.SHOW_IMPLICIT)
        }
    }

    @JavascriptInterface
    fun onEditorDismissed() {}

    @JavascriptInterface
    fun onLongPressEmpty(x: Int, y: Int) {}

    @JavascriptInterface
    fun onError(message: String) = main.post { onError.invoke(message) }

    // 接收来自 WebView 的文本并写入 Android 系统原生剪贴板
    @JavascriptInterface
    fun copyToSystemClipboard(text: String) {
        main.post {
            try {
                val clipboard = webView.context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                val clip = android.content.ClipData.newPlainText("MonacoCode", text)
                clipboard.setPrimaryClip(clip)
            } catch (e: Exception) {
                onError("复制到系统剪贴板失败: ${e.message}")
            }
        }
    }
}

// ─────────────────────────────────────────────
// Kotlin → JS 命令
// ─────────────────────────────────────────────

private fun WebView.evalJs(js: String) {
    if (Looper.myLooper() == Looper.getMainLooper()) {
        evaluateJavascript(js, null)
    } else {
        Handler(Looper.getMainLooper()).post { evaluateJavascript(js, null) }
    }
}

private fun encodeB64(text: String) =
    Base64.encodeToString(text.toByteArray(Charsets.UTF_8), Base64.NO_WRAP)

private fun WebView.setEditorContent(code: String) =
    evalJs("setContent('${encodeB64(code)}')")

private fun WebView.setEditorLanguage(lang: String) =
    evalJs("setLanguage('$lang')")

private fun WebView.setEditorTheme(dark: Boolean) =
    evalJs("setTheme('${if (dark) "vs-dark" else "vs"}')")

private fun WebView.getEditorContent(callback: (String) -> Unit) {
    evaluateJavascript("getContentBase64()") { result ->
        val clean = result?.removeSurrounding("\"") ?: ""
        val content = try {
            String(Base64.decode(clean, Base64.DEFAULT), Charsets.UTF_8)
        } catch (_: Exception) { "" }
        callback(content)
    }
}

// ─────────────────────────────────────────────
// EditorScreen 主界面
// ─────────────────────────────────────────────

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun EditorScreen(
    file: EditorFile,
    onBack: () -> Unit,
    onSave: (String) -> Unit
) {
    val view = LocalView.current
    val context = androidx.compose.ui.platform.LocalContext.current
    val scope = rememberCoroutineScope()
    val isDark = isSystemInDarkTheme()

    val webViewRef = remember { mutableStateOf<WebView?>(null) }
    var isEditorReady by remember { mutableStateOf(false) }
    var initDone by remember { mutableStateOf(false) }
    var isSaving by remember { mutableStateOf(false) }
    var currentLang by remember { mutableStateOf(file.lang) }
    var hasUnsavedChanges by remember { mutableStateOf(false) }
    var showDiscardDialog by remember { mutableStateOf(false) }
    var snackbarMessage by remember { mutableStateOf<String?>(null) }
    val snackbarHostState = remember { SnackbarHostState() }

    BackHandler(enabled = hasUnsavedChanges) { showDiscardDialog = true }

    DisposableEffect(view) {
        val window = (view.context as? androidx.activity.ComponentActivity)?.window
        window?.let { WindowCompat.setDecorFitsSystemWindows(it, false) }
        onDispose {
            window?.let { WindowCompat.setDecorFitsSystemWindows(it, true) }
        }
    }

    LaunchedEffect(snackbarMessage) {
        snackbarMessage?.let {
            snackbarHostState.showSnackbar(it)
            snackbarMessage = null
        }
    }

    LaunchedEffect(isEditorReady) {
        if (!isEditorReady || initDone) return@LaunchedEffect
        val wv = webViewRef.value ?: return@LaunchedEffect
        wv.setEditorTheme(isDark)
        wv.setEditorLanguage(monacoLang(currentLang))
        wv.setEditorContent(file.code)
        wv.evalJs("layoutEditor()")
        initDone = true
    }

    fun saveFile() {
        val wv = webViewRef.value ?: return
        isSaving = true
        wv.getEditorContent { content ->
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
                        if (hasUnsavedChanges) showDiscardDialog = true else onBack()
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                },
                actions = {
                    LangDropdown(
                        current = currentLang,
                        onSelect = { lang ->
                            currentLang = lang
                            webViewRef.value?.setEditorLanguage(monacoLang(lang))
                        }
                    )
                    IconButton(
                        onClick = { saveFile() },
                        enabled = !isSaving && isEditorReady
                    ) {
                        if (isSaving) {
                            CircularProgressIndicator(modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.surface)
        ) {
            
            
                        // ── 🚀 移动端 IDE 专属：多功能防误触辅助动作工具栏 ──
            if (isEditorReady) {
                var isSelectModeActive by remember { mutableStateOf(false) }
                val rowScrollState = rememberScrollState()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.surfaceContainerLow)
                        .horizontalScroll(rowScrollState) // 支持横向滑动包裹
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val btnMod = Modifier.height(36.dp)
                    
                    // 1. 基本剪贴功能
                    TextButton(onClick = { webViewRef.value?.evalJs("selectAll();") }, modifier = btnMod) {
                        Text("全选")
                    }
                    TextButton(onClick = { webViewRef.value?.evalJs("doCopy();") }, modifier = btnMod) {
                        Text("复制")
                    }
                    TextButton(onClick = { webViewRef.value?.evalJs("doCut();") }, modifier = btnMod) {
                        Text("剪切")
                    }
                    TextButton(
                        onClick = {
                            try {
                                val clipboard = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                                val pasteText = clipboard.primaryClip?.getItemAt(0)?.text?.toString() ?: ""
                                if (pasteText.isNotEmpty()) {
                                    val b64 = Base64.encodeToString(pasteText.toByteArray(Charsets.UTF_8), Base64.NO_WRAP)
                                    webViewRef.value?.evalJs("insertTextBase64('$b64');")
                                }
                            } catch (e: Exception) {
                                snackbarMessage = "粘贴失败: ${e.message}"
                            }
                        },
                        modifier = btnMod
                    ) {
                        Text("粘贴")
                    }

                    VerticalDivider(modifier = Modifier.height(20.dp), color = MaterialTheme.colorScheme.outlineVariant)

                    // 2. 🌟 锁定选择模式（高亮状态控制）
                    Button(
                        onClick = {
                            isSelectModeActive = !isSelectModeActive
                            webViewRef.value?.evalJs("toggleSelectionMode();")
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelectModeActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer,
                            contentColor = if (isSelectModeActive) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onPrimaryContainer
                        ),
                        modifier = btnMod.padding(horizontal = 2.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp)
                    ) {
                        Text(if (isSelectModeActive) "选择中[🔒]" else "开始选择")
                    }

                    // 3. 🕹️ 像素级方向键微调光标与选区
                    FilledIconButton(onClick = { webViewRef.value?.evalJs("moveCursor('left');") }, modifier = Modifier.size(36.dp)) {
                        Text("◀", style = MaterialTheme.typography.bodySmall)
                    }
                    FilledIconButton(onClick = { webViewRef.value?.evalJs("moveCursor('up');") }, modifier = Modifier.size(36.dp)) {
                        Text("▲", style = MaterialTheme.typography.bodySmall)
                    }
                    FilledIconButton(onClick = { webViewRef.value?.evalJs("moveCursor('down');") }, modifier = Modifier.size(36.dp)) {
                        Text("▼", style = MaterialTheme.typography.bodySmall)
                    }
                    FilledIconButton(onClick = { webViewRef.value?.evalJs("moveCursor('right');") }, modifier = Modifier.size(36.dp)) {
                        Text("▶", style = MaterialTheme.typography.bodySmall)
                    }
                }
                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant, thickness = 0.5.dp)
            }


            // ── WebView 核心编辑器画布 ──
            Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
                AndroidView(
                    modifier = Modifier.fillMaxSize(),
                    factory = { ctx ->
                        WebView(ctx).apply {
                            layoutParams = android.view.ViewGroup.LayoutParams(
                                android.view.ViewGroup.LayoutParams.MATCH_PARENT,
                                android.view.ViewGroup.LayoutParams.MATCH_PARENT
                            )
                            isFocusable = true
                            isFocusableInTouchMode = true
                            setBackgroundColor(if (isDark) 0xFF0D0D0D.toInt() else 0xFFFAFAFA.toInt())
                
                            val assetLoader = androidx.webkit.WebViewAssetLoader.Builder()
                                .addPathHandler("/assets/", androidx.webkit.WebViewAssetLoader.AssetsPathHandler(ctx))
                                .build()
                
                            settings.apply {
                                javaScriptEnabled = true
                                domStorageEnabled = true
                                allowFileAccess = true
                                useWideViewPort = true
                                loadWithOverviewMode = true
                                setSupportZoom(false)
                                builtInZoomControls = false
                                displayZoomControls = false
                            }
                
                            webChromeClient = object : WebChromeClient() {
                                override fun onConsoleMessage(msg: ConsoleMessage?): Boolean {
                                    msg?.let {
                                        android.util.Log.d("EditorJS",
                                            "[${it.messageLevel()}] ${it.message()} (${it.sourceId()}:${it.lineNumber()})")
                                    }
                                    return true
                                }
                            }
                
                            addJavascriptInterface(
                                MonacoBridge(
                                    webView = this,
                                    onReady = { isEditorReady = true },
                                    onContentChanged = { hasUnsavedChanges = true },
                                    onError = { msg -> snackbarMessage = "编辑器错误：$msg" }
                                ),
                                "AndroidBridge"
                            )
                
                            webViewClient = object : WebViewClient() {
                                override fun shouldInterceptRequest(
                                    view: WebView,
                                    request: WebResourceRequest
                                ): android.webkit.WebResourceResponse? {
                                    return assetLoader.shouldInterceptRequest(request.url)
                                }
                
                                override fun onPageFinished(view: WebView, url: String) {
                                    view.post { view.evalJs("layoutEditor()") }
                                }
                
                                override fun shouldOverrideUrlLoading(
                                    view: WebView, request: WebResourceRequest
                                ): Boolean = !request.url.toString().startsWith("https://appassets.androidplatform.net/assets/")
                            }
                
                            webViewRef.value = this
                            loadUrl("https://appassets.androidplatform.net/assets/monaco/editor.html")
                        }
                    }
                )

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
    }

    if (showDiscardDialog) {
        AlertDialog(
            onDismissRequest = { showDiscardDialog = false },
            title = { Text("放弃更改？") },
            text = { Text("${file.name} 有未保存的修改，离开后将丢失。") },
            confirmButton = {
                TextButton(onClick = { showDiscardDialog = false; onBack() }) { Text("放弃") }
            },
            dismissButton = {
                TextButton(onClick = { showDiscardDialog = false }) { Text("取消") }
            }
        )
    }
}

private fun monacoLang(lang: String): String = when (lang) {
    "js"     -> "javascript"
    "ts"     -> "typescript"
    "jsx"    -> "javascript"
    "py"     -> "python"
    "cpp"    -> "cpp"
    "c"      -> "c"
    "java"   -> "java"
    "kotlin" -> "kotlin"
    "dart"   -> "dart"
    "html"   -> "html"
    "css"    -> "css"
    "json"   -> "json"
    else     -> lang
}

@Composable
private fun LangDropdown(current: String, onSelect: (String) -> Unit) {
    val langs = listOf("js", "ts", "jsx", "py", "cpp", "c", "java", "kotlin", "dart", "html", "css", "json")
    var expanded by remember { mutableStateOf(false) }
    Box {
        TextButton(onClick = { expanded = true }) { Text(current.uppercase()) }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            langs.forEach { lang ->
                DropdownMenuItem(
                    text = { Text(lang.uppercase()) },
                    onClick = { onSelect(lang); expanded = false }
                )
            }
        }
    }
}
