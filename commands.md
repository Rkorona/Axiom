# Axiom — Command Bar 命令清单

> 用户在搜索栏输入 `>` 前缀后进入 Command 模式，以下命令通过模糊匹配显示。

---

## 主页搜索栏（HomeViewModel · `mockCommands`）

共 **3 条**。仅展示全局/项目管理级别的命令，不依赖任何打开的文件或编辑器上下文。

| # | ID | 显示名称 | 描述 | 分类 | 快捷键 | 状态 |
|---|---|---|---|---|---|---|
| 1 | `new_project` | New Project | Create a new project in Axiom | File | — | ✅ 已实现 |
| 2 | `open_folder` | Open Folder | Import an existing folder as a project | File | — | ✅ 已实现 |
| 3 | `settings` | Settings | Open application settings | General | ⌘, | ⚠️ Stub |

---

## 编辑器搜索栏（EditorViewModel · `EDITOR_COMMANDS`）

共 **17 条**。所有需要打开项目或文件才有意义的命令均放在这里。仅 `save` 已实现逻辑，其余为 stub。

| # | ID | 显示名称 | 描述 | 分类 | 状态 |
|---|---|---|---|---|---|
| 1 | `save` | Save File | Save the currently open file | File | ✅ 已实现（仅限内部项目） |
| 2 | `save_all` | Save All | Save all unsaved changes | File | ⚠️ Stub |
| 3 | `new_file` | New File | Create a new file in this project | File | ⚠️ Stub |
| 4 | `new_folder` | New Folder | Create a new folder in this project | File | ⚠️ Stub |
| 5 | `close_file` | Close File | Close the active file | File | ⚠️ Stub |
| 6 | `find_replace` | Find & Replace | Search and replace in current file | Edit | ⚠️ Stub |
| 7 | `format_doc` | Format Document | Run code formatter on current file | Edit | ⚠️ Stub |
| 8 | `rename_symbol` | Rename Symbol | Rename symbol under cursor | Edit | ⚠️ Stub |
| 9 | `open_terminal` | Open Terminal | Open integrated terminal panel | Terminal | ⚠️ Stub |
| 10 | `split_editor` | Split Editor | Split editor horizontally or vertically | View | ⚠️ Stub |
| 11 | `toggle_minimap` | Toggle Minimap | Show or hide the code minimap | View | ⚠️ Stub |
| 12 | `toggle_theme` | Toggle Theme | Switch between dark and light colour scheme | View | ⚠️ Stub |
| 13 | `git_status` | Git Status | Show working tree status | Git | ⚠️ Stub |
| 14 | `git_commit` | Git Commit | Stage changes and commit | Git | ⚠️ Stub |
| 15 | `git_push` | Git Push | Push commits to remote | Git | ⚠️ Stub |
| 16 | `settings` | Settings | Open application settings | General | ⚠️ Stub |
| 17 | `command_palette` | Command Palette | Open this command palette | General | ⚠️ Stub |

---

## 分配原则

| 命令类型 | 归属 | 原因 |
|---|---|---|
| 项目管理（新建/打开项目） | 主页 | 主页的核心职责 |
| App 全局设置（主题、Settings、命令面板） | 两端均有 | 无论在哪个页面都可能需要 |
| 文件操作（新建/关闭/保存文件） | 编辑器 | 需要已打开的项目 |
| 编辑操作（查找替换、格式化、重命名） | 编辑器 | 需要已打开的文件和光标上下文 |
| 终端、视图（分栏、小地图） | 编辑器 | 需要编辑器 UI 存在 |
| Git 操作 | 编辑器 | 需要已打开的项目仓库上下文 |
