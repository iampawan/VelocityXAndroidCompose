package dev.codepur.velocityx

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import dev.codepur.velocityx.compose.text
import org.junit.Rule
import org.junit.Test

class VxTextTest {

    @get:Rule
    val composeTestRule = createComposeRule()
    // use createAndroidComposeRule<YourActivity>() if you need access to
    // an activity

    @Test
    fun myTest() {
        // Start the app
        composeTestRule.setContent {
            vxTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                ) {
                    greeting("Android")
                }
            }
        }
        composeTestRule.onNodeWithText("Hello Android")
            .assertIsDisplayed()
    }


    @Composable
    fun greeting(name: String) {
        "Hello $name".text.center.make()
    }
}