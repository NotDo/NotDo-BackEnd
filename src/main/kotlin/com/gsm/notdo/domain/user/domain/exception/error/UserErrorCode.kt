package com.gsm.notdo.domain.user.domain.exception.error

import com.gsm.notdo.global.error.ErrorProperty

enum class UserErrorCode(
        private val message: String,
        private val status: Int
) : ErrorProperty {
    USER_NOT_FOUND("user not found", 404),
    USER_ALREADY_EXIST("user already exist", 400);
    override fun status(): Int = status

    override fun message(): String = message
}