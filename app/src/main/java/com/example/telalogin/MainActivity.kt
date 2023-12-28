package com.example.telalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.telalogin.ui.theme.TelaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main") {
                        composable("main") {
                            MainScreen(user = "")
                        }
                        composable("signIn") {
                            SignInScreen(
                                onSignInClick = {},
                                onSignUpClick = {}
                            )
                        }
                        composable("signUp") {
                            SignUpScreen(
                                onSignUpClick = {}
                            )
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScreen(
    onEnterClick: (User) -> Unit
) {
    Column {
        var username by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        TextField(
            value = username,
            onValueChange = { newValue ->
                username = newValue

            },
            Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp

                    )
                ),
            label = {
                Text("Usuário")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "pessoa que representa usuário"
                )
            }
        )

        TextField(
            value = password,
            onValueChange = {
                password = it
            },
            Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp
                    )
                ),

            label = {
                Text("Senha")
            },
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Password,
                    contentDescription = "representação de senha"
                )
            }
        )
        Button(
            onClick = {
                onEnterClick(
                    User(
                        username,
                        password
                    )
                )
            },
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),

        ) {
            Text(text = "Entrar")
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    TelaLoginTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
           MainScreen("Felipe")
        }
    }
}

