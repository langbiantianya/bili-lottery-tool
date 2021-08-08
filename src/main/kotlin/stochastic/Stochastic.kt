package stochastic

import cache.Cache
import cache.UserInf
import kotlinx.coroutines.delay
import netWork.NetWork

class Stochastic(private val BVid: String, private var people: Int) {
    var userInfs: MutableList<UserInf> = mutableListOf()

    @Volatile
    var page = 2
    lateinit var cache: Cache
    val result: MutableSet<UserInf> = mutableSetOf()

    suspend fun initStochastic() {
        getCache()
        numberOfJudgments()
        println(result)
        println(page)
    }

    private suspend fun getAllCache() {
        while (!cache.comments.last().data.cursor.is_end) {
            cache.comments.add(NetWork.getComment(page++, cache.oldID))
        }
        page -= 2

    }

    private suspend fun getCache() {
        cache = NetWork.firstConnect(BVid);
    }

    private suspend fun numberOfJudgments() {
//        if (page < 20) {
        getAllCache()
        cache.comments.forEach { comment ->
            comment.data.replies?.forEach {
                userInfs.add(UserInf(it.mid, it.member.uname))
                userInfs = userInfs.toSet().toMutableList()
            }
        }
        while (result.size < people) {
            result.add(userInfs.random())
        }

//        }
//        else {
//            val randomNumber: MutableSet<Int> = mutableSetOf()
//
//            while (randomNumber.size < people) {
//                randomNumber.add((1..cache.comments[0].data.cursor.all_count).random())
//            }
//            println(randomNumber)
//            randomNumber.forEach {
//                val npage = if (it % 20 == 0) it / 20 else it / 20 + 1
//                val num = if (it % 20 == 0) 20 else it % 20
//                val comment = NetWork.getComment(npage, cache.oldID)
//                println(num)
//                println(comment.data.replies)
//                comment.data.replies[num - 1]
//                    .let { it2 -> result.add(it2?.let { it1 -> UserInf(it1.mid, it1.member.uname) }) }
//            }
//
//        }
    }


}