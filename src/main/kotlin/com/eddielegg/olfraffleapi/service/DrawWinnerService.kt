package com.eddielegg.olfraffleapi.service

import com.eddielegg.olfraffleapi.dto.RaffleWinner
import com.eddielegg.olfraffleapi.repository.PersonRepository
import com.eddielegg.olfraffleapi.repository.RaffleEntryRepository
import com.eddielegg.olfraffleapi.repository.RaffleRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class DrawWinnerService (private val raffleRepository: RaffleRepository,
                         private val entryRepository: RaffleEntryRepository,
                         private val personRepository: PersonRepository) {

    fun drawAllWinners()  = raffleRepository.findAll().map { it.id }.map { drawWinnerForRaffle(it!!) }

    fun drawWinnerForRaffle(raffleId: Long): RaffleWinner {
        val entries = entryRepository.findByRaffleId(raffleId)
        val winningEntry = entries[entries.size.random()]

        val winningPerson = personRepository.findById(winningEntry.personId).get()
        val raffle = raffleRepository.findById(winningEntry.raffleId).get()
        return RaffleWinner(raffle, winningPerson)
    }
}

private fun Int.random() = Random().nextInt(this)