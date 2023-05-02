package com.gsm.notdo.domain.auth.port.input

import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto

interface SignUpUseCase {
    operator fun invoke(dto: SignUpDto): TokenDto
}