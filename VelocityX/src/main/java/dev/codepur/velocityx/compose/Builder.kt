package dev.codepur.velocityx.compose

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable

interface VxWidgetBuilder {

    @SuppressLint("ComposableNaming")
    @Composable
    fun make()
}

