package dev.codepur.velocityx.mixin

import androidx.compose.ui.Alignment

interface IVxAlignmentMixin<T> {

    var velocityAlignment: Alignment?

    val alignTopCenter: T
        get() = alignment(alignment = Alignment.TopCenter)

    val alignTopLeft: T
        get() = alignment(alignment = Alignment.TopStart)

    val alignTopRight: T
        get() = alignment(alignment = Alignment.TopEnd)

    val alignCenter: T
        get() = alignment(alignment = Alignment.Center)

    val alignCenterLeft: T
        get() = alignment(alignment = Alignment.CenterStart)

    val alignCenterRight: T
        get() = alignment(alignment = Alignment.CenterEnd)

    val alignBottomCenter: T
        get() = alignment(alignment = Alignment.BottomCenter)

    val alignBottomLeft: T
        get() = alignment(alignment = Alignment.BottomStart)

    val alignBottomRight: T
        get() = alignment(alignment = Alignment.BottomEnd)

    fun setChildForAlignment(child: T)

    fun alignment(alignment: Alignment): T

}

class VxAlignmentMixin<T> : IVxAlignmentMixin<T> {
    private var _child: T? = null

    override var velocityAlignment: Alignment? = null

    override fun setChildForAlignment(child: T) {
        _child = child
    }

    override fun alignment(alignment: Alignment): T {
        velocityAlignment = alignment
        return _child!!

    }


}
