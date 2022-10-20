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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable

fun Pagefour(navController: NavController) {
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
            Text(text = "'อีลอน มัสก์' ชี้จีนประสบภาวะคล้ายศก.ถดถอย เหตุตลาดอสังหาฯตกต่ำนานนับปี", fontSize = 24.sp, fontWeight = FontWeight.W800,)
            Text(text = "", fontSize = 17.sp)
            Text(text = "08:18 · 20 ต.ค.", fontSize = 13.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "นายอีลอน มัสก์ ประธานเจ้าหน้าที่บริหารบริษัทเทสลา อิงค์เปิดเผยว่า จีนกำลังประสบกับภาวะชะลอตัวที่คล้ายกับเศรษฐกิจถดถอย อันเนื่องมาจากภาวะตกต่ำของตลาดที่อยู่อาศัยที่ดำเนินมานานกว่า 1 ปีแล้ว", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "นายมัสก์ ระบุในระหว่างรายงานผลประกอบการไตรมาส 3/2565 ว่า จีนกำลังประสบกับภาวะคล้ายเศรษฐกิจถดถอย ซึ่งส่วนใหญ่เกิดขึ้นในตลาดอสังหาริมทรัพย์" ,fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "ทั้งนี้ นายมัสก์ได้ตอบคำถามเกี่ยวกับแนวโน้มยอดคำสั่งซื้อล่าสุด โดยเฉพาะอย่างยิ่งในจีนที่เทสลามีโรงงานขนาดใหญ่ตั้งอยู่", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "นอกจากนี้ นายมัสก์กล่าวว่า ยุโรปกำลังเผชิญกับภาวะถดถอยอันเนื่องมาจากปัญหาการขาดแคลนพลังงาน แต่เศรษฐกิจสหรัฐยังอยู่ในภาวะที่ดี พร้อมเสริมว่า ขณะที่ธนาคารกลางสหรัฐ (เฟด) กำลังปรับขึ้นอัตราดอกเบี้ยมากกว่าที่ควรจะเป็น แต่พวกเขาจะตระหนักได้ในที่สุด และจะปรับลดดอกเบี้ยลงมาอีกครั้ง", fontSize = 17.sp)
        }
    }
}
