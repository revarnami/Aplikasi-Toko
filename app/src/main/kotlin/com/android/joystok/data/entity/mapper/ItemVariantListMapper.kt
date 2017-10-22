package com.android.joystok.data.entity.mapper

import com.android.joystok.domain.model.ItemVariantAPIModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

@Singleton
class ItemVariantListMapper
@Inject
constructor() : EntryEntityMapper<List<ItemVariantAPIModel>, List<ItemVariantAPIModel>>()
{
    override fun transform(entity: List<ItemVariantAPIModel>?): List<ItemVariantAPIModel>? {
        if (entity != null) {
            return entity
        }
        return null
    }
}