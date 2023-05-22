package com.gsm.notdo.domain.auth.apdater.output.persistence.repository

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.AuthCodeEntity
import org.springframework.data.repository.CrudRepository

interface AuthCodeRepository : CrudRepository<AuthCodeEntity, String> {
    fun findByEmailOrNull(email: String): AuthCodeEntity?
}