package com.gsm.notdo.persistence.diary.entity

import com.gsm.notdo.domain.diary.model.Mood
import com.gsm.notdo.persistence.user.entity.UserEntity
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class DiaryEntity(
        @Id
        val id: Long,
        val title: String,
        val content: String,
        val mood: Mood,
        val createdAt: LocalDateTime,
        @ManyToOne
        val userId: UserEntity
)
