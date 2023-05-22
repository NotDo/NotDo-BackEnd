package com.gsm.notdo.domain.auth.application.port.output

import com.gsm.notdo.domain.auth.domain.Authentication

interface CommandAuthenticationPort {
    fun save(domain: Authentication)
}