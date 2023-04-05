package com.gsm.notdo.domain.`do`.model

import com.gsm.notdo.common.annotation.Aggregate
import java.time.LocalDateTime
import java.util.UUID

@Aggregate
data class Do(
        val id: UUID,
        val content: String,
        val isComplete: Boolean,
        val type: DoType,
        val createdAt: LocalDateTime,
        val updatedAt: LocalDateTime?,
        val userId: UUID
)
