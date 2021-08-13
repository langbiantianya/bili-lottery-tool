package ui.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import ui.ViewEnumerate
import ui.common.AppTheme


@Composable
fun WelcomeView(view: MutableState<ViewEnumerate>) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .clickable {
                view.value = ViewEnumerate.FrontPage
            }
//            .fillMaxSize()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(AppTheme.GirlPowders.background)
                .fillMaxHeight()
                .fillMaxHeight()
                .fillMaxSize()

        ) {
            Text(text = "欢迎使用", fontSize = 100.sp, color = AppTheme.GirlPowders.color)

        }
    }
}