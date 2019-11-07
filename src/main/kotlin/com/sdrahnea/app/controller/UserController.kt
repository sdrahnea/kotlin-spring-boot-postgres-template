package com.sdrahnea.app.controller

import com.sdrahnea.app.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class UserController {

    val counter = AtomicLong()

    @GetMapping("/user")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : User {
        return User(counter.incrementAndGet().toString(), "Hello, $name", "last name")
    }

    fun signIn() : User {
           throw IllegalStateException()
    }

    fun signOut() : User {
        throw IllegalStateException()
    }

    fun signUp() : User {
        throw IllegalStateException()
    }

}