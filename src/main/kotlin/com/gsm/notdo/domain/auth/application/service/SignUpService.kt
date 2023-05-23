package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.output.CommandRefreshTokenPort
import com.gsm.notdo.domain.auth.domain.RefreshToken
import com.gsm.notdo.domain.auth.application.port.input.SignUpUseCase
import com.gsm.notdo.domain.auth.application.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.application.port.output.JwtPort
import com.gsm.notdo.domain.auth.application.port.output.PasswordEncodePort
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthenticationPort
import com.gsm.notdo.domain.auth.domain.exception.AuthenticationNotFoundException
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import com.gsm.notdo.domain.user.domain.User
import com.gsm.notdo.domain.user.domain.exception.UserAlreadyExistException
import com.gsm.notdo.domain.user.application.port.output.CommandUserPort
import com.gsm.notdo.domain.user.application.port.output.QueryUserPort
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*

@Service

class SignUpService(
        private val queryUserPort: QueryUserPort,
        private val commandUserPort: CommandUserPort,
        private val passwordEncoderPort: PasswordEncodePort,
        private val commandRefreshTokenPort: CommandRefreshTokenPort,
        private val queryAuthenticationPort: QueryAuthenticationPort,
        private val jwtPort: JwtPort
) : SignUpUseCase {
    override fun execute(dto: SignUpDto): TokenDto {
        val user = createUser(dto)
        val token = jwtPort.receiveToken(user.id)

        validateAuthentication(dto.email)
        createRefreshToken(user, token)

        return token
    }
    private fun validateAuthentication(email: String) {
        val authentication = queryAuthenticationPort.findByEmailOrNull(email)
        if(!authentication.isVerified) {
            throw
        }
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