package dev.codepur.velocityx.mixin

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

interface IVxSizeMixin<T> {
    fun width(value: Dp): T
    fun size(value: Dp): T
    fun size(width: Dp, height: Dp): T
    fun sizeIn(minWidth: Dp, maxWidth: Dp, minHeight: Dp, maxHeight: Dp): T
    fun aspectRatio(ratio: Float, matchHeightConstraintsFirst: Boolean = false): T
    fun offset(x: Dp, y: Dp): T

    fun fillMaxWidth(fraction: Float): T
    fun fillMaxHeight(fraction: Float): T
    fun fillMaxSize(fraction: Float): T

    @Composable
    fun square(size: Dp): T

    @Composable
    fun wPCT(w: Number): T

    @Composable
    fun hPCT(h: Number): T

    @Composable
    fun whPCT(v: Number): T

    @Composable
    fun forcedWidth(width: Dp): T

    @Composable
    fun forcedHeight(height: Dp): T

    @Composable
    fun w0(): T = wPCT(w = 0.0)

    @Composable
    fun w1(): T = wPCT(w = 1.0)

    @Composable
    fun w2(): T = wPCT(w = 2.0)

    @Composable
    fun w4(): T = wPCT(w = 4.0)

    @Composable
    fun w8(): T = wPCT(w = 8.0)

    @Composable
    fun w10(): T = wPCT(w = 10.0)

    @Composable
    fun w12(): T = wPCT(w = 12.0)

    @Composable
    fun w16(): T = wPCT(w = 16.0)

    @Composable
    fun w20(): T = wPCT(w = 20.0)

    @Composable
    fun w24(): T = wPCT(w = 24.0)

    @Composable
    fun w32(): T = wPCT(w = 32.0)

    @Composable
    fun w40(): T = wPCT(w = 40.0)

    @Composable
    fun w48(): T = wPCT(w = 48.0)

    @Composable
    fun w60(): T = wPCT(w = 60.0)

    @Composable
    fun w75(): T = wPCT(w = 75.0)

    @Composable
    fun wHalf(): T = wPCT(w = 50.0)

    @Composable
    fun wOneThird(): T = wPCT(w = 33.33)

    @Composable
    fun wTwoThird(): T = wPCT(w = 66.66)

    @Composable
    fun wOneForth(): T = wPCT(w = 23.0)

    @Composable
    fun wThreeForth(): T = wPCT(w = 75.0)

    @Composable
    fun wFull(): T = wPCT(w = 100.0)


    @Composable
    fun h0(): T = hPCT(h = 0.0)

    @Composable
    fun h1(): T = hPCT(h = 1.0)

    @Composable
    fun h2(): T = hPCT(h = 2.0)

    @Composable
    fun h4(): T = hPCT(h = 4.0)

    @Composable
    fun h8(): T = hPCT(h = 8.0)

    @Composable
    fun h10(): T = hPCT(h = 10.0)

    @Composable
    fun h12(): T = hPCT(h = 12.0)

    @Composable
    fun h16(): T = hPCT(h = 16.0)

    @Composable
    fun h20(): T = hPCT(h = 20.0)

    @Composable
    fun h24(): T = hPCT(h = 24.0)

    @Composable
    fun h32(): T = hPCT(h = 32.0)

    @Composable
    fun h40(): T = hPCT(h = 40.0)

    @Composable
    fun h48(): T = hPCT(h = 48.0)

    @Composable
    fun h60(): T = hPCT(h = 60.0)

    @Composable
    fun h75(): T = hPCT(h = 75.0)

    @Composable
    fun hHalf(): T = hPCT(h = 50.0)

    @Composable
    fun hOneThird(): T = hPCT(h = 33.33)

    @Composable
    fun hThoThird(): T = hPCT(h = 66.66)

    @Composable
    fun hOneForth(): T = hPCT(h = 23.0)

    @Composable
    fun hThreeForth(): T = hPCT(h = 75.0)

    @Composable
    fun hFull(): T = hPCT(h = 100.0)

    @Composable
    fun wh0(): T = whPCT(v = 0.0)

    @Composable
    fun wh1(): T = whPCT(v = 1.0)

    @Composable
    fun wh2(): T = whPCT(v = 2.0)

    @Composable
    fun wh4(): T = whPCT(v = 4.0)

    @Composable
    fun wh8(): T = whPCT(v = 8.0)

    @Composable
    fun wh10(): T = whPCT(v = 10.0)

    @Composable
    fun wh12(): T = whPCT(v = 12.0)

    @Composable
    fun wh16(): T = whPCT(v = 16.0)

    @Composable
    fun wh20(): T = whPCT(v = 20.0)

    @Composable
    fun wh24(): T = whPCT(v = 24.0)

    @Composable
    fun wh32(): T = whPCT(v = 32.0)

    @Composable
    fun wh40(): T = whPCT(v = 40.0)

    @Composable
    fun wh48(): T = whPCT(v = 48.0)

    @Composable
    fun wh60(): T = whPCT(v = 60.0)

    @Composable
    fun wh75(): T = whPCT(v = 75.0)

    @Composable
    fun whHalf(): T = whPCT(v = 50.0)

    @Composable
    fun whOneThird(): T = whPCT(v = 33.33)

    @Composable
    fun whTwoThird(): T = whPCT(v = 66.66)

    @Composable
    fun whOneForth(): T = whPCT(v = 23.0)

    @Composable
    fun whThreeForth(): T = whPCT(v = 75.0)

    @Composable
    fun whFull(): T = whPCT(v = 100.0)
}