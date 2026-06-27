// ─────────────────────────────────────────────────────────────
// CodeMirror 6 × Android WebView  entry point
// 构建命令: vite build  →  dist/assets/editor.js
// ─────────────────────────────────────────────────────────────

// ── 核心 ──────────────────────────────────────────────────────
import { EditorView, keymap }          from "@codemirror/view"
import { EditorState, Compartment }    from "@codemirror/state"
import { basicSetup }                  from "codemirror"
import { indentWithTab }               from "@codemirror/commands"
import { openSearchPanel,
         closeSearchPanel }            from "@codemirror/search"

// ── 语言包 ────────────────────────────────────────────────────
import { javascript }  from "@codemirror/lang-javascript"
import { python }      from "@codemirror/lang-python"
import { java }        from "@codemirror/lang-java"
import { css }         from "@codemirror/lang-css"
import { html }        from "@codemirror/lang-html"
import { json }        from "@codemirror/lang-json"
import { go }          from "@codemirror/lang-go"
import { rust }        from "@codemirror/lang-rust"
import { vue }         from "@codemirror/lang-vue"
import { xml }         from "@codemirror/lang-xml"
import { yaml }        from "@codemirror/lang-yaml"
import { markdown }    from "@codemirror/lang-markdown"

// ── 主题 ──────────────────────────────────────────────────────
import { oneDark }     from "@codemirror/theme-one-dark"


// ═════════════════════════════════════════════════════════════
// 1. Compartments — 支持运行时动态切换，无需重建编辑器
// ═════════════════════════════════════════════════════════════
const languageConf  = new Compartment()   // 当前语言
const themeConf     = new Compartment()   // 亮/暗主题
const inputModeConf = new Compartment()   // 键盘唤起行为
const editableConf  = new Compartment()   // 是否可编辑


// ═════════════════════════════════════════════════════════════
// 2. 语言映射表 — 文件扩展名 → CM6 语言扩展
// ═════════════════════════════════════════════════════════════
const LANG_MAP = {
  // JavaScript 系
  js:   () => javascript(),
  mjs:  () => javascript(),
  cjs:  () => javascript(),
  jsx:  () => javascript({ jsx: true }),
  ts:   () => javascript({ typescript: true }),
  tsx:  () => javascript({ jsx: true, typescript: true }),
  // Web
  html: () => html(),
  css:  () => css(),
  vue:  () => vue(),
  xml:  () => xml(),
  svg:  () => xml(),
  // 数据 / 配置
  json: () => json(),
  yaml: () => yaml(),
  yml:  () => yaml(),
  md:   () => markdown(),
  // 系统语言
  py:   () => python(),
  java: () => java(),
  go:   () => go(),
  rs:   () => rust(),
}

/** 根据扩展名获取语言扩展，未知类型退化为纯文本 */
function getLang(ext) {
  const fn = LANG_MAP[ext?.toLowerCase?.()]
  return fn ? fn() : []
}


// ═════════════════════════════════════════════════════════════
// 3. Android WebView 核心优化：IME / 键盘唤起控制
//
//    默认 inputmode="none"：
//      用手指滑动代码 → 不唤起软键盘
//
//    editorAPI.enableKeyboard() → inputmode="text"：
//      用户主动点击"编辑"按钮 / 工具栏 → 再唤起 IME
// ═════════════════════════════════════════════════════════════
const ATTR_NO_KEYBOARD   = EditorView.contentAttributes.of({ inputmode: "none" })
const ATTR_WITH_KEYBOARD = EditorView.contentAttributes.of({ inputmode: "text" })


// ═════════════════════════════════════════════════════════════
// 4. 编辑器实例
// ═════════════════════════════════════════════════════════════
const container = document.getElementById("editor")

