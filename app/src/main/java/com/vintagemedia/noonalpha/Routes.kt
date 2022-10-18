package com.vintagemedia.noonalpha

sealed class Routes(val route: String) {
    object Login: Routes("Login")
    object Feed: Routes("feed")
    object Cart: Routes("cart")
    object Upload: Routes("upload")
    object Message: Routes("message")
    object Profile: Routes("profile")
}