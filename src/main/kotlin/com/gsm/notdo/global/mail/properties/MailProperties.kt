package com.gsm.notdo.global.mail.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "spring.mail")
data class MailProperties(
        val host: String,
        val port: Int,
        val username: String,
        val password: String
)