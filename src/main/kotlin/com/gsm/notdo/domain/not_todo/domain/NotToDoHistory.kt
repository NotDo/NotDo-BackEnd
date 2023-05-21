package com.gsm.notdo.domain.not_todo.domain

import com.gsm.notdo.global.annotation.Aggregate
import java.time.LocalDateTime
import java.util.*

@Aggregate
data class NotToDoHistory(
        val id: UUID = UUID(0, 0),
        val createdAt: LocalDateTime,
        val notToDoId: UUID,
)