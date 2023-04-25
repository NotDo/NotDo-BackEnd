package com.gsm.notdo.domain.user.output

import com.gsm.notdo.domain.user.model.User
import com.gsm.notdo.domain.user.output.persistence.user.repository.UserRepository
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import java.util.*

class UserQueryPersistenceAdapter(
        private val userRepository: UserRepository
) : QueryUserPort {
    override fun findByUserId(userId: UUID): User? {
        userRepository.findByUserId(userId)
        return null
    }
}