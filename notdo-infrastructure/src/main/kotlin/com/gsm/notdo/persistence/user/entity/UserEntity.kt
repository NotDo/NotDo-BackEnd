package com.gsm.notdo.persistence.user.entity

import com.gsm.notdo.persistence.common.BaseEntity
import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR2(255)", nullable = false, unique = true)
        val email: String,
        @Column(columnDefinition = "VARCHAR2(255)" ,nullable = true)
        val password: String?,
        @Column(columnDefinition = "VARCHAR2(8)", nullable = false)
        val nickName: String
) : BaseEntity(id)