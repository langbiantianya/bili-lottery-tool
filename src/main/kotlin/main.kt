import androidx.compose.desktop.Window
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import stochastic.Stochastic
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


fun main() = Window {
    val stochastic = Stochastic("BV1f64y1x7ZQ")
    var text by remember { mutableStateOf("Hello, World!") }
    var Gpage by remember { mutableStateOf(0) }
    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
//            stochastic.getCache()

        }) {
            Text(Gpage.toString())
        }
    }


}


