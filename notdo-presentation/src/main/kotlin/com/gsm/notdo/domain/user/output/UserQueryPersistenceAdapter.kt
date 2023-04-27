package com.gsm.notdo.domain.user.output

import com.gsm.notdo.domain.user.model.User
import com.gsm.notdo.domain.user.output.mapper.toDomain
import com.gsm.notdo.domain.user.output.persistence.user.repository.UserRepository
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class UserQueryPersistenceAdapter(
        private val userRepository: UserRepository
) : QueryUserPort {
    override fun findByUserIdOrNull(userId: UUID): User? {
        val user = userRepository.findByUserIdOrNull(userId) ?: return null
        return user.toDomain(user)
    }
    override fun existsUserByUserId(userId: UUID): Boolean =
            userRepository.existsById(userId)
}