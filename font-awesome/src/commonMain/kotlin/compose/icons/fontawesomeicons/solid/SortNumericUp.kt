package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SortNumericUp: ImageVector
    get() {
        if (_sortNumericUp != null) {
            return _sortNumericUp!!
        }
        _sortNumericUp = Builder(name = "SortNumericUp", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.17f, 258.91f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, -55.0f, 54.17f)
                curveToRelative(-14.27f, 51.05f, 21.19f, 97.77f, 68.83f, 102.53f)
                arcToRelative(84.07f, 84.07f, 0.0f, false, true, -20.85f, 12.91f)
                curveToRelative(-7.57f, 3.4f, -10.8f, 12.47f, -8.18f, 20.34f)
                lineToRelative(9.9f, 20.0f)
                curveToRelative(2.87f, 8.63f, 12.53f, 13.49f, 20.9f, 9.91f)
                curveToRelative(58.0f, -24.76f, 86.25f, -61.61f, 86.25f, -132.0f)
                verticalLineTo(336.0f)
                curveToRelative(-0.02f, -51.21f, -48.4f, -91.34f, -101.85f, -77.09f)
                close()
                moveTo(352.0f, 356.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                close()
                moveTo(304.0f, 96.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.29f, 8.83f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 304.0f, 96.0f)
                close()
                moveTo(107.31f, 36.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-80.0f, 96.0f)
                curveTo(-5.35f, 142.74f, 1.78f, 160.0f, 16.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(14.21f, 0.0f, 21.38f, -17.24f, 11.31f, -27.31f)
                close()
            }
        }
        .build()
        return _sortNumericUp!!
    }

private var _sortNumericUp: ImageVector? = null
