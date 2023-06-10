package com.example.valuteapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.valuteapp.presentation.accountScreens.AccountScreen
import com.example.valuteapp.presentation.bookingScreen.BookingScreen
import com.example.valuteapp.presentation.homeScreen.HomeScreens
import com.example.valuteapp.presentation.mainFlowScreen.MainFlowScreen
import com.example.valuteapp.presentation.mapScreen.MapScreen

sealed class Screens(val route: String) {

    object MainFlowScreen : Screens("mainScreen")
    object HomeScreen : Screens("secondScreen")
    object MapScreen : Screens("secondScreen")
    object BookingScreens : Screens("secondScreen")
    object AccountScreen : Screens("secondScreen")
}

@Composable
fun NavHost(
    navController: NavHostController
) {
    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = Screens.MainFlowScreen.route
    )
    {
        composable(Screens.MainFlowScreen.route) {
            MainFlowScreen(navController)
        }
        composable(Screens.HomeScreen.route) {
            HomeScreens(navController)
        }
        composable(Screens.MapScreen.route) {
            MapScreen(navController)
        }
        composable(Screens.BookingScreens.route) {
            BookingScreen(navController)
        }
        composable(Screens.AccountScreen.route) {
            AccountScreen(navController)
        }
    }
}