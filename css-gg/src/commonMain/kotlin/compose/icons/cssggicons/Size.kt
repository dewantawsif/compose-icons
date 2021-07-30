package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Size: ImageVector
    get() {
        if (_size != null) {
            return _size!!
        }
        _size = Builder(name = "Size", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _size!!
    }

private var _size: ImageVector? = null
