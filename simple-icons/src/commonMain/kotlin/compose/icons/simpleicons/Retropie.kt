package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Retropie: ImageVector
    get() {
        if (_retropie != null) {
            return _retropie!!
        }
        _retropie = Builder(name = "Retropie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.923f, 0.0f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, false, -1.531f, 6.839f)
                curveToRelative(0.04f, 0.475f, 0.18f, 2.156f, 0.315f, 3.874f)
                arcToRelative(1.356f, 1.356f, 0.0f, false, true, -0.126f, 0.016f)
                curveToRelative(-0.25f, 0.016f, -0.499f, -0.027f, -0.748f, -0.007f)
                curveToRelative(-0.32f, 0.024f, -0.59f, 0.197f, -0.914f, 0.197f)
                curveToRelative(-0.298f, 0.0f, -0.608f, -0.006f, -0.88f, 0.136f)
                curveToRelative(-0.446f, 0.232f, -1.106f, 0.086f, -1.474f, 0.467f)
                curveToRelative(-0.298f, 0.308f, -0.859f, 0.153f, -1.199f, 0.475f)
                curveToRelative(-0.088f, 0.083f, -0.101f, 0.222f, -0.213f, 0.26f)
                curveToRelative(-0.126f, 0.043f, -0.257f, 0.07f, -0.383f, 0.113f)
                curveToRelative(-0.247f, 0.083f, -0.51f, 0.226f, -0.607f, 0.486f)
                curveToRelative(-0.061f, 0.166f, 0.022f, 0.188f, -0.146f, 0.257f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, -0.33f, 0.182f)
                curveToRelative(-0.182f, 0.141f, -0.231f, 0.336f, -0.258f, 0.568f)
                curveToRelative(-0.002f, 0.017f, 0.003f, 0.315f, 0.003f, 0.314f)
                arcToRelative(0.918f, 0.918f, 0.0f, false, false, -0.221f, 0.256f)
                curveToRelative(-0.133f, 0.235f, -0.107f, 0.484f, -0.009f, 0.728f)
                curveToRelative(0.107f, 0.264f, 0.198f, 0.364f, 0.209f, 0.636f)
                curveToRelative(-0.012f, 0.13f, 0.05f, 0.266f, 0.098f, 0.383f)
                curveToRelative(0.192f, 0.47f, 0.307f, 0.835f, 0.831f, 0.884f)
                lineToRelative(1.48f, 3.964f)
                curveTo(6.564f, 23.015f, 9.25f, 24.0f, 11.949f, 24.0f)
                curveToRelative(2.72f, 0.0f, 5.448f, -1.001f, 6.204f, -2.986f)
                lineToRelative(1.522f, -4.002f)
                curveToRelative(0.327f, -0.06f, 0.603f, -0.178f, 0.726f, -0.538f)
                curveToRelative(0.086f, -0.189f, 0.174f, -0.393f, 0.202f, -0.6f)
                arcToRelative(0.674f, 0.674f, 0.0f, false, false, -0.01f, -0.249f)
                curveToRelative(0.062f, -0.08f, 0.123f, -0.15f, 0.167f, -0.243f)
                curveToRelative(0.211f, -0.445f, 0.162f, -0.964f, -0.268f, -1.25f)
                curveToRelative(0.114f, -0.407f, -0.014f, -0.695f, -0.385f, -0.91f)
                curveToRelative(-0.188f, -0.109f, -0.29f, -0.091f, -0.347f, -0.296f)
                curveToRelative(-0.053f, -0.19f, -0.14f, -0.339f, -0.307f, -0.437f)
                curveToRelative(-0.215f, -0.126f, -0.458f, -0.15f, -0.684f, -0.243f)
                curveToRelative(-0.093f, -0.242f, -0.33f, -0.385f, -0.565f, -0.462f)
                curveToRelative(-0.195f, -0.064f, -0.398f, -0.073f, -0.594f, -0.126f)
                curveToRelative(-0.203f, -0.054f, -0.317f, -0.242f, -0.524f, -0.318f)
                curveToRelative(-0.225f, -0.081f, -0.463f, -0.089f, -0.698f, -0.113f)
                curveToRelative(-0.253f, -0.027f, -0.43f, -0.18f, -0.669f, -0.243f)
                curveToRelative(-0.253f, -0.066f, -0.502f, -0.05f, -0.758f, -0.065f)
                curveToRelative(-0.258f, -0.015f, -0.476f, -0.15f, -0.73f, -0.182f)
                curveToRelative(-0.202f, -0.026f, -0.403f, -0.009f, -0.606f, -0.001f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -0.474f, -0.053f)
                curveToRelative(0.136f, -1.721f, 0.266f, -3.391f, 0.3f, -3.843f)
                arcTo(3.59f, 3.59f, 0.0f, false, false, 11.924f, 0.0f)
                close()
                moveTo(12.873f, 0.826f)
                curveToRelative(0.292f, -0.007f, 0.684f, 0.158f, 1.009f, 0.518f)
                curveToRelative(0.518f, 0.573f, 0.59f, 1.257f, 0.332f, 1.397f)
                curveToRelative(-0.261f, 0.145f, -0.741f, -0.145f, -1.187f, -0.529f)
                curveToRelative(-0.438f, -0.388f, -0.721f, -0.863f, -0.536f, -1.193f)
                curveToRelative(0.068f, -0.123f, 0.207f, -0.19f, 0.382f, -0.193f)
                close()
                moveTo(10.766f, 6.99f)
                arcToRelative(3.584f, 3.584f, 0.0f, false, false, 2.312f, 0.0f)
                curveToRelative(-0.197f, 2.54f, -0.459f, 5.87f, -0.486f, 6.08f)
                curveToRelative(-0.014f, 0.083f, -0.098f, 0.176f, -0.218f, 0.242f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.464f, 0.102f)
                curveToRelative(-0.027f, 0.0f, -0.664f, -0.005f, -0.68f, -0.409f)
                curveToRelative(-0.032f, -0.825f, -0.342f, -4.563f, -0.464f, -6.015f)
                close()
                moveTo(13.137f, 10.846f)
                curveToRelative(0.077f, 0.017f, 0.156f, 0.032f, 0.237f, 0.04f)
                curveToRelative(0.302f, 0.025f, 0.597f, -0.048f, 0.899f, 0.015f)
                curveToRelative(0.137f, 0.028f, 0.25f, 0.101f, 0.385f, 0.134f)
                curveToRelative(0.168f, 0.04f, 0.339f, 0.047f, 0.511f, 0.043f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, 0.463f, 0.052f)
                curveToRelative(0.164f, 0.044f, 0.273f, 0.156f, 0.43f, 0.204f)
                curveToRelative(0.352f, 0.106f, 0.793f, 0.02f, 1.095f, 0.254f)
                curveToRelative(0.059f, 0.045f, 0.08f, 0.113f, 0.145f, 0.148f)
                curveToRelative(0.068f, 0.036f, 0.143f, 0.061f, 0.218f, 0.082f)
                curveToRelative(0.13f, 0.035f, 0.265f, 0.046f, 0.396f, 0.074f)
                curveToRelative(0.151f, 0.032f, 0.311f, 0.082f, 0.43f, 0.178f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.12f, 0.197f)
                curveToRelative(0.009f, 0.072f, 0.088f, 0.1f, 0.156f, 0.13f)
                curveToRelative(0.215f, 0.094f, 0.453f, 0.11f, 0.657f, 0.232f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.205f, 0.227f)
                lineToRelative(0.006f, 0.02f)
                lineToRelative(0.002f, 0.006f)
                lineToRelative(0.01f, 0.044f)
                curveToRelative(0.004f, 0.034f, 0.014f, 0.132f, 0.027f, 0.222f)
                curveToRelative(0.057f, 0.04f, 0.12f, 0.073f, 0.186f, 0.099f)
                curveToRelative(0.18f, 0.071f, 0.474f, 0.207f, 0.537f, 0.4f)
                arcToRelative(0.208f, 0.208f, 0.0f, false, true, 0.003f, 0.007f)
                lineToRelative(0.004f, 0.023f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, true, -0.001f, 0.124f)
                curveToRelative(-0.02f, 0.075f, -0.066f, 0.238f, -0.095f, 0.366f)
                curveToRelative(0.105f, 0.077f, 0.228f, 0.133f, 0.317f, 0.23f)
                curveToRelative(0.046f, 0.05f, 0.081f, 0.11f, 0.1f, 0.172f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(0.002f, 0.007f)
                lineToRelative(0.007f, 0.03f)
                curveToRelative(0.046f, 0.185f, -0.041f, 0.53f, -0.136f, 0.636f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.182f, 0.253f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.054f, 0.166f)
                lineToRelative(0.002f, 0.018f)
                verticalLineToRelative(0.016f)
                lineToRelative(-0.001f, 0.029f)
                lineToRelative(-0.002f, 0.012f)
                lineToRelative(-0.003f, 0.018f)
                arcToRelative(2.249f, 2.249f, 0.0f, false, true, -0.18f, 0.53f)
                curveToRelative(-0.12f, 0.387f, -0.574f, 0.307f, -0.864f, 0.408f)
                curveToRelative(-0.028f, 0.154f, -0.164f, 0.81f, -0.284f, 0.965f)
                curveToRelative(-0.237f, 0.305f, -0.633f, 0.282f, -0.969f, 0.27f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.503f, 0.089f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, false, -0.2f, 0.13f)
                curveToRelative(-0.078f, 0.075f, -0.09f, 0.155f, -0.121f, 0.254f)
                curveToRelative(-0.108f, 0.352f, -0.47f, 0.512f, -0.795f, 0.543f)
                curveToRelative(-0.271f, 0.025f, -0.509f, -0.057f, -0.772f, -0.102f)
                arcToRelative(1.548f, 1.548f, 0.0f, false, false, -0.773f, 0.058f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, -0.322f, 0.187f)
                curveToRelative(-0.086f, 0.082f, -0.154f, 0.173f, -0.253f, 0.24f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.735f, 0.211f)
                curveToRelative(-0.261f, 0.0f, -0.525f, -0.066f, -0.754f, -0.2f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, false, -0.747f, -0.183f)
                curveToRelative(-0.255f, 0.0f, -0.522f, 0.05f, -0.747f, 0.183f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, -0.757f, 0.203f)
                curveToRelative(-0.337f, 0.0f, -0.694f, -0.112f, -0.926f, -0.38f)
                curveToRelative(-0.182f, -0.211f, -0.457f, -0.3f, -0.72f, -0.328f)
                curveToRelative(-0.378f, -0.04f, -0.718f, 0.123f, -1.09f, 0.123f)
                curveToRelative(-0.33f, 0.0f, -0.713f, -0.112f, -0.889f, -0.431f)
                curveToRelative(-0.067f, -0.123f, -0.067f, -0.267f, -0.17f, -0.367f)
                curveToRelative(-0.135f, -0.132f, -0.33f, -0.192f, -0.509f, -0.214f)
                curveToRelative(-0.354f, -0.044f, -0.702f, 0.068f, -1.03f, -0.14f)
                arcToRelative(0.586f, 0.586f, 0.0f, false, true, -0.263f, -0.372f)
                curveToRelative(-0.023f, -0.084f, -0.161f, -0.562f, -0.18f, -0.663f)
                curveToRelative(-0.029f, -0.15f, -0.484f, -0.048f, -0.637f, -0.135f)
                curveToRelative(-0.138f, -0.08f, -0.208f, -0.29f, -0.253f, -0.389f)
                curveToRelative(-0.044f, -0.098f, -0.18f, -0.405f, -0.19f, -0.5f)
                lineToRelative(0.006f, -0.005f)
                curveToRelative(-0.001f, -0.012f, -0.004f, -0.023f, -0.004f, -0.036f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, true, 0.104f, -0.283f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, true, -0.199f, -0.194f)
                curveToRelative(-0.044f, -0.085f, -0.255f, -0.454f, -0.19f, -0.64f)
                lineToRelative(0.005f, -0.004f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, true, 0.18f, -0.262f)
                curveToRelative(0.069f, -0.057f, 0.16f, -0.1f, 0.237f, -0.154f)
                arcToRelative(0.476f, 0.476f, 0.0f, false, true, -0.058f, -0.054f)
                curveToRelative(-0.1f, -0.136f, -0.081f, -0.427f, 0.014f, -0.566f)
                lineToRelative(0.012f, -0.02f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.003f, -0.002f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.029f, -0.036f)
                curveToRelative(0.117f, -0.124f, 0.279f, -0.185f, 0.437f, -0.248f)
                arcToRelative(0.931f, 0.931f, 0.0f, false, false, 0.187f, -0.097f)
                curveToRelative(0.009f, -0.088f, 0.003f, -0.189f, 0.01f, -0.246f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.093f, -0.178f)
                curveToRelative(0.16f, -0.17f, 0.522f, -0.23f, 0.707f, -0.296f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, false, 0.22f, -0.108f)
                curveToRelative(0.04f, -0.03f, 0.036f, -0.133f, 0.07f, -0.18f)
                curveToRelative(0.09f, -0.126f, 0.259f, -0.19f, 0.408f, -0.23f)
                curveToRelative(0.167f, -0.045f, 0.342f, -0.053f, 0.508f, -0.1f)
                arcToRelative(0.778f, 0.778f, 0.0f, false, false, 0.233f, -0.098f)
                curveToRelative(0.055f, -0.039f, 0.082f, -0.113f, 0.146f, -0.154f)
                curveToRelative(0.323f, -0.205f, 0.74f, -0.116f, 1.093f, -0.237f)
                curveToRelative(0.125f, -0.043f, 0.211f, -0.136f, 0.341f, -0.177f)
                curveToRelative(0.176f, -0.056f, 0.37f, -0.073f, 0.555f, -0.064f)
                curveToRelative(0.164f, 0.008f, 0.334f, -0.009f, 0.493f, -0.05f)
                curveToRelative(0.142f, -0.035f, 0.26f, -0.11f, 0.408f, -0.136f)
                curveToRelative(0.327f, -0.057f, 0.652f, 0.03f, 0.98f, -0.02f)
                curveToRelative(0.043f, 0.551f, 0.083f, 1.081f, 0.11f, 1.475f)
                curveToRelative(-0.67f, 0.17f, -1.125f, 0.495f, -1.125f, 0.87f)
                curveToRelative(0.0f, 0.553f, 0.983f, 1.0f, 2.195f, 1.0f)
                curveToRelative(1.212f, 0.0f, 2.195f, -0.447f, 2.195f, -1.0f)
                curveToRelative(0.0f, -0.366f, -0.435f, -0.683f, -1.08f, -0.858f)
                curveToRelative(0.034f, -0.404f, 0.072f, -0.866f, 0.123f, -1.508f)
                close()
                moveTo(17.002f, 12.899f)
                curveToRelative(-0.318f, 0.0f, -0.626f, 0.059f, -0.891f, 0.17f)
                curveToRelative(-0.375f, 0.157f, -0.6f, 0.407f, -0.634f, 0.703f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, 0.022f, 0.252f)
                lineToRelative(0.02f, 0.409f)
                lineToRelative(0.01f, 0.2f)
                lineToRelative(0.002f, 0.027f)
                arcToRelative(1.288f, 1.288f, 0.0f, false, false, -0.347f, -0.207f)
                arcToRelative(2.306f, 2.306f, 0.0f, false, false, -0.892f, -0.17f)
                curveToRelative(-0.319f, 0.0f, -0.627f, 0.058f, -0.892f, 0.169f)
                curveToRelative(-0.375f, 0.157f, -0.6f, 0.407f, -0.633f, 0.703f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, 0.023f, 0.258f)
                lineToRelative(0.02f, 0.402f)
                lineToRelative(0.01f, 0.201f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, false, 0.073f, 0.268f)
                lineToRelative(0.026f, 0.044f)
                curveToRelative(0.117f, 0.214f, 0.336f, 0.388f, 0.63f, 0.501f)
                curveToRelative(0.232f, 0.09f, 0.493f, 0.137f, 0.754f, 0.137f)
                curveToRelative(0.34f, 0.0f, 0.662f, -0.078f, 0.93f, -0.226f)
                curveToRelative(0.324f, -0.178f, 0.51f, -0.436f, 0.526f, -0.725f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.006f, -0.074f)
                curveToRelative(0.004f, -0.03f, 0.008f, -0.058f, 0.011f, -0.119f)
                lineToRelative(0.023f, -0.416f)
                arcToRelative(0.656f, 0.656f, 0.0f, false, false, 0.026f, -0.173f)
                curveToRelative(0.0f, -0.016f, -0.003f, -0.032f, -0.004f, -0.049f)
                curveToRelative(0.116f, 0.106f, 0.263f, 0.195f, 0.438f, 0.262f)
                curveToRelative(0.233f, 0.09f, 0.493f, 0.137f, 0.755f, 0.137f)
                curveToRelative(0.34f, 0.0f, 0.661f, -0.078f, 0.93f, -0.226f)
                curveToRelative(0.324f, -0.179f, 0.51f, -0.436f, 0.525f, -0.725f)
                curveToRelative(0.002f, -0.042f, 0.004f, -0.056f, 0.006f, -0.074f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, false, 0.011f, -0.12f)
                lineToRelative(0.023f, -0.41f)
                arcToRelative(0.656f, 0.656f, 0.0f, false, false, 0.026f, -0.178f)
                curveToRelative(0.001f, -0.299f, -0.192f, -0.56f, -0.543f, -0.735f)
                arcToRelative(2.312f, 2.312f, 0.0f, false, false, -0.99f, -0.216f)
                close()
                moveTo(17.002f, 13.169f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, 0.862f, 0.183f)
                curveToRelative(0.164f, 0.082f, 0.402f, 0.243f, 0.401f, 0.498f)
                curveToRelative(0.0f, 0.09f, -0.033f, 0.175f, -0.092f, 0.254f)
                lineToRelative(-0.134f, 0.116f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, true, -0.217f, 0.143f)
                curveToRelative(-0.01f, 0.004f, -0.018f, 0.01f, -0.028f, 0.013f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, -0.788f, 0.149f)
                curveToRelative(-0.293f, 0.0f, -0.571f, -0.056f, -0.807f, -0.16f)
                lineToRelative(-0.025f, -0.01f)
                arcToRelative(1.037f, 1.037f, 0.0f, false, true, -0.207f, -0.14f)
                lineToRelative(-0.132f, -0.114f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.09f, -0.299f)
                curveToRelative(0.023f, -0.194f, 0.19f, -0.366f, 0.47f, -0.484f)
                curveToRelative(0.232f, -0.098f, 0.505f, -0.149f, 0.787f, -0.149f)
                close()
                moveTo(15.79f, 14.435f)
                curveToRelative(0.074f, 0.06f, 0.16f, 0.112f, 0.256f, 0.157f)
                curveToRelative(0.017f, 0.011f, 0.037f, 0.017f, 0.054f, 0.024f)
                curveToRelative(0.268f, 0.128f, 0.58f, 0.198f, 0.906f, 0.198f)
                curveToRelative(0.327f, 0.0f, 0.642f, -0.068f, 0.912f, -0.196f)
                lineToRelative(0.023f, -0.013f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, false, 0.274f, -0.164f)
                curveToRelative(-0.006f, 0.08f, -0.011f, 0.077f, -0.016f, 0.177f)
                curveToRelative(-0.012f, 0.228f, -0.198f, 0.399f, -0.385f, 0.502f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, -0.8f, 0.193f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, -0.658f, -0.119f)
                curveToRelative(-0.192f, -0.074f, -0.389f, -0.194f, -0.49f, -0.38f)
                curveToRelative(-0.059f, -0.103f, -0.061f, -0.08f, -0.067f, -0.194f)
                arcToRelative(57.658f, 57.658f, 0.0f, false, false, -0.009f, -0.185f)
                close()
                moveTo(14.292f, 14.552f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, 0.862f, 0.184f)
                curveToRelative(0.164f, 0.08f, 0.401f, 0.242f, 0.4f, 0.497f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.093f, 0.255f)
                lineToRelative(-0.132f, 0.115f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, -0.213f, 0.14f)
                arcToRelative(2.053f, 2.053f, 0.0f, false, true, -0.82f, 0.165f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, true, -0.802f, -0.157f)
                lineToRelative(-0.03f, -0.013f)
                arcToRelative(1.032f, 1.032f, 0.0f, false, true, -0.207f, -0.139f)
                lineToRelative(-0.133f, -0.116f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, -0.089f, -0.297f)
                curveToRelative(0.022f, -0.195f, 0.19f, -0.367f, 0.47f, -0.485f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 0.787f, -0.149f)
                close()
                moveTo(13.08f, 15.818f)
                curveToRelative(0.08f, 0.064f, 0.173f, 0.122f, 0.28f, 0.17f)
                lineToRelative(0.033f, 0.013f)
                curveToRelative(0.268f, 0.127f, 0.577f, 0.196f, 0.903f, 0.196f)
                curveToRelative(0.327f, 0.0f, 0.642f, -0.067f, 0.912f, -0.196f)
                lineToRelative(0.025f, -0.014f)
                curveToRelative(0.103f, -0.047f, 0.194f, -0.102f, 0.271f, -0.163f)
                curveToRelative(-0.005f, 0.08f, -0.01f, 0.078f, -0.016f, 0.177f)
                curveToRelative(-0.011f, 0.228f, -0.197f, 0.4f, -0.385f, 0.502f)
                arcToRelative(1.665f, 1.665f, 0.0f, false, true, -0.8f, 0.193f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -0.657f, -0.119f)
                curveToRelative(-0.192f, -0.074f, -0.389f, -0.194f, -0.491f, -0.38f)
                curveToRelative(-0.058f, -0.104f, -0.06f, -0.08f, -0.066f, -0.194f)
                lineToRelative(-0.01f, -0.185f)
                close()
                moveTo(5.02f, 18.115f)
                curveToRelative(0.097f, 0.063f, 0.205f, 0.11f, 0.318f, 0.14f)
                curveToRelative(0.408f, 0.11f, 1.054f, -0.132f, 1.236f, 0.345f)
                curveToRelative(0.208f, 0.541f, 0.85f, 0.741f, 1.381f, 0.698f)
                curveToRelative(0.43f, -0.035f, 1.06f, -0.306f, 1.41f, 0.092f)
                curveToRelative(0.404f, 0.46f, 1.092f, 0.576f, 1.665f, 0.425f)
                curveToRelative(0.525f, -0.138f, 0.91f, -0.457f, 1.478f, -0.238f)
                curveToRelative(0.627f, 0.24f, 1.206f, 0.454f, 1.853f, 0.102f)
                curveToRelative(0.455f, -0.247f, 0.623f, -0.592f, 1.215f, -0.492f)
                curveToRelative(0.522f, 0.089f, 1.02f, 0.2f, 1.503f, -0.104f)
                curveToRelative(0.352f, -0.22f, 0.362f, -0.73f, 0.783f, -0.78f)
                curveToRelative(0.37f, -0.044f, 0.731f, 0.044f, 1.083f, -0.139f)
                horizontalLineToRelative(0.002f)
                lineToRelative(-0.036f, 0.094f)
                lineToRelative(-1.013f, 2.66f)
                curveToRelative(-0.328f, 0.863f, -1.097f, 1.584f, -2.223f, 2.087f)
                curveToRelative(-1.048f, 0.467f, -2.372f, 0.725f, -3.728f, 0.725f)
                curveToRelative(-1.347f, 0.0f, -2.656f, -0.255f, -3.686f, -0.717f)
                curveToRelative(-1.11f, -0.498f, -1.866f, -1.217f, -2.188f, -2.08f)
                lineTo(5.02f, 18.115f)
                close()
            }
        }
        .build()
        return _retropie!!
    }

private var _retropie: ImageVector? = null
