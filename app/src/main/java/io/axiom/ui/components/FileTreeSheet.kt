package io.axiom.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Folder
import androidx.compose.material.icons.rounded.FolderOpen
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.axiom.data.model.FileItem
import io.axiom.ui.theme.AxiomDusk
import io.axiom.ui.theme.AxiomMist
import io.axiom.ui.theme.AxiomSlate
import io.axiom.ui.theme.AxiomTextDisabled
import io.axiom.ui.theme.AxiomTextPrimary
import io.axiom.ui.theme.AxiomTextSecondary
import io.axiom.ui.theme.AxiomViolet
import io.axiom.ui.theme.AxiomVoid

// ── Layout constants ──────────────────────────────────────────────────────────

private val FILE_ITEM_H    = 52.dp
private val TREE_V_PADDING = 12.dp
private val MAX_VISIBLE_H  = 480.dp
private val INDENT_PER_DEPTH = 16.dp

/**
 * A standard [ModalBottomSheet] that shows the project file tree.
 *
 * For SAF (external) projects, items carry [FileItem.parentPath] and [FileItem.depth]
 * enabling an expandable tree: tapping a folder row expands/collapses its children.
 * For internal projects the list is flat (all items have depth 0).
 *
 * @param files       Full item list from the project scan (depth-first order for SAF).
 * @param openFile    Currently active file (highlighted in the list).
 * @param onDismiss   Called when the sheet is dismissed.
 * @param onFileClick Called when the user taps a file row.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FileTreeModalSheet(
    files: List<FileItem>,
    openFile: FileItem?,
    onDismiss: () -> Unit,
    onFileClick: (FileItem) -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    // Tracks which folder paths are currently expanded.
    var expandedFolders by remember { mutableStateOf(emptySet<String>()) }

    // Determine whether any item has parentPath set — i.e. this is a SAF tree scan.
    val isTreeMode = files.any { it.parentPath.isNotEmpty() || it.isDirectory }

    // In tree mode, show only root items plus items whose parent chain is fully expanded.
    // In flat mode (internal projects) show all items as before.
    val visibleItems = if (isTreeMode) {
        treeVisibleItems(files, expandedFolders)
    } else {
        files
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState       = sheetState,
        containerColor   = AxiomVoid,
        scrimColor       = Color.Black.copy(alpha = 0.45f),
        dragHandle       = { FileTreeHandle() }
    ) {
        // ── Sheet header ──────────────────────────────────────────────────────
        Row(
            verticalAlignment     = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier              = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 20.dp)
        ) {
            Icon(
                imageVector        = Icons.Rounded.FolderOpen,
                contentDescription = null,
                tint               = AxiomViolet.copy(alpha = 0.8f),
                modifier           = Modifier.size(18.dp)
            )
            Text(
                text  = "FILES",
                style = MaterialTheme.typography.labelSmall.copy(
                    color         = AxiomTextSecondary,
                    fontFamily    = FontFamily.Monospace,
                    fontWeight    = FontWeight.Bold,
                    letterSpacing = 1.8.sp,
                    fontSize      = 10.sp
                )
            )
            Spacer(Modifier.weight(1f))
            // Count badge — files only, exclude directories
            Box(
                contentAlignment = Alignment.Center,
                modifier         = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(AxiomSlate)
                    .padding(horizontal = 8.dp, vertical = 3.dp)
            ) {
                Text(
                    text  = files.count { !it.isDirectory }.toString(),
                    style = MaterialTheme.typography.labelSmall.copy(
                        color      = AxiomTextDisabled,
                        fontFamily = FontFamily.Monospace,
                        fontSize   = 10.sp
                    )
                )
            }
        }

        // Divider
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(AxiomDusk.copy(alpha = 0.6f))
        )

        // ── File list ─────────────────────────────────────────────────────────
        val clampedContentDp = (visibleItems.size * FILE_ITEM_H.value + TREE_V_PADDING.value * 2)
            .coerceAtMost(MAX_VISIBLE_H.value).dp

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(clampedContentDp)
        ) {
            if (files.isEmpty()) {
                TreeEmptyState()
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(clampedContentDp)
                ) {
                    itemsIndexed(visibleItems, key = { _, f -> f.id }) { _, item ->
                        if (item.isDirectory) {
                            val isExpanded = item.path in expandedFolders
                            FolderTreeRow(
                                name       = item.name,
                                depth      = item.depth,
                                isExpanded = isExpanded,
                                onClick    = {
                                    expandedFolders = if (isExpanded) {
                                        // Collapse this folder and all its descendants
                                        expandedFolders - collapseSubtree(item, expandedFolders)
                                    } else {
                                        expandedFolders + item.path
                                    }
                                }
                            )
                        } else {
                            FileTreeRow(
                                file     = item,
                                isActive = item.id == openFile?.id,
                                depth    = item.depth,
                                onClick  = {
                                    onFileClick(item)
                                    onDismiss()
                                }
                            )
                        }
                    }
                }

                // Top fade mask
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                        .align(Alignment.TopCenter)
                        .background(Brush.verticalGradient(listOf(AxiomVoid, Color.Transparent)))
                )
            }
        }
    }
}

// ── Tree visibility helpers ────────────────────────────────────────────────────

/**
 * Returns the subset of [files] that should be visible given [expandedFolders].
 * An item is visible when every ancestor folder in its parent chain is expanded.
 * Root items (parentPath == "") are always visible.
 */
