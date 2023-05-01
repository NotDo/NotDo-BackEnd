package com.gsm.notdo.domain.not_todo.output.persistence.not_todo.entity

import com.gsm.notdo.common.base.entity.BaseEntity
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tbl_history")
data class HistoryEntity(
        override val id: UUID,
        val isComplete: String,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "not_to_do_id", nullable = false)
        val notToDoId: NotToDoEntity,
        val categoryId: UUID
) : BaseEntity(id)
