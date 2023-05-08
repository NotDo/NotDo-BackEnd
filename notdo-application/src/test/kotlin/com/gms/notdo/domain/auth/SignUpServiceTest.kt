package com.gms.notdo.domain.auth

import com.gsm.notdo.domain.auth.port.CommandRefreshTokenPort
import com.gsm.notdo.domain.auth.port.output.JwtPort
import com.gsm.notdo.domain.auth.port.output.PasswordEncodePort
import com.gsm.notdo.domain.auth.service.SignUpService
import com.gsm.notdo.domain.user.port.output.CommandUserPort
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.mockk

class SignUpServiceTest : BehaviorSpec({
    val queryUserPort = mockk<QueryUserPort>()
    val commandUserPort = mockk<CommandUserPort>()
    val passwordEncoderPort = mockk<PasswordEncodePort>()
    val commandRefreshTokenPort = mockk<CommandRefreshTokenPort>()
    val jwtPort = mockk<JwtPort>()

    val signUpService = SignUpService(
            queryUserPort = queryUserPort,
            commandUserPort = commandUserPort,
            passwordEncoderPort = passwordEncoderPort,
            commandRefreshTokenPort = commandRefreshTokenPort,
            jwtPort = jwtPort
    )

    given("회원가입 정보가 주어졌을 때") {
        
    }
})