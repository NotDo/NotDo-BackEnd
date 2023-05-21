package com.gsm.notdo.domain.todo.domain

import java.time.LocalDate
import java.util.UUID

data class ToDoHistory (
        val id:UUID = UUID(0, 0),
        val isComplete: Boolean,
        val createdAt: LocalDate,
        val toDoId: UUID
)