package com.gsm.notdo.domain.auth.model

import java.util.UUID

data class AuthCode(
        val email: String,
        val authCode: String,
        val expirationTime: Long
)
