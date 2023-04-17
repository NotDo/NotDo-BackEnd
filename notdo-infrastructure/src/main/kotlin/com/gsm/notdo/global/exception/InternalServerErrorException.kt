package com.gsm.notdo.global.exception

import com.gsm.notdo.common.error.BasicException
import com.gsm.notdo.global.error.ErrorCode

object InternalServerErrorException : BasicException(ErrorCode.INTERNAL_SERVER_ERROR)