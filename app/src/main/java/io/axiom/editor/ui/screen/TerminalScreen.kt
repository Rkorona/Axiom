package io.axiom.editor.ui.screen

import android.net.Uri
import android.util.Base64
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.webkit.WebViewAssetLoader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.DisposableEffect
import io.axiom.editor.data.AppSettings
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel

// ─────────────────────────────────────────────
// JavaScript ↔ Kotlin 桥接
// 接口名称 "AndroidBridge" 对应 xterm bundle 中 window.AndroidBridge
// ─────────────────────────────────────────────
private class TerminalJsBridge(
    private val onInput: (ByteArray) -> Unit,
    private val onResizeCallback: (Int, Int) -> Unit
) {
    @JavascriptInterface
    fun onTerminalInput(data: String) {
        try { onInput(data.toByteArray(Charsets.UTF_8)) } catch (_: Exception) {}
    }

    @JavascriptInterface
    fun onResize(rows: Int, cols: Int) {
        onResizeCallback(rows, cols)
    }
}

// ─────────────────────────────────────────────
// 主 Composable
// ─────────────────────────────────────────────
@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun TerminalScreen(
    onNavigateBack: () -> Unit = {},
    settings: AppSettings = AppSettings(),
    modifier: Modifier = Modifier,
    vm: TerminalViewModel = viewModel()
) {
    BackHandler { onNavigateBack() }

    val envState             = vm.envState
    val downloadProgress     = vm.downloadProgress
    val currentStatusMessage = vm.currentStatusMessage
    val context              = LocalContext.current

    // 屏幕常亮
    val activity = context as? android.app.Activity
    DisposableEffect(settings.keepScreenOn) {
        if (settings.keepScreenOn) {
            activity?.window?.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
        onDispose {
            activity?.window?.clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

    // Ctrl 键工具栏状态
    var isCtrlPressed      by remember { mutableStateOf(false) }
    var showSecondaryPanel by remember { mutableStateOf(false) }

    // WebView 引用
    val webViewRef = remember { mutableStateOf<WebView?>(null) }
    var pageReady  by remember { mutableStateOf(false) }

    // ── 收集 PTY 输出 → 推送到 xterm.js ────────────────────────────
    LaunchedEffect(Unit) {
        vm.ptyOutput.collect { chunk ->
            if (!pageReady) return@collect
            val b64 = Base64.encodeToString(chunk, Base64.NO_WRAP)
            webViewRef.value?.post {
                webViewRef.value?.evaluateJavascript("window.writeOutput('$b64')", null)
            }
        }
    }

    LaunchedEffect(envState, pageReady) {
        if (envState == EnvironmentState.Ready && pageReady) {
            vm.startShellIfNeeded()
        }
    }

    // ── 设置同步到终端 ──────────────────────────────────────────
    suspend fun applyTerminalSettings() {
        val wv = webViewRef.value ?: return
        val fs = settings.terminalFontSize.toInt()
        wv.post { wv.evaluateJavascript("if(window.setFontSize) window.setFontSize($fs)", null) }
        val theme = settings.terminalTheme
        wv.post {
            wv.evaluateJavascript(
                "if(window.setTheme) window.setTheme('${theme.bg}','${theme.fg}')", null
            )
        }
        // 自定义字体：从 content URI 读取字节 → Base64 → 注入 xterm @font-face
        val fontUri = settings.terminalFontUri
        if (fontUri.isNotEmpty()) {
            try {
                val uri = Uri.parse(fontUri)
                val bytes = withContext(Dispatchers.IO) {
                    context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
                }
                if (bytes != null && bytes.isNotEmpty()) {
                    val b64 = Base64.encodeToString(bytes, Base64.NO_WRAP)
                    val mime = context.contentResolver.getType(uri) ?: "font/ttf"
                    wv.post {
                        wv.evaluateJavascript(
                            "if(window.setFont) window.setFont('$b64','$mime')", null
                        )
                    }
                } else {
                    Log.w("TerminalScreen", "Custom font file is empty or unreadable")
                }
            } catch (e: Exception) {
                Log.w("TerminalScreen", "Failed to load custom terminal font: $e")
            }
        } else {
            wv.post { wv.evaluateJavascript("if(window.clearFont) window.clearFont()", null) }
        }
    }

    LaunchedEffect(pageReady) {
        if (pageReady) applyTerminalSettings()
    }

    LaunchedEffect(settings) {
        if (pageReady) applyTerminalSettings()
    }

    // ── 工具栏按键 → 转义序列写入 PTY ────────────────────────────
    fun handleToolbarKeyPress(key: String) {
        val bytes: ByteArray = when (key) {
            "Esc"  -> byteArrayOf(0x1B)
            "Ctrl" -> {
                isCtrlPressed = !isCtrlPressed
                return
            }
            "Tab"  -> byteArrayOf(0x09)
            "↑"    -> byteArrayOf(0x1B, 0x5B, 0x41)
            "↓"    -> byteArrayOf(0x1B, 0x5B, 0x42)
            "←"    -> byteArrayOf(0x1B, 0x5B, 0x44)
            "→"    -> byteArrayOf(0x1B, 0x5B, 0x43)
            "Home" -> byteArrayOf(0x1B, 0x5B, 0x48)
            "End"  -> byteArrayOf(0x1B, 0x5B, 0x46)
            "{ }"  -> "{}".toByteArray()
            "[ ]"  -> "[]".toByteArray()
            "( )"  -> "()".toByteArray()
            "F1"   -> byteArrayOf(0x1B, 0x4F, 0x50)
            "F2"   -> byteArrayOf(0x1B, 0x4F, 0x51)
            "F3"   -> byteArrayOf(0x1B, 0x4F, 0x52)
            "F4"   -> byteArrayOf(0x1B, 0x4F, 0x53)
            "F5"   -> byteArrayOf(0x1B, 0x5B, 0x31, 0x35, 0x7E)
            "F6"   -> byteArrayOf(0x1B, 0x5B, 0x31, 0x37, 0x7E)
            "F7"   -> byteArrayOf(0x1B, 0x5B, 0x31, 0x38, 0x7E)
            "F8"   -> byteArrayOf(0x1B, 0x5B, 0x31, 0x39, 0x7E)
            else -> {
                val raw = key.toByteArray(Charsets.UTF_8)
                if (isCtrlPressed && raw.size == 1 && raw[0] in 0x40..0x7E) {
                    isCtrlPressed = false
                    byteArrayOf((raw[0].toInt() xor 0x40).toByte())
                } else { raw }
            }
        }
        vm.sendInput(bytes)
    }

    Scaffold(modifier = modifier) { innerPadding ->
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .imePadding()
    ) {

        // ── Ready: xterm.js WebView ────────────────────────────────
        if (envState == EnvironmentState.Ready) {
            Column(modifier = Modifier.fillMaxSize()) {

                // A. xterm.js 终端区（充满剩余空间）
                AndroidView(
                    factory = { ctx ->
                        WebView(ctx).apply {
                            this.settings.apply {
                                javaScriptEnabled = true
                                domStorageEnabled = true
                                allowFileAccess  = true
                                setSupportZoom(false)
                                builtInZoomControls = false
                                displayZoomControls = false
                                useWideViewPort = true
                                loadWithOverviewMode = false
                                allowFileAccessFromFileURLs = true
                                allowUniversalAccessFromFileURLs = true
                            }

                            webChromeClient = object : android.webkit.WebChromeClient() {
                                override fun onConsoleMessage(consoleMessage: android.webkit.ConsoleMessage): Boolean {
                                    Log.d("TerminalScreen", "WV: ${consoleMessage.message()}")
                                    return true
                                }
                            }

                            addJavascriptInterface(
                                TerminalJsBridge(
                                    onInput          = { data -> vm.sendInput(data) },
                                    onResizeCallback = { rows, cols -> vm.resizePty(rows, cols) }
                                ),
                                "AndroidBridge"
                            )

                            val assetLoader = WebViewAssetLoader.Builder()
                                .addPathHandler("/assets/", WebViewAssetLoader.AssetsPathHandler(ctx))
                                .build()

                            webViewClient = object : WebViewClient() {
                                override fun shouldInterceptRequest(
                                    view: WebView,
                                    request: WebResourceRequest
                                ): WebResourceResponse? =
                                    assetLoader.shouldInterceptRequest(request.url)

                                override fun onPageFinished(view: WebView?, url: String?) {
                                    super.onPageFinished(view, url)
                                    Log.d("TerminalScreen", "page finished: $url")
                                    pageReady = true
                                    // 延迟触发 fit，确保 WebView 完成布局后 xterm 获得正确尺寸
                                    view?.postDelayed({
                                        view.evaluateJavascript(
                                            "if(window.TerminalBridge) window.TerminalBridge.resizeTerminal()", null
                                        )
                                    }, 300)
                                }

                                override fun onReceivedError(
                                    view: WebView,
                                    request: WebResourceRequest,
                                    error: android.webkit.WebResourceError
                                ) {
                                    super.onReceivedError(view, request, error)
                                    Log.e("TerminalScreen", "WebView error: ${error.description} url=${request.url}")
                                }

                                override fun onReceivedHttpError(
                                    view: WebView,
                                    request: WebResourceRequest,
                                    errorResponse: WebResourceResponse
                                ) {
                                    super.onReceivedHttpError(view, request, errorResponse)
                                    Log.e("TerminalScreen", "HTTP error: ${errorResponse.statusCode} url=${request.url}")
                                }
                            }

                            // 布局变化时触发 xterm FitAddon 重新适配
                            viewTreeObserver.addOnGlobalLayoutListener {
                                if (this.width > 0 && this.height > 0) {
                                    evaluateJavascript(
                                        "if(window.TerminalBridge) window.TerminalBridge.resizeTerminal()", null
                                    )
                                }
                            }

                            loadUrl("https://appassets.androidplatform.net/assets/terminal/index.html")
                            webViewRef.value = this
                        }
                    },
                    update = { webViewRef.value = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                )

                // B. M3 风格工具栏
                val toolbarBg      = MaterialTheme.colorScheme.surfaceContainerHigh
                val toolbarDivider = MaterialTheme.colorScheme.outlineVariant
                val toolbarAccent  = MaterialTheme.colorScheme.primary
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(toolbarBg)
                ) {
                    // 主工具行
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .drawBehind {
                                drawLine(
                                    color = toolbarDivider,
                                    start = Offset(0f, 0f),
                                    end = Offset(size.width, 0f),
                                    strokeWidth = 1.dp.toPx()
                                )
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TerminalKeyButton(text = "Esc") { handleToolbarKeyPress("Esc") }
                        TerminalKeyDivider()
                        TerminalKeyButton(
                            text = "Ctrl",
                            isActive = isCtrlPressed,
                            accentColor = toolbarAccent
                        ) { handleToolbarKeyPress("Ctrl") }
                        TerminalKeyDivider()
                        TerminalKeyButton(icon = Icons.Default.KeyboardArrowUp)    { handleToolbarKeyPress("↑") }
                        TerminalKeyDivider()
                        TerminalKeyButton(icon = Icons.Default.KeyboardArrowDown)  { handleToolbarKeyPress("↓") }
                        TerminalKeyDivider()
                        TerminalKeyButton(icon = Icons.Default.KeyboardArrowLeft)  { handleToolbarKeyPress("←") }
                        TerminalKeyDivider()
                        TerminalKeyButton(icon = Icons.Default.KeyboardArrowRight) { handleToolbarKeyPress("→") }
                        TerminalKeyDivider()
                        TerminalKeyButton(
                            icon = Icons.Default.MoreHoriz,
                            isActive = showSecondaryPanel,
                            accentColor = toolbarAccent
                        ) { showSecondaryPanel = !showSecondaryPanel }
                    }

                    // 次级符号面板
                    if (showSecondaryPanel) {
                        val panelBg = MaterialTheme.colorScheme.surface
                        FlowRow(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(panelBg)
                                .drawBehind {
                                    drawLine(
                                        color = toolbarDivider,
                                        start = Offset(0f, 0f),
                                        end = Offset(size.width, 0f),
                                        strokeWidth = 1.dp.toPx()
                                    )
                                }
                                .padding(vertical = 2.dp)
                        ) {
                            val symbols = listOf(
                                "Tab", "{ }", "[ ]", "( )", "Home", "End",
                                "|", "/", "\\", "_", "-", "&", "$",
                                "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8"
                            )
                            val symbolColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                            symbols.forEach { sym ->
                                Box(
                                    modifier = Modifier
                                        .width(58.dp)
                                        .height(44.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .clickable(
                                            interactionSource = remember { MutableInteractionSource() },
                                            indication = null
                                        ) { handleToolbarKeyPress(sym) },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = sym,
                                        style = TextStyle(
                                            color = symbolColor,
                                            fontFamily = FontFamily.Monospace,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Medium
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        // ── Checking 遮罩 ─────────────────────────────────────────
        if (envState == EnvironmentState.Checking) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF111625)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    CircularProgressIndicator(color = Color(0xFF38BDF8))
                    Text(
                        text = "正在检测 Linux 环境…",
                        style = TextStyle(
                            color = Color(0xFF94A3B8),
                            fontFamily = FontFamily.Monospace,
                            fontSize = 13.sp
                        )
                    )
                }
            }
        }

        // ── NotInstalled 弹窗 ─────────────────────────────────────
        if (envState == EnvironmentState.NotInstalled) {
            AlertDialog(
                onDismissRequest = { },
                confirmButton = {
                    Button(onClick = { vm.startInstallDebian() }) { Text("立即下载并部署") }
                },
                dismissButton = {
                    TextButton(onClick = { }) {
                        Text("暂不配置", color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                },
                title = { Text("配置 Linux 开发运行环境", fontWeight = FontWeight.Bold) },
                text = {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = "检测到应用尚未安装 Debian Linux 系统容器。运行多语言代码、格式化程序以及启动高级 LSP 服务需要下载并解压大约 90MB 的核心基础包。\n\n建议在 Wi-Fi 网络环境下进行该操作。",
                            style = MaterialTheme.typography.bodyMedium,
                            lineHeight = 20.sp
                        )
                        if (currentStatusMessage.startsWith("❌")) {
                            Surface(
                                color = MaterialTheme.colorScheme.errorContainer,
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = currentStatusMessage,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onErrorContainer,
                                    fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                },
                shape = RoundedCornerShape(28.dp),
                containerColor = MaterialTheme.colorScheme.surfaceContainerHigh
            )
        }

        // ── 下载 / 解压 / 初始化进度弹窗 ─────────────────────────
        if (envState == EnvironmentState.Downloading ||
            envState == EnvironmentState.Extracting  ||
            envState == EnvironmentState.Initializing
        ) {
            Dialog(
                onDismissRequest = {},
                properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
            ) {
                Surface(
                    modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                    shape = RoundedCornerShape(24.dp),
                    color = MaterialTheme.colorScheme.surfaceContainerHigh,
                    tonalElevation = 6.dp
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = when (envState) {
                                EnvironmentState.Downloading  -> "正在获取 Debian 系统镜像…"
                                EnvironmentState.Extracting   -> "正在构建根文件系统…"
                                EnvironmentState.Initializing -> "正在初始化运行环境…"
                                else -> ""
                            },
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        if (envState == EnvironmentState.Downloading) {
                            LinearProgressIndicator(
                                progress = { downloadProgress },
                                modifier = Modifier.fillMaxWidth(),
                                strokeCap = StrokeCap.Round
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = currentStatusMessage,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Text(
                                    text = "${(downloadProgress * 100).toInt()}%",
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            }
                        } else {
                            CircularProgressIndicator(
                                modifier = Modifier.size(36.dp).align(Alignment.CenterHorizontally),
                                color = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = currentStatusMessage,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                            if (envState == EnvironmentState.Initializing) {
                                val steps = listOf(
                                    "APT 镜像源（USTC）", "DNS 解析（阿里/腾讯）",
                                    "主机名 & hosts", "Shell 环境（.bashrc）", "APT 优化配置"
                                )
                                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                    steps.forEach { step ->
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            Text("·", style = MaterialTheme.typography.bodySmall,
                                                color = MaterialTheme.colorScheme.primary)
                                            Text(step, style = MaterialTheme.typography.bodySmall,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    }
}

// ─────────────────────────────────────────────
// 工具栏按键组件（M3 风格）
// ─────────────────────────────────────────────
@Composable
fun RowScope.TerminalKeyButton(
    text: String? = null,
    icon: ImageVector? = null,
    isActive: Boolean = false,
    accentColor: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit
) {
    val inactiveColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
    val iconSize = 20.dp
    Surface(
        modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .clip(RoundedCornerShape(8.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { onClick() },
        color = if (isActive) accentColor.copy(alpha = 0.15f) else Color.Transparent,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            when {
                icon != null -> Icon(
                    imageVector = icon,
                    contentDescription = text,
                    tint = if (isActive) accentColor else inactiveColor,
                    modifier = Modifier.size(iconSize)
                )
                text != null -> Text(
                    text = text,
                    style = TextStyle(
                        color = if (isActive) accentColor else inactiveColor,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
    }
}

@Composable
fun TerminalKeyDivider() {
    Spacer(
        modifier = Modifier
            .width(1.dp)
            .fillMaxHeight(0.55f)
            .background(Color(0xFF2E384D))
    )
}
