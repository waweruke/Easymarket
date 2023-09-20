package com.example.easymarket.ui.theme.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.easymarket.R
import com.example.easymarket.navigation.ROUTE_PRODUCTS
import com.example.easymarket.navigation.ROUTE_PROFILE
import com.example.easymarket.ui.theme.EasyMarketTheme

@Composable
fun HomeScreen(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background1),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(painter = painterResource(id = R.drawable.shoppingcart),
            contentDescription =null,
            Modifier.size(170.dp,)
        )

        Text(text = "Welcome to home screen",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold)

        Button(onClick = { navController.navigate(ROUTE_PRODUCTS) }) {
            Text(text = "Products")
        }
        Button(onClick = { navController.navigate(ROUTE_PROFILE) }) {
            Text(text = "Profile")
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    EasyMarketTheme {
HomeScreen(rememberNavController())
    }
}