const view = new EditorView({
  state: EditorState.create({
    doc: "",
    extensions: [
      // ── 基础能力：行号、历史、折叠、括号、搜索快捷键… ──
      basicSetup,

      // ── Tab 键插入缩进（basicSetup 默认不绑定） ──
      keymap.of([indentWithTab]),

      // ── 动态 Compartment 初始值 ──
      languageConf.of(getLang("js")),
      themeConf.of(oneDark),
      inputModeConf.of(ATTR_NO_KEYBOARD),
      editableConf.of(EditorView.editable.of(true)),

      // ── 变更 / 选区事件 → 通知 Android ──
      EditorView.updateListener.of((update) => {
        if (!window.AndroidBridge) return
        if (update.docChanged) {
          const doc = update.state.doc
          AndroidBridge.onStatsChanged(doc.lines, doc.length)
        }
        if (update.selectionSet) {
          const sel  = update.state.selection.main
          const line = update.state.doc.lineAt(sel.head)
          AndroidBridge.onCursorChanged(
            line.number,
            sel.head - line.from + 1  // column（1-based）
          )
        }
      }),

      // ── 编辑区域样式 ──
      EditorView.theme({
        "&": {
          height: "100%",
          fontSize: "14px",
        },
        ".cm-scroller": {
          overflow: "auto",
          fontFamily: "'JetBrains Mono', 'Fira Code', 'Cascadia Code', monospace",
        },
        // 补全弹窗在小屏上不被截断
        ".cm-tooltip": { maxWidth: "90vw" },
        ".cm-tooltip-autocomplete > ul": { maxHeight: "40vh" },
      }),
    ],
  }),
  parent: container,
})


// ═════════════════════════════════════════════════════════════
// 5. 工具函数
// ═════════════════════════════════════════════════════════════

function b64Encode(str) {
  return btoa(unescape(encodeURIComponent(str)))
}

function b64Decode(b64) {
  return decodeURIComponent(escape(atob(b64)))
}


