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
import com.example.firebaseauth.ui.theme.screen.login.LoginScreen

@Composable
fun AppNavHost(modifier:Modifier=Modifier,navController: NavHostController= rememberNavController(), startDestination:String= ROUTE_LOGIN){

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
             LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)

        }
    }


    }

