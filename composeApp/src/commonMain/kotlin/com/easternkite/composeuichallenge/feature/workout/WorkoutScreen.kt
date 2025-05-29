package com.easternkite.composeuichallenge.feature.workout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.easternkite.composeuichallenge.component.GradientButton
import com.easternkite.composeuichallenge.feature.workout.component.WorkoutCard
import com.easternkite.composeuichallenge.feature.workout.component.WorkoutDashboard
import com.easternkite.composeuichallenge.feature.workout.component.WorkoutProfile
import com.easternkite.composeuichallenge.feature.workout.component.workoutCardItems
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun WorkoutScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xff1c1c2c)).padding(16.dp) then modifier,
    ) {
        GradientButton(onClick = {}, text = "UI CHALLENGE", modifier = Modifier.align(alignment = Alignment.End))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            item(span = { GridItemSpan(2) }) {
                WorkoutProfile("DongYeon", modifier = Modifier.padding(vertical = 50.dp))
            }
            item(span = { GridItemSpan(2) }) { WorkoutDashboard() }
            items(workoutCardItems, span = { GridItemSpan(1) }) {
                WorkoutCard(
                    emoji = it.emoji,
                    title = it.title,
                    description = it.description,
                    modifier = Modifier.aspectRatio(1f)
                )
            }
        }
    }

}

@Composable
@Preview
fun WorkoutScreenPreview() {
    WorkoutScreen()
}