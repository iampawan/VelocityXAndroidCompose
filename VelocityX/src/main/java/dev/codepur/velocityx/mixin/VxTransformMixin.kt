package dev.codepur.velocityx.mixin

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale

interface IVxTransformMixin<T> {
    fun rotate(degrees: Float): T
    fun scale(x: Float, y: Float): T
    fun scale(scale: Float): T

    /// Rotation
    val rotate0: T
        get() = rotate(0f)
    val rotate15: T
        get() = rotate(15f)
    val rotateN15: T
        get() = rotate(-15f)
    val rotate30: T
        get() = rotate(30f)
    val rotateN30: T
        get() = rotate(-30f)
    val rotate45: T
        get() = rotate(45f)
    val rotateN45: T
        get() = rotate(-45f)
    val rotate60: T
        get() = rotate(60f)
    val rotateN60: T
        get() = rotate(-60f)
    val rotate75: T
        get() = rotate(75f)
    val rotateN75: T
        get() = rotate(-75f)
    val rotate90: T
        get() = rotate(90f)
    val rotateN90: T
        get() = rotate(-90f)
    val rotate120: T
        get() = rotate(120f)
    val rotateN120: T
        get() = rotate(-120f)
    val rotate180: T
        get() = rotate(180f)
    val rotateN180: T
        get() = rotate(-180f)
    val rotate270: T
        get() = rotate(270f)
    val rotateN270: T
        get() = rotate(-270f)


    /// Scaling
    val scale0: T
        get() = scale(0f, y = 0f)
    val scale50: T
        get() = scale(0.5f, y = 0.5f)
    val scale100: T
        get() = scale(1f, y = 1f)
    val scale150: T
        get() = scale(1.5f, y = 1.5f)
    val scale200: T
        get() = scale(2f, y = 2f)
    val scaleN200: T
        get() = scale(-2f, y = -2f)
}

class VxTransformMixin<T>(private var vxModifierMixin: VxModifierMixin<T>, private val _child: T?) :
    IVxTransformMixin<T> {

    override fun rotate(degrees: Float): T {
        vxModifierMixin.velocityModifier = if (vxModifierMixin.velocityModifier != null) {
            vxModifierMixin.velocityModifier!!.rotate(degrees = degrees)
        } else {
            Modifier.rotate(degrees = degrees)
        }

        return _child!!
    }

    override fun scale(x: Float, y: Float): T {
        vxModifierMixin.velocityModifier = if (vxModifierMixin.velocityModifier != null) {
            vxModifierMixin.velocityModifier!!.scale(scaleX = x, scaleY = y)
        } else {
            Modifier.scale(scaleX = x, scaleY = y)
        }

        return _child!!
    }

    override fun scale(scale: Float): T {
        vxModifierMixin.velocityModifier = if (vxModifierMixin.velocityModifier != null) {
            vxModifierMixin.velocityModifier!!.scale(scale)
        } else {
            Modifier.scale(scale)
        }

        return _child!!
    }
}