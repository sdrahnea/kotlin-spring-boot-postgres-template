package com.sdrahnea.app.controller

import com.sdrahnea.app.model.UserArticle
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/user"])
class UserController: AbstractController<UserArticle>() {

}