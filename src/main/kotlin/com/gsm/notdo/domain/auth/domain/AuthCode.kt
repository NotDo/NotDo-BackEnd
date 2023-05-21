package com.gsm.notdo.domain.auth.domain

import com.gsm.notdo.global.annotation.Aggregate

@Aggregate
data class AuthCode(
        val email: String,
        val authCode: String,
)