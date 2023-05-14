package com.gsm.notdo.domain.auth.apdater.input.response

data class TokenResponse(
        private val accessToken: String,
        private val refreshToken: String,
        private val accessExp: Long,
        private val refreshExp: Long
)
