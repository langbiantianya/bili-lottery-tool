package ui.frontPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.common.AppTheme

@Composable
fun FrontPage() {
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
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("BV号 如\"BV14q4y1p7Ka\"") },
                maxLines = 1,
            )
            Button(
                onClick = {
                    println(text)
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
