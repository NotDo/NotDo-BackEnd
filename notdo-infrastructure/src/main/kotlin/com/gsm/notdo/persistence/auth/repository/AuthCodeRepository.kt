package com.gsm.notdo.persistence.auth.repository

import com.gsm.notdo.persistence.auth.entity.AuthCodeEntity
import org.springframework.data.repository.CrudRepository

interface AuthCodeRepository : CrudRepository<AuthCodeEntity, String> {
}