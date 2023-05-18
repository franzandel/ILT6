package com.franzandel.ilt6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun NavigationComponent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "first") {
        composable(route = "first") {
            FirstScreen { messageContent ->
                navController.navigate("second?content=$messageContent")
            }
        }
        composable(
            route = "second?content={content}",
            arguments = listOf(
                navArgument("content") {
                    defaultValue = ""
                    type = NavType.StringType
                },
            )
        ) { backStackEntry ->
            SecondScreen(
                content = backStackEntry.arguments?.getString("content"),
            ) {
                navController.navigateUp()
            }
        }
    }
}

@Composable
fun FirstScreen(onNext: (String) -> Unit) {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(value = text, onValueChange = { text = it })
        Button(onClick = { onNext.invoke(text) }) {
            Text(text = "Next")
        }
    }
}

@Composable
fun SecondScreen(content: String?, onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = content.orEmpty())
        Button(onClick = onBack) {
            Text(text = "Back")
        }
    }
}
