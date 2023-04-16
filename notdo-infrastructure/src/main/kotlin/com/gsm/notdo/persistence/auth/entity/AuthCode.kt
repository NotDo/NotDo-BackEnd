package com.gsm.notdo.persistence.auth.entity

import com.gsm.notdo.common.annotation.Aggregate
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed
import javax.persistence.Id

@Aggregate
data class AuthCode(
        @Id
        val email: String,
        @Indexed
        var authCode: String,
        @TimeToLive
        val expirationTime: Long
)
