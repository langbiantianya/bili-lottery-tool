package serializationData.comment.data.replies

import serializationData.comment.data.folder.Folder
import serializationData.comment.data.replies.content.Content
import serializationData.comment.data.replies.member.Member
import serializationData.comment.data.replies.reply_control.Reply_control
import serializationData.comment.data.replies.up_action.Up_action

data class Replies(
    val rpid: Long,
    val oid: Int,
    val type: Int,
    val mid: Int,
    val root: Long,
    val parent: Long,
    val dialog: Long,
    val count: Int,
    val rcount: Int,
    val floor: Int,
    val state: Int,
    val fansgrade: Int,
    val attr: Int,
    val ctime: Int,
    val rpid_str: String,
    val root_str: String,
    val parent_str: String,
    val like: Int,
    val action: Int,
    val member: Member,
    val content: Content,
    val replies: List<Replies>?,
    val assist: Int,
    val folder: Folder,
    val up_action: Up_action,
    val show_follow: Boolean,
    val invisible: Boolean,
    val reply_control: Reply_control
)
