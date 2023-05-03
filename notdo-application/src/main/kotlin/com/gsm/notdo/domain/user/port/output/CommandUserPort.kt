package com.gsm.notdo.domain.user.port.output

import com.gsm.notdo.domain.user.model.User

interface CommandUserPort {
    fun create(domain: User)
}