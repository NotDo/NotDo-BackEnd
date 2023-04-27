package com.gsm.notdo.domain.auth.port.output

import java.util.UUID

interface JwtPort {
    fun receiveToken(userId: UUID)
}