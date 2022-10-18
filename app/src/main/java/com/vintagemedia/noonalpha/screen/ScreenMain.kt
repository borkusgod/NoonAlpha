package com.vintagemedia.noonalpha.screen

import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vintagemedia.noonalpha.Routes

@Composable
fun ScreenMain() {
    val navController = rememberNavController()
    // adding these in for scaffold
    val state = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

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
        composable(Routes.Cart.route) {
            Cart(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Upload.route) {
            Upload(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Message.route) {
            Message(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
        composable(Routes.Profile.route) {
            Profile(navController = navController)
            //ReplaceForTesting(navController = navController)
        }
    }
}