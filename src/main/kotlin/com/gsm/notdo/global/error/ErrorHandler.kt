package com.gsm.notdo.global.error

import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.net.BindException

@RestControllerAdvice
class ErrorHandler {
    @ExceptionHandler(BindException::class)
    fun handlerBindException(e: BindingResult): ValidatorErrorResponse? = ErrorResponse.of(e)
}