package com.gsm.notdo.persistence.todo.repository

import com.gsm.notdo.persistence.todo.entity.ToDoEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ToDoRepository : CrudRepository<ToDoEntity, UUID> {
}