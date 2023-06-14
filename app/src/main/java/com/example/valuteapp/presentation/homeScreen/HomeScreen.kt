package com.example.valuteapp.presentation.homeScreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.valuteapp.R
import com.example.valuteapp.presentation.homeScreen.homeScreensElement.ItemCurrency
import com.example.valuteapp.presentation.homeScreen.homeScreensElement.PurchaseSale
import com.example.valuteapp.presentation.homeScreen.homeScreensElement.TopPart
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavController) {
    HomeScreensPreview()
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SettingsHomeScreen() {
    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    val selectedRate = remember { mutableStateOf(0f) }
    var inputValue by remember { mutableStateOf("1") }
    val result = (inputValue.toFloatOrNull() ?: 0f) * selectedRate.value
    var outputValue by remember { mutableStateOf(result.toString()) }

    Box(
        modifier = Modifier
            .width(600.dp)
            .padding(24.dp)
            .background(color = Color.White, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = colorResource(R.color.lowBlue),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(vertical = 32.dp)
        ) {
            TopPart()
            PurchaseSale()
            ItemCurrency { rate ->
                Log.d("ololo", "Нажата ставка валюты: $rate")
                selectedRate.value = rate
                scope.launch {
                    bottomSheetState.show()
                }
            }
            Text(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 32.dp)
                    .clickable {
                    },
                color = Color.White,
                text = "Смотреть Больше",
                fontSize = 14.sp
            )
        }
    }

    ModalBottomSheetLayout(
        sheetState = bottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "Валюта",
                        textAlign = TextAlign.Start,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    IconButton(
                        onClick = { scope.launch { bottomSheetState.hide() } },
                        modifier = Modifier.padding(top = 6.dp)
                    ) {
                        Icon(Icons.Default.Close, contentDescription = "Close")
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start),
                        text = "По курсу ",
                        textAlign = TextAlign.Start,
                        color = Color.Black
                    )

                    Text(
                        modifier = Modifier
                            .align(Alignment.Start),
                        text = "${selectedRate.value}",
                        textAlign = TextAlign.Start,
                        color = colorResource(R.color.lowBlue),
                        fontSize = 24.sp
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            modifier = Modifier
                                .padding(bottom = 8.dp),
                            text = "Продать",
                            textAlign = TextAlign.Start,
                            color = Color.Black
                        )
                        TextField(
                            modifier = Modifier
                                .width(160.dp)
                                .height(50.dp)
                                .padding()
                                .clip(RoundedCornerShape(6.dp))
                                .background(color = colorResource(id = R.color.white)),
                            value = inputValue,
                            onValueChange = { newValue ->
                                inputValue = newValue
                                outputValue =
                                    newValue.toFloatOrNull()?.let { it * selectedRate.value }
                                        ?.toString() ?: ""
                            },
                            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                            placeholder = {
                                Text(
                                    text = "1",
                                    color = Color.Black
                                )
                            }
                        )
                    }

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Получить",
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .align(Alignment.End)
                                .padding(bottom = 8.dp, end = 8.dp),
                            color = Color.Black
                        )
                        TextField(
                            modifier = Modifier
                                .align(Alignment.End)
                                .width(160.dp)
                                .height(50.dp)
                                .padding(end = 4.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .background(color = Color.White),
                            value = outputValue,
                            onValueChange = { newValue ->
                                outputValue = newValue
                                inputValue =
                                    newValue.toFloatOrNull()?.let { it / selectedRate.value }
                                        ?.toString() ?: ""
                            },
                            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                            placeholder = {
                                Text(
                                    text = selectedRate.value.toString(),
                                    color = Color.Black
                                )
                            }
                        )


                    }
                }
            }
        },
        content = {}
    )
}

@Preview
@Composable
fun HomeScreensPreview() {
    SettingsHomeScreen()
}




