package com.tom.tomerch.controllers

import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.transaction.annotation.Transactional
import com.tom.tomerch.dao.register.*

@RestController
@Transactional(rollbackFor=[Exception::class])
class PutController(
    private val insertItem: InsertItem,
    private val insertItemCategory: InsertItemCategory,
    ) {

    @PutMapping("/insertItem")
    fun insertItem(@RequestBody item: Item): Unit {
        insertItem.insertItem(item)
    }

    @PutMapping("/insertItemCategory")
    fun insertItemCategory(@RequestBody itemCategory: ItemCategory): Unit {
        insertItemCategory.insertItemCategory(itemCategory)
    }
  
}
