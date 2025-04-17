package com.coded.spring.ordering.items

import jakarta.persistence.*

@Entity
@Table(name = "items")
data class Item(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    var quantity: Int
)