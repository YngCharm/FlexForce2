package com.example.myfitness

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.myfitness.data.MainDb
import com.example.myfitness.data.Users
import kotlinx.coroutines.launch

class MainViewModel(val database: MainDb) : ViewModel() {
val itemsUser = database.dao.getAllItemsUsers()

    fun insertNewUser(usernameValue: String, loginValue: String, passwordValue: String) = viewModelScope.launch {
        val newUser = Users(
            name = usernameValue,
            login = loginValue,
            password = passwordValue
        )
        database.dao.insertItemUser(newUser)
    }

    fun selectUser(login: String) : String{
        return database.dao.getPassword(login).toString()
    }

    companion object {
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return MainViewModel(database) as T
            }
        }
    }
}