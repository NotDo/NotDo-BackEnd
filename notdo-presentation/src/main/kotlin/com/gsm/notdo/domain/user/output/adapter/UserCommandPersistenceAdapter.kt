package com.gsm.notdo.domain.user.output.adapter

import com.gsm.notdo.domain.user.model.User
import com.gsm.notdo.domain.user.output.mapper.toEntity
import com.gsm.notdo.domain.user.output.persistence.repository.UserRepository
import com.gsm.notdo.domain.user.port.output.CommandUserPort
import org.springframework.stereotype.Component

@Component
class UserCommandPersistenceAdapter(
    private val userRepository: UserRepository
) : CommandUserPort {
    override fun create(domain: User) {
       val userEntity = domain.toEntity(domain)
        userRepository.save(userEntity)
    }
}