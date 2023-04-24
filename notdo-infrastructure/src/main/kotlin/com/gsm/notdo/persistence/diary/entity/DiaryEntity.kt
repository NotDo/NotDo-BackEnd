package com.gsm.notdo.persistence.diary.entity

import com.gsm.notdo.common.enum.Mood
import com.gsm.notdo.persistence.common.BaseEntity
import com.gsm.notdo.persistence.user.entity.UserEntity
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "tbl_diary")
data class DiaryEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR(100)", nullable = false)
        val title: String,
        @Column(columnDefinition = "VARCHAR(1000)", nullable = false)
        val content: String,
        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        val mood: Mood,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        val userId: UserEntity
) : BaseEntity(id)
