package com.gsm.notdo.domain.user.adapter.output.mapper

import com.gsm.notdo.domain.user.adapter.output.persistence.entity.UserEntity
import com.gsm.notdo.domain.user.domain.User

fun User.toEntity(domain: User) : UserEntity =
    UserEntity(
            id = domain.id,
            email = domain.email,
            password = domain.password,
            nickName = domain.nickname,
            createdAt = domain.createdAt
    )
fun UserEntity.toDomain(entity: UserEntity) : User =
        User(
                id = entity.id,
                email = entity.email,
                password = entity.password,
                nickname = entity.nickName,
                createdAt = entity.createdAt
        )