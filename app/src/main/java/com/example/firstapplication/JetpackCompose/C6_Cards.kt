package com.example.firstapplication.JetpackCompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardExample(){
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = CircleShape,
            colors = CardDefaults.cardColors(
                containerColor = Color.Magenta.copy(alpha=0.3f),
                contentColor = Color.Blue.copy(0.5f)
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp
            ),
            border = BorderStroke(4.dp,Color.Blue.copy(alpha = 0.3f))
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(text="Hello", modifier = Modifier.padding(16.dp), fontSize = 30.sp, fontWeight = FontWeight.ExtraBold)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileSummaryCard() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue.copy(alpha = 0.3f),
                contentColor = Color.Blue.copy(alpha=0.6f)
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier.size(100.dp).background(Color.LightGray, CircleShape).border(width = 4.dp, color = Color.Black, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ){
                    Icon(imageVector = Icons.Default.Person, contentDescription = "Person Icon", modifier = Modifier.size(50.dp).padding(1.dp))
                }
                Spacer(modifier = Modifier.width(30.dp))
                Column(
                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Mohit Lakra", fontSize = 30.sp, fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "3rd Year CSE Student at NSUT | Leetcode : 1800 | Codeforces : 1500", fontWeight = FontWeight.Medium, fontSize = 14.sp)
                }
            }
        }
    }
}