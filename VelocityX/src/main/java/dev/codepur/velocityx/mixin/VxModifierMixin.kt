package dev.codepur.velocityx.mixin

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.codepur.velocityx.Vx

interface IVxModifierMixin<T> : IVxPaddingMixin<T>, IVxTransformMixin<T>,
    IVxSizeMixin<T>, IVxGradientMixin<T> {
    var velocityModifier: Modifier?
    fun setChildForModifier(child: T)
    fun modifier(value: Modifier): T
    fun withRounded(value: Dp): T
    fun withShadow(value: Dp): T
    fun clip(shape: Shape): T
    fun bg(color: Color, shape: Shape = RectangleShape): T
    fun clickable(onClick: () -> Unit, enabled: Boolean = true): T
    fun testTag(tag: String): T
    fun border(
        width: Dp? = 2.dp,
        color: Color? = Vx.black,
        shape: Shape? = RectangleShape,
    ): T

    fun scrollHorizontal(
        state: ScrollState,
        enabled: Boolean = true,
        flingBehavior: FlingBehavior? = null,
        reverseScrolling: Boolean = false
    ): T

    fun scrollVertical(
        state: ScrollState,
        enabled: Boolean = true,
        flingBehavior: FlingBehavior? = null,
        reverseScrolling: Boolean = false
    ): T


    /// Rounding
    val roundedSm: T
        get() = withRounded(7.5.dp)

    val rounded: T
        get() = withRounded(15.0.dp)

    val roundedLg: T
        get() = withRounded(30.0.dp)

    val circle: T
        get() = clip(shape = CircleShape)


    /// Shadow
    val shadowXs: T
        get() = withShadow(1.dp)

    val shadowSm: T
        get() = withShadow(2.dp)

    val shadowMd: T
        get() = withShadow(3.dp)

    val shadowLg: T
        get() = withShadow(4.dp)

    val shadowXl: T
        get() = withShadow(6.dp)

    val shadow2Xl: T
        get() = withShadow(8.dp)
    val shadow3Xl: T
        get() = withShadow(9.dp)
    val shadow4Xl: T
        get() = withShadow(12.dp)
    val shadow5Xl: T
        get() = withShadow(16.dp)
    val shadowMax: T
        get() = withShadow(24.dp)

}

class VxModifierMixin<T> : IVxModifierMixin<T> {
    private var _child: T? = null
    override var velocityModifier: Modifier? = null
    private var vxTransform: IVxTransformMixin<T>? = null
    private var vxGradient: IVxGradientMixin<T>? = null

    override fun setChildForModifier(child: T) {
        _child = child
        vxTransform = VxTransformMixin<T>(this, _child = child)
        vxGradient = VxGradientMixin<T>(this, _child = child)
    }

    override fun fillMaxWidth(fraction: Float): T {

        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .fillMaxWidth(fraction = fraction)
        } else {
            Modifier.fillMaxWidth(fraction = fraction)
        }

