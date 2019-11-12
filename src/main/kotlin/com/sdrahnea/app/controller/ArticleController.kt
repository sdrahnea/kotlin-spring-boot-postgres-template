package com.sdrahnea.app.controller

import com.sdrahnea.app.model.Article
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/article"])
class ArticleController: AbstractController<Article>() {

}