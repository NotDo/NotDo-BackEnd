package com.gsm.notdo.common.error

interface ErrorProperty {
    fun status(): Int
    fun message(): String
}