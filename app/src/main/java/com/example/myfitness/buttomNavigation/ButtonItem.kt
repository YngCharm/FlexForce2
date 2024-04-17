package com.example.myfitness.buttomNavigation

import com.example.myfitness.R

sealed class ButtonItem(val title: String, val iconID: Int, val route: String) {
    object LoginScreen: ButtonItem("Вход", R.drawable.baseline_login_24, "login")
    object RegistrationScreen: ButtonItem("Регистрация", R.drawable.baseline_app_registration_24, "registartion")

}