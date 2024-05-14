package com.tom.tomerch.dao.fetchItemDetail

import org.apache.ibatis.annotations.Mapper

@Mapper
interface FetchItemDetail {

    fun chooseItem(objectId: String): ItemDetail

}
