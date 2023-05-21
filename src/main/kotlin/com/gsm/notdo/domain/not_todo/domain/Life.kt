package com.gsm.notdo.domain.not_todo.domain

import java.util.UUID

data class Life(
        val id: UUID = UUID(0, 0),
        val isComplete: Boolean,
        val notToDoHistoryId: UUID
)
