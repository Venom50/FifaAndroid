package com.example.fifa.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.fifa.Converters.DateConverter
import com.example.fifa.Daos.PlayerDao
import com.example.fifa.Daos.UserDao
import com.example.fifa.Models.Player
import com.example.fifa.Models.User

@Database(
    entities = [
        Player::class,
        User::class
    ], version = 1, exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class PlayerAndUserDatabase : RoomDatabase() {

    abstract fun PlayerDao(): PlayerDao
    abstract fun UserDao(): UserDao

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

//            val tempInstance = INSTANCE
//            if (tempInstance != null) {
//                return tempInstance
//            }
//            synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    PlayerAndUserDatabase::class.java,
//                    "Player_and_user_database"
//                ).allowMainThreadQueries().build()
//                INSTANCE = instance
//                return instance
//            }
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}