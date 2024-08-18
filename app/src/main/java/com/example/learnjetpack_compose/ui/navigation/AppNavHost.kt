package com.example.learnjetpack_compose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnjetpack_compose.ui.screens.HomeView
import com.example.learnjetpack_compose.ui.screens.LoginView

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("home") {
            HomeView()
        }
        composable("login") {
            LoginView()
        }
    }
}