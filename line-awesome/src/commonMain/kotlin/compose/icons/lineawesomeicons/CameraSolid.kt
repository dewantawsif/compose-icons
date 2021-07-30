package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CameraSolid: ImageVector
    get() {
        if (_cameraSolid != null) {
            return _cameraSolid!!
        }
        _cameraSolid = Builder(name = "CameraSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 6.0f)
                lineTo(11.1875f, 6.4063f)
                lineTo(10.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                lineTo(20.8125f, 6.4063f)
                lineTo(20.5f, 6.0f)
                close()
                moveTo(12.5f, 8.0f)
                lineTo(19.5f, 8.0f)
                lineTo(20.6875f, 9.5938f)
                lineTo(21.0f, 10.0f)
                lineTo(27.0f, 10.0f)
                lineTo(27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.3125f, 9.5938f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(7.4492f, 11.0f, 7.0f, 11.4492f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5508f, 7.4492f, 13.0f, 8.0f, 13.0f)
                curveTo(8.5508f, 13.0f, 9.0f, 12.5508f, 9.0f, 12.0f)
                curveTo(9.0f, 11.4492f, 8.5508f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(12.6992f, 11.0f, 10.0f, 13.6992f, 10.0f, 17.0f)
                curveTo(10.0f, 20.3008f, 12.6992f, 23.0f, 16.0f, 23.0f)
                curveTo(19.3008f, 23.0f, 22.0f, 20.3008f, 22.0f, 17.0f)
                curveTo(22.0f, 13.6992f, 19.3008f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(18.2227f, 13.0f, 20.0f, 14.7773f, 20.0f, 17.0f)
                curveTo(20.0f, 19.2227f, 18.2227f, 21.0f, 16.0f, 21.0f)
                curveTo(13.7773f, 21.0f, 12.0f, 19.2227f, 12.0f, 17.0f)
                curveTo(12.0f, 14.7773f, 13.7773f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _cameraSolid!!
    }

private var _cameraSolid: ImageVector? = null
