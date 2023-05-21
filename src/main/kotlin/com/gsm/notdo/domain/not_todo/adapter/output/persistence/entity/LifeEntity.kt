package com.gsm.notdo.domain.not_todo.adapter.output.persistence.entity

import com.gsm.notdo.global.entity.BaseEntity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tbl_life")
data class LifeEntity(
        override val id: UUID,
        @Column(nullable = false)
        val isComplete: Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "not_to_do_history_id", nullable = false)
        val notToDoHistoryId: NotToDoHistoryEntity
) : BaseEntity(id)
