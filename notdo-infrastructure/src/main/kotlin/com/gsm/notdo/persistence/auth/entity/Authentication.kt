package com.gsm.notdo.persistence.auth.entity

import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed
import javax.persistence.Id

@RedisHash
data class Authentication(
        @Id
        val email: String,
        @Indexed
        val attemptCount: Long,
        @Indexed
        val isVerified: Boolean,
        @TimeToLive
        val expirationTime: Long
)
