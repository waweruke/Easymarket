package com.example.easymarket.ui.theme.pages.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
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
import com.example.easymarket.R
import com.example.easymarket.ui.theme.EasyMarketTheme

@Composable
fun SignUpScreen() {
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



        Text(text = "SignUpHere",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold)


    }
}

@Preview
@Composable
fun SignupScreenPreview() {
    EasyMarketTheme {
SignUpScreen()
    }
}