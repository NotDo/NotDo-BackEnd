package com.gsm.notdo.global.filter

import com.fasterxml.jackson.databind.ObjectMapper
import com.gsm.notdo.common.error.BasicException
import com.gsm.notdo.common.error.ErrorProperty
import com.gsm.notdo.global.error.ErrorResponse
import com.gsm.notdo.global.exception.InternalServerErrorException
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.client.HttpServerErrorException.InternalServerError
import org.springframework.web.filter.OncePerRequestFilter
import java.nio.charset.StandardCharsets
import java.util.logging.Logger
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ExceptionFilter(
        private val objectMapper: ObjectMapper
) : OncePerRequestFilter() {
    private val log by lazy { LoggerFactory.getLogger(this.javaClass.simpleName) }
    override fun doFilterInternal(
            request: HttpServletRequest,
            response: HttpServletResponse,
            filterChain: FilterChain) {
       try {
           filterChain.doFilter(request, response)
       } catch(e: BasicException) {
           when(e.cause){
               is BasicException -> {
                   errorToJson((e.cause as BasicException).errorProperty, response)
                   log.error(e.message)
               }
               else -> {
                   errorToJson(InternalServerErrorException.errorProperty, response)
                   log.error(InternalServerErrorException.message)
               }
           }
       }
    }
    private fun errorToJson(errorProperty: ErrorProperty, response: HttpServletResponse) {
        response.status = errorProperty.status()
        response.characterEncoding = StandardCharsets.UTF_8.name()
        response.contentType = MediaType.APPLICATION_JSON_VALUE
        response.writer.write(objectMapper.writeValueAsString(ErrorResponse.of(errorProperty)))
    }
}