package com.gsm.notdo.domain.auth.apdater.output

import com.gsm.notdo.domain.auth.apdater.output.mappter.toEntity
import com.gsm.notdo.domain.auth.application.port.output.CommandRefreshTokenPort
import com.gsm.notdo.domain.auth.domain.RefreshToken
import com.gsm.notdo.domain.auth.apdater.output.persistence.repository.RefreshTokenRepository
import org.springframework.stereotype.Component

@Component

class RefreshTokenCommandPersistenceAdapter(
        private val refreshTokenRepository: RefreshTokenRepository
) : CommandRefreshTokenPort {
    override fun save(domain: RefreshToken) {
        refreshTokenRepository.save(domain.toEntity(domain))
    }
}