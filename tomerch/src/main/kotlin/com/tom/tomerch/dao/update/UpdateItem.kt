package com.tom.tomerch.dao.update

import org.apache.ibatis.annotations.Mapper

@Mappers
interface UpdateItem {

    fun updateItem(item: Item): Int

}
