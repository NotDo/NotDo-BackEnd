package com.gsm.notdo.domain.user.application.port.output

import com.gsm.notdo.domain.user.domain.User
import java.util.UUID

interface QueryUserPort {
    fun findByUserIdOrNull(userId: UUID): User
    fun findByEmailOrNull(email: String): User
    fun existsUserByUserId(userId: UUID): Boolean
    fun existUserByEmail(email: String): Boolean
}