package com.example.kidsshop.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.kidsshop.R
import com.example.kidsshop.ui.theme.ToolbarBackColor

@Composable
fun HomeToolBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = ToolbarBackColor)
    ) {
        Text(
            text = "Kids Clothes shop",
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(4.dp),
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold
        )
        Image(
            modifier = Modifier
                .align(
                    Alignment.CenterEnd
                )
                .padding(4.dp),
            painter = painterResource(id = R.drawable.ic_settings),
            contentDescription = null,


            )
    }
}