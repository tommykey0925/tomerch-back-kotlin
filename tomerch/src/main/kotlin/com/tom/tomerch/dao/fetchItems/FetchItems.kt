package com.tom.tomerch.dao.fetchItems

import org.apache.ibatis.annotations.Mapper

@Mapper
interface FetchItems {

    fun selectItems(categoryId: String, itemName: String?): List<ItemList>

}
