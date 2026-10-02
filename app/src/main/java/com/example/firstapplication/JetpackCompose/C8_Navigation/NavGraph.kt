package com.example.firstapplication.JetpackCompose.C8_Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(){
    val NavController = rememberNavController()
    NavHost(
        navController = NavController,
        startDestination = MyNavClass.LoginScreen,
    ){
        composable<MyNavClass.LoginScreen> {
            LoginScreen(NavController)
        }
        composable<MyNavClass.HomeScreen> {
            Home(NavController)
        }
    }
}