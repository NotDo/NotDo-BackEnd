package com.gsm.notdo.domain.auth.apdater.output.persistence.mapper

import com.gsm.notdo.domain.auth.apdater.output.persistence.entity.AuthCodeEntity
import com.gsm.notdo.domain.auth.domain.AuthCode

fun AuthCode.toEntity(domain: AuthCode): AuthCodeEntity {
    val (email, authCode) = domain
    return AuthCodeEntity(
            email = email,
            authCode = authCode
    )
}

fun AuthCodeEntity.toDomain(entity: AuthCodeEntity): AuthCode {
    val (email, authCode) = entity
    return AuthCode(
            email = email,
            authCode = authCode
    )
}