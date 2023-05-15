package com.gsm.notdo.domain.auth.application.port.output

import com.gsm.notdo.domain.auth.domain.RefreshToken


interface CommandRefreshTokenPort {
    fun save(domain: RefreshToken)
}