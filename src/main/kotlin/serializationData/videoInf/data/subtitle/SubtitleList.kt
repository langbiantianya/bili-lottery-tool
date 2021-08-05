package serializationData.videoInf.data.subtitle

import serializationData.videoInf.data.subtitle.list.Author

data class SubtitleList(
    val id: Long,
    val lan:String,
    val lan_doc:String,
    val is_lock:Boolean,
    val subtitle_url:String,
    val author: Author
)
