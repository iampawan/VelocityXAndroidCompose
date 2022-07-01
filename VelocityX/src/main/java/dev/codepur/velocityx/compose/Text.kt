package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import dev.codepur.velocityx.Vx
import dev.codepur.velocityx.mixin.VxColorMixin


class VxText(private val text: String): VxColorMixin<VxText>() {

    init {
        setChildToColor(this)
    }

    private var  _text:String? = null
    private var _fontFamily: FontFamily? = null
    private var _scaleFactor: Double = 1.0
    private var _fontSize: Double? = null
    private var _letterSpacing: Double? = null
    private var _lineHeight: Double? = null
    private var _wordSpacing: Double? = null
    private var _maxLines: Int? = null
    private var _fontWeight: FontWeight? = null
    private var _textAlign: TextAlign? = null
    private var _overflow: TextOverflow? = null
    private var _fontStyle: FontStyle? = null
    private var _softWrap: Boolean = true
    private var _textStyle: TextStyle? = null
    private var _textDecoration: TextDecoration? = null


    /// The text to display.
    ///
    /// This will be null if a [textSpan] is provided instead.
    fun text(text: String): VxText {
        _text = text
        return this
    }

    /// Sets color of the text
    fun color(color: Color): VxText {
        velocityColor = color
        return this
    }

    /// Sets [color] of the text using Hex value
    fun hexColor(colorHex:String): VxText {
        velocityColor = Vx.hexToColor(colorHex);
        return this
    }

    fun maxLines(lines: Int): VxText {
        _maxLines = lines
        return this
    }

    /// Sets [textScaleFactor] to extra small i.e. 0.75
    val xs: VxText
        get() = fontSizedText(child = this, scaleFactor = 0.75)

    /// Sets [textScaleFactor] to small i.e. 0.875
    val sm: VxText
        get() = fontSizedText(child = this, scaleFactor = 0.875)

    /// Sets [textScaleFactor] to base i.e. 1 or default
    val base: VxText
        get() = fontSizedText(child = this, scaleFactor = 1.0)

    /// Sets [textScaleFactor] to large i.e. 1.125
    val lg: VxText
        get() = fontSizedText(child = this, scaleFactor = 1.125)

    /// Sets [textScaleFactor] to extra large i.e. 1.25
    val xl: VxText
    get() =  fontSizedText(child = this, scaleFactor = 1.25)

    /// Sets [textScaleFactor] to twice extra large i.e. 1.5
    val xl2: VxText
        get() = fontSizedText(child = this, scaleFactor = 1.5)

    /// Sets [textScaleFactor] to thrice large i.e. 1.875
    val xl3: VxText
        get() =  fontSizedText(child = this, scaleFactor = 1.875)

    /// Sets [textScaleFactor] to four times extra large i.e. 2.25
    val xl4: VxText
        get() =  fontSizedText(child = this, scaleFactor = 2.25)

    /// Sets [textScaleFactor] to five times extra large i.e. 3
    val xl5: VxText
        get() =  fontSizedText(child = this, scaleFactor = 3.0)

    /// Sets [textScaleFactor] to six times extra large i.e. 4
    val xl6: VxText
        get() =  fontSizedText(child = this, scaleFactor = 4.0)


    /// Sets [textScaleFactor] to custom value
    fun scale(value:Double):VxText =
    fontSizedText(child = this, scaleFactor=  value)
    /// To set fontSize of the text using [size]
    fun size(size:Double?):VxText {
        _fontSize = size
        return this
    }
    private fun fontSizedText(
        scaleFactor:Double, child: VxText) : VxText{
        _fontSize = (_fontSize?:14.0)*scaleFactor
        _scaleFactor = scaleFactor;
        return child;
    }

    // Give custom text alignment
    fun align(align:TextAlign):VxText {
        _textAlign = align
        return this
    }

    /// How the text should be aligned horizontally.
    ///
    /// To align text in [center]
    val center: VxText
        get() {
            _textAlign = TextAlign.Center
            return this
        }

    /// To align text in [start]
    val start: VxText
        get() {
            _textAlign = TextAlign.Start
            return this
        }

    /// To align text in [end]
    val end: VxText
        get() {
            _textAlign = TextAlign.End
            return this
        }

    /// To align text as [justify]
    val justify: VxText
        get() {
            _textAlign = TextAlign.Justify
            return this
        }

    /// Can be used to set overflow of a text.
    /// How visual overflow should be handled.
    fun overflow(overflow: TextOverflow): VxText {
        _overflow = overflow
        return this
    }

    /// To overflow text as [clip]
    val clip: VxText
        get() {
            _overflow = TextOverflow.Clip
            return this
        }

    /// To overflow text as [ellipsis]
    val ellipsis: VxText
        get() {
            _overflow = TextOverflow.Ellipsis
            return this
        }
    /// To overflow text as [visible]
    val visible: VxText
        get() {
            _overflow = TextOverflow.Visible
            return this
        }

    /// Set [FontWeight] for the text
    fun fontWeight(weight: FontWeight): VxText {
        _fontWeight = weight
        return this
    }

    /// Sets [FontWeight] to [FontWeight.w100]
    val hairLine: VxText
        get() =  fontWeightedText(weight = FontWeight.W100)

    /// Sets [FontWeight] to [FontWeight.w200]
    val thin: VxText
        get() =  fontWeightedText(weight = FontWeight.W200)

