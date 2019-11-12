package com.sdrahnea.app.service

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

abstract class AbstractService<T> {

    private lateinit var repository: CrudRepository<T, Long>

    fun findAll(): List<T> {
        return repository.findAll() as List<T>
    }

    fun findById(id: Long): T? {
        return repository.findByIdOrNull(id)
    }

    fun save(entity: T): T {
        return repository.save(entity)
    }

}