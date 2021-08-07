package cache

import serializationData.comment.Comment
import serializationData.videoInf.VideoInf

data class Cache(var videInfo: VideoInf?, val comments: MutableList<Comment>, var page: Int,var oldID:Long) {
    companion object {
        final val cache = Cache(null, mutableListOf(), 1,1)
    }
}