package com.example.fifa.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.fifa.Converters.DateConverter
import com.example.fifa.Daos.PlayerDao
import com.example.fifa.Daos.UserDao
import com.example.fifa.Entities.PlayerEntity
import com.example.fifa.Models.Player
import com.example.fifa.Models.User

@Database(
    entities = [
        PlayerEntity::class
    ], version = 1, exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class PlayerAndUserDatabase : RoomDatabase() {

    abstract fun PlayerDao(): PlayerDao

    companion object {
        @Volatile
        private var INSTANCE: PlayerAndUserDatabase? = null

        fun getDatabase(context: Context): PlayerAndUserDatabase? {

            if(INSTANCE == null) {
                synchronized(PlayerAndUserDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        PlayerAndUserDatabase::class.java,
                        "player_and_user_database").allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}