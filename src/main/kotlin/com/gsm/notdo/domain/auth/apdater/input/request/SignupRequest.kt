package com.gsm.notdo.domain.auth.apdater.input.request

data class SignupRequest(
        val email: String,
        val password: String,
        val nickname: String
)
