package com.gsm.notdo.domain.auth.apdater.output.persistence.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed

@RedisHash(value = "AuthCode", timeToLive = 300)
data class AuthCodeEntity(
        @Id
        val email: String,
        @Indexed
        var authCode: String
)
