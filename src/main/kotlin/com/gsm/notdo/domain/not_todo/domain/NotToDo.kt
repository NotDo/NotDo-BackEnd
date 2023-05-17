package com.gsm.notdo.domain.not_todo.domain

import com.gsm.notdo.global.annotation.Aggregate
import java.util.UUID

@Aggregate
data class NotToDo(
        val id: UUID = UUID(0, 0),
        val content: String,
        val life: Int,
        val isActive : Boolean,
        val categoryId: UUID
)
