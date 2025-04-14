
package com.coded.spring.ordering.users

import org.springframework.web.bind.annotation.*

@RestController
class UsersController(private val usersRepository: UsersRepo) {

    @PostMapping("/com/coded/spring/ordering/users")
    fun createUser(@RequestBody request: CreateUserRequest) = usersRepository.save(User(name = request.name, email = request.email))

    @GetMapping("/com/coded/spring/ordering/users")
    fun getAllUsers() = usersRepository.findAll()
}

data class CreateUserRequest(
    val name: String,
    val email: String
)
