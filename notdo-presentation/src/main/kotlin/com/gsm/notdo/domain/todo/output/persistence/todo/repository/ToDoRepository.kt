package com.gsm.notdo.domain.user.output.persistence.todo.repository

import com.gsm.notdo.domain.todo.output.persistence.todo.entity.ToDoEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ToDoRepository : CrudRepository<ToDoEntity, UUID> {
}