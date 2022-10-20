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

fun Pageone(navController: NavController) {
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
            Text(text = "DJIA:ตลาดหุ้นนิวยอร์ค:ผลประกอบการโกลด์แมน,ล็อคฮีดหนุนตลาดหุ้นพุ่งขึ้น", fontSize = 24.sp, fontWeight = FontWeight.W800,)
            Text(text = "", fontSize = 17.sp)
            Text(text = "08:18 · 20 ต.ค.", fontSize = 13.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "ตลาดหุ้นสหรัฐปิดพุ่งขึ้นเป็นวันที่ 2 ติดต่อกันในวันอังคาร ในขณะที่ธนาคารโกลด์แมน แซคส์และบริษัทล็อคฮีด มาร์ตินซึ่งเป็นบริษัทผลิตอาวุธเปิดเผยผลประกอบการที่แข็งแกร่ง และปัจจัยดังกล่าวช่วยลดความกังวลของนักลงทุนที่มีต่อฤดูการรายงานผลประกอบการไตรมาสสาม ทั้งนี้ หุ้นโกลด์แมน แซคส์ กรุ๊ปพุ่งขึ้น 2.33% หลังจากโกลด์แมนรายงานว่าผลกำไรรายไตรมาสลดลงไม่มากเท่าที่คาด โดยผลกำไรของโกลด์แมนได้รับแรงหนุนจากรายได้ดอกเบี้ยสุทธิ ซึ่งช่วยชดเชยการชะลอตัวในแผนกวาณิชธนกิจ นอกจากนี้ บริษัทการเงินขนาดใหญ่แห่งอื่น ๆ ของสหรัฐก็เปิดเผยผลประกอบการที่แข็งแกร่งออกมาด้วยเช่นกันในช่วงไม่กี่วันที่ผ่านมา ถึงแม้ธนาคารบางแห่งปรับเพิ่มการกันสำรองหนี้สูญเพื่อรับมือกับปัญหาที่อาจเกิดขึ้นในอนาคต", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "(รอยเตอร์ โดย จิตร โพธิ์แก้ว แปลและเรียบเรียง)" ,fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "((jit.phokaew@thomsonreuters.com; โทร 08-7689-6043;", fontSize = 17.sp)
        }
    }
}
