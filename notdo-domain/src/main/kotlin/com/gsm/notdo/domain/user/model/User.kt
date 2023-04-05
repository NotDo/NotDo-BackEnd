package com.gsm.notdo.domain.user.model

import com.gsm.notdo.common.annotation.Aggregate
import java.time.LocalDateTime
import java.util.UUID

@Aggregate
data class User(
        val id: UUID,
        val email: String,
        val password: String?,
        val nickName: String,
        val createdAt: LocalDateTime
)
