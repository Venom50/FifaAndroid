package com.example.fifa.Models

import java.io.Serializable

data class Player (
    val id: Int? = null,
    val name: String? = null,
    val age: Int? = null,
    val photo: String? = null,
    val nationality: String? = null,
    val flag: String? = null,
    val overall: Int? = null,
    val potential: Int? = null,
    val club: String? = null,
    val clubLogo: String? = null,
    val value: Int? = null,
    val wage: Int? = null,
    val special: Int? = null,
    val preferredFoot: String? = null,
    val internationalReputation: Int? = null,
    val weakFoot: Int? = null,
    val skillMoves: Int? = null,
    val workRate: String? = null,
    val bodyType: String? = null,
    val realFace: Boolean? = null,
    val position: String? = null,
    val jerseyNumber: Int? = null,
    val joined: String? = null,
    val loanedFrom: String? = null,
    val contractValidUntil: String? = null,
    val height: String? = null,
    val weight: String? = null
) : Serializable