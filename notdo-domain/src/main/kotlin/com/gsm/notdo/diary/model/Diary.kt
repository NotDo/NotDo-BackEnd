package com.gsm.notdo.diary.model

import java.time.ZonedDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Diary(
        @Id
        val id: Long,
        val title: String,
        val content: String,
        val mood: String,
        val createdAt: ZonedDateTime,
        val userId: Long
)
