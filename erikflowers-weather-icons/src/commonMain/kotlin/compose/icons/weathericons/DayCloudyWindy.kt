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

public val WeatherIcons.DayCloudyWindy: ImageVector
    get() {
        if (_dayCloudyWindy != null) {
            return _dayCloudyWindy!!
        }
        _dayCloudyWindy = Builder(name = "DayCloudyWindy", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.45f, 20.97f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.45f, 0.24f, 0.61f)
                curveToRelative(0.44f, 0.18f, 0.73f, 0.27f, 0.88f, 0.27f)
                horizontalLineToRelative(7.88f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.09f, 0.6f, -0.26f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.38f, 0.25f, -0.61f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.59f)
                curveToRelative(-0.17f, -0.16f, -0.37f, -0.24f, -0.6f, -0.24f)
                horizontalLineTo(1.57f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.08f, -0.76f, 0.24f)
                curveTo(0.57f, 20.55f, 0.45f, 20.75f, 0.45f, 20.97f)
                close()
                moveTo(1.84f, 17.97f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.43f, 0.25f, 0.59f)
                curveToRelative(0.15f, 0.17f, 0.34f, 0.26f, 0.58f, 0.26f)
                horizontalLineToRelative(9.4f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.6f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.25f, -0.61f)
                curveToRelative(-0.17f, -0.17f, -0.37f, -0.25f, -0.61f, -0.25f)
                horizontalLineToRelative(-9.4f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.59f, 0.25f)
                curveTo(1.92f, 17.53f, 1.84f, 17.73f, 1.84f, 17.97f)
                close()
                moveTo(2.89f, 15.6f)
                curveToRelative(0.0f, 0.09f, 0.06f, 0.13f, 0.17f, 0.13f)
                horizontalLineToRelative(1.39f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.04f, 0.22f, -0.13f)
                curveToRelative(0.26f, -0.53f, 0.62f, -0.97f, 1.09f, -1.32f)
                curveToRelative(0.47f, -0.35f, 1.0f, -0.55f, 1.58f, -0.62f)
                horizontalLineToRelative(0.54f)
                curveToRelative(0.11f, 0.0f, 0.16f, -0.06f, 0.16f, -0.19f)
                lineToRelative(0.07f, -0.56f)
                curveToRelative(0.07f, -0.71f, 0.3f, -1.36f, 0.69f, -1.95f)
                curveToRelative(0.39f, -0.58f, 0.9f, -1.04f, 1.53f, -1.37f)
                reflectiveCurveToRelative(1.3f, -0.5f, 2.02f, -0.5f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.85f, 1.1f)
                reflectiveCurveToRelative(1.27f, 1.64f, 1.39f, 2.72f)
                lineToRelative(0.07f, 0.56f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.19f, 0.18f, 0.19f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.89f, 0.0f, 1.65f, 0.32f, 2.3f, 0.96f)
                curveToRelative(0.65f, 0.64f, 0.97f, 1.39f, 0.97f, 2.27f)
                curveToRelative(0.0f, 0.9f, -0.32f, 1.67f, -0.97f, 2.31f)
                curveToRelative(-0.64f, 0.64f, -1.41f, 0.96f, -2.31f, 0.96f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(-0.11f, 0.0f, -0.17f, 0.06f, -0.17f, 0.19f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.17f, 0.18f)
                horizontalLineToRelative(6.89f)
                curveToRelative(0.9f, 0.0f, 1.73f, -0.22f, 2.49f, -0.67f)
                curveToRelative(0.76f, -0.44f, 1.37f, -1.05f, 1.81f, -1.81f)
                curveToRelative(0.44f, -0.76f, 0.67f, -1.59f, 0.67f, -2.49f)
                curveToRelative(0.0f, -0.73f, -0.14f, -1.39f, -0.43f, -2.01f)
                curveToRelative(0.78f, -0.96f, 1.16f, -2.06f, 1.16f, -3.28f)
                curveToRelative(0.0f, -0.94f, -0.24f, -1.81f, -0.71f, -2.62f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.45f, -1.92f, -1.92f)
                curveToRelative(-0.81f, -0.47f, -1.69f, -0.71f, -2.63f, -0.71f)
                curveToRelative(-0.73f, 0.0f, -1.43f, 0.15f, -2.1f, 0.45f)
                curveToRelative(-0.67f, 0.3f, -1.25f, 0.71f, -1.74f, 1.25f)
                curveToRelative(-0.83f, -0.43f, -1.73f, -0.65f, -2.7f, -0.65f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.79f, 1.99f, -2.09f, 3.36f)
                curveToRelative(-0.85f, 0.21f, -1.6f, 0.63f, -2.25f, 1.25f)
                reflectiveCurveToRelative(-1.1f, 1.36f, -1.35f, 2.21f)
                curveTo(2.9f, 15.55f, 2.89f, 15.57f, 2.89f, 15.6f)
                close()
                moveTo(3.6f, 24.16f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.43f, 0.26f, 0.59f)
                curveTo(4.02f, 24.92f, 4.22f, 25.0f, 4.45f, 25.0f)
                horizontalLineToRelative(9.42f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                reflectiveCurveToRelative(0.24f, -0.36f, 0.24f, -0.6f)
                curveToRelative(0.0f, -0.25f, -0.08f, -0.46f, -0.24f, -0.62f)
                reflectiveCurveToRelative(-0.36f, -0.25f, -0.6f, -0.25f)
                horizontalLineTo(4.45f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.25f)
                reflectiveCurveTo(3.6f, 23.91f, 3.6f, 24.16f)
                close()
                moveTo(11.09f, 4.65f)
                curveToRelative(0.0f, 0.25f, 0.08f, 0.45f, 0.24f, 0.6f)
                lineToRelative(0.64f, 0.66f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.6f, 0.24f)
                curveToRelative(0.26f, 0.0f, 0.46f, -0.08f, 0.62f, -0.24f)
                curveToRelative(0.16f, -0.16f, 0.24f, -0.36f, 0.24f, -0.61f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.24f, -0.59f)
                lineToRelative(-0.65f, -0.65f)
                curveToRelative(-0.17f, -0.17f, -0.36f, -0.25f, -0.57f, -0.25f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.08f, -0.63f, 0.25f)
                reflectiveCurveTo(11.09f, 4.42f, 11.09f, 4.65f)
                close()
                moveTo(16.45f, 9.03f)
                curveToRelative(0.66f, -0.63f, 1.48f, -0.95f, 2.45f, -0.95f)
                curveToRelative(0.97f, 0.0f, 1.8f, 0.34f, 2.49f, 1.03f)
                curveToRelative(0.68f, 0.68f, 1.03f, 1.51f, 1.03f, 2.49f)
                curveToRelative(0.0f, 0.67f, -0.15f, 1.27f, -0.46f, 1.81f)
                curveToRelative(-0.94f, -0.95f, -2.11f, -1.43f, -3.5f, -1.43f)
                horizontalLineToRelative(-0.3f)
                curveTo(17.87f, 10.83f, 17.3f, 9.85f, 16.45f, 9.03f)
                close()
                moveTo(18.05f, 3.81f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.43f, 0.25f, 0.59f)
                reflectiveCurveToRelative(0.36f, 0.23f, 0.6f, 0.23f)
                curveToRelative(0.25f, 0.0f, 0.45f, -0.08f, 0.6f, -0.23f)
                curveToRelative(0.15f, -0.15f, 0.23f, -0.35f, 0.23f, -0.6f)
                verticalLineTo(1.76f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.45f, -0.23f, -0.61f)
                curveToRelative(-0.16f, -0.17f, -0.36f, -0.25f, -0.6f, -0.25f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.6f, 0.25f)
                reflectiveCurveToRelative(-0.25f, 0.37f, -0.25f, 0.61f)
                verticalLineTo(3.81f)
                close()
                moveTo(23.57f, 6.09f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.25f, 0.6f)
                curveToRelative(0.12f, 0.16f, 0.33f, 0.24f, 0.6f, 0.24f)
                curveToRelative(0.27f, 0.0f, 0.47f, -0.08f, 0.59f, -0.24f)
                lineToRelative(1.46f, -1.44f)
                curveToRelative(0.16f, -0.15f, 0.24f, -0.36f, 0.24f, -0.62f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.6f)
                curveToRelative(-0.17f, -0.17f, -0.37f, -0.25f, -0.6f, -0.25f)
                reflectiveCurveToRelative(-0.44f, 0.08f, -0.61f, 0.23f)
                lineTo(23.83f, 5.5f)
                curveTo(23.66f, 5.67f, 23.57f, 5.86f, 23.57f, 6.09f)
                close()
                moveTo(24.37f, 17.95f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.23f, 0.6f)
                lineToRelative(0.66f, 0.63f)
                curveToRelative(0.24f, 0.18f, 0.45f, 0.27f, 0.61f, 0.27f)
                curveToRelative(0.16f, 0.0f, 0.37f, -0.09f, 0.61f, -0.27f)
                curveToRelative(0.16f, -0.16f, 0.24f, -0.36f, 0.24f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.24f, -0.61f)
                lineToRelative(-0.64f, -0.61f)
                curveToRelative(-0.19f, -0.17f, -0.4f, -0.26f, -0.65f, -0.26f)
                curveToRelative(-0.24f, 0.0f, -0.43f, 0.08f, -0.59f, 0.24f)
                curveTo(24.45f, 17.51f, 24.37f, 17.71f, 24.37f, 17.95f)
                close()
                moveTo(25.81f, 11.63f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.45f, 0.27f, 0.61f)
                curveToRelative(0.18f, 0.17f, 0.38f, 0.25f, 0.6f, 0.25f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.23f, 0.0f, 0.42f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.61f)
                curveToRelative(0.0f, -0.22f, -0.08f, -0.41f, -0.24f, -0.57f)
                curveToRelative(-0.16f, -0.15f, -0.36f, -0.23f, -0.59f, -0.23f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-0.24f, 0.0f, -0.45f, 0.08f, -0.62f, 0.23f)
                curveTo(25.9f, 11.22f, 25.81f, 11.41f, 25.81f, 11.63f)
                close()
            }
        }
        .build()
        return _dayCloudyWindy!!
    }

private var _dayCloudyWindy: ImageVector? = null
