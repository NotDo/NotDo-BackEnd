package com.gsm.notdo.domain.auth.port.output

interface PasswordEncodePort {
    fun encode(password: String): String
}