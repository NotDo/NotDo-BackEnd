package com.gsm.notdo.domain.category.adapter.output.persistence.category.entity

import com.gsm.notdo.domain.user.adapter.output.persistence.entity.UserEntity
import javax.persistence.*


@Entity
@Table(name = "tbl_category")
data class CategoryEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @Column(nullable = false)
        val name: Long,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        val userId: UserEntity
)