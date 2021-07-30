package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.StrongWind: ImageVector
    get() {
        if (_strongWind != null) {
            return _strongWind!!
        }
        _strongWind = Builder(name = "StrongWind", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1f, 16.97f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.45f, 0.28f, 0.62f)
                curveToRelative(0.16f, 0.19f, 0.37f, 0.28f, 0.63f, 0.28f)
                horizontalLineTo(18.7f)
                curveToRelative(0.29f, 0.0f, 0.53f, 0.1f, 0.73f, 0.3f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.45f, 0.3f, 0.74f)
                curveToRelative(0.0f, 0.29f, -0.1f, 0.53f, -0.3f, 0.72f)
                curveToRelative(-0.2f, 0.19f, -0.44f, 0.29f, -0.74f, 0.29f)
                curveToRelative(-0.29f, 0.0f, -0.54f, -0.1f, -0.73f, -0.29f)
                curveToRelative(-0.16f, -0.18f, -0.36f, -0.26f, -0.6f, -0.26f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.09f, -0.64f, 0.26f)
                reflectiveCurveToRelative(-0.27f, 0.38f, -0.27f, 0.61f)
                curveToRelative(0.0f, 0.25f, 0.09f, 0.46f, 0.28f, 0.63f)
                curveToRelative(0.56f, 0.55f, 1.22f, 0.83f, 1.96f, 0.83f)
                curveToRelative(0.78f, 0.0f, 1.45f, -0.27f, 2.01f, -0.81f)
                curveToRelative(0.56f, -0.54f, 0.83f, -1.19f, 0.83f, -1.97f)
                reflectiveCurveToRelative(-0.28f, -1.44f, -0.84f, -2.0f)
                curveToRelative(-0.56f, -0.56f, -1.23f, -0.84f, -2.0f, -0.84f)
                horizontalLineTo(4.01f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.09f, -0.64f, 0.26f)
                curveTo(3.19f, 16.51f, 3.1f, 16.72f, 3.1f, 16.97f)
                close()
                moveTo(3.1f, 13.69f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.43f, 0.28f, 0.61f)
                curveToRelative(0.17f, 0.18f, 0.38f, 0.26f, 0.63f, 0.26f)
                horizontalLineToRelative(20.04f)
                curveToRelative(0.78f, 0.0f, 1.45f, -0.27f, 2.01f, -0.82f)
                curveToRelative(0.56f, -0.54f, 0.84f, -1.2f, 0.84f, -1.97f)
                curveToRelative(0.0f, -0.77f, -0.28f, -1.44f, -0.84f, -1.99f)
                reflectiveCurveToRelative(-1.23f, -0.83f, -2.01f, -0.83f)
                curveToRelative(-0.77f, 0.0f, -1.42f, 0.27f, -1.95f, 0.8f)
                curveToRelative(-0.18f, 0.16f, -0.27f, 0.38f, -0.27f, 0.67f)
                curveToRelative(0.0f, 0.26f, 0.09f, 0.47f, 0.26f, 0.63f)
                curveToRelative(0.17f, 0.16f, 0.38f, 0.24f, 0.63f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.45f, -0.08f, 0.63f, -0.24f)
                curveToRelative(0.19f, -0.21f, 0.42f, -0.31f, 0.7f, -0.31f)
                curveToRelative(0.29f, 0.0f, 0.53f, 0.1f, 0.73f, 0.3f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.44f, 0.3f, 0.73f)
                curveToRelative(0.0f, 0.29f, -0.1f, 0.53f, -0.3f, 0.72f)
                curveToRelative(-0.2f, 0.19f, -0.44f, 0.29f, -0.73f, 0.29f)
                horizontalLineTo(4.01f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.09f, -0.64f, 0.26f)
                curveTo(3.19f, 13.23f, 3.1f, 13.44f, 3.1f, 13.69f)
                close()
            }
        }
        .build()
        return _strongWind!!
    }

private var _strongWind: ImageVector? = null
