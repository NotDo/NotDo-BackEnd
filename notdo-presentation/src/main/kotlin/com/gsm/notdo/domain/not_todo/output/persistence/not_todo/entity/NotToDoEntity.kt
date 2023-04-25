package com.gsm.notdo.domain.not_todo.output.persistence.not_todo.entity

import com.gsm.notdo.common.base.entity.BaseEntity
import com.gsm.notdo.domain.category.output.persistence.category.entity.CategoryEntity
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "tbl_not_to_do")
data class NotToDoEntity(
        override val id: UUID,
        @Column(columnDefinition = "VARCHAR(50)", nullable = false)
        val content: String,
        @Column(nullable = false)
        val isActive : Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "category_id", nullable = false)
        val categoryId: CategoryEntity
) : BaseEntity(id)
