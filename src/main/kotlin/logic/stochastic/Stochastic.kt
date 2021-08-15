package logic.stochastic

import androidx.compose.runtime.MutableState
import kotlinx.coroutines.delay
import util.cache.Cache
import util.cache.UserInf
import util.netWork.NetWork

class Stochastic() {
    var BVid: String = ""
    var people: Int = 1
    var userInfs: MutableList<UserInf> = mutableListOf()

    @Volatile
    var page = 2

    @Volatile
    lateinit var cache: Cache
    val result: MutableSet<UserInf> = mutableSetOf()


    suspend fun getAllCache(mPage: MutableState<Int>) {
        println(1)
        println(cache.comments.last().data.cursor.is_end)
        while (!cache.comments.last().data.cursor.is_end) {
            delay((1000L..3000L).random())
            cache.comments.add(NetWork.getComment(page++, cache.oldID))
            mPage.value = page
            println(page)
        }
        page -= 2

    }

    suspend fun getCache(isContinue: MutableState<Boolean>, tipsText: MutableState<String>, count: Int = 1) {
        try {
            tipsText.value = "正在获取数据，请稍后。"
            cache = NetWork.firstConnect(BVid);
            isContinue.value = true
        } catch (e: Exception) {
            e.printStackTrace()
            isContinue.value = false
            var c = count
            if (++c < 3) {
                tipsText.value = "网络错误，正在尝试${count}次。"
                delay((1000L..3000L).random())
                getCache(isContinue, tipsText, c)
            } else {
                tipsText.value = "重试${count}次失败，请检查你的网络连接！"
            }
        }

    }

    fun numberOfJudgments(): MutableSet<UserInf> {
//        if (page < 20) {
//        getAllCache()
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
//                randomNumber.add((1..util.cache.comments[0].data.cursor.all_count).random())
//            }
//            println(randomNumber)
//            randomNumber.forEach {
//                val npage = if (it % 20 == 0) it / 20 else it / 20 + 1
//                val num = if (it % 20 == 0) 20 else it % 20
//                val comment = NetWork.getComment(npage, util.cache.oldID)
//                println(num)
//                println(comment.data.replies)
//                comment.data.replies[num - 1]
//                    .let { it2 -> result.add(it2?.let { it1 -> UserInf(it1.mid, it1.member.uname) }) }
//            }
//
//        }
        return result
    }


}