package com.tom.tomerch.dao

import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Mapper

@Mapper
interface FetchItems {

    @Select("""
    select
        i.object_id,
        ic.category_name,
        i.item_name,
        i.price
    from
        item i
    inner join item_category ic
        on ic.category_id = i.category_id
    where
        i.category_id = #{categoryId}
        and i.item_name like concat('%', #{itemName},'%');
    """)
    fun selectItems(categoryId: String, itemName: String?): List<ItemList>?

}
