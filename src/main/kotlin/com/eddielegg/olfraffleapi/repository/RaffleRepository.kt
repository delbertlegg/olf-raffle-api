package com.eddielegg.olfraffleapi.repository

import com.eddielegg.olfraffleapi.entity.Raffle
import org.springframework.data.jpa.repository.JpaRepository

interface RaffleRepository: JpaRepository<Raffle, Long>