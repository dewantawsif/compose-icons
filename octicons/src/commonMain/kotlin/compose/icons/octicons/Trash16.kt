package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Trash16: ImageVector
    get() {
        if (_trash16 != null) {
            return _trash16!!
        }
        _trash16 = Builder(name = "Trash16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                lineTo(9.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.5f, 1.75f)
                close()
                moveTo(11.0f, 1.75f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 1.75f)
                curveTo(5.0f, 0.784f, 5.784f, 0.0f, 6.75f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveTo(10.216f, 0.0f, 11.0f, 0.784f, 11.0f, 1.75f)
                close()
                moveTo(4.496f, 6.675f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.492f, 0.15f)
                lineToRelative(0.66f, 6.6f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.405f, 15.0f)
                horizontalLineToRelative(5.19f)
                curveToRelative(0.9f, 0.0f, 1.652f, -0.681f, 1.741f, -1.576f)
                lineToRelative(0.66f, -6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.492f, -0.149f)
                lineToRelative(-0.66f, 6.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.249f, 0.225f)
                horizontalLineToRelative(-5.19f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.249f, -0.225f)
                lineToRelative(-0.66f, -6.6f)
                close()
            }
        }
        .build()
        return _trash16!!
    }

private var _trash16: ImageVector? = null
