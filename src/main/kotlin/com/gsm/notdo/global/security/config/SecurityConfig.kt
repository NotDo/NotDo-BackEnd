package com.gsm.notdo.global.security.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.gsm.notdo.global.security.token.JwtParser
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig(
        private val jwtParser: JwtParser,
        private val objectMapper: ObjectMapper
) {
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
                .csrf().disable()
                .formLogin().disable()
                .cors().disable()
        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/auth/sign-up").permitAll()
                .antMatchers(HttpMethod.POST,"/auth/sign-in").permitAll()
                .antMatchers(HttpMethod.POST, "auth").permitAll()
                .antMatchers(HttpMethod.HEAD, "/auth").permitAll()
                .anyRequest().authenticated()
        http
                .apply(FilterConfig(jwtParser, objectMapper))

        return http.build()
    }
}