package com.tom.tomerch.dao.register

import org.apache.ibatis.annotations.Mapper

@Mapper
interface InsertItemCategory {

    fun insertItemCategory(itemCategory: ItemCategory): Int

}
