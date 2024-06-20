package com.example.logistics_mobile_app.navigation


import OnboardingScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.logistics_mobile_app.MainActivity
import com.example.logistics_mobile_app.SplashScreen
import com.example.logistics_mobile_app.screens.MainScreen
import com.example.logisticsapp.WelcomeScreen


@Composable
fun RootNavigationGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.SPLASH
    ) {
        composable(route = Graph.SPLASH){
            SplashScreen(navController = navController)
        }
        composable(route =Graph.ONBOARDING){
            OnboardingScreen(navController = navController)
        }
        composable(route = Graph.WELCOME){
            WelcomeScreen(navController = navController, context = MainActivity())
        }
        authNavGraph(navController = navController)
        composable(route = Graph.HOME) {
                MainScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val SPLASH = "splash"
    const val ONBOARDING = "onboarding"
    const val WELCOME = "welcome"


}