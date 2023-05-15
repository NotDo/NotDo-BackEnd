package com.gsm.notdo.domain.auth.domain

import com.gsm.notdo.global.annotation.Aggregate

@Aggregate
data class RefreshToken(
        val email: String,
        val refreshToken: String,
        val timeToLive: Long
)