package com.gsm.notdo.domain.not_todo.model

import com.gsm.notdo.common.annotation.Aggregate
import java.time.LocalDateTime
import java.util.*

@Aggregate
data class History(
        val id: UUID,
        val isComplete: String,
        val createdAt : LocalDateTime,
        val notToDoId: UUID,
        val categoryId: UUID
)