package dev.codepur.velocityx.mixin

import androidx.compose.ui.graphics.Color
import dev.codepur.velocityx.Vx


interface IVxColorMixin<T> {
    var velocityColor: Color?

    fun color(color: Color): T

    fun hexColor(colorHex: String): T

    fun setChildToColor(child: T)

    ///Transparent
    val transparent: T
        get() = color(color = Color.Transparent)

    val white: T
        get() = color(color = Color.White)

    ///Gray
    val gray50: T
        get() = color(color = Vx.gray50)
    val gray100: T
        get() = color(color = Vx.gray100)
    val gray200: T
        get() = color(color = Vx.gray200)
    val gray300: T
        get() = color(color = Vx.gray300)
    val gray400: T
        get() = color(color = Vx.gray400)
    val gray500: T
        get() = color(color = Vx.gray500)
    val gray600: T
        get() = color(color = Vx.gray600)
    val gray700: T
        get() = color(color = Vx.gray700)
    val gray800: T
        get() = color(color = Vx.gray800)
    val gray900: T
        get() = color(color = Vx.gray900)

    ///Slate
    val slate50: T
        get() = color(color = Vx.slate50)
    val slate100: T
        get() = color(color = Vx.slate100)
    val slate200: T
        get() = color(color = Vx.slate200)
    val slate300: T
        get() = color(color = Vx.slate300)
    val slate400: T
        get() = color(color = Vx.slate400)
    val slate500: T
        get() = color(color = Vx.slate500)
    val slate600: T
        get() = color(color = Vx.slate600)
    val slate700: T
        get() = color(color = Vx.slate700)
    val slate800: T
        get() = color(color = Vx.slate800)
    val slate900: T
        get() = color(color = Vx.slate900)

    ///Zinc
    val zinc50: T
        get() = color(color = Vx.zinc50)
    val zinc100: T
        get() = color(color = Vx.zinc100)
    val zinc200: T
        get() = color(color = Vx.zinc200)
    val zinc300: T
        get() = color(color = Vx.zinc300)
    val zinc400: T
        get() = color(color = Vx.zinc400)
    val zinc500: T
        get() = color(color = Vx.zinc500)
    val zinc600: T
        get() = color(color = Vx.zinc600)
    val zinc700: T
        get() = color(color = Vx.zinc700)
    val zinc800: T
        get() = color(color = Vx.zinc800)
    val zinc900: T
        get() = color(color = Vx.zinc900)

    ///Neutral
    val neutral50: T
        get() = color(color = Vx.neutral50)
    val neutral100: T
        get() = color(color = Vx.neutral100)
    val neutral200: T
        get() = color(color = Vx.neutral200)
    val neutral300: T
        get() = color(color = Vx.neutral300)
    val neutral400: T
        get() = color(color = Vx.neutral400)
    val neutral500: T
        get() = color(color = Vx.neutral500)
    val neutral600: T
        get() = color(color = Vx.neutral600)
    val neutral700: T
        get() = color(color = Vx.neutral700)
    val neutral800: T
        get() = color(color = Vx.neutral800)
    val neutral900: T
        get() = color(color = Vx.neutral900)

    ///Stone
    val stone50: T
        get() = color(color = Vx.stone50)
    val stone100: T
        get() = color(color = Vx.stone100)
    val stone200: T
        get() = color(color = Vx.stone200)
    val stone300: T
        get() = color(color = Vx.stone300)
    val stone400: T
        get() = color(color = Vx.stone400)
    val stone500: T
        get() = color(color = Vx.stone500)
    val stone600: T
        get() = color(color = Vx.stone600)
    val stone700: T
        get() = color(color = Vx.stone700)
    val stone800: T
        get() = color(color = Vx.stone800)
    val stone900: T
        get() = color(color = Vx.stone900)

