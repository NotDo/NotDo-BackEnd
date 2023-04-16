package com.gsm.notdo.persistence.diary.repository

import com.gsm.notdo.persistence.diary.entity.DiaryEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface DiaryRepository : CrudRepository<DiaryEntity, UUID> {
}