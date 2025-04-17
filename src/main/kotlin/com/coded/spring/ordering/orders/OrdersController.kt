package com.coded.spring.ordering.orders
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/orders")
class OrdersController(
    private val ordersRepo: OrdersRepo
) {

    @PostMapping
    fun orderItems(@RequestBody request: OrderItemsRequest): Order {
        return ordersRepo.save(
            Order(
                userId = request.user,
                restaurant = request.restaurant,
                items = request.items
            )
        )
    }

    @GetMapping
    fun getAllOrders(): List<Order> =
        ordersRepo.findAllByOrderByCreatedAtAsc()
}

data class OrderItemsRequest(
    val user: Long,
    val restaurant: String,
    val items: String
)
