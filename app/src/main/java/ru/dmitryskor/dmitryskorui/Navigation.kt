package ru.dmitryskor.dmitryskorui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "screen_list_components"
    ) {
        composable(
            route = "screen_list_components"
        ) {
            ScreenListComponents {
                navController.navigate(it.route)
            }
        }

        Screen.entries.forEach { screen ->
            composable(
                route = screen.route
            ) {
                ScreenComponentWrapper(
                    titleAppBar = screen.componentName(),
                    onBack = {
                        navController.popBackStack()
                    }
                ) {
                    GraphComponents(screen)
                }
            }
        }
    }
}