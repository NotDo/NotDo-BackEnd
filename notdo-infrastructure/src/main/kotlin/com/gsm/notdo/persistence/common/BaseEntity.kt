package com.gsm.notdo.persistence.common

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity (
        id: UUID,
        @Column(nullable = false, updatable = false, columnDefinition = "DATETIME(6)")
        open val createdAt: LocalDateTime = LocalDateTime.now()
) : BaseUUIDEntity(id)