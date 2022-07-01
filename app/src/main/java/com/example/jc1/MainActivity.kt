package com.example.jc1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.jc1.ui.theme.JC1Theme
import com.example.jc1.ui.theme.rose100
import dev.codepur.velocityx.Vx
import dev.codepur.velocityx.compose.VxText
import dev.codepur.velocityx.compose.text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    "Hello Android".text.red500.center.bold.xl5.make()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC1Theme {
        Greeting("Android")
    }
}