package com.example.logistics_mobile_app.navigation


import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.logisticsapp.LoginScreen
import com.example.logisticsapp.SignupScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(
                onSignIn = {
                    navController.popBackStack(AuthScreen.Login.route, true)
                    navController.navigate(Graph.HOME)
                },
                onSignUp = {
                    navController.navigate(AuthScreen.SignUp.route)
                }
            )
        }
        composable(route = AuthScreen.SignUp.route) {
            SignupScreen(
                SignIn = {
                    navController.navigate(AuthScreen.Login.route)
                },

                )
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGN_UP")
}
