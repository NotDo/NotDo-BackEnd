package com.gsm.notdo.domain.auth.output

import com.gsm.notdo.domain.auth.model.RefreshToken
import com.gsm.notdo.domain.auth.port.CommandRefreshTokenPort
import com.gsm.notdo.domain.user.output.persistence.auth.repository.RefreshTokenRepository

class RefreshTokenCommandPersistenceAdapter(
        private val refreshTokenRepository: RefreshTokenRepository
) : CommandRefreshTokenPort {
    override fun save(domain: RefreshToken) {
    }
}