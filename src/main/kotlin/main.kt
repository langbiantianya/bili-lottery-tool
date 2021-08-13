import androidx.compose.desktop.Window
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.*
import logic.stochastic.Stochastic
import ui.MainView
import ui.frontPage.FrontPage


fun main() = Window(
    title = "哔哩哔哩视频评论抽奖工具"
) {
//    var text by remember { mutableStateOf("") }
    MainView()
//    val stochastic = Stochastic("BV1f64y1x7ZQ", 3)
//    var text by remember { mutableStateOf("Hello, World!") }
//    var Gpage by remember { mutableStateOf(0) }
//    suspend fun job() = coroutineScope {
//        launch { stochastic.initStochastic() }
//    }
//    MaterialTheme {
//        Button(onClick = {
//            text = "Hello, Desktop!"
////            logic.stochastic.getCache()
////            GlobalScope.launch {
////                logic.stochastic.getAllCache()
////                while (logic.stochastic.isStop) {
////                    Gpage = logic.stochastic.gpage
////                }
////
////            }
//            GlobalScope.launch {
//                job().job
//            }
//        }) {
//            Text(Gpage.toString())
//        }
//}


}


