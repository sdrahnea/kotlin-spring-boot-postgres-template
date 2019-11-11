package com.sdrahnea.app.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class UserArticle(
        @Id @GeneratedValue var id: Long? = null,
        var login: String,
        var firstname: String,
        var lastname: String,
        var description: String? = null
        )