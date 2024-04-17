package com.example.myfitness.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        Users::class,
        Train::class,
        Favorite::class
    ],
    version = 3
)
abstract class MainDb : RoomDatabase() {
abstract val dao : Dao
    companion object{
        fun createDb(context: Context): MainDb{
            return Room.databaseBuilder(
                context,
                MainDb::class.java,
                "proFit.db"
            ).build()
        }
    }
}