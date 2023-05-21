package com.gsm.notdo.domain.todo.adapter.output.persistence.repository

import com.gsm.notdo.domain.todo.adapter.output.persistence.entity.ToDoEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ToDoRepository : CrudRepository<ToDoEntity, UUID> {
}