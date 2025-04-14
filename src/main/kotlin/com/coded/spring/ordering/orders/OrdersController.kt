package com.coded.spring.ordering.orders

import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import org.springframework.data.domain.Sort

@RestController
class OrdersController(private val ordersRepository: OrdersRepo) {

    @GetMapping("/orders")
    fun getAllOrders() = ordersRepository.findAll(Sort.by(Sort.Direction.ASC, "createdAt"))

    @PostMapping("/orders")
    fun orderItems(@RequestBody request: OrderItemsRequest) =
        ordersRepository.save(
            Order(
                username = request.user,
                restaurant = request.restaurant,
                items = request.items.joinToString(", ")
            )
        )
}

data class OrderItemsRequest(
    val user: String,
    val restaurant: String,
    val items: List<String>
)
