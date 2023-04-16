package com.gsm.notdo.persistence.not_todo.repository

import com.gsm.notdo.persistence.not_todo.entity.NotToDoEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface NotToDoRepository : CrudRepository<NotToDoEntity, UUID> {
}