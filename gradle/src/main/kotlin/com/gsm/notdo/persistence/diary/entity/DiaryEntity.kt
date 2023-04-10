package com.gsm.notdo.persistence.diary.entity

import com.gsm.notdo.domain.diary.model.Mood
import com.gsm.notdo.persistence.common.BaseEntity
import com.gsm.notdo.persistence.user.entity.UserEntity
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*

@Entity
data class DiaryEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR2(100)", nullable = false)
        val title: String,
        @Column(columnDefinition = "VARCHAR2(1000)", nullable = false)
        val content: String,
        @Enumerated(EnumType.STRING)
        @Column(columnDefinition = "VARCHAR2(7)", nullable = false)
        val mood: Mood,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", columnDefinition = "BINARY(16)", nullable = false)
        val userId: UserEntity
) : BaseEntity(id)
