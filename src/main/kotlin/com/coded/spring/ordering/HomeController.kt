package com.coded.spring.ordering
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun welcome(): String {
        return "We don't want to keep you hungry, order now!"
    }
}
