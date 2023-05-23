package com.gsm.notdo.domain.auth.apdater.output.persistence.repository

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.AuthenticationEntity
import org.springframework.data.repository.CrudRepository

interface AuthenticationRepository : CrudRepository<AuthenticationEntity, String> {
    fun findByEmailOrNull(email: String): AuthenticationEntity
    fun existsByEmail(email: String): Boolean
}