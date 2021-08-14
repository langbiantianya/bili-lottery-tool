package ui.bvidPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.ViewEnumerate
import ui.common.AppTheme

@Composable
fun BvidView(viewEnumerate: MutableState<ViewEnumerate>) {
    var text by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
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
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("BV号 如\"BV14q4y1p7Ka\"") },
                maxLines = 1,
            )
            Button(
                onClick = {
                    println(text)
                    viewEnumerate.value = ViewEnumerate.Lottery
                },
                modifier = Modifier
                    .height(53.dp)
                    .padding(start = 20.dp)

            ) {
                Text(
                    "确定",
//                    color = Color.Gray
                )
            }
        }
    }
}
