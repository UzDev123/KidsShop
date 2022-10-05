package com.example.kidsshop.presentation.home

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.kidsshop.R
import com.example.kidsshop.data.Cloth

@Composable
fun HomeScreen(context: Context) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        HomeToolBar()
        LazyColumn {
            items(fakeList()) { data ->
                HomeItemsScreen(data, context)


            }
        }
    }


}

fun fakeList(): List<Cloth> {
    val clothList = ArrayList<Cloth>()

    clothList.add(
        Cloth(
            icon = R.drawable.ic_shoes,
            title = "Shoes",
            desc = "It is simple shoes for little ladies",
            rate = 4.1f,
            price = 13.99f,
            itHasHistory = false
        )
    )
    clothList.add(
        Cloth(
            icon = R.drawable.ic_slim_jeans,
            title = "Slim jean",
            desc = "It is simple Slim jean for child",
            rate = 2.3f,
            price = 39.50f,
            itHasHistory = true
        )
    )
    clothList.add(
        Cloth(
            icon = R.drawable.ic_full_clothes,
            title = "Full clothes",
            desc = "It is Long sleeve button down in chambray",
            rate = 5.0f,
            price = 52.03f,
            itHasHistory = false
        )
    )
    clothList.add(
        Cloth(
            icon = R.drawable.ic_baby_clothes,
            title = "Baby cloth",
            desc = "Baby organic zip footie in candy stars",
            rate = 4.6f,
            price = 41.99f,
            itHasHistory = false
        )
    )
    clothList.add(
        Cloth(
            icon = R.drawable.ic_jacket,
            title = "Kids jacket",
            desc = "Kids lightweight puffer jacket",
            rate = 4.8f,
            price = 58.00f,
            itHasHistory = true
        )
    )

    return clothList
}