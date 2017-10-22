package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.ItemListMapper
import com.android.joystok.data.entity.mapper.ItemVariantMapper
import com.android.joystok.data.repository.datasources.item_variant.ItemVariantDataFactory
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.android.joystok.domain.repository.ItemVariantRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class ItemVariantDataRepository
@Inject constructor(private val listMapper: ItemListMapper,
                    private val mapper: ItemVariantMapper,
                    private val dataFactory: ItemVariantDataFactory
) : ItemVariantRepository {
    override fun addItemVariant(auth: String, itemId: Int, variantName: String): Observable<ItemVariantAPIModel> {
        return dataFactory.createCloudDataStore()
                .addItemVariant(auth, itemId, variantName)
                .map ({mapper.transform(it)})
    }
}