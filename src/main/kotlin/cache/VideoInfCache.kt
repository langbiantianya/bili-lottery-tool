package cache

import serializationData.videoInf.VideoInf

data class VideoInfCache(var videoInf: VideoInf?) {
    companion object {
        val videoInfCache: VideoInfCache = VideoInfCache(null)
    }
}
