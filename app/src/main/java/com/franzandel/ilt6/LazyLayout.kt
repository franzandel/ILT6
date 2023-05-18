package com.franzandel.ilt6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun IntegersScreen(newsList: List<Int>) {
    if (newsList.isNotEmpty()) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(
                start = 24.dp,
                end = 24.dp
            )
        ) {
            items(newsList) {
                Text(text = it.toString())
            }
        }
    } else {
        Text(text = "No Data!")
    }
}
