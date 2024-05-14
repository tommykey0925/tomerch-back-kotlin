package com.tom.tomerch.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.transaction.annotation.Transactional
import com.tom.tomerch.dao.fetchItems.*
import com.tom.tomerch.dao.fetchItemDetail.*

@RestController
@Transactional(rollbackFor=[Exception::class])
class GetController(private val fetchItems: FetchItems, private val fetchItemDetail: FetchItemDetail) {

    @GetMapping("/itemList")
    fun fetchItems(@RequestParam("categoryId", required = true) categoryId: String, 
            @RequestParam("itemName", required = false) itemName: String?): List<ItemList>? {
        return fetchItems.selectItems(categoryId, itemName);
    }

    @GetMapping("/itemDetail")
    fun fetchItemDetail(@RequestParam("objectId", required = true) objectId: String): ItemDetail? {
        return fetchItemDetail.chooseItem(objectId);
    }
    
}
