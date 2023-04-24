package com.gsm.notdo.persistence.not_todo.entity

import com.gsm.notdo.persistence.category.entity.CategoryEntity
import com.gsm.notdo.persistence.common.BaseEntity
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
