package com.gsm.notdo.global.security.adapter

import com.gsm.notdo.domain.auth.application.port.output.PasswordEncodePort
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class PasswordEncodeAdapter(
        private val passwordEncoder: PasswordEncoder
) : PasswordEncodePort {
    override fun encode(password: String): String =
            passwordEncoder.encode(password)
}