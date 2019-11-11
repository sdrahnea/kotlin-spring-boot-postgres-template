package com.sdrahnea.app.controller

import com.sdrahnea.app.model.UserArticle
import com.sdrahnea.app.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class UserController {

    private lateinit var userService: UserService

    val counter = AtomicLong()

    @GetMapping("/user")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : UserArticle {
        return UserArticle(counter.incrementAndGet(), "Hello, $name", "last name", "")
    }

    fun signIn() : UserArticle {
           throw IllegalStateException()
    }

    fun signOut() : UserArticle {
        throw IllegalStateException()
    }

    fun signUp() : UserArticle {
        throw IllegalStateException()
    }

}