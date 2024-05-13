package com.tom.tomerch.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.transaction.annotation.Transactional
import com.tom.tomerch.dao.*

@RestController
class GetController(private val fetchItems: FetchItems) {

    @GetMapping("/itemList")
    @Transactional
    fun fetchItems(@RequestParam("categoryId", required = true) categoryId: String, 
            @RequestParam("itemName", required = false) itemName: String?): List<ItemList>? {
        return fetchItems.selectItems(categoryId, itemName);
    }
}
