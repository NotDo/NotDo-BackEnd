package com.gsm.notdo.domain.user.model

import java.time.ZonedDateTime
import java.util.UUID

data class User(
        val id: UUID,
        val email: String,
        val password: String?,
        val nickName: String,
        val createdAt: ZonedDateTime
)
