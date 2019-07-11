package com.example.fifa.Daos

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.fifa.Models.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllPlayers(): List<User>

    @Insert(onConflict = REPLACE)
    fun insertPlayers(user: User)

    @Query("DELETE FROM users")
    fun deleteAllPlayers()
}