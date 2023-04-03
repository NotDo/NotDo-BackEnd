package com.gsm.notdo.domain.category.model

import com.gsm.notdo.common.annotation.Aggregate

@Aggregate
data class Category(
        val id: Long,
        val name: Long,
        val doId: Long
)
