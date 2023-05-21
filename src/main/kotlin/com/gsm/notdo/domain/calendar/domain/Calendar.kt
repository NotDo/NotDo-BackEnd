package com.gsm.notdo.domain.calendar.domain

import com.gsm.notdo.global.annotation.Aggregate
import java.time.LocalDate
import java.util.UUID

@Aggregate
data class Calendar (
        val id: UUID = UUID(0, 0),
        val totalCount: Long,
        val createdAt: LocalDate,
        val userId: UUID
)