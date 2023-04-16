package com.gsm.notdo.persistence.auth.entity

import com.gsm.notdo.common.annotation.Aggregate
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed
import javax.persistence.Id

@Aggregate
data class RefreshToken(
        @Id
        val email: String,
        @Indexed
        val refreshToken: String,
        @TimeToLive
        val timeToLive: Long
)
