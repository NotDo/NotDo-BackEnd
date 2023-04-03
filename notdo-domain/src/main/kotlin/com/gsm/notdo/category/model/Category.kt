package com.gsm.notdo.category.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Category(
        @Id
        val id: Long,
        val name: Long,
        val doId: Long
)
