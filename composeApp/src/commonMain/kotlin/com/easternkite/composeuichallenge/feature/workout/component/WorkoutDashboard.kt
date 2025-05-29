package com.easternkite.composeuichallenge.feature.workout.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.easternkite.composeuichallenge.component.GradientDivider
import com.easternkite.composeuichallenge.component.GradientProgressBar
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun WorkoutDashboard() {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
    ) {
        GradientDivider(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
        )
        Column(Modifier.padding(16.dp)) {
            Text("🔥Today's AI Workout", style = MaterialTheme.typography.titleLarge, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                WorkoutItem(
                    title = "MIN",
                    value = 45
                )
                WorkoutItem(
                    title = "KCAL",
                    value = 320
                )
                WorkoutItem(
                    title = "EXERCISES",
                    value = 12
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            GradientProgressBar(
                title = "Weekly Progress",
                progress = 0.73f,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xfff46461))
                        .clickable {  }
            ) {
                Text(
                    text = "Start Workout with AI Coach",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White,
                    modifier = Modifier.padding(16.dp).align(Alignment.Center)
                )
            }
        }
    }
}