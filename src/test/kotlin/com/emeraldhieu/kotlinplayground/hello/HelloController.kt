package com.emeraldhieu.kotlinplayground.hello

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("hello")
    @ResponseStatus(HttpStatus.OK)
    fun test() {
        println("HELLO!!!")
    }
}
