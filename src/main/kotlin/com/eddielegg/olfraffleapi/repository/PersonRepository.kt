package com.eddielegg.olfraffleapi.repository

import com.eddielegg.olfraffleapi.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Long>