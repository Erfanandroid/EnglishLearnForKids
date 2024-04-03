package com.example.englishLearnForKids.ui

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.Image
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishLearnForKids.other.AlphabetMembers
import com.example.englishLearnForKids.other.FontClass
import com.example.englishlearnforkids.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Alphabet(context: Context){

    val fontHelper=FontClass()

    val alphabetList=AlphabetMembers()

    var counter by remember {
        mutableIntStateOf(0)
    }

    var capitalLetter by remember {
        mutableStateOf(alphabetList.list[0].capitalLetter)
    }

    var smallLetter by remember {
        mutableStateOf(alphabetList.list[0].smallLetter)
    }

    var img by remember {
        mutableIntStateOf(alphabetList.list[0].img)
    }

    var imgDescription by remember {
        mutableStateOf(alphabetList.list[0].imgDescription)
    }

    var sound by remember {
        mutableIntStateOf(alphabetList.list[0].sound)
    }


    val mp=MediaPlayer.create(context,sound)





    Scaffold(
        topBar = {
            Row(modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
            ) {
                TopAppBar(title = {
                    Box(modifier = Modifier.padding(start = 90.dp)) {
                        Text(text ="Alphabet"
                            , color = Color(red = 255, green = 152, blue = 0, alpha = 255),
                            fontSize = 30.sp,
                            fontFamily = fontHelper.koodakBold
                            , modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp)
                        )
                    }

                },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        Color(red = 0, green = 19, blue = 51, alpha = 255)
                    )
                    ,
                    navigationIcon = {

                        Box(modifier = Modifier.padding(start = 2.dp)){

                            IconButton(onClick = {/*todo*/}
                                , modifier = Modifier
                                    .size(40.dp)
                            ) {

                                Image(painter = painterResource(id = R.drawable.main_back),
                                    contentDescription ="back button"
                                    , modifier = Modifier.fillMaxSize()

                                )
                            }
                        }
                    }

                )
            }

        }
    ) {innerPadding->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
        ){

            Box(modifier = Modifier.fillMaxSize()){
                Image(painter = painterResource(id = R.drawable.alphabet_background)
                    , contentDescription ="background"
                    , contentScale = ContentScale.FillBounds
                    , modifier = Modifier.fillMaxSize()
                )
            }



            Column(modifier = Modifier.fillMaxSize()

            ) {


                Spacer(modifier = Modifier.height(170.dp))
                Row {
                    Spacer(modifier = Modifier.width(115.dp))
                    Column(modifier = Modifier.size(120.dp)){
                        Text(text =capitalLetter
                            , color = Color(blue = 225, green = 153, red = 51),
                            fontSize = 90.sp,
                            fontFamily = fontHelper.abeezee
                        )
                    }

                    Column(modifier = Modifier.size(120.dp)){
                        Text(text =smallLetter
                            , color = Color(blue = 225, green = 153, red = 51),
                            fontSize = 90.sp,
                            fontFamily = fontHelper.abeezee
                        )
                    }

                }

                Row(modifier = Modifier.padding(start = 150.dp)) {
                    Image(painter = painterResource(id = img), contentDescription =imgDescription
                        , modifier = Modifier
                            .size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(modifier = Modifier.padding(start = 140.dp, end = 120.dp)) {

                    Text(text =imgDescription
                        , color = Color(green = 225, red = 0, blue = 0),
                        fontSize = 30.sp,
                        fontFamily = fontHelper.abeezee,
                        maxLines = 1,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()


                    )
                }
            }

            Column(modifier = Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.height(755.dp))
                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    if (capitalLetter!="A" && capitalLetter!="Z"){
                        Spacer(modifier = Modifier.width(10.dp))
                        IconButton(onClick = {
                            if(counter>0){
                                counter--
                            }
                            capitalLetter=alphabetList.list[counter].capitalLetter
                            smallLetter=alphabetList.list[counter].smallLetter
                            img=alphabetList.list[counter].img
                            imgDescription=alphabetList.list[counter].imgDescription
                            sound=alphabetList.list[counter].sound
                        }
                            , modifier = Modifier
                                .size(60.dp)
                                .padding(end = 10.dp, bottom = 5.dp)

                        ) {


                            Image(painter = painterResource(id = R.drawable.back),
                                contentDescription ="back button"
                                , modifier = Modifier.fillMaxSize()

                            )
                        }

                        Spacer(modifier = Modifier.width(110.dp))

                        Column {
                            Spacer(modifier = Modifier.height(7.dp))

                            IconButton(onClick = {mp.start()}
                                , modifier = Modifier.size(45.dp)

                            ) {
                                Image(painter = painterResource(id =R.drawable.sound)
                                    , contentDescription ="sound icon"
                                    , modifier = Modifier.fillMaxSize()
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(125.dp))

                        IconButton(onClick = {
                            if(counter<25){
                                counter++
                            }
                            capitalLetter=alphabetList.list[counter].capitalLetter
                            smallLetter=alphabetList.list[counter].smallLetter
                            img=alphabetList.list[counter].img
                            imgDescription=alphabetList.list[counter].imgDescription
                            sound=alphabetList.list[counter].sound

                        }
                            , modifier = Modifier
                                .size(60.dp)
                                .padding(end = 10.dp, bottom = 5.dp)


                        ) {

                            Image(painter = painterResource(id = R.drawable.next),
                                contentDescription ="next button"
                                , modifier = Modifier.fillMaxSize()

                            )
                        }
                    }else if (capitalLetter =="A"){
                        Spacer(modifier = Modifier.width(180.dp))
                        Column {
                            Spacer(modifier = Modifier.height(7.dp))

                            IconButton(onClick = { mp.start()}
                                , modifier = Modifier.size(45.dp)

                            ) {
                                Image(painter = painterResource(id =R.drawable.sound)
                                    , contentDescription ="sound icon"
                                    , modifier = Modifier.fillMaxSize()
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(125.dp))

                        IconButton(onClick = {
                            counter=1
                            capitalLetter=alphabetList.list[counter].capitalLetter
                            smallLetter=alphabetList.list[counter].smallLetter
                            img=alphabetList.list[counter].img
                            imgDescription=alphabetList.list[counter].imgDescription
                            sound=alphabetList.list[counter].sound
                        }
                            , modifier = Modifier
                                .size(60.dp)
                                .padding(end = 10.dp, bottom = 5.dp)


                        ) {

                            Image(painter = painterResource(id = R.drawable.next),
                                contentDescription ="next button"
                                , modifier = Modifier.fillMaxSize()

                            )
                        }
                    }else{
                        Spacer(modifier = Modifier.width(10.dp))
                        IconButton(onClick = {
                            counter--
                            capitalLetter=alphabetList.list[counter].capitalLetter
                            smallLetter=alphabetList.list[counter].smallLetter
                            img=alphabetList.list[counter].img
                            imgDescription=alphabetList.list[counter].imgDescription
                            sound=alphabetList.list[counter].sound

                        }
                            , modifier = Modifier
                                .size(60.dp)
                                .padding(end = 10.dp, bottom = 5.dp)


                        ) {


                            Image(painter = painterResource(id = R.drawable.back),
                                contentDescription ="back button"
                                , modifier = Modifier.fillMaxSize()

                            )
                        }

                        Spacer(modifier = Modifier.width(110.dp))


                        Column {
                            Spacer(modifier = Modifier.height(7.dp))

                            IconButton(onClick = { mp.start() }
                                , modifier = Modifier.size(45.dp)

                            ) {
                                Image(painter = painterResource(id =R.drawable.sound)
                                    , contentDescription ="sound icon"
                                    , modifier = Modifier.fillMaxSize()
                                )
                            }
                        }

                    }


                }

            }

        }

    }





}