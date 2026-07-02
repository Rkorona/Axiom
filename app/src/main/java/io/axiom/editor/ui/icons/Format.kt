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
public val AppIcons.FormatIndentIncrease: ImageVector
  get() {
    if (_format_indent_increase != null) {
      return _format_indent_increase!!
    }
    _format_indent_increase =
      ImageVector.Builder(
          name = "format_indent_increase",
          defaultWidth = 24.dp,
          defaultHeight = 24.dp,
          viewportWidth = 24f,
          viewportHeight = 24f,
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
            moveTo(4f, 21f)
            quadTo(3.58f, 21f, 3.29f, 20.71f)
            quadTo(3f, 20.43f, 3f, 20f)
            reflectiveQuadTo(3.29f, 19.29f)
            reflectiveQuadTo(4f, 19f)
            horizontalLineTo(20f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(21f, 20f)
            reflectiveQuadToRelative(-0.29f, 0.71f)
            reflectiveQuadTo(20f, 21f)
            horizontalLineTo(4f)
            close()
            moveToRelative(8f, -4f)
            quadToRelative(-0.42f, 0f, -0.71f, -0.29f)
            quadTo(11f, 16.43f, 11f, 16f)
            reflectiveQuadToRelative(0.29f, -0.71f)
            reflectiveQuadTo(12f, 15f)
            horizontalLineToRelative(8f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(21f, 16f)
            reflectiveQuadToRelative(-0.29f, 0.71f)
            reflectiveQuadTo(20f, 17f)
            horizontalLineTo(12f)
            close()
            moveToRelative(0f, -4f)
            quadToRelative(-0.42f, 0f, -0.71f, -0.29f)
            quadTo(11f, 12.43f, 11f, 12f)
            reflectiveQuadToRelative(0.29f, -0.71f)
            reflectiveQuadTo(12f, 11f)
            horizontalLineToRelative(8f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(21f, 12f)
            reflectiveQuadToRelative(-0.29f, 0.71f)
            reflectiveQuadTo(20f, 13f)
            horizontalLineTo(12f)
            close()
            moveTo(12f, 9f)
            quadTo(11.58f, 9f, 11.29f, 8.71f)
            reflectiveQuadTo(11f, 8f)
            quadTo(11f, 7.57f, 11.29f, 7.29f)
            reflectiveQuadTo(12f, 7f)
            horizontalLineToRelative(8f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(21f, 8f)
            quadToRelative(0f, 0.42f, -0.29f, 0.71f)
            reflectiveQuadTo(20f, 9f)
            horizontalLineTo(12f)
            close()
            moveTo(4f, 5f)
            quadTo(3.58f, 5f, 3.29f, 4.71f)
            reflectiveQuadTo(3f, 4f)
            quadTo(3f, 3.57f, 3.29f, 3.29f)
            reflectiveQuadTo(4f, 3f)
            horizontalLineTo(20f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(21f, 4f)
            quadToRelative(0f, 0.42f, -0.29f, 0.71f)
            reflectiveQuadTo(20f, 5f)
            horizontalLineTo(4f)
            close()
            moveTo(3.85f, 15.15f)
            quadTo(3.6f, 15.4f, 3.3f, 15.28f)
            reflectiveQuadTo(3f, 14.8f)
            verticalLineTo(9.2f)
            quadTo(3f, 8.85f, 3.3f, 8.73f)
            reflectiveQuadTo(3.85f, 8.85f)
            lineToRelative(2.8f, 2.8f)
            quadTo(6.8f, 11.8f, 6.8f, 12f)
            reflectiveQuadTo(6.65f, 12.35f)
            lineToRelative(-2.8f, 2.8f)
            close()
          }
        }
        .build()
    return _format_indent_increase!!
  }

private var _format_indent_increase: ImageVector? = null
