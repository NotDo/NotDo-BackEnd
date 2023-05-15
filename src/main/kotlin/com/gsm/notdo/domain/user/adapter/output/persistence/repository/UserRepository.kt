package com.gsm.notdo.domain.user.adapter.output.persistence.repository

import com.gsm.notdo.domain.user.adapter.output.persistence.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository : CrudRepository<UserEntity, UUID> {
    fun existsByEmail(email: String): Boolean
}