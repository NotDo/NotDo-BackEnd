package com.gsm.notdo.domain.calendar.adapter.output.persistence.entity

import com.gsm.notdo.domain.user.adapter.output.persistence.entity.UserEntity
import com.gsm.notdo.global.entity.BaseEntity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tbl_calendar")
data class CalendarEntity(
        override val id: UUID,
        @Column
        val totalCount: Long,
        @ManyToOne
        val userId: UserEntity
) : BaseEntity(id) {

}
