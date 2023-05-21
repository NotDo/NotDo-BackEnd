package com.gsm.notdo.domain.auth.apdater.output.persistence.mappter

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.RefreshTokenEntity
import com.gsm.notdo.domain.auth.domain.RefreshToken

fun RefreshToken.toEntity(domain: RefreshToken): RefreshTokenEntity =
        RefreshTokenEntity(
                email = domain.email,
                refreshToken = domain.refreshToken,
                timeToLive = domain.timeToLive
        )

fun RefreshTokenEntity.toDomain(entity: RefreshTokenEntity): RefreshToken =
        RefreshToken(
                email = entity.email,
                refreshToken = entity.refreshToken,
                timeToLive = entity.timeToLive
        )