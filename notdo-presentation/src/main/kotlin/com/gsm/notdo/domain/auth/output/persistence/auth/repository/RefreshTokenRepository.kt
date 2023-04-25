package com.gsm.notdo.domain.user.output.persistence.auth.repository

import com.gsm.notdo.domain.auth.output.persistence.auth.entity.RefreshTokenEntity
import org.springframework.data.repository.CrudRepository

interface RefreshTokenRepository : CrudRepository<RefreshTokenEntity, String> {
}