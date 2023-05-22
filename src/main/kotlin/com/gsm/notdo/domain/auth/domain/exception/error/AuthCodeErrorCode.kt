package com.gsm.notdo.domain.auth.domain.exception.error

import com.gsm.notdo.global.error.ErrorProperty

enum class AuthCodeErrorCode(
        private val message: String,
        private val status: Int
) : ErrorProperty {
    AUTH_CODE_NOT_FOUND("authCode not found", 404);

    override fun status(): Int = status

    override fun message(): String = message
}