package dev.codepur.velocityx.mixin

import androidx.compose.ui.geometry.Offset
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

