package com.example.myfitness.buttomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myfitness.screns.LoginScreen
import com.example.myfitness.screns.RegisterScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController,
        startDestination = "login"){
        composable("login"){
            LoginScreen()
        }
        composable("registartion"){
            RegisterScreen()
        }
    }
}