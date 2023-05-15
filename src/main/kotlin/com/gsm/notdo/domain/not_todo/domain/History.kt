package com.gsm.notdo.domain.not_todo.domain

import com.gsm.notdo.common.annotation.Aggregate
import java.time.LocalDateTime
import java.util.*

@Aggregate
data class History(
        val id: UUID,
        val isComplete: Boolean,
        val createdAt : LocalDateTime,
        val notToDoId: UUID,
        val categoryId: UUID
)