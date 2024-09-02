package com.example.learnjetpack_compose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeView(navController: NavController) {
    Column {
        Text(text = "Home View")
    }
}