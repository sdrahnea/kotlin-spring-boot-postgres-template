package com.sdrahnea.app.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Article(
        @Id @GeneratedValue var id: Long? = null,
        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: UserArticle,
        var slug: String = title,
        var addedAt: LocalDateTime = LocalDateTime.now()
        )