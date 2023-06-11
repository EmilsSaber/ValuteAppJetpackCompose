package com.example.valuteapp.presentation.mainFlowScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.valuteapp.bottomNavigation.BottomNavigationView
import com.example.valuteapp.navigation.NavHost

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainFlowScreen() {

    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomNavigationView(
            navController = navController
        )
    }) {
        NavHost(navController = navController)
    }
}

