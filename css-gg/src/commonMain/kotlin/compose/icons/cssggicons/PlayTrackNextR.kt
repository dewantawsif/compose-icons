package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PlayTrackNextR: ImageVector
    get() {
        if (_playTrackNextR != null) {
            return _playTrackNextR!!
        }
        _playTrackNextR = Builder(name = "PlayTrackNextR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                curveTo(15.0f, 8.4477f, 15.4477f, 8.0f, 16.0f, 8.0f)
                curveTo(16.5523f, 8.0f, 17.0f, 8.4477f, 17.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.5523f, 16.5523f, 16.0f, 16.0f, 16.0f)
                curveTo(15.4477f, 16.0f, 15.0f, 15.5523f, 15.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineTo(8.0f, 15.4641f)
                verticalLineTo(8.5359f)
                lineTo(14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 5.0f)
                curveTo(1.0f, 2.7909f, 2.7909f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 1.0f, 23.0f, 2.7909f, 23.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(23.0f, 21.2091f, 21.2091f, 23.0f, 19.0f, 23.0f)
                horizontalLineTo(5.0f)
                curveTo(2.7909f, 23.0f, 1.0f, 21.2091f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 3.0f, 21.0f, 3.8954f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1046f, 20.1046f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 21.0f, 3.0f, 20.1046f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.8954f, 3.8954f, 3.0f, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _playTrackNextR!!
    }

private var _playTrackNextR: ImageVector? = null
