package com.sdrahnea.app.service

import com.sdrahnea.app.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService {

    private lateinit var userRepository: UserRepository

}