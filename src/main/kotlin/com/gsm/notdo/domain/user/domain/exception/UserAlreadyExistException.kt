package com.gsm.notdo.domain.user.exception

import com.gsm.notdo.common.error.BasicException
import com.gsm.notdo.domain.user.domain.exception.error.UserErrorCode

class UserAlreadyExistException : BasicException(UserErrorCode.USER_ALREADY_EXIST)