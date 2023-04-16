package com.gsm.notdo.persistence.auth.entity

import com.gsm.notdo.common.annotation.Aggregate
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed
import javax.persistence.Id

@Aggregate
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
