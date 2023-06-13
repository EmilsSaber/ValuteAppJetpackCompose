package com.example.valuteapp.bottomNavigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.valuteapp.R

@Composable
fun BottomNavigationView(navController: NavController) {
	val navItem =
		listOf(
			BottomNavItem.Home,
			BottomNavItem.Map,
			BottomNavItem.Booking,
			BottomNavItem.Account
		)
	val navBackStackEntry = navController.currentBackStackEntryAsState()
	val currentRoute = navBackStackEntry.value?.destination?.route

	BottomNavigation(
		backgroundColor = Color.White,
		modifier = Modifier.fillMaxWidth()
	) {
		navItem.forEachIndexed { _, item ->
			BottomNavigationItem(
				icon = { Icon(item.icon, contentDescription = "") },
				label = { Text(text = item.title, color = Color.DarkGray) },
				selected = currentRoute == item.navRoute,
				onClick = { navController.navigate(item.navRoute) },
				selectedContentColor = colorResource(R.color.lowBlue),
				unselectedContentColor = Color.Gray
			)
		}
	}
}
