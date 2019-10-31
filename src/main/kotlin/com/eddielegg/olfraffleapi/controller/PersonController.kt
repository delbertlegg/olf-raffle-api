package com.eddielegg.olfraffleapi.controller

import com.eddielegg.olfraffleapi.entity.Person
import com.eddielegg.olfraffleapi.repository.PersonRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/people")
class PersonController(private val personRepository: PersonRepository) {
    @PostMapping
    fun createPerson(@RequestBody person: Person) = ResponseEntity.ok(personRepository.save(person))

    @GetMapping
    fun getAll() = ResponseEntity.ok(personRepository.findAll())

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = ResponseEntity.ok(personRepository.findById(id))
}