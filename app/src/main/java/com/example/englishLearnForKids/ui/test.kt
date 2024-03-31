package com.example.englishLearnForKids.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.englishlearnforkids.R

@Composable
fun ColumnWithButton() {

    Box(modifier = Modifier
        .size(320.dp)
        .background(Color.Blue)

    ){
        Column(
            modifier = Modifier.padding(top = 25.dp)
        ) {

            Column(modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(230.dp)
            ) {

            }
        }
        Column(modifier = Modifier.padding(top = 0.dp)
           // .background(Color.Magenta)
        ) {
            IconButton(onClick = { /*TODO*/ }
                , modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
//                    .background(Color.Green)
                    //.padding(top = 10.dp)

            ) {
                Image(painter = painterResource(id = R.drawable.close_foreground),
                    contentDescription ="",
                    alignment = Alignment.TopEnd
                    , modifier = Modifier
                        .fillMaxWidth()
//                        .background(Color.Yellow)

                )
            }
        }

    }
}