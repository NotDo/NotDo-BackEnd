package com.gsm.notdo.domain.auth.apdater.output.persistence

import com.gsm.notdo.domain.auth.apdater.output.persistence.mapper.toEntity
import com.gsm.notdo.domain.auth.apdater.output.persistence.repository.AuthenticationRepository
import com.gsm.notdo.domain.auth.application.port.output.CommandAuthenticationPort
import com.gsm.notdo.domain.auth.domain.Authentication
import org.springframework.stereotype.Component

@Component
class AuthenticationCommandPersistenceAdapter(
        private val authenticationRepository: AuthenticationRepository
) : CommandAuthenticationPort {
    override fun save(domain: Authentication) {
        authenticationRepository.save(domain.toEntity(domain))
    }
}