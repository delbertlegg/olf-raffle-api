package com.eddielegg.olfraffleapi.controller

import com.eddielegg.olfraffleapi.entity.RaffleEntry
import com.eddielegg.olfraffleapi.repository.RaffleEntryRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/entries")
class EntryController(private val entryRepository: RaffleEntryRepository) {
    @PostMapping
    fun createEntry(@RequestBody raffleEntry: RaffleEntry): ResponseEntity<RaffleEntry> {
        return ResponseEntity.ok(entryRepository.save(raffleEntry))
    }

    @GetMapping("/counts")
    fun getCounts(@RequestParam raffleId: Long) = ResponseEntity.ok(entryRepository.getCounts(raffleId))
}