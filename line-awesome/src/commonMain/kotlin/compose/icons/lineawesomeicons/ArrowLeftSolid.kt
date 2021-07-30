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

public val LineAwesomeIcons.ArrowLeftSolid: ImageVector
    get() {
        if (_arrowLeftSolid != null) {
            return _arrowLeftSolid!!
        }
        _arrowLeftSolid = Builder(name = "ArrowLeftSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2813f, 6.7813f)
                lineTo(4.7813f, 15.2813f)
                lineTo(4.0938f, 16.0f)
                lineTo(4.7813f, 16.7188f)
                lineTo(13.2813f, 25.2188f)
                lineTo(14.7188f, 23.7813f)
                lineTo(7.9375f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                lineTo(7.9375f, 15.0f)
                lineTo(14.7188f, 8.2188f)
                close()
            }
        }
        .build()
        return _arrowLeftSolid!!
    }

private var _arrowLeftSolid: ImageVector? = null
