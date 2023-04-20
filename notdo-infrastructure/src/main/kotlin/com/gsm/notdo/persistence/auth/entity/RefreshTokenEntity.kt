package com.gsm.notdo.persistence.auth.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed

@RedisHash
data class RefreshTokenEntity(
        @Id
        val email: String,
        @Indexed
        val refreshToken: String,
        @TimeToLive
        val timeToLive: Long
)
