package dev.codepur.velocityx

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable

interface VxWidgetBuilder {

    @SuppressLint("ComposableNaming")
    @Composable
    fun make()
}

