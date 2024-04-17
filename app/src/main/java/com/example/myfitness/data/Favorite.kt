package com.example.myfitness.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Favorite")
data class Favorite(
    @PrimaryKey(autoGenerate = true)
    val id :Int? = 0,
    val idUser: Int,
    val idTrain: Int
)
