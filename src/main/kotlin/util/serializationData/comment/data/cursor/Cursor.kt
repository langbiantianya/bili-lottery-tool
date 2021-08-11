package util.serializationData.comment.data.cursor


data class Cursor(
    val all_count: Int,
    val is_begin: Boolean,
    val prev: Int,
    val next: Int,
    val is_end: Boolean,
    val mode: Int,
    val show_type: Int,
    val support_mode: List<Int>,
    val name: String
)
