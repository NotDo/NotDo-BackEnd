package com.gsm.notdo.domain.category.domain

import com.gsm.notdo.global.annotation.Aggregate
import java.util.UUID

@Aggregate
data class Category(
        val id: UUID,
        val name: Long,
        val userId: UUID
)
