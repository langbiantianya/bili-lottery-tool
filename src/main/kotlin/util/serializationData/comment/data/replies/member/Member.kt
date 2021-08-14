package util.serializationData.comment.data.replies.member

import util.serializationData.comment.data.replies.member.fans_detail.Fans_detail
import util.serializationData.comment.data.replies.member.level_info.Level_info
import util.serializationData.comment.data.replies.member.nameplate.Nameplate
import util.serializationData.comment.data.replies.member.official_verify.Official_verify
import util.serializationData.comment.data.replies.member.pendant.Pendant
import util.serializationData.comment.data.replies.member.user_sailing.User_sailing
import util.serializationData.comment.data.replies.member.vip.Vip

data class Member(
    val mid: String,
    val uname: String,
    val sex: String,
    val sign: String,
    val avatar: String,
    val rank: String,
    val DisplayRank: String,
    val level_info: Level_info,
    val pendant: Pendant,
    val nameplate: Nameplate,
    val official_verify: Official_verify,
    val vip: Vip,
    val fans_detail: Fans_detail?,
    val following: Int,
    val is_followed: Int,
    val user_sailing: User_sailing,
    val is_contractor:Boolean
)
