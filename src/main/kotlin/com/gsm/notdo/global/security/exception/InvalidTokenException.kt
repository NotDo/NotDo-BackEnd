package com.gsm.notdo.global.security.exception

import com.gsm.notdo.global.error.BasicException
import com.gsm.notdo.global.security.exception.error.SecurityErrorCode

object InvalidTokenException : BasicException(SecurityErrorCode.INVALID_TOKEN)