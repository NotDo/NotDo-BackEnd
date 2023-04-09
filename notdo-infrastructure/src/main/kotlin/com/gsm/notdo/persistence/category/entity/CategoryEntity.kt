package com.gsm.notdo.persistence.category.entity

import com.gsm.notdo.persistence.`do`.entity.DoEntity
import javax.persistence.*


@Entity
@Table(name = "tbl_category")
data class CategoryEntity(
        @Id
        val id: Long,
        @Column(nullable = false)
        val name: Long,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "do_id", nullable = false)
        val doId: DoEntity
)
