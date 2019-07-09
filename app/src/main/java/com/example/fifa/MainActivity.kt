package com.example.fifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fifa.Models.Player
import com.example.fifa.Models.User

var arrayOfPlayers = ArrayList<String>()

class MainActivity : AppCompatActivity() {

    var userArrayList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
