package com.easternkite.composeuichallenge.feature.workout.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.easternkite.composeuichallenge.component.GradientText
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun WorkoutProfile(
    userName: String,
    modifier: Modifier = Modifier,
) {
    val gradient = Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to Color(0xFF6B61F1), // 중심: 푸른 보라색
            0.5f to Color(0xFF8266E0), // 중간: 연보라
            1.0f to Color(0xFF9E63D9)  // 바깥쪽: 핑크 기운이 도는 보라
        ),
        start = Offset.Zero,
        end = Offset.Infinite
    )
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(gradient)
        ) {
            Text("🤖", modifier = Modifier.align(Alignment.Center), style = MaterialTheme.typography.titleLarge)
        }
        Box(modifier = Modifier.height(8.dp))
        GradientText(
            "Good Morning, $userName!",
            testStyle = MaterialTheme.typography.titleLarge.copy(fontSize = 25.sp)
        )
        Box(modifier = Modifier.height(8.dp))
        Text("Ready to crush your fitness goals?", color = Color.LightGray)
    }
}

@Composable
@Preview
fun WorkoutProfilePreview() {
    WorkoutProfile(
        userName = "Alex",
        modifier = Modifier.size(300.dp)
    )
}