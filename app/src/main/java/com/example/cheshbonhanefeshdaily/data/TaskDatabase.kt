package com.example.cheshbonhanefeshdaily.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [AccountableTask::class], version = 1, exportSchema = false)
abstract class TaskDatabase : RoomDatabase(){

    abstract fun accountableTaskDao() : AccountableTaskDao

    companion object {
        @Volatile
        private var Instance : TaskDatabase? = null

        fun getDatabase(context:Context) : TaskDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, TaskDatabase::class.java, "task_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}