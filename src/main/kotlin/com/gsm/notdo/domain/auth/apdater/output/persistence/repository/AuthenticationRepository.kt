package com.gsm.notdo.domain.user.output.persistence.auth.repository

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.AuthenticationEntity
import org.springframework.data.repository.CrudRepository

interface AuthenticationRepository : CrudRepository<AuthenticationEntity, String> {
}