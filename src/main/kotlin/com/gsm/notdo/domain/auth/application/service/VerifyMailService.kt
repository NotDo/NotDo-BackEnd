package com.gsm.notdo.domain.auth.application.service

import com.gsm.notdo.domain.auth.application.port.input.VerifyMailUserCase
import com.gsm.notdo.domain.auth.application.port.output.CommandAuthenticationPort
import com.gsm.notdo.domain.auth.application.port.output.QueryAuthCodePort
import com.gsm.notdo.domain.auth.domain.Authentication
import org.springframework.stereotype.Service

@Service
class VerifyMailService(
        private val queryAuthCodePort: QueryAuthCodePort,
        private val commandAuthenticationPort: CommandAuthenticationPort
) : VerifyMailUserCase {
    override fun execute(email: String, authKey: String) {
        val authCode = queryAuthCodePort.findByEmail(email)
        if(authCode.authCode == authKey) {
            commandAuthenticationPort.save(
                    Authentication(
                            email = email,
                            attemptCount = 0,
                            isVerified = true,
                            expirationTime = 900
                    )
            )
        }
    }

}