package com.vintagemedia.noonalpha

sealed class Routes(val route: String) {
    object Login: Routes("Login")
    object Feed: Routes("Feed")
    object Cart: Routes("Cart")
    object Upload: Routes("Upload")
    object Message: Routes("Message")
    object Profile: Routes("Profile")
}