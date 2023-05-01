package com.gsm.notdo.domain.user.input.mapper

import com.gsm.notdo.domain.auth.input.request.SignupRequest
import com.gsm.notdo.domain.auth.input.response.TokenResponse
import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto
import com.gsm.notdo.domain.auth.port.output.dto.TokenDto

fun SignupRequest.toDto(request: SignupRequest): SignUpDto =
        SignUpDto(
                email = request.email,
                password = request.password,
                nickname = request.nickname
        )
fun TokenDto.toResponse(dto: TokenDto): TokenResponse =
        TokenResponse(
                accessToken = dto.accessToken,
                refreshToken = dto.refreshToken,
                accessExp = dto.accessExp,
                refreshExp = dto.refreshExp
        )