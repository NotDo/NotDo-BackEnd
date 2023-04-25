package com.gsm.notdo.domain.user.port.output

import com.gsm.notdo.domain.user.model.User
import java.util.UUID

interface QueryUserPort {
    fun findByUserId(userId: UUID): User?
}