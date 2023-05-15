package com.gsm.notdo.global.error

import org.springframework.validation.BindingResult

data class ErrorResponse(
        val status: Int,
        val message: String
) {
    companion object {
        fun of(errorProperty: ErrorProperty) = ErrorResponse(
                status = errorProperty.status(),
                message = errorProperty.message()
        )
        fun of(e: BindingResult): ValidatorErrorResponse {
            val errorMap = e.fieldErrors.associate { it.field to it.defaultMessage }

            return ValidatorErrorResponse(
                    status = ErrorCode.BAD_REQUEST.status(),
                    filedError = errorMap
            )
        }
    }
}
data class ValidatorErrorResponse(
        val status: Int,
        val filedError: Map<String, String?>
)