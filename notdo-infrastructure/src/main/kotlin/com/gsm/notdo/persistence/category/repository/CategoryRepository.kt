package com.gsm.notdo.persistence.category.repository

import com.gsm.notdo.persistence.category.entity.CategoryEntity
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<CategoryEntity, Long> {
}