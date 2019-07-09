package com.example.fifa.Mappers

import com.example.fifa.Helper.IMoneyFormatter
import com.example.fifa.Models.Player

class PlayerMapper(private val moneyFormatter: IMoneyFormatter) {
    fun map(line: String): Player {
        val items = line.split(";")
        return Player(
            id = items[1].toIntOrNull(),
            name = items[2],
            age = items[3].toInt(),
            photo = items[4],
            nationality = items[5],
            flag = items[6],
            overall = items[7].toIntOrNull(),
            potential = items[8].toIntOrNull(),
            club = items[9],
            clubLogo = items[10],
            value = moneyFormatter.format(items[11]),
            wage = moneyFormatter.format(items[12]),
            special = items[13].toIntOrNull(),
            preferredFoot = items[14],
            internationalReputation = items[15].toIntOrNull(),
            weakFoot = items[16].toIntOrNull(),
            skillMoves = items[17].toIntOrNull(),
            workRate = items[18],
            bodyType = items[19],
            realFace = items[20].toBoolean(),
            position = items[21],
            jerseyNumber = items[22].toIntOrNull(),
            joined = items[23],
            loanedFrom = items[24],
            contractValidUntil = items[25],
            height = items[26],
            weight = items[27]
        )
    }
}