package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.Rotate: ImageVector
    get() {
        if (_rotate != null) {
            return _rotate!!
        }
        _rotate = Builder(name = "Rotate", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 1.0f)
                curveToRelative(7.678f, 0.0f, 15.354f, 2.929f, 21.212f, 8.787f)
                curveTo(64.91f, 20.484f, 65.841f, 37.248f, 57.003f, 49.0f)
                lineToRelative(-6.001f, 6.002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.0f, 63.0f)
                curveToRelative(-7.678f, 0.0f, -15.354f, -2.929f, -21.212f, -8.787f)
                curveTo(-0.91f, 43.516f, -1.841f, 26.752f, 6.997f, 15.0f)
                lineToRelative(6.001f, -6.002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(51.0f, 44.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(11.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(-11.0f, 0.0f)
            }
        }
        .build()
        return _rotate!!
    }

private var _rotate: ImageVector? = null
