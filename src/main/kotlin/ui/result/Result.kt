package ui.result

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.common.AppTheme

@Composable
fun Result() {
    var text by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.GirlPowders.background)
            .border(1.dp, Color.Black)

    ) {
        Text("VideoTitle", fontSize = 40.sp, modifier = Modifier.padding(top = 10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp, top = 20.dp, end = 100.dp, bottom = 20.dp)
                .border(1.dp, Color.Black)
        ) {

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("抽奖人数") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(end = 50.dp)
            ) {
                Text("按钮")
            }
        }
    }

}