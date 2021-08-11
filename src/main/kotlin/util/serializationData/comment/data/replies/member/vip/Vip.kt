package util.serializationData.comment.data.replies.member.vip

data class Vip(
    val vipType: Int,
    val vipDueDate: Long,
    val dueRemark: String,
    val accessStatus: Int,
    val vipStatus: Int,
    val vipStatusWarn: String,
    val themeType: Int
)
