package util.serializationData.videoInf.data.pages

import util.serializationData.videoInf.data.dimension.Dimension

data class Pages(
    val cid: Int,
    val page: Int,
    val from: String,
    val part: String,
    val duration: Int,
    val vid: String,
    val weblink: String,
    val dimension: Dimension
)
