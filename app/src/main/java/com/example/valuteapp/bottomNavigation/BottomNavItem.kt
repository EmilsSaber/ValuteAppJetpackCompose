package com.example.valuteapp.bottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.valuteapp.navigation.Screens

sealed class BottomNavItem(
    val icon: ImageVector, val title: String, val navRoute: String
) {
    object Home :
        BottomNavItem(
            Icons.Filled.Home,
            "Главная",
            navRoute = Screens.HomeScreen.route
        )

    object Map :
        BottomNavItem(
            Icons.Filled.ShoppingCart,
            "Карта",
            navRoute = Screens.MapScreen.route
        )

    object Booking :
        BottomNavItem(
            Icons.Filled.KeyboardArrowDown,
            "Бронь",
            navRoute = Screens.BookingScreens.route
        )

    object Account :
        BottomNavItem(
            Icons.Filled.AccountCircle,
            "Аккаунт",
            navRoute = Screens.AccountScreen.route
        )
}