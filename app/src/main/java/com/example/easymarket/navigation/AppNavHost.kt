package com.example.easymarket.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easymarket.ui.theme.pages.home.HomeScreen
import com.example.easymarket.ui.theme.pages.products.ProductsScreen
import com.example.easymarket.ui.theme.pages.profile.ProfileScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME) {
    NavHost(navController = navController,
        modifier = modifier, startDestination = startDestination
    ) {
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_PRODUCTS){
            ProductsScreen(navController)
        }
        composable(ROUTE_PROFILE){
            ProfileScreen(navController)
        }


    }
}