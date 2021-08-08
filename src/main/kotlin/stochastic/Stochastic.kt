package stochastic

import cache.Cache
import cache.UserInf
import netWork.NetWork

class Stochastic(private val BVid: String, private var people: Int) {
    var userInfs: MutableList<UserInf> = mutableListOf()
    var page = 0
    lateinit var cache: Cache
    val result: MutableList<UserInf> = mutableListOf()

    suspend fun initStochastic() {
        getCache()
        NumberOfJudgments()
    }

    suspend fun getAllCache() {
        page = cache.page
        while (--page > 1) {
            cache.comments.add(NetWork.getComment(page, cache.oldID))
        }
    }

    suspend fun getCache() {
        cache = NetWork.firstConnect(BVid);
    }

    suspend fun NumberOfJudgments() {
        if (page < 20) {
            getAllCache()
            cache.comments.forEach { comment ->
                comment.data.replies?.forEach {
                    userInfs.add(UserInf(it.mid, it.member.uname))
                    userInfs = userInfs.toSet().toMutableList()
                }
            }
            while (people-- > 0) {
                result.add(userInfs.random())
            }

        } else {

        }
    }


}