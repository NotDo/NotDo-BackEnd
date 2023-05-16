package com.gsm.notdo.domain.auth.application.port.input.dto

data class SignInDto (
        private val email: String,
        private val password: String
)