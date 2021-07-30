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

public val Octicons.ArrowDown24: ImageVector
    get() {
        if (_arrowDown24 != null) {
            return _arrowDown24!!
        }
        _arrowDown24 = Builder(name = "ArrowDown24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.97f, 13.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(6.25f, -6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-4.97f, 4.97f)
                verticalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(14.44f)
                lineToRelative(-4.97f, -4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowDown24!!
    }

private var _arrowDown24: ImageVector? = null
