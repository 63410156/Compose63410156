package com.example.compose63410156

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Pagehome(navController: NavController) {
    Column() {
        TopAppBar(title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(modifier = Modifier.padding(1.dp)) {
                    Text(
                        "ข่าว", style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }
            }

        }, backgroundColor = Color(0xFFffffff))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("B") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "08:18 · 20 ต.ค. · BangkokBizNews",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                            Text(
                                "DJIA:ตลาดหุ้นนิวยอร์ค:ผลประกอบการโกลด์แมน,ล็อคฮีดหนุนตลาดหุ้นพุ่งขึ้น", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("C") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "08:18 · 20 ต.ค. · BangkokBizNews",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                            Text(
                                "KTC โชว์กำไร 9 เดือน 5,414 ล้านบาท มุ่งขยายฐานสมาชิกคุณภาพ", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("D") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "08:18 · 20 ต.ค. · BangkokBizNews",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                            Text(
                                "แบงก์ชาติอินโดนีเซียขึ้นดอกเบี้ยอีก 0.5% สกัดเงินเฟ้อ - พยุงค่าเงิน", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("E") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "08:18 · 20 ต.ค. · BangkokBizNews",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                            Text(
                                "'อีลอน มัสก์' ชี้จีนประสบภาวะคล้ายศก.ถดถอย เหตุตลาดอสังหาฯตกต่ำนานนับปี", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("F") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "08:18 · 20 ต.ค. · BangkokBizNews",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                            Text(
                                "\"ราคาน้ำมันพรุ่งนี้ 2565\" 21 ต.ค.65 อัปเดตราคาน้ำมันกลุ่มเบนซิน, แก๊สโซฮอล์, ดีเซล", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}