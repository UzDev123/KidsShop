package com.example.kidsshop.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.kidsshop.presentation.bottomnavigation.BottomNavGraph
import com.example.kidsshop.presentation.bottomnavigation.CustomBottomNavigation
import com.example.kidsshop.ui.theme.KidsShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KidsShopTheme {

                val navController = rememberNavController()
                Scaffold(bottomBar = { CustomBottomNavigation(navController = navController) }) {
                    BottomNavGraph(navController = navController,this)
                }

            }
        }
    }
}

