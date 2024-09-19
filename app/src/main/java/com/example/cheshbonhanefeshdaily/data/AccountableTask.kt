package com.example.cheshbonhanefeshdaily.data


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "accountable_task")
data class AccountableTask (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: Int,
    val name: String,
    val type: String,
    val active: Boolean

)