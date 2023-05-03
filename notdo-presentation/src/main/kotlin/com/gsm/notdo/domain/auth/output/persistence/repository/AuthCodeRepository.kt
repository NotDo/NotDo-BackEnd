package com.gsm.notdo.domain.user.output.persistence.auth.repository

import com.gsm.notdo.domain.auth.output.persistence.entity.AuthCodeEntity
import org.springframework.data.repository.CrudRepository

interface AuthCodeRepository : CrudRepository<AuthCodeEntity, String> {
}