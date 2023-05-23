package com.gsm.notdo.domain.auth.application.port.output

interface PasswordEncodePort {
    fun encode(password: String): String
}