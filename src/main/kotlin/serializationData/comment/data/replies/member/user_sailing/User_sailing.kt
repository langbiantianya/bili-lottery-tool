package serializationData.comment.data.replies.member.user_sailing

import serializationData.comment.data.replies.member.user_sailing.cardbg.Cardbg
import serializationData.comment.data.replies.member.user_sailing.pendant.Pendant

data class User_sailing(
    val pendant: Pendant,
    val cardbg: Cardbg,
    val cardbg_with_focus: String?,
)