    ///Red
    val red50: T
        get() = color(color = Vx.red50)
    val red100: T
        get() = color(color = Vx.red100)
    val red200: T
        get() = color(color = Vx.red200)
    val red300: T
        get() = color(color = Vx.red300)
    val red400: T
        get() = color(color = Vx.red400)
    val red500: T
        get() = color(color = Vx.red500)
    val red600: T
        get() = color(color = Vx.red600)
    val red700: T
        get() = color(color = Vx.red700)
    val red800: T
        get() = color(color = Vx.red800)
    val red900: T
        get() = color(color = Vx.red900)

    ///Orange
    val orange50: T
        get() = color(color = Vx.orange50)
    val orange100: T
        get() = color(color = Vx.orange100)
    val orange200: T
        get() = color(color = Vx.orange200)
    val orange300: T
        get() = color(color = Vx.orange300)
    val orange400: T
        get() = color(color = Vx.orange400)
    val orange500: T
        get() = color(color = Vx.orange500)
    val orange600: T
        get() = color(color = Vx.orange600)
    val orange700: T
        get() = color(color = Vx.orange700)
    val orange800: T
        get() = color(color = Vx.orange800)
    val orange900: T
        get() = color(color = Vx.orange900)

    ///Amber
    val amber50: T
        get() = color(color = Vx.amber50)
    val amber100: T
        get() = color(color = Vx.amber100)
    val amber200: T
        get() = color(color = Vx.amber200)
    val amber300: T
        get() = color(color = Vx.amber300)
    val amber400: T
        get() = color(color = Vx.amber400)
    val amber500: T
        get() = color(color = Vx.amber500)
    val amber600: T
        get() = color(color = Vx.amber600)
    val amber700: T
        get() = color(color = Vx.amber700)
    val amber800: T
        get() = color(color = Vx.amber800)
    val amber900: T
        get() = color(color = Vx.amber900)

    ///Yellow
    val yellow50: T
        get() = color(color = Vx.yellow50)
    val yellow100: T
        get() = color(color = Vx.yellow100)
    val yellow200: T
        get() = color(color = Vx.yellow200)
    val yellow300: T
        get() = color(color = Vx.yellow300)
    val yellow400: T
        get() = color(color = Vx.yellow400)
    val yellow500: T
        get() = color(color = Vx.yellow500)
    val yellow600: T
        get() = color(color = Vx.yellow600)
    val yellow700: T
        get() = color(color = Vx.yellow700)
    val yellow800: T
        get() = color(color = Vx.yellow800)
    val yellow900: T
        get() = color(color = Vx.yellow900)

    ///Lime
    val lime50: T
        get() = color(color = Vx.lime50)
    val lime100: T
        get() = color(color = Vx.lime100)
    val lime200: T
        get() = color(color = Vx.lime200)
    val lime300: T
        get() = color(color = Vx.lime300)
    val lime400: T
        get() = color(color = Vx.lime400)
    val lime500: T
        get() = color(color = Vx.lime500)
    val lime600: T
        get() = color(color = Vx.lime600)
    val lime700: T
        get() = color(color = Vx.lime700)
    val lime800: T
        get() = color(color = Vx.lime800)
    val lime900: T
        get() = color(color = Vx.lime900)

    ///Green
    val green50: T
        get() = color(color = Vx.green50)
    val green100: T
        get() = color(color = Vx.green100)
    val green200: T
        get() = color(color = Vx.green200)
    val green300: T
        get() = color(color = Vx.green300)
    val green400: T
        get() = color(color = Vx.green400)
    val green500: T
        get() = color(color = Vx.green500)
    val green600: T
        get() = color(color = Vx.green600)
    val green700: T
        get() = color(color = Vx.green700)
    val green800: T
        get() = color(color = Vx.green800)
    val green900: T
        get() = color(color = Vx.green900)

