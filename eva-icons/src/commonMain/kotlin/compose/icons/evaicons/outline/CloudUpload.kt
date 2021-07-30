package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.71f, 11.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-3.0f, 2.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.38f, 1.44f)
                lineTo(11.0f, 14.36f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(14.41f)
                lineToRelative(1.29f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.67f, 7.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.33f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.08f, 8.27f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 4.75f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 9.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.84f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.8f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.25f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.09f, 1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.66f, 0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.75f, -0.34f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.67f, 7.0f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
