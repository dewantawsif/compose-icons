package compose.icons.lineaicons.software

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.ShapeOval: ImageVector
    get() {
        if (_shapeOval != null) {
            return _shapeOval!!
        }
        _shapeOval = Builder(name = "ShapeOval", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 32.0f)
                arcToRelative(31.0f, 20.0f, 0.0f, true, false, 62.0f, 0.0f)
                arcToRelative(31.0f, 20.0f, 0.0f, true, false, -62.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shapeOval!!
    }

private var _shapeOval: ImageVector? = null
