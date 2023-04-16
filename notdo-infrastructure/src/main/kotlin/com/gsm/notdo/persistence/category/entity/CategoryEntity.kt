package com.gsm.notdo.persistence.category.entity

import com.gsm.notdo.persistence.not_todo.entity.HistoryEntity
import javax.persistence.*


@Entity
@Table(name = "tbl_category")
data class CategoryEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @Column(nullable = false)
        val name: Long,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "history_id", nullable = false)
        val historyId: HistoryEntity
)
