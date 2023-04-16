package com.gsm.notdo.domain.not_todo.model

import java.util.UUID

data class NotTodo(
        val id: UUID,
        val content: String,
        val isActive : Boolean,
        val userId: UUID,
        val categoryId: UUID
)
