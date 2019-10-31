package com.eddielegg.olfraffleapi.dto

import com.eddielegg.olfraffleapi.entity.Person
import com.eddielegg.olfraffleapi.entity.Raffle

data class RaffleWinner (
        val raffle: Raffle,
        val person: Person
)