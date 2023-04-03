package com.gsm.notdo.category.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Category(
        @Id
        val id: Long,
        val name: Long,
        @Column(name = "do_id")
        val doId: Long
)
