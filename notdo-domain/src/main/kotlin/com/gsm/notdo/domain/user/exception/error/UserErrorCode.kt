package com.gsm.notdo.domain.user.exception.error

import com.gsm.notdo.common.error.ErrorProperty

enum class UserErrorCode(
        private val message: String,
        private val status: Int
) : ErrorProperty {
    NOT_FOUND("user not found", 404);
    override fun status(): Int = status

    override fun message(): String = message
}