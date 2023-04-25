package com.gsm.notdo.domain.todo.model

import com.gsm.notdo.common.annotation.Aggregate
import java.util.UUID

@Aggregate
data class ToDo(
        val id: UUID,
        val content: String,
        val isComplete: Boolean,
        val userId: UUID
)