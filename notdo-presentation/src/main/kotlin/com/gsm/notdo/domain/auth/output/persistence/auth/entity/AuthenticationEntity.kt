package com.gsm.notdo.domain.auth.output.persistence.auth.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed

@RedisHash
data class AuthenticationEntity(
        @Id
        val email: String,
        @Indexed
        val attemptCount: Long,
        @Indexed
        val isVerified: Boolean,
        @TimeToLive
        val expirationTime: Long
)
