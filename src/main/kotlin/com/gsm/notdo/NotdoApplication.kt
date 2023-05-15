package com.gsm.notdo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class NotdoApplication

fun main(args: Array<String>) {
    runApplication<NotdoApplication>(*args)
}
