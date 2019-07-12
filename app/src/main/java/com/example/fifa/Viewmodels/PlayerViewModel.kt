package com.example.fifa.Viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.fifa.Database.PlayerAndUserDatabase
import com.example.fifa.Entities.PlayerEntity
import com.example.fifa.Repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlayerViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: Repository
    val allPlayers: LiveData<Array<PlayerEntity>>

    init {
        val playerDao = PlayerAndUserDatabase.getDatabase(application)!!.PlayerDao()
        repository = Repository(playerDao)
        allPlayers = repository.allPlayers
    }

    fun insert(player: PlayerEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(player)
    }
}