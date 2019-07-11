package com.example.fifa.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "players")
data class PlayerEntity(
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "age")
    val age: Int? = null,
    @ColumnInfo(name = "photo")
    val photo: String? = null,
    @ColumnInfo(name = "nationality")
    val nationality: String? = null,
    @ColumnInfo(name = "flag")
    val flag: String? = null,
    @ColumnInfo(name = "overall")
    val overall: Int? = null,
    @ColumnInfo(name = "club_logo")
    val clubLogo: String? = null,
    @ColumnInfo(name = "preferred_foot")
    val preferredFoot: String? = null,
    @ColumnInfo(name = "weak_foot")
    val weakFoot: Int? = null,
    @ColumnInfo(name = "skill_moves")
    val skillMoves: Int? = null,
    @ColumnInfo(name = "position")
    val position: String? = null,
    @ColumnInfo(name = "jersey_number")
    val jerseyNumber: Int? = null,
    @ColumnInfo(name = "joined")
    val joined: Long? = null,
    @ColumnInfo(name = "height")
    val height: String? = null,
    @ColumnInfo(name = "weight")
    val weight: String? = null
) : Serializable