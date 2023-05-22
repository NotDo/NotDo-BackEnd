package com.gsm.notdo.domain.auth.domain

import com.gsm.notdo.global.annotation.Aggregate

@Aggregate
data class Authentication(
        val email: String,
        val attemptCount: Long,
        val isVerified: Boolean,
        val expirationTime: Long
) {
    constructor(email: String) : this(
            email = email,
            attemptCount = 0,
            isVerified = false,
            expirationTime = EXPIRED
    )

    companion object {
        const val MAX_ATTEMPT_COUNT = 5L
        const val EXPIRED = 1800L
        private const val VERIFIED_EXPIRED = 2700L
    }
    fun increaseCount(): Authentication {
        return Authentication(
                email = email,
                attemptCount = attemptCount.inc(),
                isVerified = isVerified,
                expirationTime = EXPIRED
        )
    }

    fun certified(): Authentication {
        return this.copy(
                email = email,
                attemptCount = MAX_ATTEMPT_COUNT,
                isVerified = true,
                expirationTime = VERIFIED_EXPIRED
        )
    }
}