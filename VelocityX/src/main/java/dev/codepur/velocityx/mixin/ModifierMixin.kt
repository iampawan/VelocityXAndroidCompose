package dev.codepur.velocityx.mixin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.codepur.velocityx.Vx

interface IVxModifierMixin<T> {
    var velocityModifier: Modifier?
    fun setChildForModifier(child: T)
    fun modifier(value: Modifier): T
    fun withRounded(value: Dp): T
    fun withShadow(value: Dp): T
    fun p(value: Dp): T
    fun px(value: Dp): T
    fun py(value: Dp): T
    fun pxy(value1: Dp, value2: Dp): T
    fun pLTRB(left: Dp, top: Dp, right: Dp, bottom: Dp): T
    fun pBaseline(top: Dp, bottom: Dp): T
    fun width(value: Dp): T
    fun size(value: Dp): T
    fun size(width: Dp, height: Dp): T
    fun sizeIn(minWidth: Dp, maxWidth: Dp, minHeight: Dp, maxHeight: Dp): T
    fun offset(x: Dp, y: Dp): T
    fun clip(shape: Shape): T
    fun bg(color: Color, shape: Shape = RectangleShape): T
    fun clickable(onClick: () -> Unit, enabled: Boolean = true): T
    fun border(
        width: Dp? = 2.dp,
        color: Color? = Vx.black,
        shape: Shape? = RectangleShape,
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

    /// Padding for all
    val p0: T
        get() = p(0.dp)
    val p1: T
        get() = p(1.dp)
    val p2: T
        get() = p(2.dp)
    val p4: T
        get() = p(4.dp)
    val p8: T
        get() = p(8.dp)
    val p12: T
        get() = p(12.dp)
    val p16: T
        get() = p(16.dp)
    val p20: T
        get() = p(20.dp)
    val p24: T
        get() = p(24.dp)
    val p32: T
        get() = p(32.dp)
    val p64: T
        get() = p(64.dp)

    /// Horizontal padding
    val px0: T
        get() = px(0.dp)
    val px1: T
        get() = px(1.dp)
    val px2: T
        get() = px(2.dp)
    val px4: T
        get() = px(4.dp)
    val px8: T
        get() = px(8.dp)
    val px12: T
        get() = px(12.dp)
    val px16: T
        get() = px(16.dp)
    val px20: T
        get() = px(20.dp)
    val px24: T
        get() = px(24.dp)
    val px32: T
        get() = px(32.dp)
    val px64: T
        get() = px(64.dp)

    /// Vertical padding
    val py0: T
        get() = py(0.dp)
    val py1: T
        get() = py(1.dp)
    val py2: T
        get() = py(2.dp)
    val py4: T
        get() = py(4.dp)
    val py8: T
        get() = py(8.dp)
    val py12: T
        get() = py(12.dp)
    val py16: T
        get() = py(16.dp)
    val py20: T
        get() = py(20.dp)
    val py24: T
        get() = py(24.dp)
    val py32: T
        get() = py(32.dp)
    val py64: T
        get() = py(64.dp)


    /// Horizontal & Vertical padding
    val pxy0: T
        get() = pxy(0.dp, 0.dp)
    val pxy1: T
        get() = pxy(1.dp, 1.dp)
    val pxy2: T
        get() = pxy(2.dp, 2.dp)
    val pxy4: T
        get() = pxy(4.dp, 4.dp)
    val pxy8: T
        get() = pxy(8.dp, 8.dp)
    val pxy12: T
        get() = pxy(12.dp, 12.dp)
    val pxy16: T
        get() = pxy(16.dp, 16.dp)
    val pxy20: T
        get() = pxy(20.dp, 20.dp)
    val pxy24: T
        get() = pxy(24.dp, 24.dp)
    val pxy32: T
        get() = pxy(32.dp, 32.dp)
    val pxy64: T
        get() = pxy(64.dp, 64.dp)

    fun fillMaxWidth(fraction: Float): T
    fun fillMaxHeight(fraction: Float): T
    fun fillMaxSize(fraction: Float): T

    @Composable
    fun forcedWidth(width: Dp): T

    @Composable
    fun forcedHeight(height: Dp): T

    @Composable
    fun w0(): T

    @Composable
    fun w1(): T

    @Composable
    fun w2(): T

    @Composable
    fun w4(): T

    @Composable
    fun w8(): T

    @Composable
    fun w10(): T

    @Composable
    fun w12(): T

    @Composable
    fun w16(): T

    @Composable
    fun w20(): T

    @Composable
    fun w24(): T

    @Composable
    fun w32(): T

    @Composable
    fun w40(): T

    @Composable
    fun w48(): T

    @Composable
    fun w60(): T

    @Composable
    fun w75(): T

    @Composable
    fun wHalf(): T

    @Composable
    fun wOneThird(): T

    @Composable
    fun wTwoThird(): T

    @Composable
    fun wOneForth(): T

    @Composable
    fun wThreeForth(): T

    @Composable
    fun wFull(): T

    @Composable
    fun h0(): T

    @Composable
    fun h1(): T

    @Composable
    fun h2(): T

    @Composable
    fun h4(): T

    @Composable
    fun h8(): T

    @Composable
    fun h10(): T

    @Composable
    fun h12(): T

    @Composable
    fun h16(): T

    @Composable
    fun h20(): T

    @Composable
    fun h24(): T

    @Composable
    fun h32(): T

    @Composable
    fun h40(): T

    @Composable
    fun h48(): T

    @Composable
    fun h60(): T

    @Composable
    fun h75(): T

    @Composable
    fun hHalf(): T

    @Composable
    fun hOneThird(): T

    @Composable
    fun hThoThird(): T

    @Composable
    fun hOneForth(): T

    @Composable
    fun hThreeForth(): T

    @Composable
    fun hFull(): T

    @Composable
    fun wh0(): T

    @Composable
    fun wh1(): T

    @Composable
    fun wh2(): T

    @Composable
    fun wh4(): T

    @Composable
    fun wh8(): T

    @Composable
    fun wh10(): T

    @Composable
    fun wh12(): T

    @Composable
    fun wh16(): T

    @Composable
    fun wh20(): T

    @Composable
    fun wh24(): T

    @Composable
    fun wh32(): T

    @Composable
    fun wh40(): T

    @Composable
    fun wh48(): T

    @Composable
    fun wh60(): T

    @Composable
    fun wh75(): T

    @Composable
    fun whHalf(): T

    @Composable
    fun whOneThird(): T

    @Composable
    fun whTwoThird(): T

    @Composable
    fun whOneForth(): T

    @Composable
    fun whThreeForth(): T

    @Composable
    fun whFull(): T

    @Composable
    fun square(size: Dp): T
}

class VxModifierMixin<T> : IVxModifierMixin<T> {
    private var _child: T? = null
    override var velocityModifier: Modifier? = null

