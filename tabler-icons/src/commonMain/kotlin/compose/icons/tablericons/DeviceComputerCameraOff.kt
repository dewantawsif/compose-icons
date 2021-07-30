package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceComputerCameraOff: ImageVector
    get() {
        if (_deviceComputerCameraOff != null) {
            return _deviceComputerCameraOff!!
        }
        _deviceComputerCameraOff = Builder(name = "DeviceComputerCameraOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.15f, 6.153f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.696f, 9.696f)
                moveToRelative(2.003f, -2.001f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.699f, -9.695f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.13f, 9.122f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.743f, 3.749f)
                moveToRelative(2.001f, -2.009f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.737f, -3.736f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                lineToRelative(-2.091f, 3.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.857f, 1.514f)
                horizontalLineToRelative(10.468f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.857f, -1.514f)
                lineToRelative(-2.091f, -3.486f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(21.0f, 21.0f)
            }
        }
        .build()
        return _deviceComputerCameraOff!!
    }

private var _deviceComputerCameraOff: ImageVector? = null
