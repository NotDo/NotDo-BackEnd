package com.gsm.notdo.global.security.token

import com.gsm.notdo.domain.auth.application.port.output.JwtPort
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto
import com.gsm.notdo.global.security.properties.JwtProperties
import com.gsm.notdo.global.security.properties.SecurityProperties
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.stereotype.Component
import java.util.*

@Component
class GenerateTokenAdapter(
        private val securityProperties: SecurityProperties
) : JwtPort {
    override fun receiveToken(userId: UUID): TokenDto =
            TokenDto(
                    accessToken = generateAccessToken(userId),
                    refreshToken = generateRefreshToken(userId),
                    accessExp = securityProperties.accessExp,
                    refreshExp = securityProperties.refreshExp
            )
    private fun generateAccessToken(userId: UUID) =
             Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256, securityProperties.secretKey)
                    .claim("userId", userId)
                    .claim("type", JwtProperties.ACCESS)
                    .setIssuedAt(Date())
                    .setSubject(userId.toString())
                    .setExpiration(Date(System.currentTimeMillis() + securityProperties.accessExp * 1000))
                    .compact()
    private fun generateRefreshToken(userId: UUID) =
            Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256, securityProperties.secretKey)
                    .claim("userId", userId)
                    .claim("type", JwtProperties.REFRESH)
                    .setIssuedAt(Date())
                    .setSubject(userId.toString())
                    .setExpiration(Date(System.currentTimeMillis() + securityProperties.refreshExp * 1000))
                    .compact()
}