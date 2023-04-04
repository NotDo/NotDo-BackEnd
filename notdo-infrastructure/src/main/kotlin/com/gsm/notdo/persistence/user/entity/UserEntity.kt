package com.gsm.notdo.persistence.user.entity

import java.time.ZonedDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserEntity(
        @Id
        val id: UUID,
        @Column(columnDefinition = "VARCHAR(255)", nullable = false, unique = true)
        val email: String,
        @Column(nullable = true)
        val password: String?,
        @Column(columnDefinition = "VARCHAR(20)", nullable = false)
        val nickName: String,
        val createdAt: ZonedDateTime
)