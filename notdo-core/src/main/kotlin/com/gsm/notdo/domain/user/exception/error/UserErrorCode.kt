package com.gsm.notdo.domain.user.exception.error

import com.gsm.notdo.common.error.ErrorProperty
import com.gsm.notdo.common.error.ErrorStatus

enum class UserErrorCode (
        private val status: Int,
        private val message: String
) : ErrorProperty {
    USER_NOT_FOUND(ErrorStatus.NOT_FOUND, "User Not Found9") {

    override fun status(): Int = status()

    override fun message(): String = message()
    }
}