package com.gsm.notdo.domain.user.output.persistence.user.entity

import com.gsm.notdo.common.base.entity.BaseEntity
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "tbl_user")
data class UserEntity(
        override val id: UUID,
        @Column(nullable = false, unique = true)
        val email: String,
        @Column(nullable = true)
        val password: String?,
        @Column(nullable = false)
        val nickName: String
) : BaseEntity(id)