package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.input.VerifyMailUserCase
import com.gsm.notdo.domain.auth.application.port.output.CommandAuthenticationPort
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthCodePort
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthenticationPort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(rollbackFor = [Exception::class])
class VerifyMailService(
        private val queryAuthCodePort: QueryAuthCodePort,
        private val commandAuthenticationPort: CommandAuthenticationPort,
        private val queryAuthenticationPort: QueryAuthenticationPort
) : VerifyMailUserCase {
    override fun execute(email: String, authKey: String) {
        val authCode = queryAuthCodePort.findByEmailOrNull(email)
        val authentication = queryAuthenticationPort.findByEmailOrNull(email)

        if(authCode.authCode != authKey) {
            commandAuthenticationPort.save(authentication.increaseCount())
        }
        commandAuthenticationPort.save(authentication.certified())
    }
}