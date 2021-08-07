package netWork

import cache.Cache
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import serializationData.comment.Comment
import serializationData.videoInf.VideoInf

object NetWork {
    private val commentUrlBase: String = "https://api.bilibili.com/x/v2/reply/main?type=1"
    suspend fun firstConnect(BVid: String) = coroutineScope {
        launch {
            val client = HttpClient() {
                install(JsonFeature) {
                    serializer = GsonSerializer()
                }
            }
            val videoInf: VideoInf =
                client.get("https://api.bilibili.com/x/web-interface/view?bvid=$BVid") { contentType(ContentType.Application.Json) }
//            println(customer)
            var oldID = videoInf.data.aid;
//            println(oldID)

            val comment: Comment =
                client.get("$commentUrlBase&next=1&oid=${oldID}") {
                    contentType(
                        ContentType.Application.Json
                    )
                }
//            println(customer2)
//            println(customer2.data.cursor.all_count)
            client.close()

            Cache.cache.apply {
                videInfo = videoInf
                comments.add(comment)
                page =
                    if (comment.data.cursor.all_count % 20 == 0) comment.data.cursor.all_count / 20 else comment.data.cursor.all_count / 20 + 1
                oldID = oldID
            }
//            println(Cache.cache.page)
        }
    }

    suspend fun getComment(page: Int, oldID: Long) = coroutineScope {
        launch {
            val client = HttpClient() {
                install(JsonFeature) {
                    serializer = GsonSerializer()
                }
            }
            val comment: Comment =
                client.get("$commentUrlBase&next=$page&oid=${oldID}") {
                    contentType(
                        ContentType.Application.Json
                    )
                }
            Cache.cache.comments.add(comment)
            client.close()
            delay(1000L)
        }
    }
}