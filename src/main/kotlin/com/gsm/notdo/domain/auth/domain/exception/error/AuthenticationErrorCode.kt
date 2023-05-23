package com.gsm.notdo.domain.auth.domain.exception.error

import com.gsm.notdo.global.error.ErrorProperty

enum class AuthenticationErrorCode(
        private val message: String,
        private val status: Int
) : ErrorProperty {
    AUTHENTICATION_NOT_FOUND("authentication not found", 404);

    override fun status(): Int = status

    override fun message(): String = message
}