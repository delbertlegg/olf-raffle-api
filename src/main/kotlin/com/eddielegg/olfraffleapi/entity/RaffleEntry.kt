package com.eddielegg.olfraffleapi.entity

import javax.persistence.*

@Entity
data class RaffleEntry(
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Id
        val id: Long,

        val personId: Long,
        val raffleId: Long
)