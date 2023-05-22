package com.gsm.notdo.domain.auth.apdater.output.persistence.mapper

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.AuthenticationEntity
import com.gsm.notdo.domain.auth.domain.Authentication

fun Authentication.toEntity(domain: Authentication): AuthenticationEntity {
    val (email, attemptCount, isVerified, expirationTime) = domain
    return AuthenticationEntity(
            email = email,
            attemptCount = attemptCount,
            isVerified = isVerified,
            expirationTime = expirationTime
    )
}