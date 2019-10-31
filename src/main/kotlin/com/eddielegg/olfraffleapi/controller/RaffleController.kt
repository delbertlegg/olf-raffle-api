package com.eddielegg.olfraffleapi.controller

import com.eddielegg.olfraffleapi.entity.Raffle
import com.eddielegg.olfraffleapi.repository.RaffleRepository
import com.eddielegg.olfraffleapi.service.DrawWinnerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/raffles")
class RaffleController (private val raffleRepository: RaffleRepository, private val drawWinnerService: DrawWinnerService) {

    @PostMapping
    fun createRaffle(@RequestBody raffle: Raffle): ResponseEntity<Raffle> = ResponseEntity.ok(raffleRepository.save(raffle))

    @GetMapping
    fun getRaffles() = ResponseEntity.ok(raffleRepository.findAll())

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = ResponseEntity.ok(raffleRepository.findById(id))

    @GetMapping("/draw")
    fun drawAllWinners() = ResponseEntity.ok(drawWinnerService.drawAllWinners())

    @GetMapping("/draw/{id}")
    fun drawById(@PathVariable id: Long) = ResponseEntity.ok(drawWinnerService.drawWinnerForRaffle(id))
}