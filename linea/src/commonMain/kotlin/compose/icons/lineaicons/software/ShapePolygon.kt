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

public val SoftwareGroup.ShapePolygon: ImageVector
    get() {
        if (_shapePolygon != null) {
            return _shapePolygon!!
        }
        _shapePolygon = Builder(name = "ShapePolygon", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.675f, 59.0f)
                lineToRelative(-15.324f, -27.0f)
                lineToRelative(15.324f, -27.0f)
                lineToRelative(30.65f, 0.0f)
                lineToRelative(15.324f, 27.0f)
                lineToRelative(-15.324f, 27.0f)
                close()
            }
        }
        .build()
        return _shapePolygon!!
    }

private var _shapePolygon: ImageVector? = null
