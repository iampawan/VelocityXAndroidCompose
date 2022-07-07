package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.codepur.velocityx.mixin.IVxColorMixin
import dev.codepur.velocityx.mixin.IVxModifierMixin
import dev.codepur.velocityx.mixin.VxColorMixin
import dev.codepur.velocityx.mixin.VxModifierMixin


open class VxColumnAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin(),
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin()
) :
    IVxColorMixin<T> by colorMixin,
    IVxModifierMixin<T> by modifierMixin

class VxColumn(
    private val horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    private val verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    private val children: @Composable ColumnScope.() -> Unit

) : VxColumnAddOn<VxColumn>() {

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
        return Column(
            verticalArrangement = verticalArrangement,
            horizontalAlignment = horizontalAlignment,
            modifier = currentModifier,
        ) {
            children.invoke(this)

        }
    }


}

