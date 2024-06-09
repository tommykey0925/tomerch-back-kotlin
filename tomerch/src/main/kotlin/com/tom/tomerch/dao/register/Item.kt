package com.tom.tomerch.dao.register

import java.time.OffsetDateTime

data class Item (
    val objectId: String,
    val registeredDatetime: OffsetDateTime,
    val updatedDatetime: OffsetDateTime,
    val categoryId: String,
    val itemId: String,
    val itemName: String,
    val price: Long
)
