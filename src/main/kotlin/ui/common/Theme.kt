package ui.common

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle

object AppTheme {
    val colors: Colors = Colors()
    val GirlPowders: GirlPowder = GirlPowder()

    class Colors(
        val backgroundDark: Color = Color(0xFF2B2B2B),
        val backgroundMedium: Color = Color(0xFF3C3F41),
        val backgroundLight: Color = Color(0xFF4E5254),

        val material: androidx.compose.material.Colors = darkColors(
            background = backgroundDark,
            surface = backgroundMedium,
            primary = Color.White
        ),
    )

    class GirlPowder(
        val background: Color = Color(0xfffdd3e1),
        val color: Color = Color.White,
        val material: androidx.compose.material.Colors = lightColors(
            background = background,
            primary = Color.White,
//            surface = Color.Blue,
            onPrimary = Color.Gray,
//            primaryVariant = Color.Red
//            onBackground = Color.Green

        )
    )
}