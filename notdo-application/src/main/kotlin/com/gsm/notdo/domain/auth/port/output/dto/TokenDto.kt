package com.gsm.notdo.domain.auth.port.output.dto

data class TokenDto(
        private val accessToken: String,
        private val refreshToken: String,
        private val accessExp: Long,
        private val refreshExp: Long
)
