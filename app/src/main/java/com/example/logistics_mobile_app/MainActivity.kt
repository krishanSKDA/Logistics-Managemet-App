package com.example.logistics_mobile_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.logistics_mobile_app.navigation.RootNavigationGraph
import com.example.logistics_mobile_app.ui.theme.Logistics_Mobile_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Logistics_Mobile_AppTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}
