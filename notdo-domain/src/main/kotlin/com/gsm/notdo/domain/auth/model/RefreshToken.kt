package com.gsm.notdo.domain.auth.model

import com.gsm.notdo.common.annotation.Aggregate

@Aggregate
data class RefreshToken(
        val email: String,
        val refreshToken: String,
        val timeToLive: Long
)