package com.gsm.notdo.domain.auth.port

import com.gsm.notdo.domain.auth.model.RefreshToken

interface CommandRefreshTokenPort {
    fun save(domain: RefreshToken)
}