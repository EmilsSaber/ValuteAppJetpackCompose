package com.example.valuteapp.presentation.mainFlowScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.valuteapp.bottomNavigation.BottomNavigationView
import com.example.valuteapp.navigation.NavHost

@Composable
fun MainFlowScreen() {
	MainFlowScreenPreview()
}

@Preview
@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MainFlowScreenPreview() {
	val navController = rememberNavController()
	Scaffold(
		bottomBar = {
			BottomNavigationView(
				navController = navController
			)
		}
	) { innerPadding ->
		Box(Modifier.padding(innerPadding).background(color = Color.White)) {
			NavHost(navController = navController)
		}
	}
}
