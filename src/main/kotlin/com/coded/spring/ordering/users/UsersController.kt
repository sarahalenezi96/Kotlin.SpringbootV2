package com.coded.spring.ordering.users

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UsersController(private val usersRepo: UsersRepo) {

    @PostMapping
    fun createUser(@RequestBody request: CreateUserRequest) =
        usersRepo.save(User(name = request.name))

    @GetMapping
    fun getAllUsers() = usersRepo.findAll()
}

data class CreateUserRequest(
    val name: String,
)