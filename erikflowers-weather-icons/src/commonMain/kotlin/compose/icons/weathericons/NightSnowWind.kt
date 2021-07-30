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

public val WeatherIcons.NightSnowWind: ImageVector
    get() {
        if (_nightSnowWind != null) {
            return _nightSnowWind!!
        }
        _nightSnowWind = Builder(name = "NightSnowWind", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.23f, 16.89f)
                curveToRelative(0.0f, 1.33f, 0.47f, 2.48f, 1.4f, 3.44f)
                reflectiveCurveToRelative(2.07f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.18f, -0.17f)
                curveToRelative(-0.86f, -0.05f, -1.59f, -0.39f, -2.19f, -1.03f)
                curveToRelative(-0.6f, -0.64f, -0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.85f, -2.17f)
                curveToRelative(0.57f, -0.61f, 1.27f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.53f, -0.04f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.18f)
                lineToRelative(0.07f, -0.54f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.1f, 2.85f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.08f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.19f, 0.17f, 0.19f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.33f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.97f, 1.4f, 0.97f, 2.28f)
                curveToRelative(0.0f, 0.86f, -0.3f, 1.61f, -0.91f, 2.25f)
                curveToRelative(-0.61f, 0.64f, -1.34f, 0.99f, -2.19f, 1.04f)
                curveToRelative(-0.12f, 0.0f, -0.19f, 0.06f, -0.19f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.19f, 0.17f)
                curveToRelative(1.34f, -0.04f, 2.47f, -0.55f, 3.4f, -1.51f)
                curveToRelative(0.93f, -0.97f, 1.39f, -2.12f, 1.39f, -3.45f)
                curveToRelative(0.0f, -0.71f, -0.14f, -1.38f, -0.43f, -2.01f)
                curveToRelative(0.79f, -0.96f, 1.18f, -2.07f, 1.18f, -3.32f)
                curveToRelative(0.0f, -0.95f, -0.24f, -1.83f, -0.71f, -2.64f)
                reflectiveCurveToRelative(-1.11f, -1.45f, -1.92f, -1.92f)
                reflectiveCurveToRelative(-1.68f, -0.7f, -2.62f, -0.7f)
                curveToRelative(-1.55f, 0.0f, -2.85f, 0.58f, -3.89f, 1.73f)
                curveToRelative(-0.81f, -0.43f, -1.71f, -0.65f, -2.71f, -0.65f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.32f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.11f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.74f, 1.74f)
                curveTo(4.59f, 14.71f, 4.23f, 15.74f, 4.23f, 16.89f)
                close()
                moveTo(9.72f, 24.61f)
                curveToRelative(0.0f, 0.21f, 0.08f, 0.4f, 0.24f, 0.57f)
                curveToRelative(0.18f, 0.16f, 0.37f, 0.24f, 0.58f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.58f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.43f, -0.24f, -0.59f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.23f, -0.59f, -0.23f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.59f, 0.23f)
                curveTo(9.8f, 24.17f, 9.72f, 24.37f, 9.72f, 24.61f)
                close()
                moveTo(10.58f, 20.98f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.24f, 0.61f)
                curveToRelative(0.16f, 0.17f, 0.35f, 0.25f, 0.59f, 0.25f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.61f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.42f, -0.24f, -0.58f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.59f, 0.24f)
                curveTo(10.66f, 20.56f, 10.58f, 20.76f, 10.58f, 20.98f)
                close()
                moveTo(12.47f, 26.56f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.41f, 0.24f, 0.57f)
                curveToRelative(0.17f, 0.17f, 0.36f, 0.25f, 0.58f, 0.25f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.6f, -0.23f)
                curveToRelative(0.17f, -0.16f, 0.25f, -0.35f, 0.25f, -0.59f)
                reflectiveCurveToRelative(-0.08f, -0.44f, -0.25f, -0.6f)
                curveToRelative(-0.17f, -0.17f, -0.37f, -0.25f, -0.6f, -0.25f)
                curveToRelative(-0.22f, 0.0f, -0.41f, 0.08f, -0.58f, 0.25f)
                curveTo(12.56f, 26.13f, 12.47f, 26.33f, 12.47f, 26.56f)
                close()
                moveTo(13.33f, 22.9f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.42f, 0.25f, 0.6f)
                curveToRelative(0.16f, 0.16f, 0.35f, 0.24f, 0.57f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.24f)
                reflectiveCurveToRelative(0.25f, -0.36f, 0.25f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.6f)
                reflectiveCurveToRelative(-0.37f, -0.25f, -0.61f, -0.25f)
                curveToRelative(-0.23f, 0.0f, -0.42f, 0.08f, -0.58f, 0.25f)
                reflectiveCurveTo(13.33f, 22.67f, 13.33f, 22.9f)
                close()
                moveTo(13.76f, 19.3f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.42f, 0.24f, 0.58f)
                reflectiveCurveToRelative(0.36f, 0.24f, 0.58f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.6f, -0.24f)
                curveToRelative(0.17f, -0.16f, 0.25f, -0.35f, 0.25f, -0.59f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.59f)
                reflectiveCurveToRelative(-0.37f, -0.24f, -0.6f, -0.24f)
                curveToRelative(-0.22f, 0.0f, -0.42f, 0.08f, -0.58f, 0.24f)
                reflectiveCurveTo(13.76f, 19.07f, 13.76f, 19.3f)
                close()
                moveTo(16.13f, 24.61f)
                curveToRelative(0.0f, 0.21f, 0.08f, 0.4f, 0.23f, 0.57f)
                curveToRelative(0.17f, 0.16f, 0.38f, 0.24f, 0.6f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.58f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.43f, -0.23f, -0.59f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.23f, -0.59f, -0.23f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.24f)
                curveTo(16.21f, 24.18f, 16.13f, 24.38f, 16.13f, 24.61f)
                close()
                moveTo(16.98f, 20.98f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.24f, 0.61f)
                curveToRelative(0.16f, 0.17f, 0.36f, 0.25f, 0.59f, 0.25f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.61f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.42f, -0.24f, -0.58f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.59f, 0.24f)
                reflectiveCurveTo(16.98f, 20.76f, 16.98f, 20.98f)
                close()
                moveTo(18.03f, 9.02f)
                curveToRelative(0.68f, -0.68f, 1.5f, -1.01f, 2.48f, -1.01f)
                curveToRelative(0.98f, 0.0f, 1.81f, 0.35f, 2.5f, 1.04f)
                reflectiveCurveToRelative(1.03f, 1.53f, 1.03f, 2.52f)
                curveToRelative(0.0f, 0.59f, -0.17f, 1.2f, -0.51f, 1.84f)
                curveToRelative(-0.96f, -0.96f, -2.13f, -1.44f, -3.5f, -1.44f)
                horizontalLineToRelative(-0.31f)
                curveTo(19.44f, 10.8f, 18.87f, 9.82f, 18.03f, 9.02f)
                close()
            }
        }
        .build()
        return _nightSnowWind!!
    }

private var _nightSnowWind: ImageVector? = null
