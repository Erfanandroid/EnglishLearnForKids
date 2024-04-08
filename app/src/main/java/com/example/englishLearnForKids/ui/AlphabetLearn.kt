package com.example.englishLearnForKids.ui

import android.content.Context
import android.content.res.Configuration
import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishLearnForKids.other.AlphabetMembers
import com.example.englishLearnForKids.other.FontClass
import com.example.englishLearnForKids.ui.theme.ScreenOrientation
import com.example.englishLearnForKids.ui.theme.dimens
import com.example.englishlearnforkids.R


@Composable
fun AlphabetLearn(context: Context){

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
            TopBarSection(fontHelper)
        }
    ) {innerPadding->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
        ){



            ItemSection(capitalLetter, fontHelper, smallLetter, img, imgDescription)


            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 20.dp)
                , horizontalArrangement = Arrangement.SpaceBetween
            ) {

                if (capitalLetter != "A" && capitalLetter != "Z") {

                    Row(
                        modifier = Modifier
                            .padding(start = MaterialTheme.dimens.small1)
                    ) {

                        IconButton(onClick = {
                            if (counter > 0) {
                                counter--
                            }
                            capitalLetter = alphabetList.list[counter].capitalLetter
                            smallLetter = alphabetList.list[counter].smallLetter
                            img = alphabetList.list[counter].img
                            imgDescription = alphabetList.list[counter].imgDescription
                            sound = alphabetList.list[counter].sound
                        }, modifier = Modifier
                            .size(MaterialTheme.dimens.medium3)
                        ) {


                            Image(
                                painter = painterResource(id = R.drawable.back),
                                contentDescription = "back button", modifier = Modifier.fillMaxSize()

                            )
                        }
                    }




                    Row(
                        modifier = Modifier


                    ) {
                        IconButton(onClick = { mp.start() },
                            modifier = Modifier.size(MaterialTheme.dimens.large1)


                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.sound),
                                contentDescription = "sound icon",
                                modifier = Modifier.fillMaxSize()

                            )
                        }
                    }



                    Row(
                        modifier = Modifier
                            .padding(end = MaterialTheme.dimens.small1)
                    ) {
                        IconButton(onClick = {
                            if (counter < 25) {
                                counter++
                            }
                            capitalLetter = alphabetList.list[counter].capitalLetter
                            smallLetter = alphabetList.list[counter].smallLetter
                            img = alphabetList.list[counter].img
                            imgDescription = alphabetList.list[counter].imgDescription
                            sound = alphabetList.list[counter].sound

                        }, modifier = Modifier
                            .size(MaterialTheme.dimens.medium3)

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.next),
                                contentDescription = "next button", modifier = Modifier.fillMaxSize()

                            )
                        }
                    }

                } else if (capitalLetter == "A") {

                    Row(
                        modifier = Modifier
                            .padding(start = MaterialTheme.dimens.small1)
                            .alpha(0f)
                    ) {

                        IconButton(onClick = {}, modifier = Modifier
                            .size(MaterialTheme.dimens.medium3)

                        ) {}
                    }

                    Row(
                        modifier = Modifier

                    ) {
                        IconButton(onClick = { mp.start() },
                            modifier = Modifier.size(MaterialTheme.dimens.large1)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.sound),
                                contentDescription = "sound icon",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }

                    Row(
                        modifier = Modifier.padding(end = MaterialTheme.dimens.small1)
                    ) {
                        IconButton(onClick = {
                            counter = 1
                            capitalLetter = alphabetList.list[counter].capitalLetter
                            smallLetter = alphabetList.list[counter].smallLetter
                            img = alphabetList.list[counter].img
                            imgDescription = alphabetList.list[counter].imgDescription
                            sound = alphabetList.list[counter].sound
                        }, modifier = Modifier
                            .size(MaterialTheme.dimens.medium3)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.next),
                                contentDescription = "next button", modifier = Modifier.fillMaxSize()
                            )
                        }
                    }


                } else {
                    Row(
                        modifier = Modifier
                            .padding(start = MaterialTheme.dimens.small1)
                    ) {

                        IconButton(onClick = {
                            counter--
                            capitalLetter = alphabetList.list[counter].capitalLetter
                            smallLetter = alphabetList.list[counter].smallLetter
                            img = alphabetList.list[counter].img
                            imgDescription = alphabetList.list[counter].imgDescription
                            sound = alphabetList.list[counter].sound
                        }, modifier = Modifier
                            .size(MaterialTheme.dimens.medium3)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back),
                                contentDescription = "back button", modifier = Modifier.fillMaxSize()
                            )
                        }
                    }


                    Row(
                        modifier = Modifier
                    ) {
                        IconButton(onClick = { mp.start() },
                            modifier = Modifier.size(MaterialTheme.dimens.large1)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.sound),
                                contentDescription = "sound icon",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }



                    Row(
                        modifier = Modifier
                            .padding(end = MaterialTheme.dimens.small1)
                            .alpha(0f)
                    ) {
                        IconButton(onClick = {}, modifier = Modifier
                            .size(MaterialTheme.dimens.medium3)
                        ) {}
                    }
                }

            }

        }
    }



}




