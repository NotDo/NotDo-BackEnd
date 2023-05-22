package com.gsm.notdo.domain.auth.application.port.output

import com.gsm.notdo.domain.auth.domain.AuthCode

interface QueryAuthCodePort {
    fun findByEmail(email: String): AuthCode
}