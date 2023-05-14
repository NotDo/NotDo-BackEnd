package com.gsm.notdo.domain.user.adapter.output

import com.gsm.notdo.domain.user.exception.UserNotFoundException
import com.gsm.notdo.domain.user.model.User
import com.gsm.notdo.domain.user.adapter.output.mapper.toDomain
import com.gsm.notdo.domain.user.adapter.output.persistence.repository.UserRepository
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import java.util.*

@Component
class UserQueryPersistenceAdapter(
        private val userRepository: UserRepository
) : QueryUserPort {
    override fun findByUserIdOrNull(userId: UUID): User {
        val user = userRepository.findByIdOrNull(userId) ?: throw UserNotFoundException()
        return user.toDomain(user)
    }
    override fun existsUserByUserId(userId: UUID): Boolean =
            userRepository.existsById(userId)

    override fun existUserByEmail(email: String): Boolean =
            userRepository.existsByEmail(email)
}