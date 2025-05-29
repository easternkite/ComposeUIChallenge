package com.easternkite.composeuichallenge

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.easternkite.composeuichallenge.feature.workout.WorkoutScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold {
            WorkoutScreen(modifier = Modifier.padding(it))
        }
    }
}
