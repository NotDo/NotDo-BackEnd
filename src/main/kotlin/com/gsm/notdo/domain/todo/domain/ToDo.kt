package com.gsm.notdo.domain.todo.domain

import com.gsm.notdo.global.annotation.Aggregate
import java.util.UUID

@Aggregate
data class ToDo(
        val id: UUID,
        val content: String,
        val isActive: Boolean,
        val userId: UUID
)