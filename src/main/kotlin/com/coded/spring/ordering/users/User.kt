package com.coded.spring.ordering.users

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String = ""
) {
    constructor() : this(0, "")
}
