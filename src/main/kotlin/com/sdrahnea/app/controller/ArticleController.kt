package com.sdrahnea.app.controller

import com.sdrahnea.app.repository.ArticleRepository
import com.sdrahnea.app.service.ArticleService
import org.springframework.web.bind.annotation.RestController

@RestController
class ArticleController {

    private lateinit var articleService: ArticleService

}