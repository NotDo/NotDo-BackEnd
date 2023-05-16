package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.input.SignInUseCase
import com.gsm.notdo.domain.auth.application.port.input.dto.SignInDto
import com.gsm.notdo.domain.auth.application.port.output.CommandRefreshTokenPort
import com.gsm.notdo.domain.auth.domain.RefreshToken
import com.gsm.notdo.domain.auth.port.output.JwtPort
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import com.gsm.notdo.domain.user.application.port.output.QueryUserPort
import com.gsm.notdo.domain.user.domain.User
import org.springframework.stereotype.Service

@Service
class SignInService(
        private val jwtPort: JwtPort,
        private val queryUserPort: QueryUserPort,
        private val commandRefreshTokenPort: CommandRefreshTokenPort
) : SignInUseCase {
    override fun execute(dto: SignInDto): TokenDto {
        val user = queryUserPort.findByEmailOrNull(dto.email)
        val token = jwtPort.receiveToken(user.id)

        createRefreshToken(user, token)

        return token
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