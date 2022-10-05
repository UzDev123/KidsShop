package com.example.kidsshop.presentation.bottomnavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.kidsshop.ui.theme.BottomNavItemsSelectedColor
import com.example.kidsshop.ui.theme.BottomNavItemsUnSelectedColor
import com.example.kidsshop.ui.theme.BottomNavigationBackgroundColor

@Composable
fun CustomBottomNavigation(navController: NavController) {
    val items = listOf(BottomNavItems.Home, BottomNavItems.Orders, BottomNavItems.History)

    BottomNavigation(
        backgroundColor = BottomNavigationBackgroundColor,
        contentColor = Color.Black
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route


        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon), contentDescription = item.title
                    )
                },
                label = { Text(text = item.title, fontSize = 11.sp) },
                selectedContentColor = BottomNavItemsSelectedColor,
                unselectedContentColor = BottomNavItemsUnSelectedColor,
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(route = it) {
                                saveState = true
                            }

                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
            )

        }

    }


}