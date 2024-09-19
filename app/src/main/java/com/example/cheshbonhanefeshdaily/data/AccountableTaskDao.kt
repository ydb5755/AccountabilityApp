package com.example.cheshbonhanefeshdaily.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

// when writing Queries, its good to specify a Flow<> as the return type, see step 13 in https://developer.android.com/codelabs/basic-android-kotlin-compose-persisting-data-room?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-6-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-persisting-data-room#5
// test for commit
// test again
@Dao
interface AccountableTaskDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(accountableTask: AccountableTask)

    @Update
    suspend fun update(accountableTask: AccountableTask)

    @Delete
    suspend fun delete(accountableTask: AccountableTask)
}