package com.example.fifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fifa.Database.PlayerAndUserDatabase
import com.example.fifa.Handlers.DbWorkerThread
import com.example.fifa.Models.Player
import com.example.fifa.Models.User

var arrayOfPlayers = ArrayList<String>()
var db: PlayerAndUserDatabase? = null
lateinit var mDbWorkerThread: DbWorkerThread

class MainActivity : AppCompatActivity() {

    var userArrayList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDbWorkerThread = DbWorkerThread("dbWorkerThread")
        mDbWorkerThread.start()

        db = PlayerAndUserDatabase.getDatabase(this)
    }
}
