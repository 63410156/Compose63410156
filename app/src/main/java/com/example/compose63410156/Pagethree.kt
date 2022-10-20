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

fun Pagethree(navController: NavController) {
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
            Text(text = "แบงก์ชาติอินโดนีเซียขึ้นดอกเบี้ยอีก 0.5% สกัดเงินเฟ้อ - พยุงค่าเงิน", fontSize = 24.sp, fontWeight = FontWeight.W800,)
            Text(text = "", fontSize = 17.sp)
            Text(text = "08:18 · 20 ต.ค.", fontSize = 13.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "ธนาคารกลางอินโดนีเซีย (บีไอ) ประกาศปรับขึ้นดอกเบี้ยอีก 0.50% เพื่อสกัดกั้นเงินเฟ้อ และยับยั้งการอ่อนค่าลงของเงินรูเปียห์", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "ทั้งนี้ บีไอ มีมติปรับขึ้นอัตราดอกเบี้ยซื้อคืนพันธบัตรโดยมีสัญญาขายคืน (reverse repurchase rate) ระยะเวลา 7 วันอีก 0.50% สู่ระดับ 4.75% ในวันนี้ (20 ต.ค.) ซึ่งสอดคล้องกับการคาดการณ์ของนักเศรษฐศาสตร์ 19 จาก 31 คนในผลสำรวจของสำนักข่าวบลูมเบิร์ก" ,fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "นายเพอร์รี วาร์จิโย ผู้ว่าการของบีไอ ระบุว่า การตัดสินใจในครั้งนี้ เป็นไปเพื่อลดการคาดการณ์เงินเฟ้อล่วงหน้าซึ่งอยู่ในระดับสูงเกินไป โดยบีไอ ตั้งเป้าที่จะลดอัตราเงินเฟ้อพื้นฐานให้อยู่ในกรอบเป้าหมายของธนาคารที่ 2-4% ในช่วงครึ่งปีแรกของปีหน้า เมื่อเทียบกับในช่วงไตรมาสที่ 3 ที่ผ่านมานี้", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "พิสูจน์อักษร....สุรีย์ ศิลาวงษ์", fontSize = 17.sp)
        }
    }
}
