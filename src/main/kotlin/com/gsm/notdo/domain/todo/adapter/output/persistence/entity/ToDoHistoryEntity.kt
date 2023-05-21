package com.gsm.notdo.domain.todo.adapter.output.persistence.entity

import com.gsm.notdo.global.entity.BaseEntity
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tbl_to_do_history")
data class ToDoHistoryEntity(
        override val id: UUID,
        @Column(nullable = false)
        val isComplete: Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "to_do_id", nullable = false)
        val toDoId: ToDoEntity
) : BaseEntity(id)