// ═════════════════════════════════════════════════════════════
// 6. Android Bridge API
//    Kotlin 侧通过 webView.evalJs("editorAPI.xxx(...)") 调用
// ═════════════════════════════════════════════════════════════
window.editorAPI = {

  // ── 内容读写 ────────────────────────────────────────────────

  /** 获取纯文本内容 */
  getContent: () => view.state.doc.toString(),

  /** 获取 Base64 编码的内容（避免 JS 字符串转义问题） */
  getContentBase64: () => b64Encode(view.state.doc.toString()),

  /** 写入纯文本内容并重置滚动位置 */
  setContent: (code) => {
    view.dispatch({
      changes: { from: 0, to: view.state.doc.length, insert: code },
      selection: { anchor: 0 },
    })
    view.scrollDOM.scrollTop = 0
  },

  /** 写入 Base64 编码的内容 */
  setContentBase64: (b64) => {
    window.editorAPI.setContent(b64Decode(b64))
  },


  // ── 语言 / 主题切换 ─────────────────────────────────────────

  /**
   * 切换语言
   * @param {string} ext - 文件扩展名，如 "js" | "py" | "ts"
   */
  setLanguage: (ext) => {
    view.dispatch({ effects: languageConf.reconfigure(getLang(ext)) })
  },

  /**
   * 切换主题
   * @param {boolean} dark - true = oneDark，false = 默认亮色
   */
  setTheme: (dark) => {
    view.dispatch({ effects: themeConf.reconfigure(dark ? oneDark : []) })
  },


  // ── 键盘 / IME 控制 ─────────────────────────────────────────

  /**
   * 唤起软键盘
   * 调用时机：用户点击工具栏"编辑"按钮，或 Android 侧判断用户意图输入时
   */
  enableKeyboard: () => {
    view.dispatch({ effects: inputModeConf.reconfigure(ATTR_WITH_KEYBOARD) })
    view.focus()
  },

  /**
   * 收起软键盘（不销毁编辑器焦点，光标保留）
   * 调用时机：用户点击"完成"、返回键、或切换到只读浏览模式时
   */
  disableKeyboard: () => {
    view.dispatch({ effects: inputModeConf.reconfigure(ATTR_NO_KEYBOARD) })
    view.contentDOM.blur()
  },


  // ── 只读模式 ────────────────────────────────────────────────

  /** @param {boolean} readonly */
  setReadOnly: (readonly) => {
    view.dispatch({
      effects: editableConf.reconfigure(EditorView.editable.of(!readonly)),
    })
  },


  // ── 光标移动────────────────

  /**
   * @param {"left"|"right"|"up"|"down"} dir
   */
  moveCursor: (dir) => {
    const state = view.state
    const doc   = state.doc
    let   pos   = state.selection.main.head

    if (dir === "left") {
      pos = Math.max(0, pos - 1)
    } else if (dir === "right") {
      pos = Math.min(doc.length, pos + 1)
    } else if (dir === "up") {
      const line = doc.lineAt(pos)
      if (line.number > 1) {
        const col      = pos - line.from
        const prevLine = doc.line(line.number - 1)
        pos = Math.min(prevLine.from + col, prevLine.to)
      }
    } else if (dir === "down") {
      const line = doc.lineAt(pos)
      if (line.number < doc.lines) {
        const col      = pos - line.from
        const nextLine = doc.line(line.number + 1)
        pos = Math.min(nextLine.from + col, nextLine.to)
      }
    }

    view.dispatch({ selection: { anchor: pos }, scrollIntoView: true })
  },


  // ── 选区操作 ────────────────────────────────────────────────

  /** 全选 */
  selectAll: () => {
    view.dispatch({
      selection: { anchor: 0, head: view.state.doc.length },
    })
  },

  /** 获取当前选中文本（纯文本） */
  getSelection: () => {
    const sel = view.state.selection.main
    return view.state.doc.sliceString(sel.from, sel.to)
  },

  /** 获取当前选中文本（Base64） */
  getSelectionBase64: () => b64Encode(window.editorAPI.getSelection()),


  // ── 剪贴板操作 ──────────────────────────────────────────────
  // CM6 在 Android WebView 里同样无法直接写系统剪贴板，
  // 需由 Kotlin 侧中转：
  //   复制：Kotlin 调 copySelected() 取 Base64 → 写系统剪贴板
  //   粘贴：Kotlin 从系统剪贴板读文本 → 调 insertTextBase64()

  /**
   * 复制选中内容
   * @returns {string} Base64 编码的选中文本，供 Kotlin 写入系统剪贴板
   */
  copySelected: () => window.editorAPI.getSelectionBase64(),

  /**
   * 剪切选中内容
   * @returns {string} Base64 编码的被剪切文本，供 Kotlin 写入系统剪贴板
   */
  cutSelected: () => {
    const sel  = view.state.selection.main
    const text = view.state.doc.sliceString(sel.from, sel.to)
    if (sel.from !== sel.to) {
      view.dispatch({ changes: { from: sel.from, to: sel.to, insert: "" } })
    }
    return b64Encode(text)
  },

  /**
   * 粘贴文本到当前光标位置 / 替换当前选区
   * @param {string} b64 - Kotlin 从系统剪贴板读取后 Base64 编码的文本
   */
  insertTextBase64: (b64) => {
    const text = b64Decode(b64)
    const sel  = view.state.selection.main
    view.dispatch({
      changes:   { from: sel.from, to: sel.to, insert: text },
      selection: { anchor: sel.from + text.length },
    })
  },


  // ── 搜索面板 ────────────────────────────────────────────────

  openSearch:  () => openSearchPanel(view),
  closeSearch: () => closeSearchPanel(view),


  // ── 就绪通知 ────────────────────────────────────────────────

  /**
   * 编辑器初始化完成，通知 Android 可以开始注入内容
   * 在 HTML 的 DOMContentLoaded 事件里调用
   */
  notifyReady: () => {
    if (window.AndroidBridge) AndroidBridge.onReady()
  },
}


// ═════════════════════════════════════════════════════════════
// 7. 初始化就绪通知
// ═════════════════════════════════════════════════════════════
window.editorAPI.notifyReady()