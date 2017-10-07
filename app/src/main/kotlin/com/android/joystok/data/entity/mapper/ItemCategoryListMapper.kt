package com.android.joystok.data.entity.mapper

import com.android.joystok.domain.model.ItemCategoryAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

@Singleton
class ItemCategoryListMapper
@Inject
constructor() : EntryEntityMapper<List<ItemCategoryAPIModel>, List<ItemCategoryAPIModel>>()
{
    private val TAG = "ItemCategoryListMapper"
    override fun transform(entity: List<ItemCategoryAPIModel>?): List<ItemCategoryAPIModel>? {
        if (entity != null) {
            return entity
        }
        return null
    }
}