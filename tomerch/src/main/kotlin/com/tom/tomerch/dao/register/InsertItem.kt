package com.tom.tomerch.dao.register

import org.apache.ibatis.annotations.Mapper

@Mapper
interface InsertItem {

    fun insertItem(item: Item): Int

}
