package com.gsm.notdo.global.annotation

import org.springframework.stereotype.Component
import java.lang.annotation.*
import java.lang.annotation.Retention
import java.lang.annotation.Target

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
annotation class Service
