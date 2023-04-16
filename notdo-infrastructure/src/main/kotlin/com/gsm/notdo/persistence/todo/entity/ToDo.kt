package com.gsm.notdo.persistence.todo.entity

import com.gsm.notdo.common.annotation.Aggregate
import com.gsm.notdo.persistence.common.BaseEntity
import com.gsm.notdo.persistence.user.entity.UserEntity
import org.hibernate.annotations.ColumnDefault
import java.util.UUID
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Aggregate
data class ToDo(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR(50)", nullable = false)
        val content: String,
        @Column(nullable = false)
        val isComplete: Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        val userId: UserEntity
) : BaseEntity(id)
