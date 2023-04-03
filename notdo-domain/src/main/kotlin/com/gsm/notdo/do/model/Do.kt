package com.gsm.notdo.`do`.model

import java.time.ZonedDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Do(
        @Id
        val id: Long,
        val content: String,
        val isComplete: Boolean,
        val type: String,
        val createdAt: ZonedDateTime,
        val updatedAt: ZonedDateTime,
        val userId: Long
)
