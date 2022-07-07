package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import dev.codepur.velocityx.mixin.*

open class VxCardAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin(),
    alignmentMixin: IVxAlignmentMixin<T> = VxAlignmentMixin(),
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin()
) :
    IVxColorMixin<T> by colorMixin, IVxAlignmentMixin<T> by alignmentMixin,
    IVxModifierMixin<T> by modifierMixin

class VxCard(
    private val enabled: Boolean = true,
    private val shape: Shape = RoundedCornerShape(12.dp),
    private val stroke: BorderStroke? = null,
    private var elevation: CardElevation? = null,
    private var colors: CardColors? = null,
    private val onClick: () -> Unit = {},
    private val children: @Composable ColumnScope.() -> Unit,


    ) : VxCardAddOn<VxCard>() {

    init {
        setChildToColor(this)
        setChildForAlignment(this)
        setChildForModifier(this)

    }

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("ComposableNaming")
    @Composable
    fun make() {
        if (colors == null) {
            colors = CardDefaults.cardColors()
        }
        var currentModifier = velocityModifier ?: Modifier
        if (velocityColor != null) {
            colors = CardDefaults.cardColors(containerColor = velocityColor!!)

        }

        if (elevation == null) {
            elevation = CardDefaults.cardElevation()
        }
        val interactionSource = remember { MutableInteractionSource() }
        return Surface(
            onClick = onClick,
            modifier = currentModifier,
            enabled = enabled,
            shape = shape,
            color = colors!!.containerColor(enabled).value,
            contentColor = colors!!.contentColor(enabled).value,
            tonalElevation = elevation!!.tonalElevation(enabled, interactionSource).value,
            shadowElevation = elevation!!.shadowElevation(enabled, interactionSource).value,
            border = stroke,
            interactionSource = interactionSource,

            ) {
            Column(content = children)

        }
    }


}

