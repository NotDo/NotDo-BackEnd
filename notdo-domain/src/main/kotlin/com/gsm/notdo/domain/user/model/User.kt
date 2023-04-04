package com.gsm.notdo.domain.user.model

import com.gsm.notdo.common.annotation.Aggregate
import java.time.ZonedDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Id

@Aggregate
data class User(
        @Id
        val id: UUID,
        @Column(columnDefinition = "VARCHAR(255)", nullable = false, unique = true)
        val email: String,
        @Column(columnDefinition = "VARCHAR(255)", nullable = true)
        val password: String?,
        @Column(columnDefinition = "VARCHAR(20)", nullable = false)
        val nickName: String,
        val createdAt: ZonedDateTime
)
