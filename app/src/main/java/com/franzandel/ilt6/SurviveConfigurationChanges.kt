package com.franzandel.ilt6

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
fun SurviveConfigurationChanges() {
    var quantity by rememberSaveable { mutableStateOf(1) }
//    var quantity by remember { mutableStateOf(1) }

    Row {
        Button(onClick = { quantity-- }) {
            Text("-")
        }
        Text(quantity.toString())
        Button(onClick = { quantity++ }) {
            Text("+")
        }
    }
}
