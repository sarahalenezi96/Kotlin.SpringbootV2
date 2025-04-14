package com.coded.spring.ordering.items

import org.springframework.web.bind.annotation.*

@RestController
class ItemsController(private val itemsRepository: ItemsRepo) {

    @PostMapping("/com/coded/spring/ordering/items")
    fun addItem(@RequestBody request: AddItemRequest) = itemsRepository.save(Item(name = request.name, price = request.price))

    @GetMapping("/com/coded/spring/ordering/items")
    fun getAllItems() = itemsRepository.findAll()
}

data class AddItemRequest(
    val name: String,
    val price: Double
)
