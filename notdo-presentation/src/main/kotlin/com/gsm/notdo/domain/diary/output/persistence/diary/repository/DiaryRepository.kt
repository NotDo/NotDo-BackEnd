package com.gsm.notdo.domain.user.output.persistence.diary.repository

import com.gsm.notdo.domain.diary.output.persistence.diary.entity.DiaryEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface DiaryRepository : CrudRepository<DiaryEntity, UUID> {
}