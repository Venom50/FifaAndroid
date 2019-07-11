package com.example.fifa.Daos

import android.widget.ArrayAdapter
import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.fifa.Models.Player

@Dao
interface PlayerDao {
    @Query("SELECT * FROM players")
    fun getAllPlayers(): List<Player>

    @Insert(onConflict = REPLACE)
    fun insertPlayers(player: Player)

    @Query("DELETE FROM players")
    fun deleteAllPlayers()
}