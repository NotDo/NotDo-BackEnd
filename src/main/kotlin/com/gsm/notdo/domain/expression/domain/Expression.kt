package com.gsm.notdo.domain.expression.domain

import java.time.LocalDate
import java.util.UUID

data class Expression(
        val id: UUID = UUID(0, 0),
        val expression: String,
        val createdAt: LocalDate,
        val userId: UUID
)
