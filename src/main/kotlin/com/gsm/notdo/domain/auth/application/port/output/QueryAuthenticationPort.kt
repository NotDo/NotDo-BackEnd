package com.gsm.notdo.domain.auth.application.port.output

import com.gsm.notdo.domain.auth.domain.Authentication

interface QueryAuthenticationPort {
    fun findByEmailOrNull(email: String): Authentication
    fun existsByEmail(email: String): Boolean
}