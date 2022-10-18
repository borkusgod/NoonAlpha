package com.vintagemedia.noonalpha.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vintagemedia.noonalpha.Routes

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = Routes.Login.route
        //startDestination = Routes.ReplaceForTesting.route
    ) {
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Feed.route) {
            Feed(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Login.route) {
            Cart(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Login.route) {
            Upload(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Login.route) {
            Message(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Login.route) {
            Profile(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
    }
}