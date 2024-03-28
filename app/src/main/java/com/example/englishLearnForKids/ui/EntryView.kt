package com.example.englishLearnForKids.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.englishlearnforkids.R

@Composable
fun EntryView(){

    Box(modifier = Modifier
        .fillMaxSize()
    ){
        Image(painter = painterResource(id= R.drawable.entry_pic),
            contentDescription ="beautiful picture to motivate kids",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
    }

}