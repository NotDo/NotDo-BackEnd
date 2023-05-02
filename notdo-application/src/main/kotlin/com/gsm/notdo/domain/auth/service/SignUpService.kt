package com.gsm.notdo.domain.auth.service

import com.gsm.notdo.common.annotation.UseCase
import com.gsm.notdo.domain.auth.port.input.SignUpUseCase
import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto

@UseCase
class SignUpService(

) : SignUpUseCase {
    override fun invoke(dto: SignUpDto): TokenDto {
        TODO("Not yet implemented")
    }
}