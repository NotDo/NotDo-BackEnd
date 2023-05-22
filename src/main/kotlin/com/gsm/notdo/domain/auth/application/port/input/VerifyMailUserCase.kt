package com.gsm.notdo.domain.auth.application.port.input

interface VerifyMailUserCase {
    fun execute(email: String, authKey: String)
}