package com.example.fifa.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
data class Player (
    @ColumnInfo(name = "id")
    @PrimaryKey
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
    @ColumnInfo(name = "potential")
    val potential: Int? = null,
    @ColumnInfo(name = "club")
    val club: String? = null,
    @ColumnInfo(name = "club_logo")
    val clubLogo: String? = null,
    @ColumnInfo(name = "value")
    val value: Int? = null,
    @ColumnInfo(name = "wage")
    val wage: Int? = null,
    @ColumnInfo(name = "special")
    val special: Int? = null,
    @ColumnInfo(name = "preferred_foot")
    val preferredFoot: String? = null,
    @ColumnInfo(name = "international_reputation")
    val internationalReputation: Int? = null,
    @ColumnInfo(name = "weak_foot")
    val weakFoot: Int? = null,
    @ColumnInfo(name = "skill_moves")
    val skillMoves: Int? = null,
    @ColumnInfo(name = "work_rate")
    val workRate: String? = null,
    @ColumnInfo(name = "body_type")
    val bodyType: String? = null,
    @ColumnInfo(name = "real_face")
    val realFace: Boolean? = null,
    @ColumnInfo(name = "position")
    val position: String? = null,
    @ColumnInfo(name = "jersey_number")
    val jerseyNumber: Int? = null,
    @ColumnInfo(name = "joined")
    val joined: Long? = null,
    @ColumnInfo(name = "loaned_from")
    val loanedFrom: String? = null,
    @ColumnInfo(name = "contract_valid_until")
    val contractValidUntil: String? = null,
    @ColumnInfo(name = "height")
    val height: String? = null,
    @ColumnInfo(name = "weight")
    val weight: String? = null
)