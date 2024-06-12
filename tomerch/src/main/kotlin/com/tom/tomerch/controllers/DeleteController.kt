package com.tom.tomerch.controllers

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.transaction.annotation.Transactional
import com.tom.tomerch.dao.delete.*

@RestController
@Transactional(rollbackFor=[Exception::class])
class DeleteController(
    private val deleteItem: DeleteItem,
    ) {

    @DeleteMapping("/deleteItem/{objectId}")
    fun deleteItem(@PathVariable objectId: String): Unit {
        deleteItem.deleteItem(objectId)
    }
  
}
