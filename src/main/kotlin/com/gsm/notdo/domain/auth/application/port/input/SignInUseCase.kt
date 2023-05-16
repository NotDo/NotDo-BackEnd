package com.gsm.notdo.domain.auth.application.port.input

import com.gsm.notdo.domain.auth.application.port.input.dto.SignInDto
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto

interface SignInUseCase {
    fun execute(dto: SignInDto): TokenDto
}