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

public val WeatherIcons.Showers: ImageVector
    get() {
        if (_showers != null) {
            return _showers!!
        }
        _showers = Builder(name = "Showers", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6f, 16.93f)
                curveToRelative(0.0f, -1.16f, 0.36f, -2.18f, 1.09f, -3.08f)
                curveToRelative(0.72f, -0.9f, 1.65f, -1.48f, 2.78f, -1.73f)
                curveToRelative(0.29f, -1.38f, 0.98f, -2.5f, 2.07f, -3.39f)
                reflectiveCurveTo(12.88f, 7.4f, 14.3f, 7.4f)
                curveToRelative(1.39f, 0.0f, 2.63f, 0.43f, 3.72f, 1.28f)
                curveToRelative(1.08f, 0.85f, 1.79f, 1.95f, 2.12f, 3.3f)
                horizontalLineToRelative(0.34f)
                curveToRelative(0.9f, 0.0f, 1.73f, 0.22f, 2.48f, 0.66f)
                curveToRelative(0.76f, 0.44f, 1.35f, 1.04f, 1.79f, 1.8f)
                curveToRelative(0.43f, 0.76f, 0.65f, 1.59f, 0.65f, 2.49f)
                curveToRelative(0.0f, 1.34f, -0.46f, 2.48f, -1.37f, 3.44f)
                curveToRelative(-0.92f, 0.96f, -2.04f, 1.46f, -3.37f, 1.5f)
                curveToRelative(-0.12f, 0.0f, -0.18f, -0.06f, -0.18f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, 0.06f, -0.17f, 0.18f, -0.17f)
                curveToRelative(0.84f, -0.07f, 1.57f, -0.42f, 2.17f, -1.05f)
                reflectiveCurveToRelative(0.9f, -1.37f, 0.9f, -2.22f)
                curveToRelative(0.0f, -0.89f, -0.32f, -1.66f, -0.96f, -2.31f)
                curveToRelative(-0.64f, -0.64f, -1.4f, -0.97f, -2.29f, -0.97f)
                horizontalLineToRelative(-1.63f)
                curveToRelative(-0.12f, 0.0f, -0.19f, -0.06f, -0.22f, -0.18f)
                lineToRelative(-0.07f, -0.57f)
                curveToRelative(-0.07f, -0.71f, -0.3f, -1.36f, -0.7f, -1.94f)
                reflectiveCurveToRelative(-0.91f, -1.03f, -1.53f, -1.36f)
                curveToRelative(-0.62f, -0.33f, -1.3f, -0.49f, -2.02f, -0.49f)
                curveToRelative(-1.1f, 0.0f, -2.05f, 0.36f, -2.86f, 1.09f)
                curveToRelative(-0.81f, 0.73f, -1.27f, 1.64f, -1.37f, 2.72f)
                lineToRelative(-0.07f, 0.54f)
                curveToRelative(0.0f, 0.09f, -0.05f, 0.14f, -0.16f, 0.14f)
                lineTo(9.31f, 13.7f)
                curveToRelative(-0.84f, 0.07f, -1.55f, 0.41f, -2.11f, 1.03f)
                curveToRelative(-0.57f, 0.62f, -0.85f, 1.35f, -0.85f, 2.2f)
                curveToRelative(0.0f, 0.87f, 0.3f, 1.62f, 0.89f, 2.25f)
                curveToRelative(0.59f, 0.63f, 1.31f, 0.97f, 2.17f, 1.02f)
                curveToRelative(0.12f, 0.0f, 0.18f, 0.06f, 0.18f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, -0.06f, 0.17f, -0.18f, 0.17f)
                curveToRelative(-0.66f, -0.03f, -1.28f, -0.18f, -1.88f, -0.45f)
                reflectiveCurveTo(6.42f, 20.8f, 6.0f, 20.36f)
                curveToRelative(-0.43f, -0.44f, -0.77f, -0.95f, -1.02f, -1.55f)
                reflectiveCurveTo(4.6f, 17.59f, 4.6f, 16.93f)
                close()
                moveTo(10.02f, 23.7f)
                curveToRelative(0.0f, -0.03f, 0.01f, -0.08f, 0.02f, -0.13f)
                reflectiveCurveToRelative(0.02f, -0.09f, 0.02f, -0.11f)
                lineToRelative(0.27f, -1.03f)
                curveToRelative(0.07f, -0.22f, 0.2f, -0.4f, 0.4f, -0.51f)
                curveToRelative(0.2f, -0.12f, 0.41f, -0.14f, 0.64f, -0.07f)
                curveToRelative(0.23f, 0.07f, 0.4f, 0.2f, 0.52f, 0.4f)
                curveToRelative(0.12f, 0.2f, 0.14f, 0.41f, 0.07f, 0.64f)
                lineToRelative(-0.24f, 1.01f)
                curveToRelative(-0.13f, 0.44f, -0.38f, 0.66f, -0.76f, 0.66f)
                curveToRelative(-0.03f, 0.0f, -0.05f, 0.0f, -0.09f, 0.0f)
                curveToRelative(-0.03f, 0.0f, -0.07f, -0.01f, -0.11f, -0.01f)
                curveToRelative(-0.04f, -0.01f, -0.07f, -0.01f, -0.1f, -0.01f)
                curveToRelative(-0.21f, -0.06f, -0.37f, -0.18f, -0.48f, -0.34f)
                reflectiveCurveTo(10.02f, 23.86f, 10.02f, 23.7f)
                close()
                moveTo(11.34f, 18.88f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.06f, 0.01f, -0.11f)
                curveToRelative(0.01f, -0.05f, 0.01f, -0.08f, 0.01f, -0.09f)
                lineToRelative(0.3f, -1.05f)
                curveToRelative(0.06f, -0.19f, 0.17f, -0.34f, 0.32f, -0.45f)
                curveToRelative(0.15f, -0.1f, 0.31f, -0.15f, 0.47f, -0.15f)
                curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.08f, 0.0f)
                curveToRelative(0.03f, 0.0f, 0.06f, 0.01f, 0.09f, 0.01f)
                curveToRelative(0.03f, 0.01f, 0.06f, 0.01f, 0.08f, 0.01f)
                curveToRelative(0.23f, 0.07f, 0.4f, 0.2f, 0.51f, 0.4f)
                curveToRelative(0.12f, 0.2f, 0.14f, 0.41f, 0.07f, 0.64f)
                lineToRelative(-0.24f, 1.0f)
                curveToRelative(-0.07f, 0.28f, -0.2f, 0.47f, -0.4f, 0.59f)
                reflectiveCurveToRelative(-0.42f, 0.12f, -0.65f, 0.02f)
                curveToRelative(-0.22f, -0.06f, -0.38f, -0.17f, -0.49f, -0.34f)
                reflectiveCurveTo(11.34f, 19.04f, 11.34f, 18.88f)
                close()
                moveTo(12.57f, 26.83f)
                curveToRelative(0.0f, -0.03f, 0.01f, -0.07f, 0.02f, -0.13f)
                reflectiveCurveToRelative(0.02f, -0.09f, 0.02f, -0.12f)
                lineToRelative(0.29f, -0.99f)
                curveToRelative(0.06f, -0.24f, 0.2f, -0.42f, 0.4f, -0.54f)
                curveToRelative(0.2f, -0.12f, 0.42f, -0.15f, 0.65f, -0.08f)
                curveToRelative(0.23f, 0.07f, 0.39f, 0.2f, 0.51f, 0.41f)
                reflectiveCurveToRelative(0.13f, 0.42f, 0.07f, 0.65f)
                lineToRelative(-0.25f, 1.04f)
                curveToRelative(-0.11f, 0.41f, -0.37f, 0.61f, -0.8f, 0.61f)
                curveToRelative(-0.05f, 0.0f, -0.13f, -0.01f, -0.24f, -0.04f)
                curveToRelative(-0.22f, -0.04f, -0.38f, -0.14f, -0.49f, -0.3f)
                curveTo(12.63f, 27.18f, 12.57f, 27.01f, 12.57f, 26.83f)
                close()
                moveTo(13.91f, 22.06f)
                curveToRelative(0.0f, -0.06f, 0.01f, -0.14f, 0.04f, -0.25f)
                lineToRelative(0.27f, -1.03f)
                curveToRelative(0.07f, -0.23f, 0.2f, -0.4f, 0.41f, -0.51f)
                curveToRelative(0.2f, -0.12f, 0.42f, -0.14f, 0.65f, -0.07f)
                curveToRelative(0.23f, 0.06f, 0.39f, 0.19f, 0.51f, 0.39f)
                curveToRelative(0.11f, 0.2f, 0.13f, 0.41f, 0.06f, 0.65f)
                lineToRelative(-0.24f, 0.99f)
                curveToRelative(-0.13f, 0.45f, -0.37f, 0.68f, -0.72f, 0.68f)
                curveToRelative(-0.04f, 0.0f, -0.15f, -0.02f, -0.31f, -0.06f)
                curveToRelative(-0.22f, -0.04f, -0.38f, -0.14f, -0.49f, -0.3f)
                curveTo(13.97f, 22.4f, 13.91f, 22.23f, 13.91f, 22.06f)
                close()
                moveTo(16.73f, 23.74f)
                curveToRelative(0.0f, -0.07f, 0.01f, -0.15f, 0.03f, -0.24f)
                lineToRelative(0.28f, -0.99f)
                curveToRelative(0.07f, -0.24f, 0.2f, -0.42f, 0.41f, -0.54f)
                reflectiveCurveToRelative(0.41f, -0.15f, 0.63f, -0.09f)
                curveToRelative(0.23f, 0.07f, 0.41f, 0.2f, 0.53f, 0.41f)
                curveToRelative(0.12f, 0.2f, 0.15f, 0.41f, 0.09f, 0.63f)
                lineToRelative(-0.29f, 1.06f)
                curveToRelative(-0.1f, 0.41f, -0.36f, 0.61f, -0.79f, 0.61f)
                curveToRelative(-0.09f, 0.0f, -0.18f, -0.01f, -0.26f, -0.03f)
                curveToRelative(-0.2f, -0.04f, -0.35f, -0.14f, -0.46f, -0.3f)
                curveTo(16.8f, 24.08f, 16.74f, 23.91f, 16.73f, 23.74f)
                close()
                moveTo(18.11f, 18.98f)
                curveToRelative(0.0f, -0.03f, 0.02f, -0.12f, 0.05f, -0.26f)
                lineToRelative(0.3f, -1.03f)
                curveToRelative(0.04f, -0.21f, 0.13f, -0.37f, 0.29f, -0.47f)
                curveToRelative(0.16f, -0.1f, 0.32f, -0.15f, 0.49f, -0.14f)
                curveToRelative(0.04f, -0.01f, 0.13f, 0.0f, 0.24f, 0.03f)
                curveToRelative(0.22f, 0.05f, 0.39f, 0.18f, 0.52f, 0.38f)
                curveToRelative(0.12f, 0.17f, 0.14f, 0.38f, 0.07f, 0.65f)
                lineToRelative(-0.24f, 1.03f)
                curveToRelative(-0.13f, 0.43f, -0.38f, 0.65f, -0.76f, 0.65f)
                curveToRelative(-0.06f, 0.0f, -0.17f, -0.02f, -0.34f, -0.06f)
                curveToRelative(-0.21f, -0.06f, -0.36f, -0.17f, -0.46f, -0.31f)
                curveTo(18.16f, 19.29f, 18.11f, 19.14f, 18.11f, 18.98f)
                close()
            }
        }
        .build()
        return _showers!!
    }

private var _showers: ImageVector? = null
