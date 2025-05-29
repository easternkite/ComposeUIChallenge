package com.easternkite.composeuichallenge.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun GradientButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colorStops: Array<Pair<Float, Color>> = arrayOf(
        0.0f to Color(0xFFFFC56F),
        0.7f to Color(0xFFFF91A3),
        1.0f to Color(0xFFDF75F8)
    )

) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(100.dp))
            .clickable { onClick() }
            .background(Brush.horizontalGradient(colorStops = colorStops))
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text,
            modifier = Modifier.align(Alignment.Center),
            color = Color.Black,
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
@Preview
fun GradientButtonPreview() {
    GradientButton(
        text = "UI CHALLENGE",
        onClick = {}
    )
}

