package dev.codepur.velocityx.mixin

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode

interface IVxGradientMixin<T> {
    fun linearGradient(
        colorStops: Array<Pair<Float, Color>>? = null,
        colors: List<Color>? = null,
        start: Offset = Offset.Zero,
        end: Offset = Offset.Infinite,
        tileMode: TileMode = TileMode.Clamp
    ): T

    fun radialGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        center: Offset,
        radius: Float,
        tileMode: TileMode
    ): T

    fun sweepGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        center: Offset,
    ): T

}

class VxGradientMixin<T>(private var vxModifierMixin: VxModifierMixin<T>, private var _child: T?) :
    IVxGradientMixin<T> {
    override fun linearGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        start: Offset,
        end: Offset,
        tileMode: TileMode
    ): T {
        vxModifierMixin.velocityModifier = if (vxModifierMixin.velocityModifier != null) {
            if (colorStops != null) {
                vxModifierMixin.velocityModifier!!.background(
                    brush = Brush.linearGradient(
                        colorStops = colorStops,
                        start = start,
                        end = end,
                        tileMode = tileMode,

                        )
                )
            } else {
                vxModifierMixin.velocityModifier!!.background(
                    brush = Brush.linearGradient(
                        colors = colors!!,
                        start = start,
                        end = end,
                        tileMode = tileMode

                    )
                )
            }

        } else {
            if (colorStops != null) {
                Modifier.background(
                    brush = Brush.linearGradient(
                        colorStops = colorStops,
                        start = start,
                        end = end,
                        tileMode = tileMode

                    )
                )
            } else {
                Modifier.background(
                    brush = Brush.linearGradient(
                        colors = colors!!,
                        start = start,
                        end = end,
                        tileMode = tileMode
                    )
                )
            }
        }

        return _child!!
    }

    override fun radialGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        center: Offset,
        radius: Float,
        tileMode: TileMode
    ): T {
        vxModifierMixin.velocityModifier = if (vxModifierMixin.velocityModifier != null) {
            if (colorStops != null) {
                vxModifierMixin.velocityModifier!!.background(
                    brush = Brush.radialGradient(
                        colorStops = colorStops,
                        center = center,
                        radius = radius,
                        tileMode = tileMode

                    )
                )
            } else {
                vxModifierMixin.velocityModifier!!.background(
                    brush = Brush.radialGradient(
                        colors = colors!!, radius = radius, center = center, tileMode = tileMode

                    )
                )
            }

        } else {
            if (colorStops != null) {
                Modifier.background(
                    brush = Brush.radialGradient(
                        colorStops = colorStops,
                        center = center,
                        radius = radius,
                        tileMode = tileMode
                    )
                )
            } else {
                Modifier.background(
                    brush = Brush.radialGradient(
                        colors = colors!!, radius = radius, center = center, tileMode = tileMode
                    )
                )
            }
        }

        return _child!!
    }

    override fun sweepGradient(
        colorStops: Array<Pair<Float, Color>>?,
        colors: List<Color>?,
        center: Offset
    ): T {
        vxModifierMixin.velocityModifier = if (vxModifierMixin.velocityModifier != null) {
            if (colorStops != null) {
                vxModifierMixin.velocityModifier!!.background(
                    brush = Brush.sweepGradient(colorStops = colorStops, center = center)
                )
            } else {
                vxModifierMixin.velocityModifier!!.background(
                    brush = Brush.sweepGradient(colors = colors!!, center = center)
                )
            }

        } else {
            if (colorStops != null) {
                Modifier.background(
                    brush = Brush.sweepGradient(colorStops = colorStops, center = center)
                )
            } else {
                Modifier.background(
                    brush = Brush.sweepGradient(colors = colors!!, center = center)
                )
            }
        }

        return _child!!
    }

}