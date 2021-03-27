package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.Deny: ImageVector
    get() {
        if (_deny != null) {
            return _deny!!
        }
        _deny = Builder(name = "Deny", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.919f, 10.08f)
                curveToRelative(12.108f, 12.106f, 12.108f, 31.733f, 0.0f, 43.84f)
                curveToRelative(-12.105f, 12.107f, -31.732f, 12.107f, -43.838f, 0.0f)
                curveToRelative(-12.108f, -12.106f, -12.108f, -31.733f, 0.0f, -43.84f)
                curveTo(22.187f, -2.027f, 41.813f, -2.027f, 53.919f, 10.08f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.08f, 10.08f)
                lineTo(53.92f, 53.92f)
            }
        }
        .build()
        return _deny!!
    }

private var _deny: ImageVector? = null
