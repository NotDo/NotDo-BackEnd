package com.gsm.notdo.domain.auth.apdater.output.persistence

import com.gsm.notdo.domain.auth.apdater.output.persistence.mapper.toEntity
import com.gsm.notdo.domain.auth.apdater.output.persistence.repository.AuthCodeRepository
import com.gsm.notdo.domain.auth.application.port.output.CommandAuthCodePort
import com.gsm.notdo.domain.auth.domain.AuthCode
import org.springframework.stereotype.Component

@Component
class AuthCodeCommandPersistenceAdapter(
        private val authCodeRepository: AuthCodeRepository
) : CommandAuthCodePort {
    override fun save(domain: AuthCode) {
        val saveEntity = domain.toEntity(domain)

        authCodeRepository.save(saveEntity)
    }
}