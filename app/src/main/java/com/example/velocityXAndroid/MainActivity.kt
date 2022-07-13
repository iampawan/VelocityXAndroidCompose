package com.example.velocityXAndroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.velocityXAndroid.ui.theme.VxTheme
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
                    VelocityXDemo()
//                    BoxExample()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VelocityXDemo() {
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { "VelocityX Example".text.semiBold.make() },
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                "Click Here".text.p16.make()
            }
        },
        content = { pad ->
            VxColumn {
                "VxText Example".text.blue800.bold.xl2.make()
                HeightBox(20)
                VxBox {
                    "VxBox Example".text.white.bold.p16.xl2.make()
                }.blue800.wFull().p16.rounded.make()
                HeightBox(20)
                VxImage(R.drawable.flpy).fit.roundedLg.make()
                HeightBox(20)
                VxRow {
                    "VxRow Example".text.white.bold.p16.xl2.make()
                    WidthBox(20)
                    VxImage(R.drawable.flpy).fit.rounded.make()
                }.blue800.rounded.make()
                HeightBox(20)
                VxCard {
                    "VxCard Example".text.blue800.bold.xl.p20.make()
                }.make()

            }.p(pad).p16.make()
        },

        )


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VxTheme {
        VelocityXDemo()
    }
}
