package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.codepur.velocityx.mixin.IVxModifierMixin
import dev.codepur.velocityx.mixin.VxModifierMixin

open class VxSpacerAddOn<T>(
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin()
) :
    IVxModifierMixin<T> by modifierMixin

class VxSpacer : VxSpacerAddOn<VxSpacer>() {

    init {
        setChildForModifier(this)

    }

    @SuppressLint("ComposableNaming")
    @Composable
    fun make() {
        val currentModifier = velocityModifier ?: Modifier
        return Spacer(modifier = currentModifier)
    }


}

