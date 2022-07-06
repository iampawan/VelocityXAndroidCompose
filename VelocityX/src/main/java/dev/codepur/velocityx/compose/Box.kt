package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.codepur.velocityx.mixin.IVxAlignmentMixin
import dev.codepur.velocityx.mixin.IVxColorMixin
import dev.codepur.velocityx.mixin.VxAlignmentMixin
import dev.codepur.velocityx.mixin.VxColorMixin

open class VxBoxAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin<T>(),
    alignmentMixin: IVxAlignmentMixin<T> = VxAlignmentMixin<T>()
) :
    IVxColorMixin<T> by colorMixin, IVxAlignmentMixin<T> by alignmentMixin

class VxBox(
    private val children: @Composable BoxScope.() -> Unit,
) : VxBoxAddOn<VxBox>() {

    init {
        setChildToColor(this)
        setChildForAlignment(this)

    }
    
    @SuppressLint("ComposableNaming")
    @Composable
    fun make() {
        return Box(
            contentAlignment = velocityAlignment ?: Alignment.TopStart,
            modifier = velocityColor?.let {
                Modifier.background(
                    color = it
                )
            } ?: Modifier
        ) {
            children.invoke(this)
        }
    }


}

