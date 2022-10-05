package com.example.kidsshop.presentation.bottomnavigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kidsshop.presentation.history.HistoryScreen
import com.example.kidsshop.presentation.home.HomeScreen
import com.example.kidsshop.presentation.orders.OrdersScreen

@Composable
fun BottomNavGraph(navController: NavHostController,context: Context) {

    NavHost(navController = navController, startDestination = BottomNavItems.Home.route) {
        composable(BottomNavItems.Home.route) { HomeScreen(context) }
        composable(BottomNavItems.Orders.route) { OrdersScreen() }
        composable(BottomNavItems.History.route) { HistoryScreen() }
    }
}