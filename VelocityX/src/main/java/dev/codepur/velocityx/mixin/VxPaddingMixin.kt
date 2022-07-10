package dev.codepur.velocityx.mixin

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

interface IVxPaddingMixin<T> {
    fun p(value: Dp): T
    fun p(value: PaddingValues): T
    fun px(value: Dp): T
    fun py(value: Dp): T
    fun pxy(value1: Dp, value2: Dp): T
    fun pLTRB(left: Dp, top: Dp, right: Dp, bottom: Dp): T
    fun pBaseline(top: Dp, bottom: Dp): T

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

}