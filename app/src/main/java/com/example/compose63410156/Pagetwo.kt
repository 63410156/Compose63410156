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

fun Pagetwo(navController: NavController) {
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
            Text(text = "KTC โชว์กำไร 9 เดือน 5,414 ล้านบาท มุ่งขยายฐานสมาชิกคุณภาพ", fontSize = 24.sp, fontWeight = FontWeight.W800,)
            Text(text = "", fontSize = 17.sp)
            Text(text = "08:18 · 20 ต.ค.", fontSize = 13.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "KTC โชว์กำไรสุทธิ 9 เดือน 5,414 ล้านบาท พอใจธุรกิจหลักขยายตัวชัด มุ่งขยายฐานสมาชิกคุณภาพ สร้างคุณค่าทุกการใช้จ่าย", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "บริษัท บัตรกรุงไทย จำกัด(มหาชน) หรือ KTC ประกาศงบการเงินรวม 9 เดือนมีกำไรสุทธิ 5,414 ล้านบาท และกำไรสุทธิไตรมาส 3/2565 อยู่ที่ 1,773 ล้านบาท เพิ่มขึ้นจากงวดเดียวกันของปี 2564 เท่ากับ 16.9% และ 34.6% ตามลำดับ มูลค่าพอร์ตสินเชื่อรวม 9 เดือนขยายตัว 11.5% อยู่ที่ 97,016 ล้านบาท ยอดใช้จ่ายผ่านบัตรเครดิต 9 เดือนโต 22.7% อยู่ที่ 169,033 ล้านบาท" ,fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "พร้อมเดินหน้ากลยุทธ์สร้างความเชื่อมั่นผ่านการขยายฐานสมาชิกใหม่เข้าพอร์ตทุกธุรกิจ และการรักษาฐานสมาชิกเดิมด้วยกิจกรรมการตลาดที่ตรงกับความต้องการ เน้นพอร์ตลูกหนี้โตอย่างมีคุณภาพเป็นสำคัญ คาดสิ้นปีพอร์ตสินเชื่อรวมมีมูลค่ากว่า 1 แสนล้านบาท และมีประมาณการกำไรปี 2565 ที่สูงกว่าปีก่อนหน้า", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "พิสูจน์อักษร....สุรีย์ ศิลาวงษ์", fontSize = 17.sp)
        }
    }
}
