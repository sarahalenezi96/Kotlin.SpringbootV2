package com.coded.spring.ordering.users

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepo : JpaRepository<User, Long>