        return _child!!
    }

    override fun fillMaxHeight(fraction: Float): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .fillMaxHeight(fraction = fraction)
        } else {
            Modifier.fillMaxHeight(fraction = fraction)
        }

        return _child!!
    }

    override fun fillMaxSize(fraction: Float): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .fillMaxSize(fraction = fraction)
        } else {
            Modifier.fillMaxSize(fraction = fraction)
        }

        return _child!!
    }


    override fun offset(x: Dp, y: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .offset(x = x, y = y)
        } else {
            Modifier.offset(x = x, y = y)
        }

        return _child!!
    }

    @Composable
    override fun square(size: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredSize(size)
        } else {
            Modifier.requiredSize(size)
        }

        return _child!!
    }

    @Composable
    override fun forcedWidth(width: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredWidth(width)
        } else {
            Modifier.requiredWidth(width)
        }

        return _child!!
    }

    @Composable
    override fun forcedHeight(height: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredHeight(height)
        } else {
            Modifier.requiredHeight(height)
        }

        return _child!!
    }

    @Composable
    override fun wPCT(w: Number): T {
        val screenWidth = LocalConfiguration.current.screenWidthDp
        val width = (screenWidth / 100.0) * w.toDouble()
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredWidth(width.dp)
        } else {
            Modifier.requiredWidth(width.dp)
        }
        return _child!!
    }

    @Composable
    override fun hPCT(h: Number): T {
        val screenHeight = LocalConfiguration.current.screenHeightDp
        val width = (screenHeight / 100.0) * h.toDouble()
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredHeight(width.dp)
        } else {
            Modifier.requiredHeight(width.dp)
        }
        return _child!!
    }

    @Composable
    override fun whPCT(v: Number): T {
        val screenWidth = LocalConfiguration.current.screenWidthDp
        val screenHeight = LocalConfiguration.current.screenHeightDp
        val width = (screenWidth / 100.0) * v.toDouble()
        val height = (screenHeight / 100.0) * v.toDouble()
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredWidth(width.dp)
                .requiredHeight(height.dp)
        } else {
            Modifier
                .requiredWidth(width.dp)
                .requiredHeight(height.dp)
        }
        return _child!!
    }


    override fun modifier(value: Modifier): T {
        velocityModifier = value
        return _child!!
    }

    override fun width(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.width(value)
        } else {
            Modifier.width(value)
        }

        return _child!!
    }

    override fun aspectRatio(ratio: Float, matchHeightConstraintsFirst: Boolean): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.aspectRatio(
                ratio = ratio,
                matchHeightConstraintsFirst = matchHeightConstraintsFirst
            )
        } else {
            Modifier.aspectRatio(
                ratio = ratio,
                matchHeightConstraintsFirst = matchHeightConstraintsFirst
            )
        }

        return _child!!
    }

    override fun p(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.padding(value)
        } else {
            Modifier.padding(value)
        }

        return _child!!
    }

    override fun p(value: PaddingValues): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.padding(value)
        } else {
            Modifier.padding(value)
        }

        return _child!!
    }

    override fun pLTRB(left: Dp, top: Dp, right: Dp, bottom: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.padding(start = left, top = top, end = right, bottom = bottom)
        } else {
            Modifier.padding(start = left, top = top, end = right, bottom = bottom)
        }

        return _child!!
    }

    override fun pBaseline(top: Dp, bottom: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.paddingFromBaseline(top = top, bottom = bottom)
        } else {
            Modifier.paddingFromBaseline(top = top, bottom = bottom)
        }

        return _child!!
    }

    override fun withRounded(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.clip(RoundedCornerShape(value))
        } else {
            Modifier.clip(RoundedCornerShape(value))
        }

        return _child!!
    }

    override fun withShadow(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.shadow(500.dp)
        } else {
            Modifier.shadow(value)

        }

        return _child!!
    }

    override fun px(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.padding(horizontal = value)
        } else {
            Modifier.padding(horizontal = value)
        }

        return _child!!
    }

    override fun py(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.padding(vertical = value)
        } else {
            Modifier.padding(vertical = value)
        }

        return _child!!
    }

    override fun pxy(value1: Dp, value2: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.padding(horizontal = value1, vertical = value2)
        } else {
            Modifier.padding(horizontal = value1, vertical = value2)
        }

        return _child!!
    }

    override fun size(value: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.size(value)
        } else {
            Modifier.size(value)
        }

        return _child!!
    }

    override fun sizeIn(minWidth: Dp, maxWidth: Dp, minHeight: Dp, maxHeight: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.sizeIn(
                minWidth = minWidth,
                maxWidth = maxWidth,
                minHeight = minHeight,
                maxHeight = maxHeight
            )
        } else {
            Modifier.sizeIn(
                minWidth = minWidth,
                maxWidth = maxWidth,
                minHeight = minHeight,
                maxHeight = maxHeight
            )
        }

        return _child!!
    }


    override fun size(width: Dp, height: Dp): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.size(width, height)
        } else {
            Modifier.size(width, height)
        }

        return _child!!
    }

    override fun clip(shape: Shape): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.clip(shape)
        } else {
            Modifier.clip(shape)
        }

        return _child!!
    }

    override fun bg(color: Color, shape: Shape): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.background(color = color, shape = shape)
        } else {
            Modifier.background(color = color, shape = shape)
        }

        return _child!!
    }

    override fun clickable(onClick: () -> Unit, enabled: Boolean): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.clickable(enabled = enabled, onClick = onClick)
        } else {
            Modifier.clickable(enabled = enabled, onClick = onClick)
        }

        return _child!!
    }


    override fun testTag(tag: String): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.testTag(tag)
        } else {
            Modifier.testTag(tag)
        }

        return _child!!
    }

    override fun scrollHorizontal(
        state: ScrollState,
        enabled: Boolean,
        flingBehavior: FlingBehavior?,
        reverseScrolling: Boolean
    ): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.horizontalScroll(state, enabled, flingBehavior, reverseScrolling)
        } else {
            Modifier.horizontalScroll(state, enabled, flingBehavior, reverseScrolling)
        }

        return _child!!
    }

    override fun scrollVertical(
        state: ScrollState,
        enabled: Boolean,
        flingBehavior: FlingBehavior?,
        reverseScrolling: Boolean
    ): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.verticalScroll(state, enabled, flingBehavior, reverseScrolling)
        } else {
            Modifier.verticalScroll(state, enabled, flingBehavior, reverseScrolling)
        }

        return _child!!
    }


    /**
     * Modify element to add border with appearance specified with a [border] and a [shape] and clip it.
     *
     * @param  [BorderStroke] class that specifies border appearance, such as size and color
     * @param shape shape of the border
     */

    override fun border(width: Dp?, color: Color?, shape: Shape?): T {
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!.border(
                border = BorderStroke(width = width!!, color = color!!),
                shape = shape!!
            )

        } else {
            Modifier.border(
                border = BorderStroke(width = width!!, color = color!!),
                shape = shape!!
            )
        }

        return _child!!
    }


    override fun rotate(degrees: Float): T {
        return vxTransform!!.rotate(degrees)
    }

    override fun scale(x: Float, y: Float): T {
        return vxTransform!!.scale(x, y)
    }

    override fun scale(scale: Float): T {
        return vxTransform!!.scale(scale)
    }

    override fun linearGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        start: Offset,
        end: Offset,
        tileMode: TileMode
    ): T {
        return vxGradient!!.linearGradient(colorStops, colors, start, end, tileMode)
    }

    override fun radialGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        center: Offset,
        radius: Float,
        tileMode: TileMode
    ): T {
        return vxGradient!!.radialGradient(colorStops, colors, center, radius, tileMode)
    }

    override fun sweepGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        center: Offset
    ): T {
        return vxGradient!!.sweepGradient(colorStops, colors, center)
    }


}