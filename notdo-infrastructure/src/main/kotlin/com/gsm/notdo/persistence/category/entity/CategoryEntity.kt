package com.gsm.notdo.persistence.category.entity

import com.gsm.notdo.persistence.`do`.entity.DoEntity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class CategoryEntity(
        @Id
        val id: Long,
        val name: Long,
        @ManyToOne()
        val doId: DoEntity
)
