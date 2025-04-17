package com.coded.spring.ordering.orders
import jakarta.persistence.*

@Entity
@Table(name = "orders")
data class Order(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var userId: Long,
    var restaurant: String,
    var items: String,
    var createdAt: Long = System.currentTimeMillis()

) {
    constructor() : this(id = null, userId = 0L, restaurant = "", items = "", createdAt = 0L)
}
