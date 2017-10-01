package com.android.joystok.data.entity.mapper

import com.android.joystok.data.entity.ItemCategoryAPIEntity
import com.android.joystok.domain.model.ItemCategoryAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/30/17.
 */

@Singleton
class CategoryMapper
@Inject
constructor() : EntryEntityMapper<ItemCategoryAPIModel, ItemCategoryAPIEntity>()
{
    override fun transform(entity: ItemCategoryAPIEntity?): ItemCategoryAPIModel? {
        if (entity != null) {
            val categoryModel = ItemCategoryAPIModel()
            categoryModel.id = entity.id
            categoryModel.categoryName = entity.categoryName
            categoryModel.remarks = entity.remarks
            return categoryModel
        }
        return null
    }
}