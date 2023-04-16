package com.gsm.notdo.persistence.todo.entity

import com.gsm.notdo.persistence.common.BaseEntity
import com.gsm.notdo.persistence.user.entity.UserEntity
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
