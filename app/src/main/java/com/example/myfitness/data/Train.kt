package com.example.myfitness.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Train")
data class Train(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    val description: String,
    val trainType: String
)
