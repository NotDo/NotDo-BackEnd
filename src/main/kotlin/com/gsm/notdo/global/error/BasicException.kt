package com.gsm.notdo.global.error

abstract class BasicException(
        val errorProperty: ErrorProperty
) : RuntimeException() {
    override fun fillInStackTrace(): Throwable = this
}