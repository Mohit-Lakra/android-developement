package com.example.firstapplication.JetpackCompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun TextExample(){
    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 24.sp,
        fontWeight = FontWeight(500),
        fontFamily = FontFamily.Monospace,
        letterSpacing = 2.sp,
        textAlign = TextAlign.Center,
    )
}
@Preview(showBackground = true)
@Composable
fun TextFieldExample(){
    var name by remember { mutableStateOf("") }
    TextField(
        value = name,
        onValueChange = {name = it},
        label = { Text(text = "Enter your name : ")},
        placeholder = { Text(text = "Michael Stark") },
        leadingIcon = {
            Text(text = "***", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        },
        trailingIcon = {
            Text(text = "#", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        },
        singleLine = true,
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Black,
            unfocusedContainerColor = Color.Blue,
            focusedContainerColor = Color.LightGray,
            cursorColor = Color.Magenta
        )
    )
}
