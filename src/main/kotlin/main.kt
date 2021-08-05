import androidx.compose.desktop.Window
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.*
import serializationData.comment.Comment
import serializationData.videoInf.VideoInf


//fun main() = Window {
//    var text by remember { mutableStateOf("Hello, World!") }
//    MaterialTheme {
//        Button(onClick = {
//            text = "Hello, Desktop!"
//            GlobalScope.launch {
//                job()
//            }
//        }) {
//            Text(text)
//        }
//    }
//
//}

suspend fun job() = coroutineScope {
    launch {
        val client = HttpClient() {
            install(JsonFeature) {
                serializer = GsonSerializer()
            }
        }
//        val customer: serializationData.Customer = client.get("http://127.0.0.1:8080/customer")

//https://api.bilibili.com/x/v2/reply/main?next=1&type=1&oid=762045509
        val customer: VideoInf =
            client.get("https://api.bilibili.com/x/web-interface/view?bvid=BV1f64y1x7ZQ") { contentType(ContentType.Application.Json) }
        println(customer)
        val customer2: Comment =
            client.get("https://api.bilibili.com/x/v2/reply/main?next=1&type=1&oid=762045509") { contentType(ContentType.Application.Json) }
        println(customer2)
        client.close()
    }


}
