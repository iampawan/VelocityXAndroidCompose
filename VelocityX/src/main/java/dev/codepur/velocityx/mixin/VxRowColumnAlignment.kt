package dev.codepur.velocityx.mixin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment

interface IVxRowColumnAlignmentMixin<T> {

    var horizontalArrangement: Arrangement.Horizontal?
    var verticalArrangement: Arrangement.Vertical?
    var verticalAlignment: Alignment.Vertical?
    var horizontalAlignment: Alignment.Horizontal?

    val arrangeStart: T
        get() = horizontalArrangement(value = Arrangement.Start)

    val arrangeEnd: T
        get() = horizontalArrangement(value = Arrangement.End)

    val arrangeCenter: T
        get() = horizontalArrangement(value = Arrangement.Center)

    val arrangeSpaceAround: T
        get() = horizontalArrangement(value = Arrangement.SpaceAround)

    val arrangeSpaceBetween: T
        get() = horizontalArrangement(value = Arrangement.SpaceBetween)

    val arrangeSpaceEvenly: T
        get() = horizontalArrangement(value = Arrangement.SpaceEvenly)

    val arrangeTop: T
        get() = verticalArrangement(value = Arrangement.Top)

    val arrangeBottom: T
        get() = verticalArrangement(value = Arrangement.Bottom)

    val alignTop: T
        get() = verticalAlignment(value = Alignment.Top)

    val alignCenterVertical: T
        get() = verticalAlignment(value = Alignment.CenterVertically)

    val alignBottom: T
        get() = verticalAlignment(value = Alignment.Bottom)

    val alignStart: T
        get() = horizontalAlignment(value = Alignment.Start)

    val alignCenterHorizontal: T
        get() = horizontalAlignment(value = Alignment.CenterHorizontally)

    val alignEnd: T
        get() = horizontalAlignment(value = Alignment.End)


    fun setChildForRowColumnAlignment(child: T)

    fun horizontalArrangement(value: Arrangement.Horizontal): T

    fun verticalArrangement(value: Arrangement.Vertical): T

    fun horizontalAlignment(value: Alignment.Horizontal): T

    fun verticalAlignment(value: Alignment.Vertical): T

}

class VxRowColumnAlignmentMixin<T> : IVxRowColumnAlignmentMixin<T> {
    private var _child: T? = null

    override var horizontalArrangement: Arrangement.Horizontal? = null
    override var verticalArrangement: Arrangement.Vertical? = null
    override var verticalAlignment: Alignment.Vertical? = null
    override var horizontalAlignment: Alignment.Horizontal? = null

    override fun setChildForRowColumnAlignment(child: T) {
        _child = child
    }

    override fun horizontalArrangement(value: Arrangement.Horizontal): T {
        horizontalArrangement = value
        return _child!!
    }

    override fun verticalArrangement(value: Arrangement.Vertical): T {
        verticalArrangement = value
        return _child!!
    }

    override fun horizontalAlignment(value: Alignment.Horizontal): T {
        horizontalAlignment = value
        return _child!!

    }

    override fun verticalAlignment(value: Alignment.Vertical): T {
        verticalAlignment = value
        return _child!!

    }


}
