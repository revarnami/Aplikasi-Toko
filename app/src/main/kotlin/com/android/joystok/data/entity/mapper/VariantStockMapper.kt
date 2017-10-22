package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.VariantStockAPIEntity
import com.android.joystok.domain.model.VariantStockAPIModel
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class VariantStockMapper
@Inject
constructor() : EntryEntityMapper<VariantStockAPIModel, VariantStockAPIEntity>()
{
    override fun transform(entity: VariantStockAPIEntity?): VariantStockAPIModel? {
        if (entity != null) {
            val itemModel = VariantStockAPIModel()
            itemModel.itemVariantId = entity.itemVariantId
            itemModel.quantity = entity.quantity
            itemModel.branchId = entity.branchId
            itemModel.id = entity.id
            return itemModel
        }
        return null
    }
}