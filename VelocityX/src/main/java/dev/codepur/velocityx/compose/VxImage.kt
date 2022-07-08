import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import dev.codepur.velocityx.VxWidgetBuilder
import dev.codepur.velocityx.mixin.*

open class VxImageAddOn<T>(
    colorMixin: IVxColorMixin<T> = VxColorMixin(),
    alignmentMixin: IVxAlignmentMixin<T> = VxAlignmentMixin(),
    modifierMixin: IVxModifierMixin<T> = VxModifierMixin()
) :
    IVxColorMixin<T> by colorMixin, IVxAlignmentMixin<T> by alignmentMixin,
    IVxModifierMixin<T> by modifierMixin

class VxImage(private val resId: Int) : VxWidgetBuilder, VxImageAddOn<VxImage>() {
    init {
        setChildToColor(this)
        setChildForAlignment(this)
        setChildForModifier(this)

    }

    private var content: String? = null
    private var alpha: Float = DefaultAlpha
    private var contentScale: ContentScale = ContentScale.Fit
    private var velocityColorFilter: ColorFilter? = null

    fun description(value: String): VxImage {
        content = value
        return this
    }

    fun alpha(value: Float): VxImage {
        alpha = value
        return this
    }

    fun colorFilter(value: ColorFilter?): VxImage {
        velocityColorFilter = value
        return this
    }

    val fit: VxImage
        get() {
            contentScale = ContentScale.Fit
            return this
        }

    val crop: VxImage
        get() {
            contentScale = ContentScale.Crop
            return this
        }

    val fill: VxImage
        get() {
            contentScale = ContentScale.FillBounds
            return this
        }

    val fillWidth: VxImage
        get() {
            contentScale = ContentScale.FillWidth
            return this
        }

    val fillHeight: VxImage
        get() {
            contentScale = ContentScale.FillHeight
            return this
        }

    val fitInside: VxImage
        get() {
            contentScale = ContentScale.Inside
            return this
        }

    val none: VxImage
        get() {
            contentScale = ContentScale.None
            return this
        }


    @SuppressLint("ComposableNaming")
    @Composable
    override fun make() {
        var currentModifier = velocityModifier ?: Modifier
        if (velocityColor != null) {
            currentModifier = currentModifier
                .background(color = velocityColor!!)

        }
        Image(
            painter = painterResource(id = resId),
            contentDescription = content ?: "",
            alignment = velocityAlignment ?: Alignment.Center,
            modifier = currentModifier,
            contentScale = contentScale,
            alpha = alpha,
            colorFilter = velocityColorFilter
        )
    }


}