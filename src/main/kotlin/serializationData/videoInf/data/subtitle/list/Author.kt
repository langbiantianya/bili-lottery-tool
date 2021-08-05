package serializationData.videoInf.data.subtitle.list

data class Author(
    val mid: Int,
    val name: String,
    val sex: String,
    val face: String,
    val sign: String,
    val rank: Int,
    val birthday: Int,
    val is_fake_account: Int,
    val is_deleted: Int
)
