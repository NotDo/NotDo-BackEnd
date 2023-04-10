package com.gsm.notdo.persistence.category.entity

import com.gsm.notdo.persistence.`do`.entity.DoEntity
import javax.persistence.*

@Entity
data class CategoryEntity(
        @Id
        val id: Long,
        @Column(columnDefinition = "VARCHAR2(50)", nullable = false)
        val name: Long,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "do_id", nullable = false)
        val doId: DoEntity
)
