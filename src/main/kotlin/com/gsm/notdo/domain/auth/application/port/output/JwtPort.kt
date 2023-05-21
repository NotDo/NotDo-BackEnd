package com.gsm.notdo.domain.auth.application.port.output

import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import java.util.UUID

interface JwtPort {
    fun receiveToken(userId: UUID): TokenDto
}