package ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import kotlinx.coroutines.*
import logic.stochastic.Stochastic
import ui.common.AppTheme
import ui.bvidPage.BvidView
import ui.result.LotteryView
import ui.welcome.WelcomeView

@Composable
fun MainView() {
    val viewPage: MutableState<ViewEnumerate> = remember { mutableStateOf(ViewEnumerate.WelcomeView) }
    val bvid: MutableState<String> = remember { mutableStateOf("") }
    val isContinue: MutableState<Boolean> = remember { mutableStateOf(true) }
    val stochastic = Stochastic();
    val tipsText: MutableState<String> = remember { mutableStateOf("") }

    MaterialTheme(colors = AppTheme.GirlPowders.material) {

        when (viewPage.value) {
            ViewEnumerate.WelcomeView -> {
                WelcomeView(viewPage)
            }
            ViewEnumerate.FrontPage -> {
                BvidView(viewPage, bvid)
//                println(bvid.value)
            }
            ViewEnumerate.Lottery -> {
                stochastic.BVid = bvid.value
                runBlocking {
                    launch { stochastic.getCache(isContinue, tipsText) }
                }
                if (isContinue.value) {
                    LotteryView(viewPage, stochastic)
                } else {
                    Text(tipsText.value)
                }

            }
        }


    }


}