    override fun setChildForModifier(child: T) {
        _child = child
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

    @Composable
    override fun w0(): T = setCustomWidth(w = 0.0)

    @Composable
    override fun w1(): T = setCustomWidth(w = 1.0)

    @Composable
    override fun w2(): T = setCustomWidth(w = 2.0)

    @Composable
    override fun w4(): T = setCustomWidth(w = 4.0)

    @Composable
    override fun w8(): T = setCustomWidth(w = 8.0)

    @Composable
    override fun w10(): T = setCustomWidth(w = 10.0)

    @Composable
    override fun w12(): T = setCustomWidth(w = 12.0)

    @Composable
    override fun w16(): T = setCustomWidth(w = 16.0)

    @Composable
    override fun w20(): T = setCustomWidth(w = 20.0)

    @Composable
    override fun w24(): T = setCustomWidth(w = 24.0)

    @Composable
    override fun w32(): T = setCustomWidth(w = 32.0)

    @Composable
    override fun w40(): T = setCustomWidth(w = 40.0)

    @Composable
    override fun w48(): T = setCustomWidth(w = 48.0)

    @Composable
    override fun w60(): T = setCustomWidth(w = 60.0)

    @Composable
    override fun w75(): T = setCustomWidth(w = 75.0)

    @Composable
    override fun wHalf(): T = setCustomWidth(w = 50.0)

    @Composable
    override fun wOneThird(): T = setCustomWidth(w = 33.33)

    @Composable
    override fun wTwoThird(): T = setCustomWidth(w = 66.66)

    @Composable
    override fun wOneForth(): T = setCustomWidth(w = 23.0)

    @Composable
    override fun wThreeForth(): T = setCustomWidth(w = 75.0)

    @Composable
    override fun wFull(): T = setCustomWidth(w = 100.0)


    @Composable
    override fun h0(): T = setCustomHeight(h = 0.0)

    @Composable
    override fun h1(): T = setCustomHeight(h = 1.0)

    @Composable
    override fun h2(): T = setCustomHeight(h = 2.0)

    @Composable
    override fun h4(): T = setCustomHeight(h = 4.0)

    @Composable
    override fun h8(): T = setCustomHeight(h = 8.0)

    @Composable
    override fun h10(): T = setCustomHeight(h = 10.0)

    @Composable
    override fun h12(): T = setCustomHeight(h = 12.0)

    @Composable
    override fun h16(): T = setCustomHeight(h = 16.0)

    @Composable
    override fun h20(): T = setCustomHeight(h = 20.0)

    @Composable
    override fun h24(): T = setCustomHeight(h = 24.0)

    @Composable
    override fun h32(): T = setCustomHeight(h = 32.0)

    @Composable
    override fun h40(): T = setCustomHeight(h = 40.0)

    @Composable
    override fun h48(): T = setCustomHeight(h = 48.0)

    @Composable
    override fun h60(): T = setCustomHeight(h = 60.0)

    @Composable
    override fun h75(): T = setCustomHeight(h = 75.0)

    @Composable
    override fun hHalf(): T = setCustomHeight(h = 50.0)

    @Composable
    override fun hOneThird(): T = setCustomHeight(h = 33.33)

    @Composable
    override fun hThoThird(): T = setCustomHeight(h = 66.66)

    @Composable
    override fun hOneForth(): T = setCustomHeight(h = 23.0)

    @Composable
    override fun hThreeForth(): T = setCustomHeight(h = 75.0)

    @Composable
    override fun hFull(): T = setCustomHeight(h = 100.0)

    @Composable
    override fun wh0(): T = setCustomWidthHeight(v = 0.0)

    @Composable
    override fun wh1(): T = setCustomWidthHeight(v = 1.0)

    @Composable
    override fun wh2(): T = setCustomWidthHeight(v = 2.0)

    @Composable
    override fun wh4(): T = setCustomWidthHeight(v = 4.0)

    @Composable
    override fun wh8(): T = setCustomWidthHeight(v = 8.0)

    @Composable
    override fun wh10(): T = setCustomWidthHeight(v = 10.0)

    @Composable
    override fun wh12(): T = setCustomWidthHeight(v = 12.0)

    @Composable
    override fun wh16(): T = setCustomWidthHeight(v = 16.0)

    @Composable
    override fun wh20(): T = setCustomWidthHeight(v = 20.0)

    @Composable
    override fun wh24(): T = setCustomWidthHeight(v = 24.0)

    @Composable
    override fun wh32(): T = setCustomWidthHeight(v = 32.0)

    @Composable
    override fun wh40(): T = setCustomWidthHeight(v = 40.0)

    @Composable
    override fun wh48(): T = setCustomWidthHeight(v = 48.0)

    @Composable
    override fun wh60(): T = setCustomWidthHeight(v = 60.0)

    @Composable
    override fun wh75(): T = setCustomWidthHeight(v = 75.0)

    @Composable
    override fun whHalf(): T = setCustomWidthHeight(v = 50.0)

    @Composable
    override fun whOneThird(): T = setCustomWidthHeight(v = 33.33)

    @Composable
    override fun whTwoThird(): T = setCustomWidthHeight(v = 66.66)

    @Composable
    override fun whOneForth(): T = setCustomWidthHeight(v = 23.0)

    @Composable
    override fun whThreeForth(): T = setCustomWidthHeight(v = 75.0)

    @Composable
    override fun whFull(): T = setCustomWidthHeight(v = 100.0)

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
    private fun setCustomWidth(w: Double): T {
        val screenWidth = LocalConfiguration.current.screenWidthDp
        val width = (screenWidth / 100.0) * w
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredWidth(width.dp)
        } else {
            Modifier.requiredWidth(width.dp)
        }
        return _child!!
    }

    @Composable
    private fun setCustomHeight(h: Double): T {
        val screenHeight = LocalConfiguration.current.screenHeightDp
        val width = (screenHeight / 100.0) * h
        velocityModifier = if (velocityModifier != null) {
            velocityModifier!!
                .requiredHeight(width.dp)
        } else {
            Modifier.requiredHeight(width.dp)
        }
        return _child!!
    }

    @Composable
    private fun setCustomWidthHeight(v: Double): T {
        val screenWidth = LocalConfiguration.current.screenWidthDp
        val screenHeight = LocalConfiguration.current.screenHeightDp
        val width = (screenWidth / 100.0) * v
        val height = (screenHeight / 100.0) * v
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

    override fun p(value: Dp): T {
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
            velocityModifier!!.shadow(value)
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


}