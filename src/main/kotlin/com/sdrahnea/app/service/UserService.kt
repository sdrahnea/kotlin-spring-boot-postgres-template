package com.sdrahnea.app.service

import com.sdrahnea.app.repository.UserArticleRepository
import org.springframework.stereotype.Service

@Service
class UserService {

    private lateinit var userArticleRepository: UserArticleRepository

}