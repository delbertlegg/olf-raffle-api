package com.eddielegg.olfraffleapi.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Raffle (
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Id
        val id: Long,
        val name: String,
        val description: String
)