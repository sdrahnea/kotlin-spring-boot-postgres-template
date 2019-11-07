package com.sdrahnea.app.repository

import com.sdrahnea.app.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {

    fun findByLogin(login: String): User?

}