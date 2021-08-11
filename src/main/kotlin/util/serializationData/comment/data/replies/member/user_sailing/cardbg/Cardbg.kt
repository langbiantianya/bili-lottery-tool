package util.serializationData.comment.data.replies.member.user_sailing.cardbg

import util.serializationData.comment.data.replies.member.user_sailing.cardbg.fan.Fan

data class Cardbg(
    val id:Int,
    val name:String,
    val image:String,
    val jump_url:String,
    val fan:Fan,
    val type:String,
)
