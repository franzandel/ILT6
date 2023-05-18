package com.franzandel.ilt6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.franzandel.ilt6.ui.theme.ILT6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ILT6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
//                    PaddingFirstThenClickableText()
//                    ClickableFirstThenPaddingText()
//                    SurviveConfigurationChanges()
//                    IntegersScreen((1..100).shuffled())
//                    NavigationComponent()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(
    name = "Single Preview",
    group = "Greeting",
    showBackground = true,
    widthDp = 200,
    heightDp = 300
)
@Preview(
    name = "Full Device Preview",
    group = "Greeting",
    device = Devices.PIXEL_3A,
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    ILT6Theme {
        Greeting("Android")
    }
}
