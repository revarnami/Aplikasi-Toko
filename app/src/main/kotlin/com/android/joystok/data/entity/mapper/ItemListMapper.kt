package com.android.joystok.data.entity.mapper

import com.android.joystok.domain.model.ItemAPIModel
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

class ItemListMapper
@Inject
constructor() : EntryEntityMapper<List<ItemAPIModel>, List<ItemAPIModel>>()
{
    override fun transform(entity: List<ItemAPIModel>?): List<ItemAPIModel>? {
        if (entity != null) {
            return entity
        }
        return null
    }
}