package util.serializationData.videoInf.data.stat

data class Stat(
    val aid: Int,
    val view: Int,
    val danmaku: Int,
    val reply: Int,
    val favorite: Int,
    val coin: Int,
    val share: Int,
    val now_rank: Int,
    val his_rank: Int,
    val like: Int,
    val dislike: Int,
    val evaluation: String,
    val argue_msg: String
)
