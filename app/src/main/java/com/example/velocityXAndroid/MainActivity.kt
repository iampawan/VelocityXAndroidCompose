package com.example.velocityXAndroid

import VxImage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.velocityXAndroid.ui.theme.VxTheme
import dev.codepur.velocityx.Vx
import dev.codepur.velocityx.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    Greeting(name = "PK")
//                    BoxExample()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    VxColumn {
        VxCard {
            VxBox(
                children = {
                    "Hello $name".text.white.center.xl3.italic.make()
                },
            ).linearGradient(
                colors = listOf(Vx.amber100, Vx.cyan500)
            ).alignCenter.p12.square(size = Vx.dp(100))
                .border(color = Vx.white).make()
        }.blue300.p16.make()

        WidthBox(20)
        VxImage(R.drawable.flpy).crop.circle.size(200.dp).make()
    }.arrangeSpaceAround.alignCenterVertical.linearGradient(
        colors = listOf(
            Vx.amber100,
            Vx.cyan500
        )
    ).make()

}

@Composable
fun BoxExample() {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.background(Color.Blue)
    ) {
        Text(
            "Hello Pawan",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
//    Box(Modifier.fillMaxSize()) {
//        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
//        Box(
//            Modifier
//                .align(Alignment.TopCenter)
//                .fillMaxHeight()
//                .width(
//                    50.dp
//                )
//                .background(Color.Blue)
//        )
//        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
//        FloatingActionButton(
//            modifier = Modifier
//                .align(Alignment.BottomEnd)
//                .padding(12.dp),
//            onClick = {}
//        ) {
//            Text("+")
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VxTheme {
        Greeting("Android")
    }
}
