package util.serializationData.comment.data

import util.serializationData.comment.data.config.Config
import util.serializationData.comment.data.cursor.Cursor
import util.serializationData.comment.data.effects.Effects
import util.serializationData.comment.data.folder.Folder
import util.serializationData.comment.data.replies.Replies
import util.serializationData.comment.data.top.Top
import util.serializationData.comment.data.up_selection.Up_selection
import util.serializationData.comment.data.upper.Upper

data class Data(
    val cursor: Cursor,
    val hots: String?,
    val notice: String?,
    val replies: List<Replies>,
    val top: Top,
    val lottery_card: Unit?,
    val folder: Folder,
    val up_selection: Up_selection,
    val cm: Unit?,
    val effects: Effects,
    val assist: Int,
    val blacklist: Int,
    val vote: Int,
    val lottery: Int,
    val config: Config,
    val upper: Upper,
    val show_bvid: Boolean
)
