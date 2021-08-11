package util.cache

import util.serializationData.comment.Comment
import util.serializationData.videoInf.VideoInf

data class Cache(val videInfo: VideoInf?, val comments: MutableList<Comment>, val page: Int, val oldID: Long) {
}