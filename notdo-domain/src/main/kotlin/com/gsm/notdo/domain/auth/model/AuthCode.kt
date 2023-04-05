package com.gsm.notdo.domain.auth.model

import com.gsm.notdo.common.annotation.Aggregate

@Aggregate
data class AuthCode(
        val email: String,
        val authCode: String,
        val expirationTime: Long
)
