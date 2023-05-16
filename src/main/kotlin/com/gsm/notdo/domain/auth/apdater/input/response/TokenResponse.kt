package com.gsm.notdo.domain.auth.apdater.input.response

data class TokenResponse(
        val accessToken: String,
        val refreshToken: String,
        val accessExp: Long,
        val refreshExp: Long
)
