package com.gsm.notdo.domain.calendar.adapter.output.persistence.repository

import com.gsm.notdo.domain.calendar.adapter.output.persistence.entity.CalendarEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface CalendarRepository : CrudRepository<CalendarEntity, UUID> {
}