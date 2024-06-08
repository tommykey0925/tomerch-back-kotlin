package com.tom.tomerch.dao.register

import org.apache.ibatis.annotations.Mapper

@Mapper
interface FetchItemDetail {

    fun chooseItem(objectId: String): ItemDetail

}
