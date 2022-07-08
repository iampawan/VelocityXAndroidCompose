package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.codepur.velocityx.VxWidgetBuilder
import dev.codepur.velocityx.mixin.IVxModifierMixin
import dev.codepur.velocityx.mixin.VxModifierMixin

open class VxSpacerAddOn<T>(
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin()
) :
    IVxModifierMixin<T> by modifierMixin

class VxSpacer : VxWidgetBuilder, VxSpacerAddOn<VxSpacer>() {

    init {
        setChildForModifier(this)

    }

    @SuppressLint("ComposableNaming")
    @Composable
    override fun make() {
        val currentModifier = velocityModifier ?: Modifier
        return Spacer(modifier = currentModifier)
    }


}

@Composable
fun WidthBox(width: Number) {
    VxSpacer().forcedWidth(width.toDouble().dp).make()
}

@Composable
fun WidthPCTBox(width: Number) {
    VxSpacer().wPCT(width.toDouble()).make()
}

@Composable
fun HeightBox(height: Number) {
    VxSpacer().forcedHeight(height.toDouble().dp).make()
}

@Composable
fun HeightPCTBox(height: Number) {
    VxSpacer().hPCT(height.toDouble()).make()
}

@Composable
fun SquareBox(size: Number) {
    VxSpacer().forcedWidth(size.toDouble().dp).forcedHeight(size.toDouble().dp).make()
}


