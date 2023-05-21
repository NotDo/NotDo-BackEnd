package com.gsm.notdo.domain.not_todo.adapter.output.persistence.entity

import com.gsm.notdo.global.entity.BaseEntity
import java.util.*
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class NotToDoHistoryEntity(
        override val id: UUID,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "not_to_do_id", nullable = false)
        val notToDoId: NotToDoEntity
) : BaseEntity(id)