    ///Emerald
    val emerald50: T
        get() = color(color = Vx.emerald50)
    val emerald100: T
        get() = color(color = Vx.emerald100)
    val emerald200: T
        get() = color(color = Vx.emerald200)
    val emerald300: T
        get() = color(color = Vx.emerald300)
    val emerald400: T
        get() = color(color = Vx.emerald400)
    val emerald500: T
        get() = color(color = Vx.emerald500)
    val emerald600: T
        get() = color(color = Vx.emerald600)
    val emerald700: T
        get() = color(color = Vx.emerald700)
    val emerald800: T
        get() = color(color = Vx.emerald800)
    val emerald900: T
        get() = color(color = Vx.emerald900)

    ///teal
    val teal50: T
        get() = color(color = Vx.teal50)
    val teal100: T
        get() = color(color = Vx.teal100)
    val teal200: T
        get() = color(color = Vx.teal200)
    val teal300: T
        get() = color(color = Vx.teal300)
    val teal400: T
        get() = color(color = Vx.teal400)
    val teal500: T
        get() = color(color = Vx.teal500)
    val teal600: T
        get() = color(color = Vx.teal600)
    val teal700: T
        get() = color(color = Vx.teal700)
    val teal800: T
        get() = color(color = Vx.teal800)
    val teal900: T
        get() = color(color = Vx.teal900)

    ///Cyan
    val cyan50: T
        get() = color(color = Vx.cyan50)
    val cyan100: T
        get() = color(color = Vx.cyan100)
    val cyan200: T
        get() = color(color = Vx.cyan200)
    val cyan300: T
        get() = color(color = Vx.cyan300)
    val cyan400: T
        get() = color(color = Vx.cyan400)
    val cyan500: T
        get() = color(color = Vx.cyan500)
    val cyan600: T
        get() = color(color = Vx.cyan600)
    val cyan700: T
        get() = color(color = Vx.cyan700)
    val cyan800: T
        get() = color(color = Vx.cyan800)
    val cyan900: T
        get() = color(color = Vx.cyan900)

    ///Sky
    val sky50: T
        get() = color(color = Vx.sky50)
    val sky100: T
        get() = color(color = Vx.sky100)
    val sky200: T
        get() = color(color = Vx.sky200)
    val sky300: T
        get() = color(color = Vx.sky300)
    val sky400: T
        get() = color(color = Vx.sky400)
    val sky500: T
        get() = color(color = Vx.sky500)
    val sky600: T
        get() = color(color = Vx.sky600)
    val sky700: T
        get() = color(color = Vx.sky700)
    val sky800: T
        get() = color(color = Vx.sky800)
    val sky900: T
        get() = color(color = Vx.sky900)

    ///Blue
    val blue50: T
        get() = color(color = Vx.blue50)
    val blue100: T
        get() = color(color = Vx.blue100)
    val blue200: T
        get() = color(color = Vx.blue200)
    val blue300: T
        get() = color(color = Vx.blue300)
    val blue400: T
        get() = color(color = Vx.blue400)
    val blue500: T
        get() = color(color = Vx.blue500)
    val blue600: T
        get() = color(color = Vx.blue600)
    val blue700: T
        get() = color(color = Vx.blue700)
    val blue800: T
        get() = color(color = Vx.blue800)
    val blue900: T
        get() = color(color = Vx.blue900)

    ///Indigo
    val indigo50: T
        get() = color(color = Vx.indigo50)
    val indigo100: T
        get() = color(color = Vx.indigo100)
    val indigo200: T
        get() = color(color = Vx.indigo200)
    val indigo300: T
        get() = color(color = Vx.indigo300)
    val indigo400: T
        get() = color(color = Vx.indigo400)
    val indigo500: T
        get() = color(color = Vx.indigo500)
    val indigo600: T
        get() = color(color = Vx.indigo600)
    val indigo700: T
        get() = color(color = Vx.indigo700)
    val indigo800: T
        get() = color(color = Vx.indigo800)
    val indigo900: T
        get() = color(color = Vx.indigo900)

