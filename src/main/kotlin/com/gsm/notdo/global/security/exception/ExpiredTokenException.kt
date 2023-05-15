package com.gsm.notdo.global.security.exception

import com.gsm.notdo.global.error.BasicException
import com.gsm.notdo.global.security.exception.error.SecurityErrorCode

object ExpiredTokenException : BasicException(SecurityErrorCode.EXPIRED_TOKEN)