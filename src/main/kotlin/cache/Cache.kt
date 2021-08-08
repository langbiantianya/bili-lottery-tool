package cache

import serializationData.comment.Comment
import serializationData.videoInf.VideoInf

data class Cache(val videInfo: VideoInf?, val comments: MutableList<Comment>, val page: Int,val oldID:Long) {
    companion object {
        final val cache = Cache(null, mutableListOf(), 1,1)
    }
}