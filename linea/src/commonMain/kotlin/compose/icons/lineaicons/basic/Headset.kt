package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 48.0f)
                curveTo(5.477f, 48.0f, 1.0f, 43.523f, 1.0f, 38.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.0f, 28.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(28.0f)
                horizontalLineTo(53.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 31.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -16.0f, 19.0f, -16.0f)
                reflectiveCurveToRelative(19.0f, 16.0f, 19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(51.0f, 48.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-15.0f, 6.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
