package com.gsm.notdo.domain.auth.output.mappter

import com.gsm.notdo.domain.auth.model.RefreshToken
import com.gsm.notdo.domain.auth.output.persistence.entity.RefreshTokenEntity

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