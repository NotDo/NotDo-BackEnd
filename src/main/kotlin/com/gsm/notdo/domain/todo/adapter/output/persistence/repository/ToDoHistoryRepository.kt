package com.gsm.notdo.domain.todo.adapter.output.persistence.repository

import com.gsm.notdo.domain.todo.adapter.output.persistence.entity.ToDoHistoryEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ToDoHistoryRepository : CrudRepository<ToDoHistoryEntity, UUID>{
}