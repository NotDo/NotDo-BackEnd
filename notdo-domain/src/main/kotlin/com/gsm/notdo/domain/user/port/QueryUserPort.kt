package com.gsm.notdo.domain.user.port

import com.gsm.notdo.domain.user.model.User
import java.util.*

interface QueryUserPort {
    fun queryUserById(userId: UUID): User?
}