package com.example.bookcompose.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bookcompose.home.components.TabBar
import com.example.bookcompose.home.components.TopAppBar
import com.example.bookcompose.ui.theme.BookComposeTheme

/**
 * @author : Mingaleev D
 * @data : 13.06.2023
 */

@Composable
fun HomeScreen() {
   Box(
       modifier = Modifier
           .background(MaterialTheme.colors.background)
           .fillMaxSize()
   ) {
      LazyColumn() {
         item {
            TopAppBar()
         }
         item {
            TabBar()
         }
      }


   }
}


@Preview
@Composable
fun PrevHomeScreen() {
   BookComposeTheme {
      HomeScreen()

   }
}