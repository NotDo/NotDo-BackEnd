package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.input.SendAuthCodeUseCase
import com.gsm.notdo.domain.auth.application.port.output.CommandAuthCodePort
import com.gsm.notdo.domain.auth.domain.AuthCode
import com.gsm.notdo.global.mail.properties.MailProperties
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import org.thymeleaf.context.Context
import org.thymeleaf.spring5.SpringTemplateEngine
import javax.mail.internet.MimeMessage
import kotlin.random.Random


@Service
class SendAuthCodeService(
        private val javaMailSender: JavaMailSender,
        private val mailProperties: MailProperties,
        private val templateEngine: SpringTemplateEngine,
        private val commandAuthCodePort: CommandAuthCodePort
) : SendAuthCodeUseCase {
    override fun execute(email: String) {
        val code = createCode()
        val message = createMessage(email, code)
        javaMailSender.send(message) // 메일 발송


        val authCode: AuthCode = AuthCode(email, code)
        commandAuthCodePort.save(authCode)
    }
    private fun createMessage(email: String, code: String): MimeMessage {
        val setFrom = mailProperties.host
        val title = "NotDo 인증 번호"

        val message: MimeMessage = javaMailSender.createMimeMessage().apply {
            addRecipients(MimeMessage.RecipientType.TO, email) // 보낼 이메일 설정
            subject = title
            setFrom(setFrom)
            setText(setContext(code), "utf-8", "html")
        }
        return message
    }
    private fun setContext(code: String): String? {
        val context = Context().apply {
            setVariable("code", code)
        }
        return templateEngine.process("Mail", context)
    }
    private fun createCode(): String =
            (0..3).joinToString(""){ Random.nextInt(10).toString() }
}