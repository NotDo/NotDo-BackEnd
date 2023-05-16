package com.gsm.notdo.domain.auth.application.port.input

import com.gsm.notdo.domain.auth.application.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto

interface SignUpUseCase {
    fun execute(dto: SignUpDto): TokenDto
}