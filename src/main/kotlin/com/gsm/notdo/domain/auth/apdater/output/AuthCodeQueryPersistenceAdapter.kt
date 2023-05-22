package com.gsm.notdo.domain.auth.apdater.output

import com.gsm.notdo.domain.auth.apdater.output.persistence.repository.AuthCodeRepository
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthCodePort
import com.gsm.notdo.domain.auth.domain.AuthCode
import org.springframework.stereotype.Component

@Component
class AuthCodeQueryPersistenceAdapter(
        private val authCodeRepository: AuthCodeRepository
) : QueryAuthCodePort {
    override fun findByEmail(email: String): AuthCode =
            authCodeRepository.findByEmailOrNull(email) ?:
}