package com.easternkite.composeuichallenge.feature.workout.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun WorkoutItem(
    title: String,
    value: Int,
    modifier: Modifier = Modifier,
) {
    val animatedValue = remember { Animatable(0f) }
    LaunchedEffect(Unit) {
        animatedValue.animateTo(
            targetValue = value.toFloat(),
            animationSpec = tween(durationMillis = 1000)
        )
    }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${animatedValue.value.toInt()}",
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = Color(0xFF6ED4E7),
            lineHeight = 1.sp
        )
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge ,
            color = Color.LightGray,
            lineHeight = 1.sp
        )
    }
}

@Composable
@Preview
fun WorkoutItemPreview() {
    WorkoutItem(
        value = 12,
        title = "EXCERCISES"
    )
}