package com.gsm.notdo.global.filter

import com.gsm.notdo.global.security.properties.JwtProperties
import com.gsm.notdo.global.security.token.JwtParser
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtTokenFilter(
        private val jwtParser: JwtParser
) : OncePerRequestFilter() {
    override fun doFilterInternal(
            request: HttpServletRequest,
            response: HttpServletResponse,
            filterChain: FilterChain) {
        val token = resolveToken(request)

        token?.let {
            SecurityContextHolder.getContext().authentication = jwtParser.getAuthentication(token)
        }
        filterChain.doFilter(request, response)
    }
    private fun resolveToken(request: HttpServletRequest): String? {
        val token = request.getHeader(JwtProperties.HEADER)
        return if (token != null && token.startsWith(JwtProperties.PREFIX)) token.replace("Bearer ", "") else null
    }
}