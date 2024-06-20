package com.example.logistics_mobile_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.logistics_mobile_app.screens.HomeScreen
import androidx.compose.foundation.layout.PaddingValues
import com.example.logistics_mobile_app.screens.NotificationScreen
import com.example.logistics_mobile_app.screens.ProfileScreen
import com.example.logistics_mobile_app.screens.ServiceScreen
import com.example.logistics_mobile_app.screens.SettingScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController = navController,
        startDestination = Screens.Home.route) {
        composable(Screens.Home.route){
            HomeScreen(innerPadding = innerPadding)
        }
        composable(Screens.Notification.route){
            NotificationScreen(innerPadding = innerPadding)
        }
        composable(Screens.Profile.route){
            ProfileScreen(innerPadding = innerPadding)
        }
        composable(Screens.Service.route){
            ServiceScreen(innerPadding = innerPadding)
        }
        composable(Screens.Setting.route){
            SettingScreen(innerPadding = innerPadding)
        }
    }
}