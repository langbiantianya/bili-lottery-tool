package stochastic

import cache.Cache
import cache.UserInf
import netWork.NetWork
import serializationData.videoInf.VideoInf

class Stochastic(private val BVid: String) {
    var userInf: UserInf = UserInf(mutableListOf())
    var page = 0
    lateinit var cache: Cache


    suspend fun getAllCache() {
        page = Cache.cache.page
        while (--page > 1) {
            NetWork.getComment(page, Cache.cache.oldID)
        }
    }

    suspend fun getCache() {
        cache = NetWork.firstConnect(BVid);
    }

    suspend fun NumberOfJudgments() {
        if (page < 20) {
            getAllCache()
            Cache.cache.comments.forEach { comment ->
                comment.data.replies?.forEach {
                    userInf.uIDs.add(it.mid)
                    userInf = UserInf(userInf.uIDs.toSet().toMutableList())
                }
            }
        } else {

        }
    }


}