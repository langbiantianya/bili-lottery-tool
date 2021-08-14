package ui.result

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import logic.stochastic.Stochastic
import ui.ViewEnumerate
import ui.common.AppTheme

@Composable
fun LotteryView(view: MutableState<ViewEnumerate>, stochastic: Stochastic) {
    var people by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.GirlPowders.background)
            .border(1.dp, Color.Black)

    ) {
        Text("${stochastic.cache.videInfo.data.title}", fontSize = 40.sp, modifier = Modifier.padding(top = 10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp, top = 20.dp, end = 100.dp, bottom = 20.dp)
                .border(1.dp, Color.Black)
        ) {

            OutlinedTextField(
                value = people,
                onValueChange = { people = it },
                label = { Text("抽奖人数") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Button(
                onClick = {
                    println(people.toInt())
                },
                modifier = Modifier
                    .padding(end = 50.dp)
            ) {
                Text("按钮")
            }
        }
        Text("正在获取xxx")
        Column(
            modifier = Modifier
                .padding(top = 10.dp)
                .border(2.dp, Color.Black)
                .verticalScroll(rememberScrollState())
        ) {

            repeat(10) {
                SelectionContainer {
                    Row {
                        Text(
                            "UID: $it",
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 2.dp, bottom = 2.dp)
                        )
                        Text(
                            "Name: $it",
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 3.dp, bottom = 2.dp)
                        )
                    }

                }

            }
        }
    }

}