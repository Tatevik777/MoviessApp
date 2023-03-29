package com.example.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moviesapp.screens.MainScreen
import com.example.moviesapp.screens.SplashScreen
import com.example.moviesapp.utils.Constants

sealed class Screens(val route:String){
    object Splash:Screens(route = Constants.Screens.SPLASH_SCREEN)
    object Main:Screens(route = Constants.Screens.MAIN_SCREEN)
    object DETAIL:Screens(route = Constants.Screens.DETAIL_SCREEN,)
}

@Composable
fun SetUpNavHost(navController: NavHostController){
    NavHost(
        navController= navController,
        startDestination= Screens.Splash.route
    ){
        composable(route = Screens.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screens.DETAIL.route){

        }
        composable(route = Screens.Main.route){
            MainScreen()
        }

    }
}
