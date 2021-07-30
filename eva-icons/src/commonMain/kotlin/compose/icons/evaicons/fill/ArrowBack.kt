package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import compose.icons.evaicons.FillGroup

public val FillGroup.ArrowBack: ImageVector
    get() {
        if (_arrowBack != null) {
            return _arrowBack!!
        }
        _arrowBack = Builder(name = "ArrowBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineTo(7.14f)
                lineToRelative(3.63f, -4.36f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.23f, 5.36f)
                lineToRelative(-5.0f, 6.0f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, -0.09f, 0.15f)
                curveToRelative(0.0f, 0.05f, 0.0f, 0.08f, -0.07f, 0.13f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 12.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.07f, 0.36f)
                curveToRelative(0.0f, 0.05f, 0.0f, 0.08f, 0.07f, 0.13f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, 0.09f, 0.15f)
                lineToRelative(5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.64f, -0.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.13f, -1.41f)
                lineTo(7.14f, 13.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowBack!!
    }

private var _arrowBack: ImageVector? = null
