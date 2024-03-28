package com.example.englishLearnForKids.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishLearnForKids.other.FontClass
import com.example.englishlearnforkids.R




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainList(){

    val fontHelper=FontClass()

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 10.dp)
    ) {
        Scaffold(topBar = {
            TopAppBar(title = {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Hello Little \n Student"
                        , modifier = Modifier
                            .padding(top = 0.dp)
                        , color = Color(red = 63, green = 4, blue = 122, alpha = 255),
                        fontFamily = fontHelper.Mouse_Mem ,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Left,
                        fontSize = 30.sp,
                    )

                    Spacer(modifier = Modifier.width(250.dp))

                    Box(modifier = Modifier.padding(top = 10.dp)){
                        Box(modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                            .background(Color(red = 230, green = 226, blue = 226, alpha = 255))
                            .padding(top = 2.dp, start = 2.dp)
                            .clickable {/* todo */ }
                        ){
                            Icon(painter = painterResource(id = R.drawable.star), contentDescription ="star"
                                , tint = Color(red = 255, green = 152, blue = 0, alpha = 255),
                                modifier = Modifier.size(30.dp)

                            )
                        }
                    }
                }
            }
            )

        }
            ,


        ){innerPadding->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxWidth()

                    , verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                ElevatedCard(modifier = Modifier
                    .height(150.dp)
                    .width(370.dp)
                    , elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    )
                    , shape = RoundedCornerShape(25.dp)
                    , colors = CardDefaults.elevatedCardColors(
                        containerColor = Color(red = 208, green = 233, blue = 245, alpha = 255)
                    )
                    ,
                    content = {
                        Row (modifier = Modifier.fillMaxSize()){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.dinosaur),
                                    contentDescription ="dinosaur pic" )
                                
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Column(modifier = Modifier
                                .fillMaxSize()
                                // .background(Color.Red)
                                .size(50.dp)
                            ) {
                                Text(text = "آموزش زبان مبتدی \nبرای کودکان"
                                , modifier = Modifier.padding(top = 10.dp,start = 35.dp)
                                    , fontFamily = fontHelper.vorujak
                                    , fontWeight = FontWeight.Bold
                                    , textAlign = TextAlign.Right
                                    , fontSize = 30.sp
                                    , color = Color(blue = 102, red = 0, green = 0)
                                )

                                Spacer(modifier = Modifier.height(30.dp))

                                Text(text = "از گزینه های زیر انتخاب کنید"
                                , modifier = Modifier.padding(start = 30.dp)
                                    , fontFamily = fontHelper.vorujak
                                    , textAlign = TextAlign.Right
                                    , fontSize = 25.sp
                                    , color = Color(green = 153, red = 0, blue = 0)
                                )

                            }
                            
                        }
                        
                    }



                )

            }



        }


    }
}




