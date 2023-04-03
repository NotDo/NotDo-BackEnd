package com.gsm.notdo.persistence.user.entity

import java.time.ZonedDateTime
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
        @Id
        val id: UUID,
        val email: String,
        val password: String?,
        val nickName: String,
        val createdAt: ZonedDateTime
)