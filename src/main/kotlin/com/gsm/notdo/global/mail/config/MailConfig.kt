package com.gsm.notdo.global.mail.config

import com.gsm.notdo.global.mail.properties.MailProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
class MailConfig(
       private val mailProperties: MailProperties
) {
    @Bean
    fun javaMailSender(): JavaMailSender {
        val (host, port, username, password) = mailProperties

        return JavaMailSenderImpl().apply {
            this.host = host
            this.port = port
            this.username = username
            this.password = password
        }
    }
}