package com.gsm.notdo.domain.auth.application.port.input

interface SendAuthCodeUseCase {
    fun execute(email: String)
}