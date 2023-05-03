package com.gsm.notdo.domain.todo.output.persistence.todo.entity

import com.gsm.notdo.common.base.entity.BaseEntity
import com.gsm.notdo.domain.user.output.persistence.entity.UserEntity
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "tbl_todo")
data class ToDoEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR(50)", nullable = false)
        val content: String,
        @Column(nullable = false)
        val isComplete: Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        val userId: UserEntity
) : BaseEntity(id)
