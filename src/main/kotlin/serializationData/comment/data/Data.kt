package serializationData.comment.data

import serializationData.comment.data.config.Config
import serializationData.comment.data.cursor.Cursor
import serializationData.comment.data.effects.Effects
import serializationData.comment.data.folder.Folder
import serializationData.comment.data.replies.Replies
import serializationData.comment.data.top.Top
import serializationData.comment.data.up_selection.Up_selection
import serializationData.comment.data.upper.Upper

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
