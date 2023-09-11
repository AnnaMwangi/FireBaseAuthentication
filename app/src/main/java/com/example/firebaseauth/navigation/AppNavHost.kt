package com.example.firebaseauth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauth.ui.theme.screen.Register.RegisterScreen
import com.example.firebaseauth.ui.theme.screen.about.AboutScreen
import com.example.firebaseauth.ui.theme.screen.home.Homescreen
import com.example.firebaseauth.ui.theme.screen.login.LoginScreen
import com.example.firebaseauth.ui.theme.screen.products.AddProduct
import com.example.firebaseauth.ui.theme.screen.products.UpdateProductsScreen
import com.example.firebaseauth.ui.theme.screen.products.ViewProductsScreen

@Composable
fun AppNavHost(modifier:Modifier=Modifier,navController: NavHostController= rememberNavController(), startDestination:String= ROUTE_LOGIN){

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
             LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)

        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_HOME){
            Homescreen(navController)

        }
        composable(ROUTE_ADD_PRODUCTS){
            AddProduct(navController)
        }
        composable(ROUTE_VIEW_PRODUCTs){
            ViewProductsScreen(navController)

        }
        composable(ROUTE_UPDATE_PRODUCTS+"/{id}"){passedData->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
    }


    }

