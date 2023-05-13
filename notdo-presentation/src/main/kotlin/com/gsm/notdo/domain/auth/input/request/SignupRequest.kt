package com.gsm.notdo.domain.auth.input.request

data class SignupRequest(
        val email: String,
        val password: String,
        val nickname: String
)
