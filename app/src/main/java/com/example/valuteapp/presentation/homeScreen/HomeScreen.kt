package com.example.valuteapp.presentation.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.valuteapp.R
import com.example.valuteapp.presentation.homeScreen.homeScreensElement.ItemCurrency
import com.example.valuteapp.presentation.homeScreen.homeScreensElement.PurchaseSale
import com.example.valuteapp.presentation.homeScreen.homeScreensElement.TopPart

@Composable
fun HomeScreen(navController: NavController) {
	HomeScreensPreview()
}

@Composable
fun SettingsHomeScreen() {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.background(color = colorResource(R.color.lowBlue),shape = RoundedCornerShape(16.dp))
			.padding(vertical = 32.dp)
	) {
		TopPart()
		PurchaseSale()
		ItemCurrency()
		Text(
			modifier = Modifier
				.align(alignment = Alignment.CenterHorizontally)
				.padding(top = 32.dp),
			color = colorResource(R.color.white),
			text = "Смотреть Больше",
			fontSize = 14.sp
		)
	}
}

@Preview
@Composable
fun HomeScreensPreview() {
	Box(
		modifier = Modifier
			.width(600.dp)
			.padding(24.dp)
			.background(
				color = Color.White,
			),
		contentAlignment = Alignment.Center
	) {
		SettingsHomeScreen()
	}
}




