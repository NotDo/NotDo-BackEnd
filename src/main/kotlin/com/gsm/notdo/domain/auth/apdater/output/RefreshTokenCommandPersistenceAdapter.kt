package com.gsm.notdo.domain.auth.apdater.output

import com.gsm.notdo.domain.auth.model.RefreshToken
import com.gsm.notdo.domain.auth.apdater.output.mappter.toEntity
import com.gsm.notdo.domain.auth.application.port.output.CommandRefreshTokenPort
import com.gsm.notdo.domain.user.output.persistence.auth.repository.RefreshTokenRepository

class RefreshTokenCommandPersistenceAdapter(
        private val refreshTokenRepository: RefreshTokenRepository
) : CommandRefreshTokenPort {
    override fun save(domain: RefreshToken) {
        refreshTokenRepository.save(domain.toEntity(domain))
    }
}