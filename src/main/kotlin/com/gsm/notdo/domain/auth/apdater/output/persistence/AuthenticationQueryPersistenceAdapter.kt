package com.gsm.notdo.domain.auth.apdater.output.persistence

import com.gsm.notdo.domain.auth.apdater.output.persistence.mapper.toDomain
import com.gsm.notdo.domain.auth.apdater.output.persistence.repository.AuthenticationRepository
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthenticationPort
import com.gsm.notdo.domain.auth.domain.Authentication
import com.gsm.notdo.domain.auth.domain.exception.AuthenticationNotFoundException
import org.springframework.stereotype.Component

@Component
class AuthenticationQueryPersistenceAdapter(
        private val authenticationRepository: AuthenticationRepository
) : QueryAuthenticationPort {
    override fun findByEmailOrNull(email: String): Authentication {
        val authenticationEntity = authenticationRepository.findByEmailOrNull(email) ?: throw AuthenticationNotFoundException()
        return authenticationEntity.toDomain(authenticationEntity)
    }

    override fun existsByEmail(email: String): Boolean {
        return authenticationRepository.existsByEmail(email)
    }

}