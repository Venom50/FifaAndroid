package com.example.fifa.Mappers

import com.example.fifa.Entities.PlayerEntity
import com.example.fifa.Models.Player

class PlayerToEntity {
    fun playerToEntityMapper(player: Player): PlayerEntity {
        return PlayerEntity(
            player.id,
            player.name,
            player.age,
            player.photo,
            player.nationality,
            player.flag,
            player.overall,
            player.clubLogo,
            player.preferredFoot,
            player.weakFoot,
            player.skillMoves,
            player.position,
            player.jerseyNumber,
            player.joined?.time,
            player.height,
            player.weight
        )
    }
}