package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.output.CommandRefreshTokenPort
import com.gsm.notdo.domain.auth.domain.RefreshToken
import com.gsm.notdo.domain.auth.port.input.SignUpUseCase
import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.JwtPort
import com.gsm.notdo.domain.auth.port.output.PasswordEncodePort
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import com.gsm.notdo.domain.user.domain.User
import com.gsm.notdo.domain.user.exception.UserAlreadyExistException
import com.gsm.notdo.domain.user.port.output.CommandUserPort
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import java.time.LocalDate
import java.util.*


class SignUpService(
        private val queryUserPort: QueryUserPort,
        private val commandUserPort: CommandUserPort,
        private val passwordEncoderPort: PasswordEncodePort,
        private val commandRefreshTokenPort: CommandRefreshTokenPort,
        private val jwtPort: JwtPort
) : SignUpUseCase {
    override fun execute(dto: SignUpDto): TokenDto {
        val user = createUser(dto)
        val token = jwtPort.receiveToken(user.id)

        createRefreshToken(user, token)

        return token
    }
    private fun createUser(dto: SignUpDto): User {
        val isExistUser = queryUserPort.existUserByEmail(dto.email)

        if(isExistUser) {
            throw UserAlreadyExistException()
        }
        val user = User(
                id = UUID.randomUUID(),
                email = dto.email,
                password = passwordEncoderPort.encode(dto.password),
                nickname = dto.nickname,
                createdAt = LocalDate.now()
        )
        return commandUserPort.create(user)
    }

    private fun createRefreshToken(user: User, token: TokenDto) {
        val refreshToken = RefreshToken(
                email = user.email,
                refreshToken = token.refreshToken,
                timeToLive = token.refreshExp
        )
        commandRefreshTokenPort.save(refreshToken)
    }
}