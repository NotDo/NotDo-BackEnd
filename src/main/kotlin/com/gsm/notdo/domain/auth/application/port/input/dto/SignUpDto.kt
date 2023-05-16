package com.gsm.notdo.domain.auth.application.port.input.dto

data class SignUpDto(
        val email: String,
        val password: String,
        val nickname: String
)
