package com.gsm.notdo.domain.not_todo.domain

import com.gsm.notdo.common.annotation.Aggregate
import java.util.UUID

@Aggregate
data class NotToDo(
        val id: UUID,
        val content: String,
        val isActive : Boolean,
        val categoryId: UUID
)
