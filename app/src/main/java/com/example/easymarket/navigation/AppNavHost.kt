package com.example.easymarket.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easymarket.ui.theme.pages.home.HomeScreen
import com.example.easymarket.ui.theme.pages.products.ProductsScreen
import com.example.easymarket.ui.theme.pages.profile.ProfileScreen
import com.example.easymarket.ui.theme.pages.splash.Splash

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH) {
    NavHost(navController = navController,
        modifier = modifier, startDestination = startDestination
    ) {
        composable(ROUTE_SPLASH){
            Splash(navController)
        }
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