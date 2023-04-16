package com.gsm.notdo.persistence.user.repository

import com.gsm.notdo.persistence.user.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepository : CrudRepository<UserEntity, UUID> {
}