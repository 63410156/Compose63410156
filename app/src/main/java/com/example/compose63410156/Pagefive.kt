package com.example.compose63410156

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Pagefive(navController: NavController) {
    Column() {
        TopAppBar(title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(R.drawable.back),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .clickable{navController.navigate("A")},
                )
            }

        }, backgroundColor = Color(0xFFFFFFFF), modifier = Modifier.border(2.dp, Color.LightGray))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(15.dp)
        ) {
            Text(text = "กรุงเทพธุรกิจ", fontSize = 13.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "\"ราคาน้ำมันพรุ่งนี้ 2565\" 21 ต.ค.65 อัปเดตราคาน้ำมันกลุ่มเบนซิน, แก๊สโซฮอล์, ดีเซล", fontSize = 24.sp, fontWeight = FontWeight.W800,)
            Text(text = "", fontSize = 17.sp)
            Text(text = "08:18 · 20 ต.ค.", fontSize = 13.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "\"ราคาน้ำมันพรุ่งนี้ 2565 ล่าสุด\" 21 ต.ค.65 เช็กราคาน้ำมันทุกชนิด กลุ่มเบนซิน, แก๊สโซฮอล์, ดีเซล จาก 3 ปั๊มน้ำมัน ปตท. บางจาก และเชลล์ อัปเดตล่าสุดจากปั๊มขยับเท่าไร ?", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "\"ราคาน้ำมัน พรุ่งนี้ 2565 ล่าสุด\" อัปเดตข้อมูล ณ วันที่ 20 ตุลาคม 2565 เวลา 17.00 น. จาก 3 ปั๊มน้ำมันดัง ประกอบด้วย บมจ.บางจากปิโตรเลียม, บริษัท ปตท. น้ำมันและการค้าปลีก จำกัด (มหาชน) หรือ โออาร์ และ บริษัท เชลล์ แห่งประเทศไทย จำกัด โดย \"ราคาน้ำมันพรุ่งนี้ 2565\" กลุ่มเบนซิน, แก๊สโซฮอล์ และ ดีเซล มีดังนี้" ,fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "\"ราคาน้ำมัน พรุ่งนี้ 21 ต.ค. 65\" ปตท.", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = " • แก๊สโซฮอล์ 95 ราคา 35.15 บาท/ลิตร", fontSize = 17.sp)
            Text(text = " • แก๊สโซฮอล์ 91 ราคา 34.88 บาท/ลิตร", fontSize = 17.sp)
            Text(text = " • แก๊สโซฮอล์ E20 ราคา 34.04 บาท/ลิตร", fontSize = 17.sp)
            Text(text = " • แก๊สโซฮอล์ E85 ราคา 32.44 บาท/ลิตร", fontSize = 17.sp)
            Text(text = " • เบนซิน 95 ราคา 42.56 บาท/ลิตร", fontSize = 17.sp)
        }
    }
}
