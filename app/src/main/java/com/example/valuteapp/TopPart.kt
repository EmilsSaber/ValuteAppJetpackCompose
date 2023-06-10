package com.example.valuteapp

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TopPart() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 2.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SettingsIcon()
        Spacer(modifier = Modifier.weight(1f))
        Logo()
        Box(
            modifier = Modifier
                .size(83.dp)
                .align(Alignment.CenterVertically),
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo Icon",
                modifier = Modifier.fillMaxSize(),

                )
        }
        Spacer(modifier = Modifier.weight(1f))
        NotificationIcon()
    }

}

@Composable
private fun Logo() {

}

@Composable
private fun NotificationIcon() {
    Column(
        modifier = Modifier
            .height(80.dp)
            .padding(end = 33.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.notifications_icon),
                contentDescription = "Notification Icon",
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
private fun SettingsIcon() {
    Column(
        modifier = Modifier
            .height(80.dp)
            .padding(start = 33.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.settings_icon),
                contentDescription = "Settings Icon",
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}