package com.example.myfitness

import android.app.Application
import com.example.myfitness.data.MainDb

class App : Application() {
    val database by lazy{MainDb.createDb(this)}
}