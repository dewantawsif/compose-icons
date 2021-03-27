package compose.icons.lineaicons.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Bevel
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 1.0f)
                lineToRelative(-23.0f, 36.0f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(-7.0f, 26.0f)
                lineToRelative(26.0f, -36.0f)
                lineToRelative(-14.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
