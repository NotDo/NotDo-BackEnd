package com.gsm.notdo.persistence.not_todo.repository

import com.gsm.notdo.persistence.not_todo.entity.HistoryEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface HistoryRepository : CrudRepository<HistoryEntity, UUID> {
}