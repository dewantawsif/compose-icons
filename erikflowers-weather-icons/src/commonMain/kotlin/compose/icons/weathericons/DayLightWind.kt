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

public val WeatherIcons.DayLightWind: ImageVector
    get() {
        if (_dayLightWind != null) {
            return _dayLightWind!!
        }
        _dayLightWind = Builder(name = "DayLightWind", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.32f, 14.85f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.44f, 0.26f, 0.6f)
                curveToRelative(0.16f, 0.17f, 0.36f, 0.25f, 0.6f, 0.25f)
                horizontalLineToRelative(9.42f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.23f, -0.59f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                horizontalLineTo(3.18f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.61f, 0.24f)
                curveTo(2.4f, 14.42f, 2.32f, 14.62f, 2.32f, 14.85f)
                close()
                moveTo(2.65f, 21.0f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.25f, 0.6f)
                curveToRelative(0.16f, 0.17f, 0.36f, 0.25f, 0.6f, 0.25f)
                horizontalLineToRelative(9.43f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.6f)
                reflectiveCurveToRelative(-0.08f, -0.43f, -0.25f, -0.59f)
                reflectiveCurveToRelative(-0.37f, -0.24f, -0.61f, -0.24f)
                horizontalLineTo(3.51f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.24f)
                curveTo(2.74f, 20.57f, 2.65f, 20.77f, 2.65f, 21.0f)
                close()
                moveTo(4.02f, 17.9f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.43f, 0.25f, 0.59f)
                curveToRelative(0.17f, 0.16f, 0.38f, 0.23f, 0.63f, 0.23f)
                horizontalLineToRelative(9.4f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.59f)
                curveToRelative(0.0f, -0.25f, -0.08f, -0.45f, -0.23f, -0.61f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                horizontalLineTo(4.9f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.08f, -0.63f, 0.24f)
                curveTo(4.11f, 17.45f, 4.02f, 17.65f, 4.02f, 17.9f)
                close()
                moveTo(6.45f, 11.55f)
                curveToRelative(0.0f, -0.24f, 0.09f, -0.44f, 0.26f, -0.62f)
                curveToRelative(0.17f, -0.16f, 0.38f, -0.24f, 0.6f, -0.24f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.23f, 0.0f, 0.42f, 0.08f, 0.58f, 0.25f)
                curveToRelative(0.16f, 0.17f, 0.23f, 0.37f, 0.23f, 0.61f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.23f, 0.6f)
                curveToRelative(-0.16f, 0.17f, -0.35f, 0.25f, -0.58f, 0.25f)
                horizontalLineTo(7.31f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.61f, -0.25f)
                curveTo(6.53f, 11.98f, 6.45f, 11.78f, 6.45f, 11.55f)
                close()
                moveTo(9.31f, 4.63f)
                curveToRelative(0.0f, -0.22f, 0.08f, -0.43f, 0.24f, -0.61f)
                curveToRelative(0.19f, -0.16f, 0.4f, -0.24f, 0.63f, -0.24f)
                curveToRelative(0.22f, 0.0f, 0.42f, 0.08f, 0.59f, 0.24f)
                lineToRelative(1.42f, 1.47f)
                curveToRelative(0.16f, 0.15f, 0.24f, 0.35f, 0.24f, 0.59f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.24f, 0.6f)
                curveToRelative(-0.16f, 0.16f, -0.36f, 0.24f, -0.6f, 0.24f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.59f, -0.24f)
                lineTo(9.55f, 5.25f)
                curveTo(9.39f, 5.07f, 9.31f, 4.87f, 9.31f, 4.63f)
                close()
                moveTo(11.86f, 11.43f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.02f, -0.91f, 0.27f, -1.75f, 0.74f, -2.53f)
                curveToRelative(0.47f, -0.77f, 1.11f, -1.38f, 1.9f, -1.83f)
                reflectiveCurveToRelative(1.65f, -0.67f, 2.57f, -0.67f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.14f, 2.02f, 0.42f)
                curveToRelative(0.64f, 0.28f, 1.2f, 0.65f, 1.66f, 1.12f)
                curveToRelative(0.47f, 0.47f, 0.84f, 1.02f, 1.11f, 1.66f)
                curveToRelative(0.27f, 0.64f, 0.41f, 1.32f, 0.41f, 2.02f)
                curveToRelative(0.0f, 0.94f, -0.23f, 1.8f, -0.69f, 2.6f)
                reflectiveCurveToRelative(-1.09f, 1.43f, -1.88f, 1.89f)
                curveToRelative(-0.79f, 0.47f, -1.66f, 0.7f, -2.6f, 0.71f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-0.07f, 0.0f, -0.13f, -0.02f, -0.18f, -0.07f)
                curveToRelative(-0.05f, -0.05f, -0.08f, -0.11f, -0.08f, -0.18f)
                verticalLineToRelative(-1.22f)
                curveToRelative(0.0f, -0.13f, 0.07f, -0.2f, 0.22f, -0.2f)
                horizontalLineToRelative(0.24f)
                curveToRelative(0.96f, -0.01f, 1.79f, -0.35f, 2.47f, -1.05f)
                curveToRelative(0.68f, -0.69f, 1.03f, -1.52f, 1.03f, -2.49f)
                curveToRelative(0.0f, -0.96f, -0.35f, -1.78f, -1.04f, -2.47f)
                curveToRelative(-0.69f, -0.68f, -1.52f, -1.02f, -2.5f, -1.02f)
                curveToRelative(-0.94f, 0.0f, -1.76f, 0.32f, -2.44f, 0.98f)
                curveToRelative(-0.68f, 0.65f, -1.04f, 1.44f, -1.08f, 2.37f)
                curveToRelative(0.0f, 0.06f, -0.02f, 0.11f, -0.07f, 0.17f)
                reflectiveCurveToRelative(-0.13f, 0.09f, -0.25f, 0.09f)
                horizontalLineToRelative(-1.14f)
                curveTo(11.93f, 11.67f, 11.86f, 11.59f, 11.86f, 11.43f)
                close()
                moveTo(16.23f, 21.31f)
                verticalLineToRelative(-1.99f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.24f, -0.6f)
                reflectiveCurveToRelative(0.36f, -0.24f, 0.6f, -0.24f)
                curveToRelative(0.24f, 0.0f, 0.45f, 0.08f, 0.61f, 0.24f)
                reflectiveCurveToRelative(0.24f, 0.36f, 0.24f, 0.6f)
                verticalLineToRelative(1.99f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.45f, -0.25f, 0.62f)
                curveToRelative(-0.17f, 0.17f, -0.37f, 0.25f, -0.6f, 0.25f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.25f)
                reflectiveCurveTo(16.23f, 21.56f, 16.23f, 21.31f)
                close()
                moveTo(16.23f, 3.83f)
                verticalLineTo(1.78f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.25f, -0.6f)
                reflectiveCurveToRelative(0.36f, -0.25f, 0.6f, -0.25f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.08f, 0.6f, 0.25f)
                reflectiveCurveToRelative(0.25f, 0.37f, 0.25f, 0.6f)
                verticalLineToRelative(2.04f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.42f, -0.25f, 0.58f)
                curveToRelative(-0.17f, 0.15f, -0.37f, 0.23f, -0.6f, 0.23f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.23f)
                curveTo(16.31f, 4.25f, 16.23f, 4.06f, 16.23f, 3.83f)
                close()
                moveTo(21.74f, 17.01f)
                curveToRelative(0.0f, -0.23f, 0.07f, -0.42f, 0.23f, -0.56f)
                curveToRelative(0.15f, -0.16f, 0.34f, -0.23f, 0.57f, -0.23f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.23f)
                lineToRelative(1.45f, 1.42f)
                curveToRelative(0.16f, 0.17f, 0.24f, 0.38f, 0.24f, 0.61f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.43f, -0.24f, 0.59f)
                curveToRelative(-0.4f, 0.31f, -0.8f, 0.31f, -1.2f, 0.0f)
                lineToRelative(-1.42f, -1.43f)
                curveTo(21.82f, 17.48f, 21.74f, 17.26f, 21.74f, 17.01f)
                close()
                moveTo(21.74f, 6.08f)
                curveToRelative(0.0f, -0.25f, 0.07f, -0.45f, 0.23f, -0.59f)
                lineToRelative(1.42f, -1.47f)
                curveToRelative(0.18f, -0.16f, 0.37f, -0.24f, 0.59f, -0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.37f, 0.25f, 0.6f)
                curveToRelative(0.0f, 0.25f, -0.08f, 0.46f, -0.24f, 0.62f)
                lineToRelative(-1.45f, 1.43f)
                curveToRelative(-0.18f, 0.16f, -0.38f, 0.24f, -0.6f, 0.24f)
                curveToRelative(-0.23f, 0.0f, -0.41f, -0.08f, -0.57f, -0.24f)
                reflectiveCurveTo(21.74f, 6.32f, 21.74f, 6.08f)
                close()
                moveTo(24.0f, 11.55f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.44f, 0.25f, -0.62f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.24f, 0.56f, -0.24f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.09f, 0.61f, 0.26f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.37f, 0.26f, 0.6f)
                curveToRelative(0.0f, 0.23f, -0.09f, 0.43f, -0.26f, 0.6f)
                curveToRelative(-0.18f, 0.17f, -0.38f, 0.25f, -0.61f, 0.25f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-0.23f, 0.0f, -0.42f, -0.08f, -0.58f, -0.25f)
                curveTo(24.08f, 11.99f, 24.0f, 11.79f, 24.0f, 11.55f)
                close()
            }
        }
        .build()
        return _dayLightWind!!
    }

private var _dayLightWind: ImageVector? = null
