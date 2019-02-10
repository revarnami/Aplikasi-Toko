package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.ItemAPIEntity
import com.android.joystok.domain.model.ItemAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

@Singleton
class ItemMapper
@Inject
constructor() : EntryEntityMapper<ItemAPIModel, ItemAPIEntity>()
{
    override fun transform(entity: ItemAPIEntity?): ItemAPIModel? {
        if (entity != null) {
            val itemModel = ItemAPIModel()
            itemModel.itemCode = entity.itemCode
            itemModel.categoryId = entity.categoryId
            itemModel.itemName = entity.itemName
            itemModel.supplier = entity.supplier
            itemModel.basePrice = entity.basePrice
            itemModel.salePrice = entity.salePrice
            itemModel.stock = entity.stock
            itemModel.remarks = entity.remarks
            itemModel.isVariant = entity.isVariant
            itemModel.inactive = entity.inactive
            itemModel.id = entity.id
            return itemModel
        }
        return null
    }
}