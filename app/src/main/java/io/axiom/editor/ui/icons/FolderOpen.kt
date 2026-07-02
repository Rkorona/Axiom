package io.axiom.editor.ui.icons


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
public val AppIcons.FolderOpen: ImageVector
  get() {
    if (_folder_open != null) {
      return _folder_open!!
    }
    _folder_open =
      ImageVector.Builder(
          name = "folder_open",
          defaultWidth = 40.dp,
          defaultHeight = 40.dp,
          viewportWidth = 40f,
          viewportHeight = 40f,
        )
        .apply {
          path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Bevel,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.Companion.NonZero,
          ) {
            moveTo(6.11f, 33.33f)
            quadToRelative(-1.1f, 0f, -1.94f, -0.84f)
            reflectiveQuadTo(3.33f, 30.56f)
            verticalLineTo(9.44f)
            quadToRelative(0f, -1.1f, 0.84f, -1.94f)
            reflectiveQuadTo(6.11f, 6.67f)
            horizontalLineTo(16.1f)
            quadToRelative(0.57f, 0f, 1.08f, 0.22f)
            reflectiveQuadToRelative(0.89f, 0.6f)
            lineToRelative(1.96f, 1.96f)
            horizontalLineTo(35.28f)
            quadToRelative(0.59f, 0f, 0.99f, 0.4f)
            reflectiveQuadToRelative(0.4f, 0.99f)
            reflectiveQuadToRelative(-0.4f, 0.99f)
            reflectiveQuadToRelative(-0.99f, 0.4f)
            horizontalLineTo(18.85f)
            lineTo(16.07f, 9.44f)
            horizontalLineTo(6.11f)
            verticalLineTo(30.56f)
            lineTo(9.71f, 17.04f)
            quadToRelative(0.25f, -0.92f, 1.02f, -1.48f)
            reflectiveQuadTo(12.42f, 15f)
            horizontalLineTo(35.53f)
            quadToRelative(1.37f, 0f, 2.22f, 1.09f)
            reflectiveQuadToRelative(0.47f, 2.42f)
            lineTo(34.76f, 31.26f)
            quadToRelative(-0.28f, 1.03f, -1.02f, 1.55f)
            reflectiveQuadToRelative(-1.8f, 0.52f)
            horizontalLineTo(6.11f)
            close()
            moveTo(9.03f, 30.56f)
            horizontalLineTo(32.08f)
            lineTo(35.42f, 17.78f)
            horizontalLineTo(12.36f)
            lineTo(9.03f, 30.56f)
            close()
            moveTo(6.11f, 17.11f)
            verticalLineTo(9.44f)
            verticalLineToRelative(2.78f)
            quadToRelative(0f, 0f, 0f, 1.32f)
            reflectiveQuadToRelative(0f, 3.57f)
            close()
            moveTo(9.03f, 30.56f)
            lineTo(12.36f, 17.78f)
            lineTo(9.03f, 30.56f)
            close()
          }
        }
        .build()
    return _folder_open!!
  }

private var _folder_open: ImageVector? = null
