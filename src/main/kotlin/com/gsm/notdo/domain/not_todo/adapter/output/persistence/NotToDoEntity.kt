package com.gsm.notdo.domain.not_todo.adapter.output.persistence

import com.gsm.notdo.domain.user.adapter.output.persistence.entity.UserEntity
import com.gsm.notdo.global.entity.BaseEntity
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "tbl_not_to_do")
data class NotToDoEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR(50)", nullable = false)
        val content: String,
        @Column(nullable = false)
        val isActive: Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        val userId: UserEntity
) : BaseEntity(id)
