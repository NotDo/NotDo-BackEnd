package com.gsm.notdo.domain.diary.domain

import com.gsm.notdo.common.annotation.Aggregate
import java.time.LocalDateTime
import java.util.UUID

@Aggregate
data class Diary(
        val id: UUID,
        val title: String,
        val content: String,
        val mood: Mood,
        val createdAt: LocalDateTime,
        val userId: UUID
)
