package com.sdrahnea.app.repository

import com.sdrahnea.app.model.UserArticle
import org.springframework.data.repository.CrudRepository

interface UserArticleRepository : CrudRepository<UserArticle, Long> {

    fun findByLogin(login: String): UserArticle?

}