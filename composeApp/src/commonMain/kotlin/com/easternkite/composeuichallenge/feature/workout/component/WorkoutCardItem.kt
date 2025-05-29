package com.easternkite.composeuichallenge.feature.workout.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import org.jetbrains.compose.ui.tooling.preview.Preview

data class WorkoutCardItem(
    val title: String,
    val description: String,
    val emoji: String
)

@Composable
fun WorkoutCard(
    emoji: String,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
            .padding(16.dp)
            .clickable {  },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = emoji,
            style = MaterialTheme.typography.displayMedium,
        )
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
        )
        Text(
            text = description,
            color = Color.Gray,
            style = MaterialTheme.typography.bodySmall,

            )

    }

}

@Composable
@Preview
fun WorkoutCardPreview() {
    WorkoutCard(
        emoji = "💪",
        title = "Pushups",
        description = "30 reps"
    )
}

val workoutCardItems = listOf(
    WorkoutCardItem(
        emoji = "📊",
        title = "Smart Analytics",
        description = "AI-powered insights"
    ),
    WorkoutCardItem(
        emoji = "🎯",
        title = "Adaptive Goals",
        description = "Personalized targets"
    ),
    WorkoutCardItem(
        emoji = "💪",
        title = "Pushups",
        description = "30 reps"
    ),
    WorkoutCardItem(
        emoji = "🏋️",
        title = "Weightlifting",
        description = "5 sets of 5 reps"
    ),
    WorkoutCardItem(
        emoji = "🏃‍♂️",
        title = "Running",
        description = "5 km"
    ),
    WorkoutCardItem(
        emoji = "🏊‍♂️",
        title = "Swimming",
        description = "100 m"
    )
)
