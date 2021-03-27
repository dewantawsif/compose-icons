package compose.icons.lineaicons.weather

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
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.MoonsetFull: ImageVector
    get() {
        if (_moonsetFull != null) {
            return _moonsetFull!!
        }
        _moonsetFull = Builder(name = "MoonsetFull", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 47.0f)
                lineTo(64.0f, 47.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(39.0f, 60.0f)
                lineToRelative(-7.0f, -7.0f)
                lineToRelative(-7.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.159f, 47.0f)
                curveTo(49.96f, 44.096f, 51.0f, 40.669f, 51.0f, 37.0f)
                curveToRelative(0.0f, -10.493f, -8.506f, -19.0f, -19.0f, -19.0f)
                reflectiveCurveToRelative(-19.0f, 8.507f, -19.0f, 19.0f)
                curveToRelative(0.0f, 3.668f, 1.04f, 7.094f, 2.841f, 9.998f)
            }
        }
        .build()
        return _moonsetFull!!
    }

private var _moonsetFull: ImageVector? = null
