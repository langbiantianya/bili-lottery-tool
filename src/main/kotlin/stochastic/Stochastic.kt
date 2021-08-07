package stochastic

import cache.Cache
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import netWork.NetWork

class Stochastic(private val BVid: String) {
    var isStop = false
    var gpage = 0

    suspend fun getCache() {
        NetWork.firstConnect(BVid).join();
        var page = Cache.cache.page
        while (--page > 1) {
            NetWork.getComment(page, Cache.cache.oldID).join()
            gpage = page
        }
        isStop = true

    }


}