package com.gsm.notdo.common.error

abstract class BaseException(
        val errorProperty: ErrorProperty
) : RuntimeException() {
    override fun fillInStackTrace(): Throwable = this
}
