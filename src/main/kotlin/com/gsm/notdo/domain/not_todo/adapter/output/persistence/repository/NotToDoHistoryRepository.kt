package com.gsm.notdo.domain.not_todo.adapter.output.persistence.repository

import com.gsm.notdo.domain.not_todo.adapter.output.persistence.entity.NotToDoHistoryEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface NotToDoHistoryRepository : CrudRepository<NotToDoHistoryEntity, UUID> {
}