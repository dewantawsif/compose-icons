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

public val WeatherIcons.DaySunny: ImageVector
    get() {
        if (_daySunny != null) {
            return _daySunny!!
        }
        _daySunny = Builder(name = "DaySunny", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.37f, 14.62f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.45f, 0.25f, -0.62f)
                curveToRelative(0.17f, -0.16f, 0.38f, -0.24f, 0.6f, -0.24f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.23f, 0.0f, 0.42f, 0.08f, 0.58f, 0.25f)
                curveToRelative(0.15f, 0.17f, 0.23f, 0.37f, 0.23f, 0.61f)
                reflectiveCurveTo(8.0f, 15.06f, 7.85f, 15.23f)
                curveToRelative(-0.15f, 0.17f, -0.35f, 0.25f, -0.58f, 0.25f)
                horizontalLineTo(5.23f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.6f, -0.25f)
                curveTo(4.46f, 15.06f, 4.37f, 14.86f, 4.37f, 14.62f)
                close()
                moveTo(7.23f, 21.55f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.23f, -0.61f)
                lineToRelative(1.47f, -1.43f)
                curveToRelative(0.15f, -0.16f, 0.35f, -0.23f, 0.59f, -0.23f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.23f)
                reflectiveCurveToRelative(0.24f, 0.34f, 0.24f, 0.57f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.46f, -0.24f, 0.64f)
                lineTo(8.7f, 22.14f)
                curveToRelative(-0.41f, 0.32f, -0.82f, 0.32f, -1.23f, 0.0f)
                curveTo(7.31f, 21.98f, 7.23f, 21.78f, 7.23f, 21.55f)
                close()
                moveTo(7.23f, 7.71f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.23f, -0.61f)
                curveTo(7.66f, 6.93f, 7.87f, 6.85f, 8.1f, 6.85f)
                curveToRelative(0.22f, 0.0f, 0.42f, 0.08f, 0.59f, 0.24f)
                lineToRelative(1.43f, 1.47f)
                curveToRelative(0.16f, 0.15f, 0.24f, 0.35f, 0.24f, 0.59f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.24f, 0.6f)
                reflectiveCurveToRelative(-0.36f, 0.24f, -0.6f, 0.24f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.59f, -0.24f)
                lineTo(7.47f, 8.32f)
                curveTo(7.31f, 8.16f, 7.23f, 7.95f, 7.23f, 7.71f)
                close()
                moveTo(9.78f, 14.62f)
                curveToRelative(0.0f, -0.93f, 0.23f, -1.8f, 0.7f, -2.6f)
                reflectiveCurveToRelative(1.1f, -1.44f, 1.91f, -1.91f)
                reflectiveCurveToRelative(1.67f, -0.7f, 2.6f, -0.7f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.14f, 2.02f, 0.42f)
                curveToRelative(0.64f, 0.28f, 1.2f, 0.65f, 1.66f, 1.12f)
                curveToRelative(0.47f, 0.47f, 0.84f, 1.02f, 1.11f, 1.66f)
                curveToRelative(0.27f, 0.64f, 0.41f, 1.32f, 0.41f, 2.02f)
                curveToRelative(0.0f, 0.94f, -0.23f, 1.81f, -0.7f, 2.61f)
                curveToRelative(-0.47f, 0.8f, -1.1f, 1.43f, -1.9f, 1.9f)
                curveToRelative(-0.8f, 0.47f, -1.67f, 0.7f, -2.61f, 0.7f)
                reflectiveCurveToRelative(-1.81f, -0.23f, -2.61f, -0.7f)
                curveToRelative(-0.8f, -0.47f, -1.43f, -1.1f, -1.9f, -1.9f)
                curveTo(10.02f, 16.43f, 9.78f, 15.56f, 9.78f, 14.62f)
                close()
                moveTo(11.48f, 14.62f)
                curveToRelative(0.0f, 0.98f, 0.34f, 1.81f, 1.03f, 2.5f)
                curveToRelative(0.68f, 0.69f, 1.51f, 1.04f, 2.49f, 1.04f)
                reflectiveCurveToRelative(1.81f, -0.35f, 2.5f, -1.04f)
                reflectiveCurveToRelative(1.04f, -1.52f, 1.04f, -2.5f)
                curveToRelative(0.0f, -0.96f, -0.35f, -1.78f, -1.04f, -2.47f)
                curveToRelative(-0.69f, -0.68f, -1.52f, -1.02f, -2.5f, -1.02f)
                curveToRelative(-0.97f, 0.0f, -1.8f, 0.34f, -2.48f, 1.02f)
                curveTo(11.82f, 12.84f, 11.48f, 13.66f, 11.48f, 14.62f)
                close()
                moveTo(14.14f, 22.4f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.25f, -0.6f)
                reflectiveCurveToRelative(0.37f, -0.24f, 0.6f, -0.24f)
                curveToRelative(0.24f, 0.0f, 0.45f, 0.08f, 0.61f, 0.24f)
                reflectiveCurveToRelative(0.24f, 0.36f, 0.24f, 0.6f)
                verticalLineToRelative(1.99f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.45f, -0.25f, 0.62f)
                curveToRelative(-0.17f, 0.17f, -0.37f, 0.25f, -0.6f, 0.25f)
                reflectiveCurveToRelative(-0.44f, -0.08f, -0.6f, -0.25f)
                curveToRelative(-0.17f, -0.17f, -0.25f, -0.38f, -0.25f, -0.62f)
                verticalLineTo(22.4f)
                close()
                moveTo(14.14f, 6.9f)
                verticalLineTo(4.86f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.25f, -0.6f)
                curveTo(14.56f, 4.09f, 14.76f, 4.0f, 15.0f, 4.0f)
                reflectiveCurveToRelative(0.43f, 0.08f, 0.6f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.37f, 0.25f, 0.6f)
                verticalLineTo(6.9f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.42f, -0.25f, 0.58f)
                reflectiveCurveTo(15.23f, 7.71f, 15.0f, 7.71f)
                reflectiveCurveToRelative(-0.44f, -0.08f, -0.6f, -0.23f)
                reflectiveCurveTo(14.14f, 7.13f, 14.14f, 6.9f)
                close()
                moveTo(19.66f, 20.08f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.42f, 0.23f, -0.56f)
                curveToRelative(0.15f, -0.16f, 0.34f, -0.23f, 0.56f, -0.23f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.23f)
                lineToRelative(1.46f, 1.43f)
                curveToRelative(0.16f, 0.17f, 0.24f, 0.38f, 0.24f, 0.61f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.43f, -0.24f, 0.59f)
                curveToRelative(-0.4f, 0.31f, -0.8f, 0.31f, -1.2f, 0.0f)
                lineToRelative(-1.42f, -1.42f)
                curveTo(19.74f, 20.55f, 19.66f, 20.34f, 19.66f, 20.08f)
                close()
                moveTo(19.66f, 9.16f)
                curveToRelative(0.0f, -0.25f, 0.08f, -0.45f, 0.23f, -0.59f)
                lineToRelative(1.42f, -1.47f)
                curveToRelative(0.17f, -0.16f, 0.37f, -0.24f, 0.59f, -0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.37f, 0.25f, 0.6f)
                curveToRelative(0.0f, 0.25f, -0.08f, 0.46f, -0.24f, 0.62f)
                lineToRelative(-1.46f, 1.43f)
                curveToRelative(-0.18f, 0.16f, -0.38f, 0.24f, -0.6f, 0.24f)
                curveToRelative(-0.23f, 0.0f, -0.41f, -0.08f, -0.56f, -0.24f)
                reflectiveCurveTo(19.66f, 9.4f, 19.66f, 9.16f)
                close()
                moveTo(21.92f, 14.62f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.24f, -0.62f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.24f, 0.57f, -0.24f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.09f, 0.6f, 0.26f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.37f, 0.26f, 0.6f)
                reflectiveCurveToRelative(-0.09f, 0.43f, -0.26f, 0.6f)
                curveToRelative(-0.17f, 0.17f, -0.37f, 0.25f, -0.6f, 0.25f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.58f, -0.25f)
                reflectiveCurveTo(21.92f, 14.86f, 21.92f, 14.62f)
                close()
            }
        }
        .build()
        return _daySunny!!
    }

private var _daySunny: ImageVector? = null
