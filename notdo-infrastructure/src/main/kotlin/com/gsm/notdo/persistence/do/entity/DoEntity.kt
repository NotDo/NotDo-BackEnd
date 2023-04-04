package com.gsm.notdo.persistence.`do`.entity

import com.gsm.notdo.domain.`do`.model.DoType
import com.gsm.notdo.persistence.user.entity.UserEntity
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
data class DoEntity(
        @Id
        val id: Long,
        @Column(columnDefinition = "VARCHAR2(50)", nullable = false)
        val content: String,
        val isComplete: Boolean,
        @Enumerated(EnumType.STRING)
        @Column(columnDefinition = "VARCHAR2(7)", nullable = false)
        val type: DoType,
        val createdAt: ZonedDateTime,
        val updatedAt: ZonedDateTime?,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", columnDefinition = "BINARY(16)", nullable = false)
        val userId: UserEntity
)
