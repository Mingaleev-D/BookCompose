package com.example.bookcompose.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bookcompose.home.HomeScreen
import com.example.bookcompose.ui.theme.BookComposeTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         BookComposeTheme {
            TransparentSystemBar()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
               val navController = rememberNavController()
               NavHost(navController = navController, startDestination = "home") {
                  composable("home") {
                     HomeScreen()
                  }
               }
            }
         }
      }
   }

   @Composable
   fun TransparentSystemBar() {
      val systemUiController = rememberSystemUiController()
      val useDarkIcons = !isSystemInDarkTheme()

      DisposableEffect(systemUiController, useDarkIcons) {
         systemUiController.setSystemBarsColor(
             color = Color.Transparent,
             darkIcons = useDarkIcons
         )

         onDispose {}
      }
   }
}

@Composable
fun Greeting(name: String) {
   Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   BookComposeTheme {
      Greeting("Android")
   }
}