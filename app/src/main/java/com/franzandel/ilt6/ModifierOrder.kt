package com.franzandel.ilt6

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PaddingFirstThenClickableText() {
    Text(
        "Hello Compose!",
        Modifier.background(Color.LightGray)
            .padding(50.dp)
            .clickable {}
    )
}

@Composable
fun ClickableFirstThenPaddingText() {
    Text(
        "Hello Compose!",
        Modifier.background(Color.LightGray)
            .clickable {}
            .padding(50.dp)
    )
}
