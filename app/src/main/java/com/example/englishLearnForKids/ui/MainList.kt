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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import com.example.englishLearnForKids.other.FontClass
import com.example.englishLearnForKids.other.MainListMembers
import com.example.englishlearnforkids.R




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainList(navController: NavController){

    val fontHelper=FontClass()

    var showDialog by remember {
        mutableStateOf(false)
    }



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
                Spacer(modifier = Modifier.height(15.dp))

                Column(Modifier.fillMaxSize()) {
                    LazyVerticalGrid(
                        columns =GridCells.Fixed(2)
                        , modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, bottom = 3.dp)

                    ) {
                        val mainList=MainListMembers()
                        items(
                            mainList.list
                            ,key = {
                                it.id
                            }
                        ){item->
                            Column(modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 40.dp)
                            ) {
                                ElevatedCard(
                                  shape = RoundedCornerShape(8.dp),
                                    elevation = CardDefaults.elevatedCardElevation(6.dp)
                                    , modifier = Modifier
                                        .size(150.dp)
                                        .clickable {
                                            showDialog = true
                                        }
                                ) {
                                    Image(painter = painterResource(id = item.img)
                                        , contentDescription =item.title
                                    , contentScale = ContentScale.FillBounds
                                    )
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(text = item.title
                                , textAlign = TextAlign.Center,
                                    fontFamily = fontHelper.abeezee,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(blue = 153, green = 0, red = 0),
                                    fontSize = 25.sp,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                )

                                Text(text = item.translation
                                    , textAlign = TextAlign.Center,
                                    fontFamily = fontHelper.koodakBold,
                                    color = Color(blue = 0, green = 102, red = 0),
                                    fontSize = 25.sp,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                )


                            }
                        }
                    }
                }





            }



        }

        //------MainList Code Finished





        //----------Start of Dialog Code

        if (showDialog) {
            AlertDialog(onDismissRequest = {
                showDialog=false
                                           },
                properties = DialogProperties(
                    dismissOnBackPress = true
                    ,dismissOnClickOutside = true
                ),


                modifier = Modifier.clip(shape = RoundedCornerShape(20.dp) )) {


                Box(
                    modifier = Modifier
                        .height(500.dp)
                        .width(350.dp)
                ){
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 30.dp)
                            .clip(shape = RoundedCornerShape(30.dp))
                    ){
                        Column(
                            Modifier
                                .background(Color(red = 224, green = 224, blue = 224, alpha = 255))
                                .height(450.dp)

                        ) {


                            Card(
                                modifier = Modifier
                                    .height(120.dp)
                                    .width(260.dp)
                                    .padding(start = 10.dp, top = 30.dp, end = 11.dp),
                                colors = CardDefaults.cardColors(
                                    Color(red = 253, green = 98, blue = 8)
                                )
                            ) {

                                Row(Modifier.fillMaxSize()) {
                                    Text(
                                        text = "LEARN",
                                        modifier = Modifier
                                            .fillMaxSize(0.4f)
                                            .padding(top = 10.dp, start = 7.dp),
                                        textAlign = TextAlign.Start,
                                        color = Color.White,
                                        fontFamily = fontHelper.chicle,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )

                                    Image(
                                        painter = painterResource(id = R.drawable.learingicon),
                                        contentDescription = "",
                                        alignment = Alignment.CenterEnd,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(end = 10.dp)
                                    )
                                }


                            }

                            Spacer(modifier = Modifier.height(12.dp))


                            Card(
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(260.dp)
                                    .padding(start = 10.dp, end = 11.dp),
                                colors = CardDefaults.cardColors(
                                    Color(red = 253, green = 229, blue = 8)
                                )
                            ) {
                                Row(Modifier.fillMaxSize()) {

                                    Text(
                                        text = "WRITING",
                                        modifier = Modifier
                                            .fillMaxSize(0.4f)
                                            .padding(top = 10.dp, start = 7.dp),
                                        textAlign = TextAlign.Start,
                                        color = Color.White,
                                        fontFamily = fontHelper.chicle,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.writing_icon),
                                        contentDescription = "",
                                        alignment = Alignment.CenterEnd,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(end = 5.dp)
                                    )

                                }

                            }

                            Spacer(modifier = Modifier.height(12.dp))


                            Card(
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(260.dp)
                                    .padding(start = 10.dp, end = 11.dp),
                                colors = CardDefaults.cardColors(
                                    Color(red = 0, green = 153, blue = 76)
                                )
                            ) {
                                Row(Modifier.fillMaxSize()) {
                                    Text(
                                        text = "FIND THE WORD",
                                        modifier = Modifier
                                            .fillMaxWidth(0.4f)
                                            .padding(top = 10.dp, start = 7.dp),
                                        textAlign = TextAlign.Start,
                                        color = Color.White,
                                        fontFamily = fontHelper.chicle,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.findwords),
                                        contentDescription = "",
                                        alignment = Alignment.CenterEnd,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(end = 10.dp)
                                    )
                                }

                            }
                            Spacer(modifier = Modifier.height(12.dp))

                            Card(
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(260.dp)
                                    .padding(start = 10.dp, end = 11.dp),
                                colors = CardDefaults.cardColors(
                                    Color(red = 255, green = 50, blue = 127)
                                )
                            ) {
                                Row(Modifier.fillMaxSize()) {
                                    Text(
                                        text = "FIND THE PICTURE",
                                        modifier = Modifier
                                            .fillMaxWidth(0.4f)
                                            .padding(top = 10.dp, start = 7.dp),
                                        textAlign = TextAlign.Start,
                                        color = Color.White,
                                        fontFamily = fontHelper.chicle,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.findpictures),
                                        contentDescription = "",
                                        alignment = Alignment.CenterEnd,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(end = 10.dp)
                                    )
                                }

                            }
                        }
                    }

                    Row {
                        Spacer(modifier = Modifier.width(250.dp))

                        IconButton(onClick = {showDialog=false}
                            , modifier = Modifier
                                .size(60.dp)
                                .padding(end = 10.dp, bottom = 5.dp)


                        ) {

                            Image(painter = painterResource(id = R.drawable.close_button),
                                contentDescription ="",
                                alignment = Alignment.TopEnd
                                , modifier = Modifier

                            )
                        }
                    }
                }

            }


    }
}

}



