package com.gsm.notdo.persistence.auth.repository

import com.gsm.notdo.persistence.auth.entity.AuthenticationEntity
import org.springframework.data.repository.CrudRepository

interface AuthenticationRepository : CrudRepository<AuthenticationEntity, String> {
}