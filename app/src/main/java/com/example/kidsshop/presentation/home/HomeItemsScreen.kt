package com.example.kidsshop.presentation.home

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kidsshop.data.Cloth
import com.example.kidsshop.ui.theme.DividerColor

@Composable
fun HomeItemsScreen(cloth: Cloth, context: Context) {
    Box(
        modifier = Modifier
            .height(160.dp)
            .fillMaxWidth()
            .clickable {
                Toast
                    .makeText(context, cloth.title, Toast.LENGTH_SHORT)
                    .show()
            }

    ) {
        Row(
            Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier
                    .background(
                        shape = RoundedCornerShape(corner = CornerSize(32f)),
                        color = Color.Transparent
                    )
                    .size(width = 147.dp, height = 147.dp)
                    .padding(8.dp),
                elevation = 4.dp
            ) {
                Image(
                    painter = painterResource(id = cloth.icon),
                    modifier = Modifier
                        .fillMaxSize(),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

            }

            Column(Modifier.fillMaxWidth(0.7f)) {
                Text(
                    text = cloth.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )
                Text(text = cloth.desc, fontFamily = FontFamily.Serif, fontSize = 12.sp)
                RatingBar(
                    rating = cloth.rate,
                    color = Color.Yellow,
                    modifier = Modifier.height(16.dp)
                )
            }
            Column {
                Image(
                    painter = painterResource(id = if (cloth.itHasHistory) com.example.kidsshop.R.drawable.ic_bookmark_added else com.example.kidsshop.R.drawable.ic_bookmark_add),
                    contentDescription = cloth.title,
                    modifier = Modifier.clickable {
                        Toast.makeText(context, cloth.price.toString(), Toast.LENGTH_SHORT).show()
                    }.padding(8.dp)
                )
                Text(
                    text = "$" + cloth.price.toString(),
                    Modifier.padding(4.dp),
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif
                )
            }
        }
        Divider(
            startIndent = 8.dp,
            thickness = 0.7.dp, color = DividerColor, modifier = Modifier
                .align(
                    Alignment.BottomEnd
                )
                .padding(end = 8.dp)
        )
    }


}