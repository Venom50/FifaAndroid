package com.example.fifa.Daos

import android.widget.ArrayAdapter
import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.fifa.Entities.PlayerEntity
import com.example.fifa.Models.Player

@Dao
interface PlayerDao {
    @Query("SELECT * FROM players")
    fun getAllPlayers(): Array<PlayerEntity>

    @Insert(onConflict = REPLACE)
    fun insertPlayers(vararg player: PlayerEntity)

    @Query("DELETE FROM players")
    fun deleteAllPlayers()

    @Query("SELECT * FROM players WHERE id == :id")
    fun getPlayerById(id: Int): PlayerEntity
}