package dev.codepur.velocityx.mixin

import androidx.compose.ui.Alignment

interface IVxAlignmentMixin<T> {

    var velocityAlignment: Alignment?

    val alignTopCenter: T
        get() = addAlignment(alignment = Alignment.TopCenter)

    val alignTopLeft: T
        get() = addAlignment(alignment = Alignment.TopStart)

    val alignTopRight: T
        get() = addAlignment(alignment = Alignment.TopEnd)

    val alignCenter: T
        get() = addAlignment(alignment = Alignment.Center)

    val alignCenterLeft: T
        get() = addAlignment(alignment = Alignment.CenterStart)

    val alignCenterRight: T
        get() = addAlignment(alignment = Alignment.CenterEnd)

    val alignBottomCenter: T
        get() = addAlignment(alignment = Alignment.BottomCenter)

    val alignBottomLeft: T
        get() = addAlignment(alignment = Alignment.BottomStart)

    val alignBottomRight: T
        get() = addAlignment(alignment = Alignment.BottomEnd)

    fun setChildForAlignment(child: T)

    fun addAlignment(alignment: Alignment): T

    fun alignment(value: Alignment): T?

}

class VxAlignmentMixin<T> : IVxAlignmentMixin<T> {
    private var _child: T? = null

    override var velocityAlignment: Alignment? = null

    override fun setChildForAlignment(child: T) {
        _child = child
    }

    override fun addAlignment(alignment: Alignment): T {
        velocityAlignment = alignment
        return _child!!

    }

    override fun alignment(value: Alignment): T? {
        velocityAlignment = value
        return _child
    }


}
