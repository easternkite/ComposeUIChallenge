package com.easternkite.composeuichallenge.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun GradientProgressBar(
    title: String,
    progress: Float,
    modifier: Modifier = Modifier,
    colorStops: Array<Pair<Float, Color>> = arrayOf(
        0.0f to Color(0xFFF56A4E),
        0.7f to Color(0xFFFDB96E),
        1.0f to Color(0xFFFFE385)
    )
) {
    val animatedValue = remember { Animatable(0f) }
    LaunchedEffect(Unit) {
        animatedValue.animateTo(
            targetValue = progress,
            animationSpec = tween(durationMillis = 1000)
        )
    }

    Column(modifier = modifier) {
        Row(modifier = Modifier.padding(vertical = 8.dp)) {
            Text(title, color = Color.White, modifier = Modifier.weight(1f))
            Text("${(animatedValue.value * 100).toInt()}%", color = Color.White)
        }
        Box(
            Modifier
                .fillMaxWidth()
                .height(6.dp)
                .clip(RoundedCornerShape(50))
                .background(Color.DarkGray)
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(animatedValue.value)
                    .clip(RoundedCornerShape(50))
                    .background(Brush.horizontalGradient(colorStops = colorStops))
            )
        }
    }
}
@Composable
@Preview
fun GradientProgressBarPreview() {
    GradientProgressBar(title = "Weekly Progress", progress = 0.73f)
}