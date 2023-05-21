package com.gsm.notdo.global.mail.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
class MailConfig(
        @Value("\${spring.mail.host}")
        private val mailHost: String,
        @Value("\${spring.mail.port}")
        private val mailPort: Int,
        @Value("\${spring.mail.username}")
        private val mailUsername: String,
        @Value("\${spring.mail.password}")
        private val mailPassword: String
) {
    @Bean
    fun javaMailSender(): JavaMailSender =
        JavaMailSenderImpl().apply {
            host = mailHost
            port = mailPort
            username = mailUsername
            password = mailPassword
        }
}