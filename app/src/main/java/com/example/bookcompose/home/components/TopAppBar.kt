package com.example.bookcompose.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.bookcompose.R

/**
 * @author : Mingaleev D
 * @data : 13.06.2023
 */

@Composable
fun TopAppBar() {
   Surface() {
      Row(
          modifier = Modifier
              .fillMaxWidth()
              .padding(horizontal = 8.dp, vertical = 8.dp),
          verticalAlignment = Alignment.CenterVertically
      ) {
         Text(
             text = stringResource(id = R.string.app_name),
             style = MaterialTheme.typography.h5,
             color = Color.Green,
             fontWeight = FontWeight.Bold
         )
         Spacer(modifier = Modifier.weight(1f))
         IconButton(
             onClick = { /*TODO*/ }, modifier = Modifier
             .padding(end = 8.dp)
             .clip(CircleShape)
             .background(Color.LightGray)
         ) {
            Icon(imageVector = Icons.Rounded.Search, contentDescription = null)
         }
         IconButton(
             onClick = { /*TODO*/ }, modifier = Modifier
             .clip(CircleShape)
             .background(Color.LightGray)
         ) {
            Icon(imageVector = Icons.Rounded.Message, contentDescription = null)
         }
      }
   }

}