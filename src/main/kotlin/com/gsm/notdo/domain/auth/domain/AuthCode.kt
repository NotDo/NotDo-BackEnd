package com.gsm.notdo.domain.auth.domain

import com.gsm.notdo.common.annotation.Aggregate

@Aggregate
data class AuthCode(
        val email: String,
        val authCode: String,
        val expirationTime: Long
)