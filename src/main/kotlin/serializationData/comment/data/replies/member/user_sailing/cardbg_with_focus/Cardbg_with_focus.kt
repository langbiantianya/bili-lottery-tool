package serializationData.comment.data.replies.member.user_sailing.cardbg_with_focus

import serializationData.comment.data.replies.member.user_sailing.cardbg.fan.Fan

data class Cardbg_with_focus(
    val id: Int,
    val name: String,
    val image: String,
    val jump_url: String,
    val fan: Fan,
    val type: String
)
