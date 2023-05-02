package com.gsm.notdo.domain.auth.input

import com.gsm.notdo.domain.auth.port.input.SignUpUseCase
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
        private val signUpUseCase: SignUpUseCase
) {

}