    ///Violet
    val violet50: T
        get() = color(color = Vx.violet50)
    val violet100: T
        get() = color(color = Vx.violet100)
    val violet200: T
        get() = color(color = Vx.violet200)
    val violet300: T
        get() = color(color = Vx.violet300)
    val violet400: T
        get() = color(color = Vx.violet400)
    val violet500: T
        get() = color(color = Vx.violet500)
    val violet600: T
        get() = color(color = Vx.violet600)
    val violet700: T
        get() = color(color = Vx.violet700)
    val violet800: T
        get() = color(color = Vx.violet800)
    val violet900: T
        get() = color(color = Vx.violet900)

    ///Purple
    val purple50: T
        get() = color(color = Vx.purple50)
    val purple100: T
        get() = color(color = Vx.purple100)
    val purple200: T
        get() = color(color = Vx.purple200)
    val purple300: T
        get() = color(color = Vx.purple300)
    val purple400: T
        get() = color(color = Vx.purple400)
    val purple500: T
        get() = color(color = Vx.purple500)
    val purple600: T
        get() = color(color = Vx.purple600)
    val purple700: T
        get() = color(color = Vx.purple700)
    val purple800: T
        get() = color(color = Vx.purple800)
    val purple900: T
        get() = color(color = Vx.purple900)

    ///Fuchsia
    val fuchsia50: T
        get() = color(color = Vx.fuchsia50)
    val fuchsia100: T
        get() = color(color = Vx.fuchsia100)
    val fuchsia200: T
        get() = color(color = Vx.fuchsia200)
    val fuchsia300: T
        get() = color(color = Vx.fuchsia300)
    val fuchsia400: T
        get() = color(color = Vx.fuchsia400)
    val fuchsia500: T
        get() = color(color = Vx.fuchsia500)
    val fuchsia600: T
        get() = color(color = Vx.fuchsia600)
    val fuchsia700: T
        get() = color(color = Vx.fuchsia700)
    val fuchsia800: T
        get() = color(color = Vx.fuchsia800)
    val fuchsia900: T
        get() = color(color = Vx.fuchsia900)

    ///Pink
    val pink50: T
        get() = color(color = Vx.pink50)
    val pink100: T
        get() = color(color = Vx.pink100)
    val pink200: T
        get() = color(color = Vx.pink200)
    val pink300: T
        get() = color(color = Vx.pink300)
    val pink400: T
        get() = color(color = Vx.pink400)
    val pink500: T
        get() = color(color = Vx.pink500)
    val pink600: T
        get() = color(color = Vx.pink600)
    val pink700: T
        get() = color(color = Vx.pink700)
    val pink800: T
        get() = color(color = Vx.pink800)
    val pink900: T
        get() = color(color = Vx.pink900)

    ///Rose
    val rose50: T
        get() = color(color = Vx.rose50)
    val rose100: T
        get() = color(color = Vx.rose100)
    val rose200: T
        get() = color(color = Vx.rose200)
    val rose300: T
        get() = color(color = Vx.rose300)
    val rose400: T
        get() = color(color = Vx.rose400)
    val rose500: T
        get() = color(color = Vx.rose500)
    val rose600: T
        get() = color(color = Vx.rose600)
    val rose700: T
        get() = color(color = Vx.rose700)
    val rose800: T
        get() = color(color = Vx.rose800)
    val rose900: T
        get() = color(color = Vx.rose900)


}

class VxColorMixin<T> : IVxColorMixin<T> {
    private var _childToColor: T? = null
    override var velocityColor: Color? = null

    override fun setChildToColor(child: T) {
        _childToColor = child
    }

    /// Sets [color] of the text using Hex value
    override fun hexColor(colorHex: String): T {
        velocityColor = Vx.hexToColor(colorHex)
        return _childToColor!!
    }

    /// Sets [color] of the text
    override fun color(color: Color): T {
        velocityColor = color
        return _childToColor!!
    }
}
