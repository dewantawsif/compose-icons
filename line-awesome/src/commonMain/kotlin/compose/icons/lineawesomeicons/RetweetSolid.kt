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

public val LineAwesomeIcons.RetweetSolid: ImageVector
    get() {
        if (_retweetSolid != null) {
            return _retweetSolid!!
        }
        _retweetSolid = Builder(name = "RetweetSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                lineTo(0.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(19.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(11.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(25.0f, 25.0f)
                lineTo(30.0f, 20.0f)
                lineTo(26.0f, 20.0f)
                lineTo(26.0f, 7.0f)
                close()
            }
        }
        .build()
        return _retweetSolid!!
    }

private var _retweetSolid: ImageVector? = null
