package com.gsm.notdo.persistence.`do`.entity

import com.gsm.notdo.domain.`do`.model.DoType
import com.gsm.notdo.persistence.common.BaseEntity
import com.gsm.notdo.persistence.user.entity.UserEntity
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*

@Entity
data class DoEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR2(50)", nullable = false)
        val content: String,
        val isComplete: Boolean,
        @Enumerated(EnumType.STRING)
        @Column(columnDefinition = "VARCHAR2(7)", nullable = false)
        val type: DoType,
        override val createdAt: LocalDateTime,
        @Column(nullable = false, updatable = false, columnDefinition = "DATETIME(6)")
        val updatedAt: LocalDateTime?,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", columnDefinition = "BINARY(16)", nullable = false)
        val userId: UserEntity
) : BaseEntity(id)
