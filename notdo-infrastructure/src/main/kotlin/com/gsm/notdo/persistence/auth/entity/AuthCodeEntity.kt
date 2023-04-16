package com.gsm.notdo.persistence.auth.entity

import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed
import javax.persistence.Id

@RedisHash
data class AuthCodeEntity(
        @Id
        val email: String,
        @Indexed
        var authCode: String,
        @TimeToLive
        val expirationTime: Long
)
