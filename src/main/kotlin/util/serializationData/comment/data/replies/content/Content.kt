package util.serializationData.comment.data.replies.content

data class Content(
    val message: String,
    val plat: Int,
    val device: String,
    val members: List<Unit?>,
    val jump_url: Unit?,
    val max_line: Int
)
