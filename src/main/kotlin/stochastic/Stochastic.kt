package stochastic


import androidx.compose.runtime.*
import cache.Cache
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import netWork.NetWork

class Stochastic(private val BVid: String) {
    var Gpage = 0
    fun getCache() {
        GlobalScope.launch {
            NetWork.firstConnect(BVid).join();
            var page = Cache.cache.page
            while (--page > 1) {
                NetWork.getComment(page, Cache.cache.oldID).join()
                Gpage = page

            }
        }

    }


}