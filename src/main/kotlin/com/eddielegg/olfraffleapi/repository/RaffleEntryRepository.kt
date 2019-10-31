package com.eddielegg.olfraffleapi.repository

import com.eddielegg.olfraffleapi.entity.RaffleEntry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface RaffleEntryRepository: JpaRepository<RaffleEntry, Long> {
    fun findByRaffleId(raffleId: Long): List<RaffleEntry>

    @Query("select count(r) as count from RaffleEntry r where r.raffleId = :raffleId group by r.personId")
    fun getCounts(@Param("raffleId") raffleId: Long): List<Int>
}
