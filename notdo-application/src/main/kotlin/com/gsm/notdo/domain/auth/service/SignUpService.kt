package com.gsm.notdo.domain.auth.service

import com.gsm.notdo.common.annotation.Service
import com.gsm.notdo.domain.auth.port.input.SignUpUseCase
import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.JwtPort
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import com.gsm.notdo.domain.user.model.User
import com.gsm.notdo.domain.user.port.output.QueryUserPort

@Service
class SignUpService(
        private val queryUserPort: QueryUserPort,
        private val jwtPort: JwtPort
) : SignUpUseCase {
    override fun execute(dto: SignUpDto): TokenDto {
        TODO("Not yet implemented")
    }
}