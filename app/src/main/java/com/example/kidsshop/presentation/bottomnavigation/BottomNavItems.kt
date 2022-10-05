package com.example.kidsshop.presentation.bottomnavigation

import com.example.kidsshop.R

sealed class BottomNavItems(val title: String, val icon: Int, val route: String) {
    object Home : BottomNavItems("Home", R.drawable.ic_home, "home")
    object Orders : BottomNavItems("Orders", R.drawable.ic_order_in_way, "orders")
    object History : BottomNavItems("History", R.drawable.ic_history, "history")

}
