package com.gsm.notdo.domain.auth.apdater.output.persistence

import com.gsm.notdo.domain.auth.apdater.output.persistence.mapper.toDomain
import com.gsm.notdo.domain.auth.apdater.output.persistence.repository.AuthCodeRepository
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthCodePort
import com.gsm.notdo.domain.auth.domain.AuthCode
import com.gsm.notdo.domain.auth.domain.exception.AuthCodeNotFoundException
import org.springframework.stereotype.Component

@Component
class AuthCodeQueryPersistenceAdapter(
        private val authCodeRepository: AuthCodeRepository
) : QueryAuthCodePort {
    override fun findByEmail(email: String): AuthCode {
        val authCodeEntity = authCodeRepository.findByEmailOrNull(email) ?: throw AuthCodeNotFoundException()
        return authCodeEntity.toDomain(authCodeEntity)
    }
}