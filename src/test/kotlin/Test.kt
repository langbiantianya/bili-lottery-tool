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
import cache.Cache
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

import org.junit.Test
import stochastic.Stochastic

class Test {
    @Test
    fun test1() {
        val stochastic = Stochastic("BV1f64y1x7ZQ")
        runBlocking {
            stochastic.getCache()
        }

        println(Cache.cache.comments.size)

    }


}



