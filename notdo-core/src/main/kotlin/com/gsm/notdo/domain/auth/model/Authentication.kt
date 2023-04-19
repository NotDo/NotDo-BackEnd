package com.gsm.notdo.domain.auth.model

import com.gsm.notdo.common.annotation.Aggregate

@Aggregate
data class Authentication(
        val email: String,
        val attemptCount: Long,
        val isVerified: Boolean,
        val expirationTime: Long
)