    /// Sets [FontWeight] to [FontWeight.w300]
    val light: VxText
        get() =  fontWeightedText(weight = FontWeight.W300)

    /// Sets [FontWeight] to [FontWeight.w400]
    val normal: VxText
        get() =  fontWeightedText(weight = FontWeight.W400)

    /// Sets [FontWeight] to [FontWeight.w500]
    val medium: VxText
        get() =  fontWeightedText(weight = FontWeight.W500)

    /// Sets [FontWeight] to [FontWeight.w600]
    val semiBold: VxText
        get() =  fontWeightedText(weight = FontWeight.W600)

    /// Sets [FontWeight] to [FontWeight.w700]
    val bold: VxText
        get() =  fontWeightedText(weight = FontWeight.W700)

    /// Sets [FontWeight] to [FontWeight.w800]
    val extraBold: VxText
        get() =  fontWeightedText(weight = FontWeight.W800)

    /// Sets [FontWeight] to [FontWeight.w900]
    val extraBlack: VxText
        get() =  fontWeightedText(weight = FontWeight.W900)

   private fun fontWeightedText(weight:FontWeight):VxText {
        _fontWeight = weight
        return this
    }

    /// Sets [letterSpacing] to -3.0
    val tightest : VxText
        get() = letterSpacing(-3.0)
    /// Sets [letterSpacing] to -2.0
    val tighter : VxText
        get() = letterSpacing(-2.0)
    /// Sets [letterSpacing] to -1.0
    val tight : VxText
        get() = letterSpacing(-1.0)
    /// Sets [letterSpacing] to 1.0
    val wide : VxText
        get() = letterSpacing(1.0)
    /// Sets [letterSpacing] to 2.0
    val wider : VxText
        get() = letterSpacing(2.0)
    /// Sets [letterSpacing] to 3.0
    val widest : VxText
        get() = letterSpacing(3.0)

    fun letterSpacing(spacing:Double):VxText {
        _letterSpacing = spacing
        return this
    }

    /// Sets [FontStyle] to [FontStyle.italic]
    val italic: VxText
        get() {
            _fontStyle = FontStyle.Italic
            return this
        }

    /// Sets [lineHeight] to 0.75
    val heightTight : VxText
    get() = lineHeight(0.75)

    /// Sets [lineHeight] to 0.875
    val heightSnug : VxText
        get() = lineHeight(0.875)

    /// Sets [lineHeight] to 1.25
    val heightRelaxed : VxText
        get() = lineHeight(1.25)

    /// Sets [lineHeight] to 1.5
    val heightLoose : VxText
        get() = lineHeight(1.5)

    /// Sets custom [lineHeight] with [val]
    fun lineHeight(height:Double):VxText {
        _lineHeight = height
        return this
    }

    /// Set [fontFamily] for the text
    fun fontFamily(family: FontFamily): VxText {
        _fontFamily = family
        return this
    }

    /// Whether the text should break at soft line breaks.
    ///
    /// If false, the glyphs in the text will be positioned as if there was
    /// unlimited horizontal space.
    fun softWrap(wrapValue: Boolean): VxText {
        _softWrap = wrapValue
        return this
    }

    /// Use textStyle to provide custom or any theme style.
    ///
    /// If the style's 'inherit' property is true, the style will be merged with
    /// the closest enclosing [DefaultTextStyle]. Otherwise, the style will
    /// replace the closest enclosing [DefaultTextStyle].
    fun textStyle(style: TextStyle):VxText {
        _textStyle = style;
        return this;
    }

    /// Sets [TextDecoration] as [TextDecoration.underline]
    val underline
        get() = decoration(TextDecoration.Underline)

    /// Sets [TextDecoration] as [TextDecoration.lineThrough]
    val lineThrough
        get() = decoration(TextDecoration.LineThrough)

    /// Sets [TextDecoration] as [TextDecoration.None]
    val noneDecoration
        get() = decoration(TextDecoration.None)

    ///Sets TextDecoration
    fun decoration(decorator: TextDecoration):VxText {
        _textDecoration = decorator;
        return this;
    }

    /// Converts the text to fully uppercase.
    val uppercase:VxText
    get() = setText(_text?.uppercase()!!)

    /// Converts the text to fully lowercase.
    val lowercase:VxText
        get() = setText(_text?.lowercase()!!)


    ///Modifies Text
    private fun setText(newText: String):VxText {
        _text = newText;
        return this;
    }


    @SuppressLint("ComposableNaming")
    @Composable
    fun make() {
        val currentContext = LocalTextStyle.current
        Text(
            text = text,
            color = velocityColor ?: currentContext.color,
            fontSize = _fontSize?.sp ?: currentContext.fontSize,
            fontWeight = _fontWeight ?: currentContext.fontWeight,
            textAlign = _textAlign ?: currentContext.textAlign,
            maxLines = _maxLines ?: Int.MAX_VALUE,
            letterSpacing = _letterSpacing?.sp ?: currentContext.letterSpacing,
            fontStyle = _fontStyle ?: currentContext.fontStyle,
            overflow = _overflow ?: TextOverflow.Clip,
            lineHeight = _lineHeight?.sp ?: currentContext.lineHeight,
            softWrap = _softWrap,
            fontFamily = _fontFamily?:currentContext.fontFamily,
            style = _textStyle?:TextStyle.Default,
            textDecoration = _textDecoration?:currentContext.textDecoration,

            )
    }



}

val String.text get() =  VxText(text = this)

