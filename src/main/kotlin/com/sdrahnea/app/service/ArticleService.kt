package com.sdrahnea.app.service

import com.sdrahnea.app.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService {

    private lateinit var articleRepository: ArticleRepository

}