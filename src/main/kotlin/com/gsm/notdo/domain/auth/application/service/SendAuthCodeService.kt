package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.input.SendAuthCodeUseCase
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class SendAuthCodeService(
        private val javaMailSender: JavaMailSender
) : SendAuthCodeUseCase {
    override fun execute(email: String) {


    }

}