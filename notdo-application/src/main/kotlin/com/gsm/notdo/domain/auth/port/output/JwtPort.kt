package com.gsm.notdo.domain.auth.port.output

import com.gsm.notdo.domain.user.input.response.TokenResponse
import java.util.UUID

interface JwtPort {
    fun receiveToken(userId: UUID): TokenResponse
}