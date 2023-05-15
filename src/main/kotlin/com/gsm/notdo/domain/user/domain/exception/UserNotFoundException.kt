package com.gsm.notdo.domain.user.domain.exception


import com.gsm.notdo.domain.user.domain.exception.error.UserErrorCode
import com.gsm.notdo.global.error.BasicException

class UserNotFoundException() : BasicException(UserErrorCode.USER_NOT_FOUND)