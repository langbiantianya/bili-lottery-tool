package ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*

import ui.common.AppTheme
import ui.bvidPage.BvidView
import ui.result.LotteryView
import ui.welcome.WelcomeView

@Composable
fun MainView() {
    val viewPage: MutableState<ViewEnumerate> = remember { mutableStateOf(ViewEnumerate.WelcomeView) }
    MaterialTheme(colors = AppTheme.GirlPowders.material) {

        when (viewPage.value) {
            ViewEnumerate.WelcomeView -> {
                WelcomeView(viewPage)
            }
            ViewEnumerate.FrontPage -> {
                BvidView(viewPage)
            }
            ViewEnumerate.Result -> {
                LotteryView(viewPage)
            }
        }


    }


}




