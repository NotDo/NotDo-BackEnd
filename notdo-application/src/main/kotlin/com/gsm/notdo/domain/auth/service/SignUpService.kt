package com.gsm.notdo.domain.auth.service

import com.gsm.notdo.common.annotation.Service
import com.gsm.notdo.domain.auth.port.input.SignUpUseCase
import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.JwtPort
import com.gsm.notdo.domain.auth.port.output.PasswordEncodePort
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import com.gsm.notdo.domain.user.exception.UserAlreadyExistException
import com.gsm.notdo.domain.user.model.User
import com.gsm.notdo.domain.user.port.output.CommandUserPort
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import java.time.LocalDate
import java.util.*

@Service
class SignUpService(
        private val queryUserPort: QueryUserPort,
        private val commandUserPort: CommandUserPort,
        private val passwordEncoderPort: PasswordEncodePort,
        private val jwtPort: JwtPort
) : SignUpUseCase {
    override fun execute(dto: SignUpDto): TokenDto {
        if(queryUserPort.existUserByEmail(dto.email)) {
            throw UserAlreadyExistException()
        }
        val user = User(
                id = UUID.randomUUID(),
                email = dto.email,
                password = passwordEncoderPort.encode(dto.password),
                nickname = dto.nickname,
                createdAt = LocalDate.now()
        )
        commandUserPort.create(user)
        return jwtPort.receiveToken(user.id)
    }
}