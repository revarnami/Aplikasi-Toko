package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.ItemVariantAPIEntity
import com.android.joystok.domain.model.ItemVariantAPIModel
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class ItemVariantMapper
@Inject
constructor() : EntryEntityMapper<ItemVariantAPIModel, ItemVariantAPIEntity>()
{
    override fun transform(entity: ItemVariantAPIEntity?): ItemVariantAPIModel? {
        if (entity != null) {
            val itemModel = ItemVariantAPIModel()
            itemModel.itemId = entity.itemId
            itemModel.itemVariantStock = entity.itemVariantStock
            itemModel.variantName = entity.variantName
            itemModel.id = entity.id
            return itemModel
        }
        return null
    }
}