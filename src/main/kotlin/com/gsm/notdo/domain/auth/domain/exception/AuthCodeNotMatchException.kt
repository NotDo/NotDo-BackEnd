package com.gsm.notdo.domain.auth.domain.exception

import com.gsm.notdo.domain.auth.domain.exception.error.AuthCodeErrorCode
import com.gsm.notdo.global.error.BasicException

class AuthCodeNotMatchException : BasicException(AuthCodeErrorCode.AUTH_CODE_NOT_MATCH)