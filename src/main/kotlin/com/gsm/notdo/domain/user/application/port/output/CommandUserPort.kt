package com.gsm.notdo.domain.user.application.port.output

import com.gsm.notdo.domain.user.domain.User


interface CommandUserPort {
    fun save(domain: User) : User
}