package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.codepur.velocityx.mixin.*


open class VxColumnAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin(),
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin(),
    rowColumnAlignmentMixin: IVxRowColumnAlignmentMixin<T> = VxRowColumnAlignmentMixin(),
) :
    IVxColorMixin<T> by colorMixin,
    IVxModifierMixin<T> by modifierMixin,
    IVxRowColumnAlignmentMixin<T> by rowColumnAlignmentMixin

class VxColumn(
    private val children: @Composable ColumnScope.() -> Unit

) : VxColumnAddOn<VxColumn>() {

    init {
        setChildToColor(this)
        setChildForModifier(this)
        setChildForRowColumnAlignment(this)

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
            verticalArrangement = verticalArrangement ?: Arrangement.Top,
            horizontalAlignment = horizontalAlignment ?: Alignment.Start,
            modifier = currentModifier,
        ) {
            children.invoke(this)

        }
    }


}

