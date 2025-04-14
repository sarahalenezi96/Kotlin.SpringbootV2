package com.coded.spring.ordering.orders

import org.springframework.web.bind.annotation.*

@RestController

class OrdersController(private val ordersRepository: OrdersRepo) {

    @GetMapping("/orders")
    fun getAllOrders() = ordersRepository.findAll()

    @PostMapping("/orders")
    fun orderItems(@RequestBody request: OrderItemsRequest) =
        ordersRepository.save(Order(username = request.user, restaurant = request.restaurant, items = request.items.toString()))
}

data class OrderItemsRequest(
    val user: String,
    var restaurant: String,
    var items: List<String>
)
