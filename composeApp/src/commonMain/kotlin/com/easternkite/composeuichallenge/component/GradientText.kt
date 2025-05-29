package com.easternkite.composeuichallenge.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun GradientText(
    text: String,
    testStyle: TextStyle = MaterialTheme.typography.titleLarge,
    colorStops: Array<Pair<Float, Color>> = arrayOf(
        0.0f to Color(0xFFF56A4E),
        0.7f to Color(0xFFFDB96E),
        1.0f to Color(0xFFFFE385)
    )
) {
    Text(
        text = text,
        style = testStyle
            .copy(
                brush = Brush.horizontalGradient(colorStops = colorStops),
                fontWeight = FontWeight.Bold
            )
    )
}

@Composable
@Preview
fun GradientTextPreview() {
    GradientText(text = "Good Morning, Alex!")
}