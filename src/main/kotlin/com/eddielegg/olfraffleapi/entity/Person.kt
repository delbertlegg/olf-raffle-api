package com.eddielegg.olfraffleapi.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person (
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Id
        val id: Long,
        val firstName: String,
        val lastName: String,
        val emailAddress: String,
        val phoneNumber: String
)