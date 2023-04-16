package com.gsm.notdo.persistence.not_todo.entity

import com.gsm.notdo.persistence.common.BaseEntity
import com.gsm.notdo.persistence.user.entity.UserEntity
import java.util.UUID
import javax.persistence.*

@Entity
data class NotToDoEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR(50)", nullable = false)
        val content: String,
        @Column(nullable = false)
        val isActive : Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        val userId: UserEntity,
        @Column(nullable = false)
        val categoryId: UUID
) : BaseEntity(id)
