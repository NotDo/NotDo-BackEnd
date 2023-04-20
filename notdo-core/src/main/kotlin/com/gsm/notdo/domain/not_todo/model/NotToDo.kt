package com.gsm.notdo.domain.not_todo.model

import java.util.UUID

data class NotToDo(
        val id: UUID,
        val content: String,
        val isActive : Boolean,
        val categoryId: UUID
)
