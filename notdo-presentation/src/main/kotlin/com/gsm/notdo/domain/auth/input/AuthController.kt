package com.gsm.notdo.domain.auth.input

import com.gsm.notdo.domain.auth.input.request.SignupRequest
import com.gsm.notdo.domain.auth.input.response.TokenResponse
import com.gsm.notdo.domain.auth.port.input.SignUpUseCase
import com.gsm.notdo.domain.user.input.mapper.toDto
import com.gsm.notdo.domain.user.input.mapper.toResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
        private val signUpUseCase: SignUpUseCase
) {
    @GetMapping("/signup")
    fun signup(@RequestBody request: SignupRequest): TokenResponse =
        signUpUseCase(request.toDto(request))
                .let { it.toResponse(it) }

}