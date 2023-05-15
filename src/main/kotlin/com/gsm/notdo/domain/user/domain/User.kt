package com.gsm.notdo.domain.user.domain

import com.gsm.notdo.global.annotation.Aggregate
import java.time.LocalDate
import java.util.UUID

@Aggregate
data class User(
        val id: UUID,
        val email: String,
        val password: String?,
        val nickname: String,
        val createdAt: LocalDate
)