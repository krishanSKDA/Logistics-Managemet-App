package com.example.logistics_mobile_app.navigation

sealed class Screens(var route:String) {
   object Home: Screens("home")
   object Service: Screens("service")
   object Profile: Screens("profile")
   object Notification: Screens("notification")
    object Setting: Screens("setting")
}