private fun treeVisibleItems(
    files: List<FileItem>,
    expandedFolders: Set<String>
): List<FileItem> {
    // Build a lookup map from path → item for fast parent resolution.
    val byPath = files.associateBy { it.path }

    return files.filter { item ->
        var parentPath = item.parentPath
        while (parentPath.isNotEmpty()) {
            if (parentPath !in expandedFolders) return@filter false
            parentPath = byPath[parentPath]?.parentPath ?: ""
        }
        true
    }
}

/**
 * Returns the set of folder paths to remove when collapsing [folder]:
 * the folder itself plus every expanded descendant folder.
 */
private fun collapseSubtree(folder: FileItem, expandedFolders: Set<String>): Set<String> {
    val toCollapse = mutableSetOf(folder.path)
    // Any expanded folder whose path starts with this folder's path (descendants).
    expandedFolders.filterTo(toCollapse) { it.startsWith(folder.path) }
    return toCollapse
}

// ── Sub-composables ───────────────────────────────────────────────────────────

@Composable
private fun FileTreeHandle() {
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(width = 36.dp, height = 4.dp)
                .clip(CircleShape)
                .background(AxiomMist.copy(alpha = 0.55f))
        )
    }
}

@Composable
private fun FolderTreeRow(
    name: String,
    depth: Int,
    isExpanded: Boolean,
    onClick: () -> Unit
) {
    val startPad = (20 + depth * INDENT_PER_DEPTH.value).dp
    Row(
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier              = Modifier
            .fillMaxWidth()
            .height(FILE_ITEM_H)
            .clickable(onClick = onClick)
            .padding(start = startPad, end = 20.dp)
    ) {
        Icon(
            imageVector        = if (isExpanded) Icons.Rounded.FolderOpen else Icons.Rounded.Folder,
            contentDescription = null,
            tint               = AxiomViolet.copy(alpha = if (isExpanded) 0.9f else 0.65f),
            modifier           = Modifier.size(15.dp)
        )
        Text(
            text     = name,
            style    = MaterialTheme.typography.bodyMedium.copy(
                color      = if (isExpanded) AxiomViolet.copy(alpha = 0.9f) else AxiomTextSecondary,
                fontFamily = FontFamily.Monospace,
                fontWeight = if (isExpanded) FontWeight.Medium else FontWeight.Normal,
                fontSize   = 13.sp
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector        = if (isExpanded) Icons.Rounded.KeyboardArrowDown
                                 else Icons.Rounded.KeyboardArrowRight,
            contentDescription = if (isExpanded) "Collapse" else "Expand",
            tint               = AxiomTextDisabled.copy(alpha = 0.7f),
            modifier           = Modifier.size(16.dp)
        )
    }
}

@Composable
private fun FileTreeRow(
    file: FileItem,
    isActive: Boolean,
    depth: Int,
    onClick: () -> Unit
) {
    val bg      = if (isActive) AxiomViolet.copy(alpha = 0.10f) else Color.Transparent
    val startPad = (20 + depth * INDENT_PER_DEPTH.value).dp
    Row(
        verticalAlignment     = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier              = Modifier
            .fillMaxWidth()
            .height(FILE_ITEM_H)
            .background(bg)
            .clickable(onClick = onClick)
            .padding(start = startPad, end = 20.dp)
    ) {
        // Language colour dot
        Box(
            modifier = Modifier
                .size(7.dp)
                .clip(CircleShape)
                .background(Color(file.language.colorHex))
        )

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text     = file.name,
                style    = MaterialTheme.typography.bodyMedium.copy(
                    color      = if (isActive) AxiomViolet else AxiomTextPrimary,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = if (isActive) FontWeight.SemiBold else FontWeight.Normal,
                    fontSize   = 13.sp
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            if (file.size > 0L) {
                Text(
                    text  = formatSize(file.size),
                    style = MaterialTheme.typography.labelSmall.copy(
                        color    = AxiomTextDisabled,
                        fontSize = 10.sp
                    )
                )
            }
        }

        // Active indicator bar
        if (isActive) {
            Box(
                modifier = Modifier
                    .width(2.dp)
                    .height(22.dp)
                    .clip(CircleShape)
                    .background(AxiomViolet)
            )
        }
    }
}

@Composable
private fun TreeEmptyState() {
    Box(
        contentAlignment = Alignment.Center,
        modifier         = Modifier
            .fillMaxWidth()
            .height(120.dp)
    ) {
        Text(
            text  = "No files found",
            style = MaterialTheme.typography.bodySmall.copy(
                color      = AxiomTextDisabled,
                fontFamily = FontFamily.Monospace
            )
        )
    }
}

// ── Helpers ───────────────────────────────────────────────────────────────────

private fun formatSize(bytes: Long): String = when {
    bytes < 1_024L     -> "${bytes}B"
    bytes < 1_048_576L -> "${bytes / 1_024L}KB"
    else               -> "${"%.1f".format(bytes / 1_048_576.0)}MB"
}
