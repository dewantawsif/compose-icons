package compose.icons.lineaicons.software

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.LayoutSidebarLeft: ImageVector
    get() {
        if (_layoutSidebarLeft != null) {
            return _layoutSidebarLeft!!
        }
        _layoutSidebarLeft = Builder(name = "LayoutSidebarLeft", defaultWidth = 64.0.dp,
                defaultHeight = 64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(-20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineToRelative(42.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(-42.0f)
                close()
            }
        }
        .build()
        return _layoutSidebarLeft!!
    }

private var _layoutSidebarLeft: ImageVector? = null
