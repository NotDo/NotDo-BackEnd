package com.gsm.notdo.domain.auth.port.input.dto

data class SignUpDto(
        val email: String,
        val password: String,
        val nickname: String
)
