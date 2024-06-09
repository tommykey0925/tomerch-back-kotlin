package com.tom.tomerch.dao.register

import java.time.OffsetDateTime

data class ItemCategory (
    val objectId: String,
    val registeredDatetime: OffsetDateTime,
    val updatedDatetime: OffsetDateTime,
    val categoryId: String,
    val categoryName: String
)
