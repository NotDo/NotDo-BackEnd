package com.gsm.notdo.domain.auth.apdater.input

import com.gsm.notdo.domain.auth.apdater.input.request.SignInRequest
import com.gsm.notdo.domain.auth.apdater.input.request.SignupRequest
import com.gsm.notdo.domain.auth.apdater.input.response.TokenResponse
import com.gsm.notdo.domain.auth.application.port.input.SendAuthCodeUseCase
import com.gsm.notdo.domain.auth.application.port.input.SignInUseCase
import com.gsm.notdo.domain.auth.application.port.input.SignUpUseCase
import com.gsm.notdo.domain.user.adapter.input.mapper.toDto
import com.gsm.notdo.domain.user.adapter.input.mapper.toResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
        private val signUpUseCase: SignUpUseCase,
        private val signInUseCase: SignInUseCase,
        private val sendAuthCodeUseCase: SendAuthCodeUseCase
) {
    @GetMapping("/sign-up")
    fun signUp(@RequestBody request: SignupRequest): ResponseEntity<TokenResponse> =
        signUpUseCase.execute(request.toDto(request))
                .let { ResponseEntity.status(HttpStatus.CREATED).body(it.toResponse(it)) }

    @PostMapping("/sign-in")
    fun signIn(@RequestBody request: SignInRequest): ResponseEntity<TokenResponse> =
            signInUseCase.execute(request.toDto(request))
                    .let { ResponseEntity.status(HttpStatus.OK).body(it.toResponse(it)) }
    @PostMapping
    fun sendAuthCode(@RequestParam("email")email: String): ResponseEntity<Void> =
            sendAuthCodeUseCase.execute(email)
                    .run { ResponseEntity.status(HttpStatus.OK).build() }

}