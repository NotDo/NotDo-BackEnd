package com.gsm.notdo.persistence.`do`.entity

import com.gsm.notdo.domain.`do`.model.DoType
import java.time.ZonedDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class DoEntity(
        @Id
        val id: Long,
        val content: String,
        val isComplete: Boolean,
        val type: DoType,
        val createdAt: ZonedDateTime,
        val updatedAt: ZonedDateTime?,
        val userId: Long
)
