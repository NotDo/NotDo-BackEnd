package com.gsm.notdo.global.security.priciple

import com.gsm.notdo.domain.user.exception.UserNotFoundException
import com.gsm.notdo.domain.user.port.output.QueryUserPort
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthDetailService(
        private val queryUserPort: QueryUserPort,
) : UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        val userId = UUID.fromString(username)

        if(!queryUserPort.existsUserByUserId(userId))
            throw UserNotFoundException()

        return AuthDetails(userId)
    }
}