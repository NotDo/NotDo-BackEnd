package com.gsm.notdo.global.security.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.util.Base64

@ConfigurationProperties(prefix = "jwt")
@ConstructorBinding
class JwtProperties(
        secretKey: String,
        val accessExp: Int,
        val refreshExp: Int
) {
    val secretKey = Base64.getEncoder().encodeToString(secretKey.toByteArray())
}