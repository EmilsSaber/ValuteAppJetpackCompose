package com.example.valuteapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.valuteapp.bottomNavigation.BottomNavItem
import com.example.valuteapp.presentation.accountScreens.AccountScreen
import com.example.valuteapp.presentation.bookingScreen.BookingScreen
import com.example.valuteapp.presentation.homeScreen.HomeScreen
import com.example.valuteapp.presentation.mainFlowScreen.MainFlowScreen
import com.example.valuteapp.presentation.mapScreen.MapScreen

sealed class Screens(val route: String) {
    object MainFlowScreen : Screens("mainFlowScreen")
    object HomeScreen : Screens("HomeScreen")
    object MapScreen : Screens("MapScreen")
    object BookingScreens : Screens("BookingScreen")
    object AccountScreen : Screens("AccountScreen")
}

@Composable
fun NavHost(
    navController: NavHostController
) {
    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.navRoute
    )
    {
        composable(Screens.MainFlowScreen.route) {
            MainFlowScreen()
        }
        composable(BottomNavItem.Home.navRoute) {
            HomeScreen(navController)
        }
        composable(BottomNavItem.Map.navRoute) {
            MapScreen(navController)
        }
        composable(BottomNavItem.Booking.navRoute) {
            BookingScreen(navController)
        }
        composable(BottomNavItem.Account.navRoute) {
            AccountScreen(navController)
        }
    }
}