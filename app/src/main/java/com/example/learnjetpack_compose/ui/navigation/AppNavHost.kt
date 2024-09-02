package com.example.learnjetpack_compose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnjetpack_compose.ui.screens.HomeView
import com.example.learnjetpack_compose.ui.screens.LoginView

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "login") {
        composable("home") {
            HomeView(navController)
        }
        composable("login") {
            LoginView(navController)
        }
    }
}