package ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import ui.common.AppTheme
import ui.frontPage.FrontPage
import ui.result.Result
import ui.welcome.WelcomeView

@Composable
fun MainView() {
    MaterialTheme(colors = AppTheme.GirlPowders.material) {
//        WelcomeView()
//        FrontPage()
        Result()
    }
}