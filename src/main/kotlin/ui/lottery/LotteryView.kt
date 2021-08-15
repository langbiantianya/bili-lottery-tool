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
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import logic.stochastic.Stochastic
import ui.ViewEnumerate
import ui.common.AppTheme
import util.cache.UserInf

@Composable
fun LotteryView(view: MutableState<ViewEnumerate>, stochastic: Stochastic) {
    var people by remember { mutableStateOf("") }
    val page: MutableState<Int> = remember { mutableStateOf(0) }
    val result: MutableState<Set<UserInf>> = remember { mutableStateOf(emptySet()) }
    var buttonIsClick by remember { mutableStateOf(true) }
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
                enabled = buttonIsClick,
                onClick = {
                    stochastic.people = people.toInt()
                    buttonIsClick = false
//                    GlobalScope.launch
                    GlobalScope.launch {
                        println(people.toInt())
                        stochastic.getAllCache(page)
                        result.value = stochastic.numberOfJudgments()
                    }

                },
                modifier = Modifier
                    .padding(end = 50.dp)
            ) {
                Text("开始")
            }
        }
        Text("正在获取第${page.value}页评论")
        Column(
            modifier = Modifier
                .padding(top = 10.dp)
                .border(2.dp, Color.Black)
                .verticalScroll(rememberScrollState())
        ) {
            repeat(result.value.size) {
                SelectionContainer {
                    Row {
                        Text(
                            "UID: ${result.value.toList()[it].uID}",
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 2.dp, bottom = 2.dp)
                        )
                        Text(
                            "Name: ${result.value.toList()[it].uName}",
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 3.dp, bottom = 2.dp)
                        )
                    }

                }

            }
        }
    }

}