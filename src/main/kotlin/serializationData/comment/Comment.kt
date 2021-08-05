package serializationData.comment

import serializationData.comment.data.Data

data class Comment(
    val code: Int,
    val message: String,
    val ttl: Int,
    val data: Data
)
