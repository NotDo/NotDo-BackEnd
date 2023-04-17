package com.gsm.notdo.persistence.auth.repository

import com.gsm.notdo.persistence.auth.entity.RefreshTokenEntity
import org.springframework.data.repository.CrudRepository

interface RefreshTokenRepository : CrudRepository<RefreshTokenEntity, String> {
}