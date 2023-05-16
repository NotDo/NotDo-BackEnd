package com.gsm.notdo.domain.auth.apdater.output.persistence.repository

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.RefreshTokenEntity
import org.springframework.data.repository.CrudRepository

interface RefreshTokenRepository : CrudRepository<RefreshTokenEntity, String> {
}