package com.coded.spring.ordering.items

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/items")
class ItemsController(private val itemsRepo: ItemsRepo) {

    @PostMapping
    fun addItem(@RequestBody request: AddItemRequest) =
        itemsRepo.save(Item(name = request.name, quantity = request.quantity))

    @GetMapping
    fun getAllItems() = itemsRepo.findAll()
}

data class AddItemRequest(
    val name: String,
    val quantity: Int
)