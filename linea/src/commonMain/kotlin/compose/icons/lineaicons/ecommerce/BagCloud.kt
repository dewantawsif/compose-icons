package compose.icons.lineaicons.ecommerce

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
import compose.icons.lineaicons.EcommerceGroup

public val EcommerceGroup.BagCloud: ImageVector
    get() {
        if (_bagCloud != null) {
            return _bagCloud!!
        }
        _bagCloud = Builder(name = "BagCloud", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 18.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, 45.0f)
                lineToRelative(-44.0f, 0.0f)
                lineToRelative(0.0f, -45.0f)
                lineToRelative(10.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -5.523f, 4.477f, -10.0f, 10.0f, -10.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                verticalLineToRelative(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.887f, 48.0f)
                horizontalLineTo(39.0f)
                curveToRelative(1.887f, 0.0f, 3.0f, -1.0f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.0f, -1.0f, -3.0f, -3.0f, -3.0f)
                curveToRelative(0.0f, -3.604f, -3.277f, -6.0f, -7.0f, -6.0f)
                curveToRelative(-3.295f, 0.0f, -6.413f, 2.978f, -7.0f, 6.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-2.0f, 0.0f, -3.0f, 2.0f, -3.0f, 3.0f)
                curveToRelative(0.0f, 2.0f, 1.0f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.434f)
            }
        }
        .build()
        return _bagCloud!!
    }

private var _bagCloud: ImageVector? = null
