package com.gsm.notdo.domain.auth.application.port.output

import com.gsm.notdo.domain.auth.domain.AuthCode

interface CommandAuthCodePort {
    fun save(domain: AuthCode)
}