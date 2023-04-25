package com.gsm.notdo.domain.user.output.persistence.not_todo.repository

import com.gsm.notdo.domain.not_todo.output.persistence.not_todo.entity.HistoryEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface HistoryRepository : CrudRepository<HistoryEntity, UUID> {
}