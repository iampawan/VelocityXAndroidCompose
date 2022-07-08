package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.codepur.velocityx.VxWidgetBuilder
import dev.codepur.velocityx.mixin.*

open class VxBoxAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin(),
    alignmentMixin: IVxAlignmentMixin<T> = VxAlignmentMixin(),
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin(),

    ) :
    IVxColorMixin<T> by colorMixin, IVxAlignmentMixin<T> by alignmentMixin,
    IVxModifierMixin<T> by modifierMixin

class VxBox(
    private val children: @Composable BoxScope.() -> Unit,

    ) : VxWidgetBuilder, VxBoxAddOn<VxBox>() {

    init {
        setChildToColor(this)
        setChildForAlignment(this)
        setChildForModifier(this)

    }

    @SuppressLint("ComposableNaming")
    @Composable
    override fun make() {
        var currentModifier = velocityModifier ?: Modifier
        if (velocityColor != null) {
            currentModifier = currentModifier
                .background(color = velocityColor!!)

        }

        return Box(
            contentAlignment = velocityAlignment ?: Alignment.TopStart,
            modifier = currentModifier
        ) {
            children.invoke(this)

        }
    }


}

