package com.example.telalogin.models

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.telalogin.ui.theme.TelaLoginTheme
import com.example.telalogin.ui.theme.screens.MainScreen
import com.example.telalogin.ui.theme.screens.SignInScreen
import com.example.telalogin.ui.theme.screens.SignUpScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main/{user}") {
                        composable("main/{user}") { entry ->
                            entry.arguments?.getString("user")?.let { user ->
                                MainScreen(user = user)
                            } ?: LaunchedEffect(null) {
                                navController.navigate("signIn")
                            }
                        }
                        composable("signIn") {
                            SignInScreen(
                                onSignInClick = { user ->
                                    navController.navigate("main/${user.username}")
                                }
                            ) {
                                navController.navigate("signUp")
                            }
                        }
                        composable("signUp") {
                            SignUpScreen(
                                onSignUpClick = {
                                    navController.popBackStack()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
