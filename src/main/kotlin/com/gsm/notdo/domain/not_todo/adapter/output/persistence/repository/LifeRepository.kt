package com.gsm.notdo.domain.not_todo.adapter.output.persistence.repository

import com.gsm.notdo.domain.not_todo.adapter.output.persistence.entity.LifeEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface LifeRepository : CrudRepository<LifeEntity, UUID> {
}