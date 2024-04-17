package com.example.myfitness.screns

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myfitness.MainViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun LoginScreen(viewModel: MainViewModel = viewModel(
    factory = MainViewModel.factory
)) {
    var textValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "FlexForce",
            fontSize = 24.sp
        )
        Row(
            modifier = Modifier
                .padding(0.dp, 40.dp, 0.dp, 0.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {


        }
        OutlinedTextField(
            value = textValue,
            onValueChange = { newValue ->
                textValue = newValue
            },
            label = { Text(text = "логин") }
        )
        OutlinedTextField(
            value = passwordValue,
            onValueChange = { newValue ->
                passwordValue = newValue
            },
            label = { Text(text = "пароль") },
            visualTransformation = PasswordVisualTransformation() // Скрывает введенный текст
        )
        Box(
            modifier = Modifier
                .padding(0.dp, 40.dp)
                .background(Color.Red, shape = RoundedCornerShape(30.dp))
                .padding(20.dp, 10.dp)
                .clickable { viewModel.selectUser(textValue)
                }


        ) {
            Text(text = "Войти", color = Color.White, fontWeight = FontWeight.Bold)


        }
    }
}


@Composable
fun RegisterScreen(viewModel: MainViewModel = viewModel(
    factory = MainViewModel.factory
)) {

    var usernameValue by remember { mutableStateOf("") }
    var loginValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    var retPasswordValue by remember { mutableStateOf("") }


    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "FlexForce",
            fontSize = 24.sp
        )
        Row(
            modifier = Modifier
                .padding(0.dp, 40.dp, 0.dp, 0.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {


        }
        OutlinedTextField(
            value = usernameValue,
            onValueChange = { newValue ->
                usernameValue = newValue
            },
            label = { Text(text = "имя пользователя") }
        )
        OutlinedTextField(
            value = loginValue,
            onValueChange = { newValue ->
                loginValue = newValue
            },
            label = { Text(text = "логин") }
        )
        OutlinedTextField(
            value = passwordValue,
            onValueChange = { newValue ->
                passwordValue = newValue
            },
            label = { Text(text = "пароль") },
            visualTransformation = PasswordVisualTransformation() // Скрывает введенный текст
        )
        OutlinedTextField(
            value = retPasswordValue,
            onValueChange = { newValue ->
                retPasswordValue = newValue
            },
            label = { Text(text = "повтор пароль") },
            visualTransformation = PasswordVisualTransformation() // Скрывает введенный текст
        )
        Box(
            modifier = Modifier
                .padding(0.dp, 40.dp)
                .background(Color.Red, shape = RoundedCornerShape(30.dp))
                .padding(20.dp, 10.dp)
                .clickable {
                    viewModel.insertNewUser(usernameValue, loginValue, passwordValue)
                }

        ) {
            Text(text = "Зарегестрироваться", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}