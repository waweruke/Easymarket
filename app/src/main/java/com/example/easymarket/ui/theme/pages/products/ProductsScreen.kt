package com.example.easymarket.ui.theme.pages.products

import ProductRepository
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.easymarket.R
import com.example.easymarket.models.Product
import com.example.easymarket.navigation.ROUTE_HOME
import com.example.easymarket.ui.theme.EasyMarketTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(navController:NavHostController) {
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

        Text(text = "All Products",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold)

        Button(onClick = { navController.navigate(ROUTE_HOME) }) {
            Text(text = "home")
        }
        Button(onClick = { navController.navigate(ROUTE_HOME) }) {
            Text(text = "Profile")
        }
    }


    @Composable
    fun ViewProductsScreen(navController:NavHostController) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            var context = LocalContext.current
            var ProductRepository = ProductRepository(navController, context)


            val emptyProductState = remember { mutableStateOf(Product("","","","")) }
            var emptyProductsListState = remember { mutableStateListOf<Product>() }

            var products = ProductRepository.viewproducts(emptyProductState, emptyProductsListState)


            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Text(text = "All Products",
                //   fontSize = 30.sp,
                //  fontFamily = FontFamily.Cursive,
                //color = Color.Red)

                Spacer(modifier = Modifier.height(20.dp))

                LazyColumn(){
                    items(Product){
                        ProductItem(
                            name = it.name,
                            description = it.description,
                            price = it.price,
                            id = it.id,
                            navController = navController,
                            ProductRepository = ProductRepository
                        )
                    }
                }
            }
        }
    }


    @Composable
    fun ProductItem(name:String, description:String, price:String, id:String,
                  navController:NavHostController, ProductRepository: ProductRepository
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(text = name)
            Text(text = description)
            Text(text = price)
            Button(onClick = {
                ProductRepository.deleteProduct(id)
            }) {
                Text(text = "Delete")
            }
            Button(onClick = {
                navController.navigate("")
            }) {
                Text(text = "Update")
            }
        }
    }

}

