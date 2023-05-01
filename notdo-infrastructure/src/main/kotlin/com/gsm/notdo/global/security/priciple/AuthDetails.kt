package com.gsm.notdo.global.security.priciple

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.util.UUID

class AuthDetails(
        private val userId: UUID
) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority>? = null

    override fun getPassword(): String? = null

    override fun getUsername(): String = userId.toString()

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = true
}