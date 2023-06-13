package com.example.bookcompose.home.components

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Newspaper
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Store
import androidx.compose.material.icons.rounded.Tv
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

/**
 * @author : Mingaleev D
 * @data : 13.06.2023
 */

@Composable fun TabBar() {
   Surface {
      var tabIndex by remember {
         mutableStateOf(0)
      }
      TabRow(
          selectedTabIndex = tabIndex,
          backgroundColor = Color.Transparent,
          contentColor = MaterialTheme.colors.primary
      ) {
         val tabs = listOf(
             TabItem(Icons.Rounded.Home, ""),
             TabItem(Icons.Rounded.Tv, ""),
             TabItem(Icons.Rounded.Store, ""),
             TabItem(Icons.Rounded.Newspaper, ""),
             TabItem(Icons.Rounded.Notifications, ""),
             TabItem(Icons.Rounded.Menu, ""),

             )
         tabs.forEachIndexed { indexNumber, imageVector ->

            Tab(
                selected = tabIndex == indexNumber,
                onClick = { tabIndex = indexNumber },
                modifier = Modifier.heightIn(48.dp)
            ) {
               Icon(
                   imageVector = imageVector.icon,
                   contentDescription = imageVector.contentDescription,
                   tint = if (indexNumber == tabIndex) {
                      MaterialTheme.colors.primary
                   } else {
                      MaterialTheme.colors.onSurface.copy(alpha = 0.44f)
                   }
               )
            }
         }
      }
   }
}

data class TabItem(
    val icon: ImageVector,
    val contentDescription: String
)