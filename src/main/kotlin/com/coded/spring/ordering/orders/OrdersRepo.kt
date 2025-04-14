package com.coded.spring.ordering.orders

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import jakarta.persistence.*

@Repository
interface OrdersRepo : JpaRepository<Order, Long>

@Entity
@Table(name = "orders")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var username: String,
    var restaurant: String,

    var items: String
) {
    constructor() : this(null, "", "", "")
}
