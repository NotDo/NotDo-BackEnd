package com.gsm.notdo.global.security.exception.error

import com.gsm.notdo.common.error.ErrorProperty

enum class SecurityErrorCode(
        private val status: Int,
        private val message: String
) : ErrorProperty {
    EXPIRED_TOKEN(401, "Expired Token"),
    INVALID_TOKEN(401, "Invalid Token");
    override fun status(): Int = status

    override fun message(): String = message

}