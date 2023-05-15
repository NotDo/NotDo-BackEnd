package com.gsm.notdo.global.security.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.util.Base64

@ConstructorBinding
@ConfigurationProperties(prefix = "jwt")
class SecurityProperties(
        secretKey: String,
        val accessExp: Long,
        val refreshExp: Long
) {
    val secretKey = Base64.getEncoder().encodeToString(secretKey.toByteArray())
}