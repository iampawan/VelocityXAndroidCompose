package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.codepur.velocityx.mixin.IVxColorMixin
import dev.codepur.velocityx.mixin.IVxModifierMixin
import dev.codepur.velocityx.mixin.VxColorMixin
import dev.codepur.velocityx.mixin.VxModifierMixin


open class VxRowAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin(),
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin()
) :
    IVxColorMixin<T> by colorMixin,
    IVxModifierMixin<T> by modifierMixin

class HStack(
    private val horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    private val verticalAlignment: Alignment.Vertical = Alignment.Top,
    private val children: @Composable RowScope.() -> Unit

) : VxRowAddOn<HStack>() {

    init {
        setChildToColor(this)
        setChildForModifier(this)

    }

    @SuppressLint("ComposableNaming")
    @Composable
    fun make() {
        var currentModifier = velocityModifier ?: Modifier
        if (velocityColor != null) {
            currentModifier = currentModifier
                .background(color = velocityColor!!)

        }
        return Row(
            verticalAlignment = verticalAlignment,
            horizontalArrangement = horizontalArrangement,
            modifier = currentModifier,
        ) {
            children.invoke(this)

        }
    }


}

