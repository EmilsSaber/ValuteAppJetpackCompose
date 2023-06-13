package com.example.valuteapp.presentation.homeScreen.homeScreensElement

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.valuteapp.R

@Composable
fun TopPart() {
	TopPartPreview()
}

@Composable
private fun IconColumn(
	icon: Painter,
	contentDescription: String,
	startPadding: Dp = 0.dp,
	endPadding: Dp = 0.dp,
) {
	Column(
		modifier = Modifier
			.height(80.dp)
			.padding(start = startPadding, end = endPadding),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.SpaceEvenly
	) {
		Box(modifier = Modifier.size(29.dp)) {
			Image(
				modifier = Modifier.fillMaxSize(),
				painter = icon,
				contentDescription = contentDescription,
			)
		}
	}
}

@Preview
@Composable
fun TopPartPreview() {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(start = 2.dp),
		horizontalArrangement = Arrangement.SpaceEvenly,
		verticalAlignment = Alignment.CenterVertically
	) {
		IconColumn(
			icon = painterResource(R.drawable.settings_icon),
			contentDescription = "Settings Icon",
			startPadding = 33.dp,
		)
		Spacer(modifier = Modifier.weight(1f))
		Box(
			modifier = Modifier
				.size(83.dp)
				.align(Alignment.CenterVertically),
		) {
			Image(
				modifier = Modifier.fillMaxSize(),
				painter = painterResource(R.drawable.logo),
				contentDescription = "Logo Icon",
			)
		}
		Spacer(modifier = Modifier.weight(1f))
		IconColumn(
			icon = painterResource(R.drawable.notifications_icon),
			contentDescription = "Notification Icon",
			endPadding = 33.dp
		)
	}
}