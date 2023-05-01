package com.gsm.notdo.domain.auth.port.input.dto

data class SignUpDto(
        private val email: String,
        private val password: String,
        private val nickname: String
)
