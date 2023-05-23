package com.gsm.notdo.domain.user.adapter.output

import com.gsm.notdo.domain.user.adapter.output.persistence.mapper.toDomain
import com.gsm.notdo.domain.user.adapter.output.persistence.mapper.toEntity
import com.gsm.notdo.domain.user.adapter.output.persistence.repository.UserRepository
import com.gsm.notdo.domain.user.domain.User
import com.gsm.notdo.domain.user.application.port.output.CommandUserPort
import org.springframework.stereotype.Component

@Component
class UserCommandPersistenceAdapter(
    private val userRepository: UserRepository
) : CommandUserPort {
    override fun save(domain: User): User {
        val userEntity = domain.toEntity(domain)
        val saveEntity = userRepository.save(userEntity)
        return saveEntity.toDomain(saveEntity)
    }
}