@Composable
private fun ItemSection(
    capitalLetter: String,
    fontHelper: FontClass,
    smallLetter: String,
    img: Int,
    imgDescription: String
) {
    if (ScreenOrientation==Configuration.ORIENTATION_PORTRAIT) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = MaterialTheme.dimens.large3),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row {

                Column {
                    Text(
                        text = capitalLetter, color = Color(blue = 225, green = 153, red = 51),
                        fontSize = MaterialTheme.dimens.large2.value.sp,
                        fontFamily = fontHelper.abeezee
                    )
                }

                Spacer(modifier = Modifier.width(MaterialTheme.dimens.small2))

                Column {
                    Text(
                        text = smallLetter, color = Color(blue = 225, green = 153, red = 51),
                        fontSize = MaterialTheme.dimens.large2.value.sp,
                        fontFamily = fontHelper.abeezee
                    )
                }
            }

            Spacer(modifier = Modifier.height(MaterialTheme.dimens.medium1))

            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = imgDescription,
                    modifier = Modifier
                        .size(MaterialTheme.dimens.large3)
                )
            }


            Spacer(modifier = Modifier.height(MaterialTheme.dimens.medium1))

            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = imgDescription, color = Color(green = 225, red = 0, blue = 0),
                    fontSize = MaterialTheme.dimens.medium3.value.sp,
                    fontFamily = fontHelper.abeezee,
                    maxLines = 1,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }else if (ScreenOrientation==Configuration.ORIENTATION_LANDSCAPE){

        Row(
            modifier = Modifier
                .fillMaxSize()
                .horizontalScroll(rememberScrollState())
                .padding(bottom = MaterialTheme.dimens.large1),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {

                Column {
                    Text(
                        text = capitalLetter, color = Color(blue = 225, green = 153, red = 51),
                        fontSize = MaterialTheme.dimens.large2.value.sp,
                        fontFamily = fontHelper.abeezee
                    )
                }

                Spacer(modifier = Modifier.width(MaterialTheme.dimens.small2))

                Column {
                    Text(
                        text = smallLetter, color = Color(blue = 225, green = 153, red = 51),
                        fontSize = MaterialTheme.dimens.large2.value.sp,
                        fontFamily = fontHelper.abeezee
                    )
                }
            }

            Spacer(modifier = Modifier.width(MaterialTheme.dimens.medium1))

            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = imgDescription,
                    modifier = Modifier
                        .size(MaterialTheme.dimens.large3)
                )
            }


            Spacer(modifier = Modifier.width(MaterialTheme.dimens.medium1))

            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = imgDescription, color = Color(green = 225, red = 0, blue = 0),
                    fontSize = MaterialTheme.dimens.medium3.value.sp,
                    fontFamily = fontHelper.abeezee,
                    maxLines = 1,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}




@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun TopBarSection(fontHelper: FontClass) {
    Row(
        modifier = Modifier
            .height(MaterialTheme.dimens.medium3)
            .fillMaxWidth()
    ) {
        TopAppBar(
            title = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = MaterialTheme.dimens.small2),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    Text(
                        text = "Alphabet",
                        color = Color(red = 255, green = 152, blue = 0, alpha = 255),
                        fontSize = MaterialTheme.dimens.medium1.value.sp,
                        fontFamily = fontHelper.koodakBold,
                        modifier = Modifier
                            .padding(top = MaterialTheme.dimens.small1)
                    )
                }

            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                Color(red = 0, green = 19, blue = 51, alpha = 255)
            ),
            navigationIcon = {

                Box(modifier = Modifier.padding(start = 2.dp)) {

                    IconButton(onClick = {/*todo*/ }, modifier = Modifier
                        .size(MaterialTheme.dimens.medium2)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.main_back),
                            contentDescription = "back button", modifier = Modifier.fillMaxSize()

                        )
                    }
                }
            }

        )
    }
}