package com.tom.tomerch.dao.delete

import org.apache.ibatis.annotations.Mapper

@Mapper
interface DeleteItem {

    fun deleteItem(objectId: String): Int

}
