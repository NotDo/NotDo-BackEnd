package com.gsm.notdo.domain.`do`.model

import com.gsm.notdo.common.annotation.Aggregate
import java.time.ZonedDateTime

@Aggregate
data class Do(
        val id: Long,
        val content: String,
        val isComplete: Boolean,
        val type: Type,
        val createdAt: ZonedDateTime,
        val updatedAt: ZonedDateTime?,
        val userId: Long
)
