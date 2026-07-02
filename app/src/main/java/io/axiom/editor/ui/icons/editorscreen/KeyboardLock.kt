package io.axiom.editor.ui.icons.editorscreen


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.axiom.editor.ui.icons.AppIcons
@Suppress("CheckReturnValue")
public val AppIcons.KeyboardLock: ImageVector
  get() {
    if (_keyboard_lock != null) {
      return _keyboard_lock!!
    }
    _keyboard_lock =
      ImageVector.Builder(
          name = "keyboard_lock",
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
            moveTo(16.85f, 22f)
            quadToRelative(-0.35f, 0f, -0.6f, -0.25f)
            reflectiveQuadTo(16f, 21.15f)
            verticalLineToRelative(-3.3f)
            quadToRelative(0f, -0.35f, 0.25f, -0.6f)
            reflectiveQuadTo(16.85f, 17f)
            horizontalLineTo(17f)
            verticalLineTo(16f)
            quadToRelative(0f, -0.83f, 0.59f, -1.41f)
            reflectiveQuadTo(19f, 14f)
            reflectiveQuadToRelative(1.41f, 0.59f)
            reflectiveQuadTo(21f, 16f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(0.15f)
            quadToRelative(0.35f, 0f, 0.6f, 0.25f)
            reflectiveQuadTo(22f, 17.85f)
            verticalLineToRelative(3.3f)
            quadToRelative(0f, 0.35f, -0.25f, 0.6f)
            reflectiveQuadTo(21.15f, 22f)
            horizontalLineToRelative(-4.3f)
            close()
            moveTo(18f, 17f)
            horizontalLineToRelative(2f)
            verticalLineTo(16f)
            quadToRelative(0f, -0.43f, -0.29f, -0.71f)
            reflectiveQuadTo(19f, 15f)
            reflectiveQuadToRelative(-0.71f, 0.29f)
            reflectiveQuadTo(18f, 16f)
            verticalLineToRelative(1f)
            close()
            moveTo(6.71f, 9.71f)
            quadTo(7f, 9.42f, 7f, 9f)
            quadTo(7f, 8.57f, 6.71f, 8.29f)
            reflectiveQuadTo(6f, 8f)
            quadTo(5.58f, 8f, 5.29f, 8.29f)
            reflectiveQuadTo(5f, 9f)
            quadTo(5f, 9.42f, 5.29f, 9.71f)
            reflectiveQuadTo(6f, 10f)
            reflectiveQuadTo(6.71f, 9.71f)
            close()
            moveToRelative(0f, 3f)
            quadTo(7f, 12.43f, 7f, 12f)
            reflectiveQuadTo(6.71f, 11.29f)
            reflectiveQuadTo(6f, 11f)
            quadTo(5.58f, 11f, 5.29f, 11.29f)
            reflectiveQuadTo(5f, 12f)
            reflectiveQuadToRelative(0.29f, 0.71f)
            reflectiveQuadTo(6f, 13f)
            reflectiveQuadTo(6.71f, 12.71f)
            close()
            moveToRelative(3f, -3f)
            quadTo(10f, 9.42f, 10f, 9f)
            quadTo(10f, 8.57f, 9.71f, 8.29f)
            reflectiveQuadTo(9f, 8f)
            quadTo(8.58f, 8f, 8.29f, 8.29f)
            reflectiveQuadTo(8f, 9f)
            quadTo(8f, 9.42f, 8.29f, 9.71f)
            quadTo(8.58f, 10f, 9f, 10f)
            quadTo(9.43f, 10f, 9.71f, 9.71f)
            close()
            moveToRelative(0f, 3f)
            quadTo(10f, 12.43f, 10f, 12f)
            reflectiveQuadTo(9.71f, 11.29f)
            reflectiveQuadTo(9f, 11f)
            quadTo(8.58f, 11f, 8.29f, 11.29f)
            reflectiveQuadTo(8f, 12f)
            reflectiveQuadToRelative(0.29f, 0.71f)
            quadTo(8.58f, 13f, 9f, 13f)
            quadToRelative(0.43f, 0f, 0.71f, -0.29f)
            close()
            moveToRelative(3f, -3f)
            quadTo(13f, 9.42f, 13f, 9f)
            quadTo(13f, 8.57f, 12.71f, 8.29f)
            reflectiveQuadTo(12f, 8f)
            reflectiveQuadTo(11.29f, 8.29f)
            reflectiveQuadTo(11f, 9f)
            quadToRelative(0f, 0.42f, 0.29f, 0.71f)
            reflectiveQuadTo(12f, 10f)
            reflectiveQuadTo(12.71f, 9.71f)
            close()
            moveToRelative(0f, 3f)
            quadTo(13f, 12.43f, 13f, 12f)
            reflectiveQuadTo(12.71f, 11.29f)
            reflectiveQuadTo(12f, 11f)
            reflectiveQuadToRelative(-0.71f, 0.29f)
            reflectiveQuadTo(11f, 12f)
            reflectiveQuadToRelative(0.29f, 0.71f)
            reflectiveQuadTo(12f, 13f)
            reflectiveQuadToRelative(0.71f, -0.29f)
            close()
            moveToRelative(3f, -3f)
            quadTo(16f, 9.42f, 16f, 9f)
            quadTo(16f, 8.57f, 15.71f, 8.29f)
            reflectiveQuadTo(15f, 8f)
            reflectiveQuadTo(14.29f, 8.29f)
            reflectiveQuadTo(14f, 9f)
            quadToRelative(0f, 0.42f, 0.29f, 0.71f)
            reflectiveQuadTo(15f, 10f)
            reflectiveQuadTo(15.71f, 9.71f)
            close()
            moveToRelative(0f, 3f)
            quadTo(16f, 12.43f, 16f, 12f)
            reflectiveQuadTo(15.71f, 11.29f)
            reflectiveQuadTo(15f, 11f)
            reflectiveQuadToRelative(-0.71f, 0.29f)
            reflectiveQuadTo(14f, 12f)
            reflectiveQuadToRelative(0.29f, 0.71f)
            reflectiveQuadTo(15f, 13f)
            reflectiveQuadToRelative(0.71f, -0.29f)
            close()
            moveToRelative(3f, -3f)
            quadTo(19f, 9.42f, 19f, 9f)
            quadTo(19f, 8.57f, 18.71f, 8.29f)
            reflectiveQuadTo(18f, 8f)
            reflectiveQuadTo(17.29f, 8.29f)
            reflectiveQuadTo(17f, 9f)
            quadToRelative(0f, 0.42f, 0.29f, 0.71f)
            reflectiveQuadTo(18f, 10f)
            reflectiveQuadTo(18.71f, 9.71f)
            close()
            moveTo(4f, 19f)
            quadTo(3.18f, 19f, 2.59f, 18.41f)
            reflectiveQuadTo(2f, 17f)
            verticalLineTo(7f)
            quadTo(2f, 6.18f, 2.59f, 5.59f)
            reflectiveQuadTo(4f, 5f)
            horizontalLineTo(20f)
            quadToRelative(0.83f, 0f, 1.41f, 0.59f)
            quadTo(22f, 6.18f, 22f, 7f)
            verticalLineToRelative(4.63f)
            quadToRelative(0f, 0.45f, -0.39f, 0.67f)
            reflectiveQuadTo(20.8f, 12.33f)
            quadTo(20.35f, 12.15f, 19.89f, 12.08f)
            reflectiveQuadTo(18.95f, 12f)
            quadTo(18.85f, 11.7f, 18.6f, 11.5f)
            reflectiveQuadTo(18f, 11.3f)
            quadToRelative(-0.43f, 0f, -0.71f, 0.29f)
            quadTo(17f, 11.88f, 17f, 12.3f)
            quadToRelative(0f, 0.05f, 0f, 0.06f)
            quadToRelative(0f, 0.01f, 0f, 0.06f)
            quadToRelative(-0.57f, 0.28f, -1.09f, 0.66f)
            quadTo(15.4f, 13.48f, 15f, 14f)
            horizontalLineTo(9f)
            quadTo(8.58f, 14f, 8.29f, 14.29f)
            reflectiveQuadTo(8f, 15f)
            reflectiveQuadToRelative(0.29f, 0.71f)
            quadTo(8.58f, 16f, 9f, 16f)
            horizontalLineToRelative(5.1f)
            quadToRelative(-0.05f, 0.25f, -0.08f, 0.49f)
            reflectiveQuadTo(14f, 17f)
            verticalLineToRelative(1f)
            quadToRelative(0f, 0.43f, -0.29f, 0.71f)
            reflectiveQuadTo(13f, 19f)
            horizontalLineTo(4f)
            close()
          }
        }
        .build()
    return _keyboard_lock!!
  }

private var _keyboard_lock: ImageVector? = null
