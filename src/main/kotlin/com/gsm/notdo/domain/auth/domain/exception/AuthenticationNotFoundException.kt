package com.gsm.notdo.domain.auth.domain.exception

import com.gsm.notdo.domain.auth.domain.exception.error.AuthenticationErrorCode
import com.gsm.notdo.global.error.BasicException

class AuthenticationNotFoundException : BasicException(AuthenticationErrorCode.AUTHENTICATION_NOT_FOUND)