package com.gsm.notdo.domain.category.adapter.output.persistence.category.repository

import com.gsm.notdo.domain.category.adapter.output.persistence.category.entity.CategoryEntity
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<CategoryEntity, Long> {
}