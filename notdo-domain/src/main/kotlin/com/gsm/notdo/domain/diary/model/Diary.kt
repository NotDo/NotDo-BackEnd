package com.gsm.notdo.domain.diary.model

import com.gsm.notdo.common.annotation.Aggregate
import java.time.LocalDateTime

@Aggregate
data class Diary(
        val id: Long,
        val title: String,
        val content: String,
        val mood: Mood,
        val createdAt: LocalDateTime,
        val userId: Long
)
