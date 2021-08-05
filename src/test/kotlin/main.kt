import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


fun main() = Window("nmsl") {
    val type = remember { mutableStateOf(false) }
    Column(Modifier.fillMaxSize(), Arrangement.spacedBy(5.dp)) {
        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {
                type.value = !type.value
            }
        ) {
            Text("切换")
        }
        if (type.value) {
            ss()
        }
    }


}
@Composable
fun ss() {
    val count = remember { mutableStateOf(0) }

    Column(Modifier.fillMaxSize(), Arrangement.spacedBy(5.dp)) {
        Button(modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {
                count.value++
            }) {
            Text(if (count.value == 0) "Hello World" else "Clicked ${count.value}!")
        }
        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {
                count.value = 0
            },
            enabled = false
        ) {
            Text("Reset")
        }
        Text(
            text = if (count.value == 0) "Hello World" else "Clicked ${count.value}!",
            modifier = Modifier.height(20.dp).padding(5.dp),
            color = Color.Blue,
            fontSize = 20.sp,
            lineHeight = 20.sp
        )
//        OutlinedTextField(
//            value = if (count.value == 0) "Hello World" else "Clicked ${count.value}!",
//            onValueChange = { count.value }
//        )
    }
}

