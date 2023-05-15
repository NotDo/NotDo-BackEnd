package com.gsm.notdo.domain.auth.port.output.dto

data class TokenDto(
        val accessToken: String,
        val refreshToken: String,
        val accessExp: Long,
        val refreshExp: Long
)
