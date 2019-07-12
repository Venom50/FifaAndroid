package com.example.fifa.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.fifa.Daos.PlayerDao
import com.example.fifa.Entities.PlayerEntity

class Repository(private val playerDao: PlayerDao) {
    val allPlayers: LiveData<Array<PlayerEntity>> = playerDao.getAllPlayers()

    @WorkerThread
    suspend fun insert(player: PlayerEntity) {
        playerDao.insertPlayers(player)
    }
}