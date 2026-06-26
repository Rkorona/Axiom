package com.example.myapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.FolderOpen
import androidx.compose.material.icons.outlined.Hub
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.SortByAlpha
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.model.Project
import com.example.myapplication.ui.model.ProjectType

// ---------- Sample Data ----------
private val sampleProjects = listOf(
    Project(
        id = "1",
        name = "MyApplication",
        description = "local, android, compose",
        type = ProjectType.LOCAL,
        lastModified = "今天",
        iconColor = Color(0xFFE53935),
        isActive = false
    ),
    Project(
        id = "2",
        name = "sing-box-dashboard",
        description = "github, flutter, proxy-ui",
        type = ProjectType.GITHUB,
        lastModified = "昨天",
        iconColor = Color(0xFF1E3A5F),
        isActive = true
    ),
    Project(
        id = "3",
        name = "fishing-venue-app",
        description = "github, react-native, management",
        type = ProjectType.GITHUB,
        lastModified = "3 天前",
        iconColor = Color(0xFF1565C0),
        isActive = false
    )
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onProjectClick: (Project) -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    var selectedTab by remember { mutableIntStateOf(0) }
    var sortMenuExpanded by remember { mutableStateOf(false) }
    
    // 🧠 控制底栏新建菜单的显示状态
    var showSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState()

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Outlined.Hub, contentDescription = "主页", tint = MaterialTheme.colorScheme.onSurface)
                    }
                },
                title = { Text(text = "Projects", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold) },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "搜索", tint = MaterialTheme.colorScheme.onSurface)
                    }
                    Box {
                        IconButton(onClick = { sortMenuExpanded = true }) {
                            Icon(imageVector = Icons.Outlined.SortByAlpha, contentDescription = "排序", tint = MaterialTheme.colorScheme.onSurface)
                        }
                        DropdownMenu(expanded = sortMenuExpanded, onDismissRequest = { sortMenuExpanded = false }) {
                            DropdownMenuItem(text = { Text("按名称排序") }, onClick = { sortMenuExpanded = false })
                            DropdownMenuItem(text = { Text("按修改时间排序") }, onClick = { sortMenuExpanded = false })
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        },
        floatingActionButton = {
            // 点击 FAB 直接拉起底栏菜单
            FloatingActionButton(
                onClick = { showSheet = true },
                shape = RoundedCornerShape(16.dp),
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.size(64.dp)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "新建项目", modifier = Modifier.size(28.dp))
            }
        },
        bottomBar = {
            NavigationBar(containerColor = MaterialTheme.colorScheme.surface, tonalElevation = 0.dp) {
                NavigationBarItem(selected = selectedTab == 0, onClick = { selectedTab = 0 }, icon = { Icon(Icons.Outlined.FolderOpen, "Projects") }, label = { Text("Projects") })
                NavigationBarItem(selected = selectedTab == 1, onClick = { selectedTab = 1 }, icon = { Icon(Icons.Outlined.Hub, "GitHub") }, label = { Text("GitHub") })
                NavigationBarItem(selected = selectedTab == 2, onClick = { selectedTab = 2 }, icon = { Icon(Icons.Outlined.Settings, "设置") }, label = { Text("设置") })
            }
        }
    ) { innerPadding ->
        ProjectList(
            projects = sampleProjects,
            onProjectClick = onProjectClick,
            modifier = Modifier.padding(innerPadding)
        )

        // ── 🚀 新增：M3 规范的 FAB 展开操作面板 ──
        if (showSheet) {
            ModalBottomSheet(
                onDismissRequest = { showSheet = false },
                sheetState = sheetState,
                containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
                dragHandle = { BottomSheetDefaults.DragHandle() }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                        .padding(start = 24.dp, end = 24.dp, bottom = 32.dp, top = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "创建或导入项目",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))

                    // 选项 1：克隆 Git 仓库
                    FabSheetItem(
                        icon = Icons.Outlined.Hub,
                        iconColor = Color(0xFF1E3A5F),
                        title = "克隆 Git 仓库",
                        description = "从 GitHub、GitLab 或自定义 URL 克隆远程项目",
                        onClick = {
                            showSheet = false
                            // TODO: 触发你的 Git 克隆逻辑
                        }
                    )

                    // 选项 2：新建本地项目
                    FabSheetItem(
                        icon = Icons.Outlined.CreateNewFolder,
                        iconColor = Color(0xFFE53935),
                        title = "新建本地项目",
                        description = "在沙盒中创建一个空白项目或选择运行模版",
                        onClick = {
                            showSheet = false
                            // TODO: 触发新建文件夹/模版逻辑
                        }
                    )

                    // 选项 3：导入本地存储
                    FabSheetItem(
                        icon = Icons.Outlined.Folder,
                        iconColor = Color(0xFFF57C00),
                        title = "导入本地文件夹",
                        description = "通过系统文件选择器，授权外部文件夹访问权限",
                        onClick = {
                            showSheet = false
                            // TODO: 触发 SAF 选择器
                        }
                    )
                }
            }
        }
    }
}

// ── 🎨 提取的可复用 Sheet 列表项组件 ──
@Composable
private fun FabSheetItem(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceContainerHigh)
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(iconColor.copy(alpha = 0.12f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = icon, contentDescription = null, tint = iconColor, modifier = Modifier.size(22.dp))
        }
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = description, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}



// ---------- Project List ----------
@Composable
fun ProjectList(
    projects: List<Project>,
    onProjectClick: (Project) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Section header
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Projects",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.SemiBold
                )
                // Avatar group (decorative, mirrors the Termius screenshot)
                AvatarGroup()
            }
        }

        // Project cards
        items(projects, key = { it.id }) { project ->
            ProjectCard(
                project = project,
                onClick = { onProjectClick(project) }
            )
        }
    }
}

// ---------- Project Card ----------
@Composable
fun ProjectCard(
    project: Project,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = when {
            // Mimic Termius grouped card style with rounded groups
            else -> RoundedCornerShape(12.dp)
        },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerLow
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Project type icon block (mimics Termius colored square icon)
            ProjectIcon(
                color = project.iconColor,
                type = project.type
            )

            Spacer(modifier = Modifier.width(14.dp))

            // Name + description
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = project.name,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = project.description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Active badge / last modified
            if (project.isActive) {
                Spacer(modifier = Modifier.width(8.dp))
                ActiveBadge()
            } else {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = project.lastModified,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

// ---------- Project Icon ----------
@Composable
fun ProjectIcon(
    color: Color,
    type: ProjectType,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        val icon: ImageVector = when (type) {
            ProjectType.LOCAL -> Icons.Outlined.FolderOpen
            ProjectType.GITHUB -> Icons.Outlined.Hub
        }
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(26.dp)
        )
    }
}

// ---------- Active Badge ----------
@Composable
fun ActiveBadge() {
    Surface(
        shape = RoundedCornerShape(6.dp),
        color = MaterialTheme.colorScheme.secondaryContainer
    ) {
        Text(
            text = "Active",
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            fontWeight = FontWeight.Medium
        )
    }
}

// ---------- Avatar Group (decorative) ----------
@Composable
fun AvatarGroup() {
    Row(horizontalArrangement = Arrangement.spacedBy((-8).dp)) {
        // User avatar placeholder
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "D",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp
            )
        }
        // Add collaborator button
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceContainerHigh),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "+",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}

