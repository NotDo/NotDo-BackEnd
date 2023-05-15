package com.gsm.notdo.global.security.token

import com.gsm.notdo.global.exception.InternalServerErrorException
import com.gsm.notdo.global.security.exception.ExpiredTokenException
import com.gsm.notdo.global.security.exception.InvalidTokenException
import com.gsm.notdo.global.security.priciple.AuthDetailService
import com.gsm.notdo.global.security.properties.SecurityProperties
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component

@Component
class JwtParser(
        private val securityProperties: SecurityProperties,
        private val authDetailService: AuthDetailService
) {
    fun getAuthentication(token: String): Authentication {
        val claim = getTokenClaim(token)

        val userDetail = authDetailService.loadUserByUsername(claim.id)

        return UsernamePasswordAuthenticationToken(userDetail, "", userDetail.authorities)
    }

    private fun getTokenClaim(token: String): Claims =
            try {
                Jwts.parser()
                        .setSigningKey(securityProperties.secretKey)
                        .parseClaimsJws(token)
                        .body
            } catch(e: Exception) {
                when(e) {
                    is InvalidTokenException -> throw InvalidTokenException
                    is ExpiredTokenException -> throw ExpiredTokenException
                    else -> { throw InternalServerErrorException }
                }
        }
}