package com.tom.tomerch.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.transaction.annotation.Transactional
import com.tom.tomerch.dao.update.*

@RestController
@Transactional(rollbackFor=[Exception::class])
class PostController(
    private val updateItem: UpdateItem
    ) {

    @PostMapping("/updateItem")
    fun updateItem(@RequestBody item: Item): Unit {
        updateItem.updateItem(item)
    }
  
}
