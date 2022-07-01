package dev.codepur.velocityx.compose

import androidx.compose.runtime.Composable

 interface VxWidgetBuilder<T> where  T : Composable{
    fun make(): T
}

interface VxWidgetContextBuilder<T> where  T : Composable{
    fun make(): T
}

//abstract class VxTextSpanBuilder<TextSpan> {
//    TextSpan make({Key? key});
//}