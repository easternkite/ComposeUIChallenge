package com.easternkite.composeuichallenge.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
@Composable
fun GradientDivider(
    modifier: Modifier = Modifier,
    colorStops: Array<Pair<Float, Color>> = arrayOf(
        0.0f to Color(0xFFF7806C),
        0.25f to Color(0xFFFDB45C),
        0.5f to Color(0xFFFBE97B),
        0.75f to Color(0xFFB5E4C2),
        1.0f to Color(0xFF6ED4E7)
    )
) {
    Box(
        modifier = modifier
            .background(brush = Brush.horizontalGradient(colorStops = colorStops))
    )
}

@Composable
@Preview
fun GradientDividerPreview() {
    GradientDivider(modifier = Modifier.fillMaxWidth().height(2.dp))
}



