package util.serializationData.comment.data.replies.member.user_sailing

import util.serializationData.comment.data.replies.member.user_sailing.cardbg.Cardbg
import util.serializationData.comment.data.replies.member.user_sailing.cardbg_with_focus.Cardbg_with_focus
import util.serializationData.comment.data.replies.member.user_sailing.pendant.Pendant

data class User_sailing(
    val pendant: Pendant,
    val cardbg: Cardbg,
    val cardbg_with_focus: Cardbg_with_focus,
)