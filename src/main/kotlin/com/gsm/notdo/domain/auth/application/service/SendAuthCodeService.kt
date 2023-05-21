package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.input.SendAuthCodeUseCase
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class SendAuthCodeService(
        private val javaMailSender: JavaMailSender
) : SendAuthCodeUseCase {
    override fun execute(email: String) {
        val message = SimpleMailMessage().apply {
            setTo(email)
            setSubject(email)
            setText(email)
        }

        send(message)
    }

}