//package com.coded.spring.ordering.orders
//
//import org.springframework.data.jpa.repository.JpaRepository
//import org.springframework.stereotype.Repository
//
//@Repository
//    interface OrdersRepo : JpaRepository<Order, Long> {
//        fun findAllByOrderByCreatedAtAsc(): List<Order>
//    }
package com.coded.spring.ordering.orders

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdersRepo : JpaRepository<Order, Long> {
    fun findAllByOrderByCreatedAtAsc(): List<Order>
}