package com.gsm.notdo.domain.user.exception

import com.gsm.notdo.common.error.BasicException
import com.gsm.notdo.domain.user.exception.error.UserErrorCode

object UserNotFoundException : BasicException(UserErrorCode.USER_NOT_FOUND)