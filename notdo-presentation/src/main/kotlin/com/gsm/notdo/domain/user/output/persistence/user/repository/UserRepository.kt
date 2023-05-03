package com.gsm.notdo.domain.user.output.persistence.user.repository

import com.gsm.notdo.domain.user.output.persistence.user.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository : CrudRepository<UserEntity, UUID> {
    fun existsByEmail(email: String): Boolean
}