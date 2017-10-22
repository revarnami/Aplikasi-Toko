package com.android.joystok.data.repository.datasources.item_variant

import com.android.joystok.data.entity.ItemVariantAPIEntity
import rx.Observable

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

interface ItemVariantDataStore {
    fun addItemVariant(auth: String, itemId: Int, variantName: String): Observable<ItemVariantAPIEntity>
}